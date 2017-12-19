public class Main {

    public static void main(String[] args) {

        TriangleExercises triangleExercises = new TriangleExercises();

        System.out.println("Print one star: ");
        triangleExercises.printStars(1);

        System.out.println("Print horizontal line: ");
        triangleExercises.printStars(8);

        System.out.println("Print vertical line: ");
        triangleExercises.printVerticalLine(3);

        System.out.println("Print a right triangle: ");
        triangleExercises.printRightTriangle(3);
    }
}
