// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p54 extends r54 {
    public final vb1 c;
    public final /* synthetic */ t54 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p54(t54 t54Var, long j, vb1 vb1Var) {
        super(j);
        this.d = t54Var;
        this.c = vb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.C(this.d);
    }

    @Override // r54
    public final String toString() {
        return super.toString() + this.c;
    }
}
