// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ra9 extends of0 implements oq4 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ra9(int i, fw2 fw2Var) {
        super(fw2Var);
        if (fw2Var == null || fw2Var.getContext() == z14.a) {
            this.a = i;
        } else {
            w26.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // oq4
    public final int getArity() {
        return this.a;
    }

    @Override // fw2
    public final sw2 getContext() {
        return z14.a;
    }

    @Override // of0
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        f59.a.getClass();
        return g59.a(this);
    }
}
