// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
