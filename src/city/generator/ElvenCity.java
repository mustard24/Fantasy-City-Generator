/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city.generator;
import java.util.Random;

/**
 *
 * @author Dustin Moody
 */
public class ElvenCity extends CityMaker{
    private String[] elvenPrefixes = new String[]{"Ae", "Aly", "Cend","Elf","Elv", "Il", "Moon", "Ze"};
    private String[] elvenSuffixes = new String[]{"ion","than", "thian", "ther", "glade", "ous"};
    private String elvenName;
    public ElvenCity GenerateNew(){
        Random random = new Random();
        elvenName = elvenPrefixes[random.nextInt(elvenPrefixes.length)]+ elvenSuffixes[random.nextInt(elvenSuffixes.length)];
        ElvenCity elvenCity = new ElvenCity();
        elvenCity.ChangeCityName(elvenName);
        System.out.println("Check!");
        System.out.println(elvenName);
        return elvenCity;
    }
}
