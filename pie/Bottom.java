package pie;

public class Bottom extends PieD {
    public Object accept(PieVisitorI ask) {
        return ask.forBot(this);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
