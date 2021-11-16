package TD2;

public class Addition extends Operation {

    public Addition(ExpressionArithmetique op1,ExpressionArithmetique op2){
        super(op1,op2,'+');
    }

    public double eval() {
        return op1.eval()+op2.eval();
    }

}
