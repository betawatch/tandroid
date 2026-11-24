// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class rc9 extends og0 implements ps4 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public rc9(int i, px2 px2Var) {
        super(px2Var);
        if (px2Var == null || px2Var.getContext() == k34.a) {
            this.a = i;
        } else {
            u36.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // ps4
    public final int getArity() {
        return this.a;
    }

    @Override // px2
    public final cy2 getContext() {
        return k34.a;
    }

    @Override // og0
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        h79.a.getClass();
        return i79.a(this);
    }
}
