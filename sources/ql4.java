// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ql4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tl4 b;

    public /* synthetic */ ql4(tl4 tl4Var, byte b) {
        this.a = b;
        this.b = tl4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tl4 tl4Var = this.b;
        switch (b) {
            case 0:
                tl4Var.q();
                if (tl4Var.b.i()) {
                    gm.d3(this, 500L);
                    break;
                }
                break;
            default:
                if (!tl4Var.b.G()) {
                    tl4Var.u = false;
                    tl4Var.o(false);
                    tl4Var.w = false;
                    break;
                } else {
                    gm.d3(this, 1500L);
                    break;
                }
        }
    }
}
