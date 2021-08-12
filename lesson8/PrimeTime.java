import java.util.ArrayList;

public class PrimeTime {
    public static void main(String[] args){
        System.out.println(isPrime(3));
        // ArrayList<Integer> primes = getPrimesBetween(0, 100);
        // for(int prime: primes){
        //     System.out.print(prime + " ");
        // }

        // ArrayList<Integer> primeFactors = getPrimeFactor(70);
        // for(int primeFactor: primeFactors){
        //     System.out.print(primeFactor + " ");
        // }

        ArrayList<Integer> quareFreeNums = getSquareFreeNums(100);
        for(int squareFreeNum: quareFreeNums){
            System.out.print(squareFreeNum + " ");
        }

        
        
        
    }
    public static boolean isPrime(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }

        return true;
    }

    public static ArrayList<Integer> getPrimesBetween(int a, int b){
        if(a < 2){
            a = 2;
        }
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    public static ArrayList<Integer> getPrimeFactor(int x){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) {
                if(isPrime(i)) primeFactors.add(i);

            }
            

        }
        return primeFactors;
    }

    public static boolean isSquareFree(int x){
        if(x % 2 == 0) x = x/2;
        if(x % 2 == 0) return false;
        ArrayList<Integer> primefactors = getPrimeFactor(x);
        if(primefactors.size() > 0){
            for(int primeFactor: primefactors){
                int xTemp = x/primeFactor;
                if(xTemp % primeFactor == 0) return false;

            }
        }
        return true;

    }

    public static ArrayList<Integer> getSquareFreeNums (int x){
        ArrayList<Integer> quareFreeNums = new ArrayList<Integer>();
        for(int i = 0; i <= x; i++){
            if(isSquareFree(i)){
                quareFreeNums.add(i);
            }
        }

        return quareFreeNums;
    }



    
}
