package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstNum = number / 1000;
        int secondNum = (number - (firstNum * 1000)) / 100;
        int thirdNum = (number - (firstNum *1000) - (secondNum*100))/10;
        int forthNum = number - (firstNum *1000) - (secondNum*100) - (thirdNum *10);

        int sum = firstNum + secondNum + thirdNum + forthNum;
        System.out.println(sum);
    }
}
