import java.util.*;
class HashMapKey{
    private final String key;

    public HashMapKey(String key){
        this.key=key;

    }
    //Generowanie określonej liczby kluczów
    public HashMapKey[] generateKeys(int quantity){
        HashMapKey[] keys = new HashMapKey[quantity];
        String abc ="abcdefghijklmnopqrstuvwxyz";
        int size = abc.length();
        Random randomKey = new Random();
        StringBuilder tempKey= new StringBuilder();
        for(int i=0;i<quantity;i++){
            for(int n=0;n<5;n++){
                tempKey.append(abc.charAt(randomKey.nextInt(size)));
            }
            keys[i] = new HashMapKey(tempKey.toString());
            tempKey = new StringBuilder();
        }
        // System.out.println("\n\n\n\n Zostało wygenerowanych " + quantity +" kluczów mapy");
        return keys;
    }
    //Must have
    @Override
    public String toString(){
        return "Klucz mapy to : "+key;
    }
    public String getKeys(){
        return this.key;
    }
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals(Object o){
        HashMapKey key = (HashMapKey) o;
        return this.key.equals(key.getKeys());
    }
    @Override
    public int hashCode(){
        return 31 * key.hashCode();
    }
}