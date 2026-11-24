// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yr8 implements g94, kac {
    public final /* synthetic */ lea a;

    public /* synthetic */ yr8(lea leaVar) {
        this.a = leaVar;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.l();
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        lea leaVar = this.a;
        leaVar.i();
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        leaVar.h(new zr8(leaVar, (byte) 1), null);
        return Boolean.TRUE;
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
