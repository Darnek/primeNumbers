import java.util.TreeMap;

public class PrimeNumbers {

    public  TreeMap<Integer, Double> getPrimeNumber(int n){
        int numPrimes=0;
        double mult=1;
        int prime = 2;
        TreeMap<Integer, Double> map = new TreeMap<>();
        while (numPrimes<n) {
            if(isPrime(prime)){
                mult*=prime;
                map.put(prime, mult);
                numPrimes++;
            }
            prime++;
        }
        return map;
    }

    public  boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int count=2;
        while(count<n){
            if (n%count==0){
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.getPrimeNumber(10).forEach((k,v) -> System.out.println("| " + k + " | " + v + " |"));
    }
}
