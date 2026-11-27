// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class yfb extends ax2 implements ss4 {
    private final int arity;

    public yfb(int i, zw2 zw2Var) {
        super(zw2Var);
        this.arity = i;
    }

    @Override // ss4
    public int getArity() {
        return this.arity;
    }

    @Override // qf0
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s89.a.getClass();
        return t89.a(this);
    }
}
