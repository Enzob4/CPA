package TD2;

public class Operation extends ExpressionArithmetique {

    ExpressionArithmetique op1;
    ExpressionArithmetique op2;
    private char op;

    public Operation(ExpressionArithmetique op1,ExpressionArithmetique op2,char op){
        this.op=op;
        this.op1=op1;
        this.op2=op2;
    }
    @Override
    public double eval() {
        return 0;


    }

    @Override
    public String toString() {
        return "Op1 :"+op1+", Op2 :" +op2+",Operateur :"+op;
    }
}
