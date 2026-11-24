// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zp2 extends bq2 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ dq2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp2(dq2 dq2Var, byte b) {
        super(dq2Var);
        this.f = b;
        this.h = dq2Var;
    }

    @Override // bq2
    public final Object a(int i) {
        byte b = this.f;
        dq2 dq2Var = this.h;
        switch (b) {
            case 0:
                return dq2Var.g(i);
            case 1:
                return new cq2(dq2Var, i);
            default:
                return dq2Var.l(i);
        }
    }
}
