package se.lexicon;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            returnBiggestString(new String[0]);

        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

    /**
     *
     * @param strings String array
     * @return biggestString
     * @throws NullPointerException when array is null
     * @throws IllegalArgumentException when array is empty
     */
    public static String returnBiggestString(String[] strings) throws NullPointerException, IllegalArgumentException{
        if(strings == null){
            throw new NullPointerException("Array of strings was " + null);
        }
        if(strings.length == 0){
            throw new IllegalArgumentException("Cannot determine biggest string because array was empty");
        }
        int biggest = 0;
        String biggestString = null;
        for(String string : strings){
            if(string.length() > biggest){
                biggest = string.length();
                biggestString = string;
            }
        }
        return biggestString;
    }
}
