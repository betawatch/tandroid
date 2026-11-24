// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
