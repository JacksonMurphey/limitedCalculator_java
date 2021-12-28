public class Calculator {
    
    private double operandOne;
    private double operandTwo;
    private String operator;
    private double results;  

    public Calculator(){
        this.operandOne;
        this.operandTwo;
        this.operator = "";
        this.results = 0.00; 

    }

    public void setOperator(String operator){
        this.operator = operator; 
    }
    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }
    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }

    public double performOperation(){
        if(operator.equals("+")){
        this.results = this.operandOne + this.operandTwo;}

        if(operator.equals("-")){
            this.results = this.operandOne - this.operandTwo;
        }

        return this.results; 
    }

    public double getResults(){
        System.out.println(this.results);
        return this.results;
    }

}
