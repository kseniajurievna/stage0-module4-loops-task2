package school.mjc.stage0.loops.task2;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int numberToCheck = 2; numberToCheck <= printToInclusive; numberToCheck++){
            boolean isPrime = true;
            for (int factor = 2; factor <=numberToCheck/2; factor++){
                if (numberToCheck % factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(numberToCheck);
        }
        }
        for(int number : primeNumbers){
            System.out.println(number);
        }
    }
}
