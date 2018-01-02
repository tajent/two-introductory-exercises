public class Main {

    public static void main(String[] args) {

        ShapeExercises shapeExercises = new ShapeExercises();
        FizzBuzz fizzBuzzExercise = new FizzBuzz();
        PrimeFactors primeFactorsExercise = new PrimeFactors();

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

        System.out.println("Print FizzBuzz for numbers 1-100: ");
        fizzBuzzExercise.fizzBuzz();

        System.out.println("Print prime factors of 30");
        primeFactorsExercise.generate(30);
    }
}
