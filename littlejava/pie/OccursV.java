package littlejava.pie;

public class OccursV implements PieVisitorI {
    Object a;
    OccursV(Object _a) {
        a = _a;
    }
    //--------------------------------
    @Override
    public Object forBot() {
        return new Integer(0);
    }

    @Override
    public Object forTop(Object t, PieD r) {
        if (t.equals(a)) {
            return new Integer(((Integer)(r.accept(this))).intValue() + 1);
        }
        else {
            return r.accept(this);
        }
    }
}