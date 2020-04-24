package se.lexicon.data;

import java.util.Arrays;

/**
 *
 * @author Erik Svensson
 */
public class NamesStorage {//class starts

    private static String[] names = new String[0];

    /**
     *
     * @param fullName String fullName
     * @return <b>true</b> if found
     */
    public static boolean nameExists(final String fullName){ //method starts
        boolean exists = false;
        for(String name : names){ //for loop starts
            if(name.equalsIgnoreCase(fullName)){ //if statement starts
                exists = true;
                break; //Breaks out of a loop or a switch.
            }// if statement ends
        } //for loop ends
        return exists;
    } // method ends

    /**
     *
     * @param fullName String representing a full name. <b>Not null</b>
     * @return true if name was added, false if param was null or existed in the array
     */
    public static boolean add(final String fullName){
        if(fullName == null){
            return false;
        }
        if(nameExists(fullName)){
            return false;
        }
        names = addStringToArray(names, fullName);
        return true;
    }

    public static String[] findByFirstName(final String firstName){
        String[] result = new String[0]; //empty array
        for(String fullName : names){
            String extracted = fullName.substring(0, fullName.indexOf(" "));
            if(extracted.equalsIgnoreCase(firstName)) {
                result = addStringToArray(result, fullName);
            }
        }
        return result;
    }

    public static String[] findByLastName(final String lastName){
        String[] result = new String[0];
        for(String fullName : names){
            String extracted = fullName.substring(fullName.indexOf(" ")).trim();
            if(extracted.equalsIgnoreCase(lastName)){
                result = addStringToArray(result, fullName);
            }
        }
        return result;
    }

    public static boolean remove(final String fullName){
        int index = getIndexOfString(names, fullName);
        if(index < 0){
            return false;
        }
        names = removeByIndex(names, index);
        return true;
    }

    private static String[] removeByIndex(final String[] strings, final int index) {
        String[]first = Arrays.copyOfRange(strings, 0, index);
        String[]last = Arrays.copyOfRange(strings, index + 1, strings.length);
        String[]combined = Arrays.copyOf(first, first.length + last.length);
        for(int writePos = first.length, readPos=0; readPos<last.length; writePos++, readPos++){
            combined[writePos] = last[readPos];
        }

        /*
        System.arraycopy(
                last,           //source array
                0,       //copy from index
                combined,       //target array
                first.length,   //starting position in the destination data
                last.length     //number of elements to copy from last array
        );

         */
        return combined;
    }

    private static int getIndexOfString(String[] strings, String fullName) {
        int index = -1;
        for(int i = 0; i<strings.length; i++){
            if(strings[i].equalsIgnoreCase(fullName)){
                index = i;
                break;
            }
        }
        return index;
    }

    private static String[] addStringToArray(final String[] source, final String string) {
        String[] returnArray = Arrays.copyOf(source, source.length+1);
        returnArray[returnArray.length-1] = string;
        return returnArray;
    }

    /**
     * Empties the array by overwriting it with a new empty array
     */
    public static void clear(){
        names = new String[0];
    }



}// class ends
