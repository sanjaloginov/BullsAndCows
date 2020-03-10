package tsi.javacourses;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

import java.util.Random;

public class PrimaryController {

    private int count;
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Turn> turnsTable;
    Random rand = new Random();

    int a = rand.nextInt(10);
    int b = rand.nextInt(10);
    /*for ( ; ; ) {
        if (b == a) {
            b = rand.nextInt(10);
        } else {
            break;
        }
    }*/
    int c = rand.nextInt(10);
    int d = rand.nextInt(10);

    public void doTurn() {
        count++;
        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();

        var turn = new Turn();
        turn.setNr(count);
        turn.setGuess("" + n1 + n2 + n3 + n4);

        turnsTable.getItems().add(0,turn);

        System.out.printf("TURN %d %d %d %d%n", n1, n2, n3, n4);
        System.out.printf("%d %d %d %d%n", a, b, c, d);
    }
}
