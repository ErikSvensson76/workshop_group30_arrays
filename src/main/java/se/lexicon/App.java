package se.lexicon;

import se.lexicon.data.NamesStorage;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NamesStorage.add("Erik Svensson");
        NamesStorage.add("Erik Andersson");
        NamesStorage.add("Martin Svensson");

        String[] eriks = NamesStorage.findByFirstName("marTiN");
        System.out.println(Arrays.toString(eriks));


    }
}
