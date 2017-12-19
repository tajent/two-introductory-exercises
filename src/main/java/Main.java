public class Main {

    public static void main(String[] args) {

        ShapeExercises shapeExercises = new ShapeExercises();

        System.out.println("Print one star: ");
        shapeExercises.printStars(1);

        System.out.println("Print horizontal line: ");
        shapeExercises.printStars(8);

        System.out.println("Print vertical line: ");
        shapeExercises.printVerticalLine(3);

        System.out.println("Print a right triangle: ");
        shapeExercises.printRightTriangle(3);

        System.out.println("Print an isosceles triangle: ");
        shapeExercises.printIsosTriangle(3);

        System.out.println("Print a diamond: ");
        shapeExercises.printDiamond(3);

        System.out.println("Print a diamond with a name: ");
        shapeExercises.printDiamondName(3);
    }
}
