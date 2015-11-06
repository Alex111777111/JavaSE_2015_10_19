package edu.javacourse.tractor.entity;

public class EarthLine
{
    private EarthHole[] holes;

    public EarthLine() {
    }

    public EarthLine(EarthHole[] holes) {
        this.holes = holes;
    }
    
    public EarthHole[] getHoles() {
        if(holes != null) {
            return holes;
        } else {
            return new EarthHole[0];
        }
    }

    public void setHoles(EarthHole[] holes) {
        this.holes = holes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(EarthHole eh : holes) {
            sb.append(eh.toString());
        }
        return "EarthLine {" + sb.toString() + "}";
    }
    
    
}
