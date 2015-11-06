package edu.javacourse.tractor;

import edu.javacourse.tractor.engine.BelarusTractor;
import edu.javacourse.tractor.engine.Tractor;
import edu.javacourse.tractor.entity.EarthField;
import edu.javacourse.tractor.entity.EarthHole;
import edu.javacourse.tractor.entity.EarthLine;
import edu.javacourse.tractor.exception.NoHoleException;
import edu.javacourse.tractor.exception.UnknownStateException;

public class TractorApplication
{
    private static final int LINE_COUNT = 3;
    private static final int HOLE_COUNT = 5;

    public static void main(String[] args) {
        Tractor tr = new BelarusTractor();
//        Tractor tr = null; //new BelarusTractor();

        EarthField ef = initField();
        System.out.println(ef.getLines().length);
        for (int i = 0; i < ef.getLines().length; i++) {
            System.out.println(ef.getLines()[i]);
        }

        for (int i = 0; i < ef.getLines().length; i++) {
            EarthLine el = ef.getLines()[i];
            tr.setLine(el);
            System.out.println("Moved to Line:" + i);
            for (int j = 0; j < el.getHoles().length; j++) {
                EarthHole eh = el.getHoles()[j];
                tr.moveToHole(eh);
                EarthHole h = null;
                try {
                    h = tr.processHole();
                    System.out.println("OK 1");
                    System.out.println("OK 2");
                } catch (UnknownStateException ex) {
                    System.out.println(ex.getMessage() + ", code=" + ex.getErrorCode());
                    System.out.println("Hole is not processed:" + eh);
                } catch (NoHoleException ex) {
                    System.out.println(ex.getMessage() + ", code=" + ex.getErrorCode());
                    System.out.println("Hole is not processed:" + eh);
                } catch (Exception ex) {
                    System.out.println("UnknownException");
                } finally {
                    System.out.println("FINALLY");
                }
            }
        }
    }

    public static EarthField initField() {
        EarthField ef = new EarthField();
        EarthLine[] el = new EarthLine[LINE_COUNT];
        for (int i = 0; i < el.length; i++) {
            el[i] = new EarthLine();
            el[i].setHoles(initHoles());
        }
        ef.setLines(el);

        return ef;
    }

    public static EarthHole[] initHoles() {
        EarthHole[] eh = new EarthHole[HOLE_COUNT];
        for (int i = 0; i < eh.length; i++) {
            eh[i] = new EarthHole(i);
            int tmp = (int) (Math.random() * 4 + 1);
            switch (tmp) {
                case 1:
                    eh[i].setState(EarthHole.EarthHoleState.EMPTY);
                    break;
                case 2:
                    eh[i].setState(EarthHole.EarthHoleState.IS_VEGETABLE);
                    break;
                case 3:
                    eh[i].setState(EarthHole.EarthHoleState.IS_SEED);
                    break;
                default:
                    eh[i].setState(EarthHole.EarthHoleState.DIRTY);
                    break;
            }
        }

        return eh;
    }
}
