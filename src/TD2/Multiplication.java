package TD2;

public class Multiplication extends Operation {

    public Multiplication(ExpressionArithmetique op1,ExpressionArithmetique op2){
        super(op1,op2,'*');
    }

    public double eval() {
        return op1.eval()*op2.eval();
    }


}
