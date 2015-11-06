package edu.javacourse.tractor.entity;

public class EarthField
{
    private EarthLine[] lines;

    public EarthField() {
    }
    
    public EarthField(EarthLine[] lines) {
        this.lines = lines;
    }

    public EarthLine[] getLines() {
        if(lines != null) {
            return lines;
        } else {
            return new EarthLine[0];
        }
    }

    public void setLines(EarthLine[] lines) {
        this.lines = lines;
    }
}
