// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sw2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hx2 b;

    public /* synthetic */ sw2(hx2 hx2Var, byte b) {
        this.a = b;
        this.b = hx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hx2 hx2Var = this.b;
        switch (b) {
            case 0:
                hx2Var.c0 = null;
                break;
            case 1:
                hx2Var.A.g0(null);
                kw7 kw7Var = hx2Var.C;
                if (kw7Var != null) {
                    kw7Var.a();
                    hx2Var.z.removeView(hx2Var.C);
                    hx2Var.C = null;
                    break;
                }
                break;
            default:
                hx2Var.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(d53.h).start();
                break;
        }
    }
}
