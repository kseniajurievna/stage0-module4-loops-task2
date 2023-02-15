package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int primeCheckNumber = 2;
        int divisibleCount = 0;
        int n = 2;
        while (n <= printToInclusive) {
            while (primeCheckNumber <= n / 2) {
                if(n%primeCheckNumber !=0){
                    System.out.println(n);
                    n++;
                }
                break;
            }
        }
    }
    public static void main (String[] args){
        printPrimeNumbers(10);
    }
}
