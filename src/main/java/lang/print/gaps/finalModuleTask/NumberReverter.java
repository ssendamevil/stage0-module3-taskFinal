package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstNum = number / 100;
        int secondNum = (number - (firstNum * 100)) / 10;
        int thirdNum = number - (firstNum *100) - (secondNum*10);

        int reversed = (thirdNum *100) + (secondNum * 10) + firstNum;

        System.out.println(reversed);
    }
}
