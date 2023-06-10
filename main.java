import java.io.IOException;
import java.util.Scanner;


class Example1 {
    static Integer cell[] = {0,0,0,0,0,0,0,0,0};
    static Integer r = 0;

    public static void TemplateText() {
        System.out.print("\t\t\t\t=================\n");
        System.out.print("\t\t\t\t  Template 3x3\n");
        System.out.print("\t\t\t\t=================\n");
        System.out.print("\t\t\t\t    1 | 2 | 3\n");
        System.out.print("\t\t\t\t    4 | 5 | 6\n");
        System.out.print("\t\t\t\t    7 | 8 | 9\n");
        System.out.print("\t\t\t\t=================\n");
    }

    public static void MatrixFillingText() {
        System.out.print("\t\t\t\tFill in the cells\n");
        System.out.print("\t\t\t\t=================\n");
        System.out.format("\t\t\t\t%s\t%s\t%s\n", cell[0], cell[1], cell[2]);
        System.out.format("\t\t\t\t%s\t%s\t%s\n", cell[3], cell[4], cell[5]);
        System.out.format("\t\t\t\t%s\t%s\t%s\n", cell[6], cell[7], cell[8]);
        System.out.print("\t\t\t\t=================\n\n");
        System.out.print("Note: you can enter all 9 numbers in any 'cell' separated by a space (5 -12)\n\n");
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Solving a Matrix by a Simple Method (Java)");
        TemplateText();
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < cell.length; i ++ ) {
                MatrixFillingText();

                System.out.format("cell %s > ", i+1);
                cell[i] = Integer.parseInt(sc.next());
                
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            MatrixFillingText();
            r = cell[0] * (cell[4] * cell[8] - cell[5] * cell[7]) - cell[1] * (cell[3] * cell[8] - cell[5] * cell[6]) + cell[2] * (cell[3] * cell[7] - cell[4] * cell[6]);
            System.out.format("\t\t\t\tResult: %s", r);
        }
    }
}
