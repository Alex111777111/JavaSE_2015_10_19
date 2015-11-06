package edu.javacourse.tractor.engine;

import edu.javacourse.tractor.entity.EarthHole;
import edu.javacourse.tractor.entity.EarthLine;
import edu.javacourse.tractor.exception.NoHoleException;
import edu.javacourse.tractor.exception.TractorException;
import edu.javacourse.tractor.exception.UnknownStateException;

public class BelarusTractor implements Tractor
{
    private EarthLine line;
    private EarthHole hole;

    public EarthLine getLine() {
        return line;
    }

    @Override
    public void setLine(EarthLine line) {
        this.line = line;
    }

    public EarthHole getHole() {
        return hole;
    }
    
    @Override
    public void moveToHole(EarthHole hole) {
        System.out.println("Belarus moved to hole:" + hole);
        this.hole = hole;
    }

    @Override
    public EarthHole processHole() throws UnknownStateException, NoHoleException {
        if(hole != null) {
            if(hole.getState().equals(EarthHole.EarthHoleState.DIRTY)) {
                UnknownStateException ex = new UnknownStateException(24, "Неизвестное состояние");
                throw ex;
            }
            System.out.println("Belarus processed hole");
            return hole;
        } else {
            throw new NoHoleException();
        }
    }
}
