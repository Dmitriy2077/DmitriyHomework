package lesson3;

import java.util.Scanner;

/**
 * Создать класс компьютер.
 * Поля:
 *      - isOn boolean
 * 	    - процессор    Boolean
 * 	    - оперативка Boolean
 * 	    - жесткий диск Boolean
 * 	    - ресурс полных циклов работы (включений/выключений) int
 * Методы:
 * 	    - метод описание(вывод всех полей)
 *          вывод:  [“есть”, “есть”, “есть”, 18 циклов]
 * 	    - метод включить,
 * 	            при включении может произойти сбой,
 * 	            при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали ПК
 * 	                включается, если нет сгорает. Если ПК сгорел, при попытке включить нужно выдать сообщение, что ему конец
 * 	    - выключить (аналогично включению)
 * 	    - при превышении лимита ресурса комп сгорает
 */

public class Computer {
    private boolean stateOn = false;
    private boolean liveState = true;
    private boolean haveProcessor;
    private boolean haveMemory;
    private boolean haveHardDrive;
    private int lifecycles;

    public Computer() {
    }

    public Computer(int lifecycles) {
        this.lifecycles = lifecycles;
    }

    public Computer(boolean haveProcessor, int lifecycles) {
        this.haveProcessor = haveProcessor;
        this.lifecycles = lifecycles;
    }

    public Computer(boolean haveProcessor, boolean haveMemory, int lifecycles) {
        this.haveProcessor = haveProcessor;
        this.haveMemory = haveMemory;
        this.lifecycles = lifecycles;
    }

    public Computer(boolean haveProcessor, boolean haveMemory, boolean haveHardDrive, int lifecycles) {
        this.haveProcessor = haveProcessor;
        this.haveMemory = haveMemory;
        this.haveHardDrive = haveHardDrive;
        this.lifecycles = lifecycles;
    }

    public boolean isStateOn() {
        return stateOn;
    }

    private void setStateOn(boolean stateOn) {
        this.stateOn = stateOn;
    }

    public boolean isLiveState() {
        return liveState;
    }

    private void setLiveState(boolean liveState) {
        this.liveState = liveState;
    }

    public boolean isHaveProcessor() {
        return haveProcessor;
    }

    public void setHaveProcessor(boolean haveProcessor) {
        this.haveProcessor = haveProcessor;
    }

    public boolean isHaveMemory() {
        return haveMemory;
    }

    public void setHaveMemory(boolean haveMemory) {
        this.haveMemory = haveMemory;
    }

    public boolean isHaveHardDrive() {
        return haveHardDrive;
    }

    public void setHaveHardDrive(boolean haveHardDrive) {
        this.haveHardDrive = haveHardDrive;
    }

    public int getLifecycles() {
        return lifecycles;
    }

    private void setLifecycles(int lifecycles) {
        this.lifecycles = lifecycles;
    }

    public void turnComputerOn() {
        breakComputer();
        turningOnOrOff(!isStateOn(), true, "on", "off");
    }

    public void turnComputerOff() {
        if (getLifecycles() > 0)
            setLifecycles(getLifecycles() - 1);
        else breakComputer();
        turningOnOrOff(isStateOn(), false, "off", "on");
    }

    private int inputUserNumber() {
        Scanner scanner = new Scanner(System.in);
        String stringToProcess;

        System.out.print("Enter 0 or 1 to turn computer on => ");
        stringToProcess = scanner.next();

        return checkInputNumber(stringToProcess);
    }

    private int checkInputNumber(String inputString) {
        int result = -1;

        if (inputString.length() == 1){
            if (inputString.charAt(0) == '1' || inputString.charAt(0) == '0')
                result = Integer.parseInt(inputString);
            else
                System.out.println("You must enter only 1 or 0!");
        } else
            System.out.println("You must enter only one digit!");

        return result;
    }

    private int getRandom() {
        return (int) (Math.random()*2);
    }

    private void turningOnOrOff(boolean isOnOrOff, boolean stateOnOrOff, String stringState, String stringError) {
        if (isLiveState() && isOnOrOff) {
            if (getRandom() == inputUserNumber()) {
                setStateOn(stateOnOrOff);
                System.out.println("Your computer is turned " + stringState);
            }
            else {
                setLiveState(false);
                System.out.println("Your computer is broken");
            }
        } else if (isLiveState() && !isOnOrOff)
            System.out.println("Your computer is turned " + stringState +
                    ". You should turn it " + stringError + " first.");
        else
            System.out.println("Your computer is broken. You should buy a new one)");
    }

    void breakComputer() {
        if (getLifecycles() <= 0 || !isHaveHardDrive() || !isHaveMemory() || !isHaveProcessor())
            setLiveState(false);
    }

    @Override
    public String toString() {
        return "\t[\"" + haveProcessor +
                "\", \"" + haveMemory +
                "\", \"" + haveHardDrive +
                "\", " + lifecycles +
                " lifecycles]";
    }
}
