package edu.javacourse.tractor.engine;

import edu.javacourse.tractor.entity.EarthHole;
import edu.javacourse.tractor.exception.NoHoleException;
import edu.javacourse.tractor.exception.UnknownStateException;

public class MercedesSuperTractor extends MercedesTractor
{
    @Override
    public EarthHole processHole() throws UnknownStateException, NoHoleException {
        if(getHole() != null) {
            System.out.println("SuperMercedes processed EarthHole");
        } else {
            
        }
        
        return null;
    }
    
}
