public class TriangleExercises {

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
}
