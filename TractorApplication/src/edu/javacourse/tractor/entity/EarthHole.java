package edu.javacourse.tractor.entity;

public class EarthHole
{
    public enum EarthHoleState {
        EMPTY, IS_VEGETABLE, IS_SEED, DIRTY
    };
    private EarthHoleState state;
    private int holeId;

    public EarthHole(int holeId) {
        this(holeId, EarthHoleState.EMPTY);
    }

    public EarthHole(int holeId, EarthHoleState state) {
        this.holeId = holeId;
        this.state = state;
    }

    public int getHoleId() {
        return holeId;
    }

    public void setHoleId(int holeId) {
        this.holeId = holeId;
    }
    
    public EarthHoleState getState() {
        return state;
    }

    public void setState(EarthHoleState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" + "state=" + state + ", holeId=" + holeId + '}';
    }
}
