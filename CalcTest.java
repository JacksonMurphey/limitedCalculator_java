public class CalcTest {
    

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        calc.setOperandOne(10.5);
        calc.setOperator("+");
        calc.setOperandTwo(5.2);
        calc.performOperation();
        calc.getResults();

        
        Calculator minus = new Calculator();

        minus.setOperandOne(25.5);
        minus.setOperator("-");
        minus.setOperandTwo(20);
        minus.performOperation();
        minus.getResults();

    }
}
