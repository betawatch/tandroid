// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y62 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v72 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y62(v72 v72Var, int i, byte b) {
        this.a = b;
        this.b = v72Var;
        this.c = i;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.h0(i, (nf8) obj);
                break;
            default:
                v72Var.h0(i, new sf8((String) obj));
                break;
        }
    }
}
