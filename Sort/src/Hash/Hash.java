package Hash;

public class Hash {

    private String hashArray[];
    int arraySize;
    int currentSize = 0;

    public Hash(int arraySize){


        if(isPrime(arraySize)){
            this.arraySize = arraySize;
            hashArray = new String[arraySize];
            System.out.println("This is prime");
        }
        else{
            System.out.println("Generating the prime");
            int primeSize = getNextPrime(arraySize);
            hashArray = new String[primeSize];
            this.arraySize = primeSize;
            System.out.println("Hash table size given "+ arraySize + "is not a prime number");
            System.out.println("Now we allocated the new "+ primeSize + " for you");
        }
    }

    public boolean isPrime(int number){

        for(int i=2; i*i <= number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public int getNextPrime(int number){

        int i= 1;

        while(! isPrime(number)){

            number+=i;
            i++;
        }
        return number;
    }

    /*
    for(int i=number; true; i++)
    if(isPrime(i){
    return i;
    }
    * */


    private int hashFunction(String word){

        int hashValue = word.hashCode();
        hashValue = hashValue % arraySize;
        if(hashValue <0){
            hashValue += arraySize;
        }
        return hashValue;
    }

    private int hashStep(String word){
        int hashValue = word.hashCode();
        hashValue = hashValue % arraySize;
        if(hashValue < 0){
            hashValue += arraySize;

        }

        return 3 - hashValue % 3;
    }

    public void insert(String word){
        int hashValue = hashFunction(word);
        int stepSize = hashStep(word);

        while(hashArray[hashValue] != null){
            hashValue = hashValue + stepSize;
            hashValue = hashValue % arraySize;
        }
        hashArray[hashValue] = word;
        System.out.println("Inserted word: "+ word);
        currentSize++;
    }

    public String find(String word){

        int hashValue = hashFunction(word);
        int stepSize = hashStep(word);

        while(hashArray[hashValue] != null){
            if(hashArray[hashValue].equals(word)){
                return hashArray[hashValue];
            }
            hashValue = hashValue + stepSize;
            hashValue = hashValue % arraySize;
        }
        return hashArray[hashValue];
    }

}
