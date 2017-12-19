public class ShapeExercises {

    public void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public void printVerticalLine(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            printStars(1);
        }
    }

    public void printRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            printStars(i);
        }
    }

    public void printWhitespaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    public void printIsosTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            printWhitespaces(height - i);
            printStars(2*i-1);
        }
    }

    public void printDiamond(int size) {
        printIsosTriangle(size);
        for (int i = size; i > 1; i--) {
            printWhitespaces(size+1-i);
            printStars(2*i-3);
        }
    }

    public void printDiamondName(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            if (i == size) {
                System.out.println("Jeannette");
            } else {
                printStars(2*i-1);
            }
        }
        for (int i = size; i > 1; i--) {
            printWhitespaces(size+1-i);
            printStars(2*i-3);
        }
    }
}
