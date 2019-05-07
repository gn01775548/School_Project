/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author bonnie
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDict;
    
    public AirlinerDirectory() {
        airlinerDict = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerDict() {
        return airlinerDict;
    }
    
    public Airliner addAirliner() {
        Airliner a = new Airliner();
        airlinerDict.add(a);
        return a;
    }
    
    public void removeAirliner(Airliner a) {
        airlinerDict.remove(a);
    }
    
    public Airliner searchAirliner(String keyWord) {
        for(Airliner a : airlinerDict) {
            
            if(keyWord.equals(a.getAirlinerName())) {
                return a;
            }                      
        }
        return null;
    }
    
    public Flight searchAirlinerbyFromLoca(String keyWord) {
        for(Airliner a : airlinerDict) {
            for(Flight f : a.getFlightDirectory().getFlightDir()){
            if(keyWord.equals(f.getFlightFromLoca())) {
                return f;
            }                      
        }
        }return null;
    
    }
    
    public Flight searchAirlinerbyToLoca(String keyWord) {
        for(Airliner a : airlinerDict) {
            for(Flight f : a.getFlightDirectory().getFlightDir()){
            if(keyWord.equals(f.getFlightToLoca())) {
                return f;
            }                      
        }
        }return null;
    
    }
    
    public Flight searchAirlinerbyTime(String keyWord) {
        for(Airliner a : airlinerDict) {
            for(Flight f : a.getFlightDirectory().getFlightDir()){
            if(keyWord.equals(f.getFlightTime())) {
                return f;
            }                      
        }
        }return null;
    
    }
    
}
