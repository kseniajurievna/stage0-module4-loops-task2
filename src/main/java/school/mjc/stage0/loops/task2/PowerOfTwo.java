package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int start = 1;
        int number = 2;
        int result = 0;
        while (start <= power){
            result = number * start;
            System.out.println(result);
            start++;
        }
    }
}
