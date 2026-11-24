// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bn9 b;

    public /* synthetic */ ym9(bn9 bn9Var, byte b) {
        this.a = b;
        this.b = bn9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bn9 bn9Var = this.b;
        switch (b) {
            case 0:
                bn9Var.c();
                break;
            default:
                bn9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(d53.h).setDuration(280L).start();
                bn9Var.c = System.currentTimeMillis();
                bn9Var.invalidate();
                try {
                    bn9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                gm.d3(bn9Var.h, 59500L);
                break;
        }
    }
}
