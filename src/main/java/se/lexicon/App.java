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

        NamesStorage.remove("Erik Svensson");

        System.out.println(NamesStorage.nameExists("Erik Svensson"));




    }
}
