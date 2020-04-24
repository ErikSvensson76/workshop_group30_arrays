package se.lexicon.data;

public class NamesStorage {

    private static String[] names = new String[0];

    /**
     *
     * @param fullName String fullName
     * @return true if found
     */
    public static boolean nameExists(final String fullName){
        boolean exists = false;
        for(String name : names){
            if(name.equalsIgnoreCase(fullName)){
                exists = true;
                break; //Breaks out of a loop or a switch.
            }
        }
        return exists;
    }


    /**
     * Empties the array by overwriting it with a new empty array
     */
    public static void clear(){
        names = new String[0];
    }



}
