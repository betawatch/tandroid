// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
