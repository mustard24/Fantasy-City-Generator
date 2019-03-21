/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city.generator;

/**
 *
 * @author Dustin Moody
 */
public abstract class CityMaker {
    private String cityName;
    private int numberElves;
    private int numberDwarves;
    private int numberHumans;
    
    public void ChangeCityName(String name){
        cityName = name;
    }
    public void ChangeNumberElves(int number){
        numberElves = number;
    }
    public void ChangeNumberDwarves(int number){
        numberDwarves = number;
    }
    public void ChangeNumberHumans(int number){
        numberHumans = number;
    }
}
