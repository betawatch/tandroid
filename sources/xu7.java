// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class xu7 implements ht3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xu7(xv7 xv7Var, boolean z, byte b) {
        this.a = b;
        this.b = xv7Var;
        this.c = z;
    }

    @Override // ht3
    public final void a(zna znaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                jv7 jv7Var = xv7Var.m1;
                if (znaVar == xv7Var.s1) {
                    xv7Var.s1 = null;
                    if (!z2) {
                        jv7Var.setVisibility(8);
                        m58.e(xv7Var.v1).g();
                        jv7Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                tu7 tu7Var = xv7Var.c1;
                if (znaVar == xv7Var.l1) {
                    xv7Var.l1 = null;
                    if (!z2) {
                        tu7Var.setVisibility(8);
                    }
                    tu7Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
