package TD2;

public abstract class ExpressionArithmetique {
    public ExpressionArithmetique(){
        super();
    }

    public abstract double eval();

    public abstract String toString();

    public boolean equals(Object o) {
        return false;
    }


}
