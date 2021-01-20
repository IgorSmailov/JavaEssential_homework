package Home_Lambda;

public class Main {
    public static void main(String[] args) {


        Calculator calculatorPlus = (a, b) -> a + b;
       Calculator calculatorMinus = (a, b) -> a - b;
       Calculator calculatorMultiplication = (a, b) -> a * b;
      Calculator calculatorDivision = (a,b) -> b !=0 ? a/b : 0;


        System.out.println(calculatorPlus.calculate(20,13));
        System.out.println(calculatorMinus.calculate(10,5));
        System.out.println(calculatorMultiplication.calculate(2,44));
        System.out.println(calculatorDivision.calculate(23,11));

        }
}
