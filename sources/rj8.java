// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rj8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yj8 b;

    public /* synthetic */ rj8(yj8 yj8Var, byte b) {
        this.a = b;
        this.b = yj8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yj8 yj8Var = this.b;
        switch (b) {
            case 0:
                l11.u(yj8Var.getContext(), "https://" + oc7.r1(yj8Var.T1).N2 + "/nft/" + yj8Var.y2.slug);
                break;
            case 1:
                try {
                    yj8Var.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                yj8Var.j2.c(yj8Var.F2);
                break;
            default:
                yj8Var.J2[0].setVisibility(8);
                break;
        }
    }
}
