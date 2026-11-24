// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sc1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tc1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sc1(tc1 tc1Var, boolean z, byte b) {
        this.a = b;
        this.b = tc1Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        tc1 tc1Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    tc1Var.Z0.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    tc1Var.V0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
