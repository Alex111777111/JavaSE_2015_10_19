package edu.javacourse.tractor.engine;

import edu.javacourse.tractor.entity.EarthHole;
import edu.javacourse.tractor.entity.EarthLine;
import edu.javacourse.tractor.exception.NoHoleException;
import edu.javacourse.tractor.exception.UnknownStateException;

public interface Tractor
{
    public void setLine(EarthLine line);
    public void moveToHole(EarthHole hole);
    public EarthHole processHole() throws UnknownStateException, NoHoleException;
}
