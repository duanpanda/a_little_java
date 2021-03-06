package shape;

public class Union extends ShapeD {
    ShapeD s;
    ShapeD t;
    public Union(ShapeD _s, ShapeD _t) {
        s = _s;
        t = _t;
    }
    //--------------------------------
    @Override
    public boolean accept(ShapeVisitorI ask) {
        // The parameter ShapeVisitorI 'ask' may be generated by the generator
        // in HasPtV.forTrans().
        // How can we make sure that the generator creates a UnionVisitorI for
        // Union? By the factory method newHasPt()!
        // Otherwise, we could run into an exception:
        //     java.lang.ClassCastException: HasPtV cannot be cast to UnionVisitorI
        //         at Union.accept(...java: ...)
        //         at HasPtV.forTrans(...java: ...)
        //         at Translation.accept(...java: ...)
        // This RuntimeException indicates that the attempt to confirm the
        // UnionVisitorIness of the object failed.
        return ((UnionVisitorI)ask).forUnion(s, t);
    }

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + s + ", " + t + ")";
    }
}
