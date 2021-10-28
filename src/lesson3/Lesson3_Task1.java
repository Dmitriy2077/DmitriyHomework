package lesson3;

import java.util.Scanner;

public class Lesson3_Task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int typeOfComputer;
        Computer computerFull = new Computer(true,true,true, 18);
        Computer computerRamCpu = new Computer(true,true, 10);
        Computer computerCpu = new Computer(true, 5);
        Computer computerOnlyLifecycles = new Computer(1);
        Computer computerEmpty = new Computer();

        System.out.print("""
                Choose computer type please:
                0 -> Full Kit
                1 -> only Ram & Cpu
                2 -> Only Cpu
                3 -> Without base components
                4 -> Only PC Case
                --->>>\s""");
        typeOfComputer = checkInputNumber(scanner.next());

        switch (typeOfComputer) {
            case 0 -> computerActions(computerFull);
            case 1 -> computerActions(computerRamCpu);
            case 2 -> computerActions(computerCpu);
            case 3 -> computerActions(computerOnlyLifecycles);
            case 4 -> computerActions(computerEmpty);
        }
    }

     static void computerActions(Computer computer){
        boolean breaker = true;
        int userAction;

        while (breaker) {
            System.out.print("""
                    Choose computer action:
                    1 -> Turn On
                    2 -> Turn Off
                    3 -> Turn On->Off
                    4 -> Info about PC
                    0 -> Exit
                    --->>>\s""");
            userAction = checkInputNumber(scanner.next());
            switch (userAction) {
                case 1 -> computer.turnComputerOn();
                case 2 -> computer.turnComputerOff();
                case 3 -> {
                    computer.turnComputerOn();
                    computer.turnComputerOff();
                }
                case 4 -> System.out.println(computer);
                case 0 -> breaker = false;
            }
        }
     }

    static int checkInputNumber(String inputString) {
        int result = 0;

        if (inputString.length() == 1){
            if (inputString.charAt(0) == '0' || inputString.charAt(0) == '1' || inputString.charAt(0) == '2' ||
                    inputString.charAt(0) == '3' || inputString.charAt(0) == '4')
                result = Integer.parseInt(inputString);
            else
                System.out.println("--->>> 0\nYou must enter a number between 0 and 4");
        } else
            System.out.println("--->>> 0\nYou must enter only one digit!");

        return result;
    }
}
