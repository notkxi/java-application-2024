//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Sequence seqa = new Sequence();
    Sequence seqb = new Sequence();

    seqa.add(1);
    seqa.add(4);
    seqa.add(9);
    seqa.add(16);

    seqb.add(9);
    seqb.add(7);
    seqb.add(4);
    seqb.add(9);
    seqb.add(11);

    seqa.merge(seqb);

    System.out.println(seqa.merge(seqb));
        }
    }
