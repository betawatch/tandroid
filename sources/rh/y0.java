package rh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                c4 c4Var = d1Var.N;
                if (c4Var != null && d1Var.d != null) {
                    d1Var.O = true;
                    c4Var.b().setPressed(false);
                    try {
                        d1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((m2) d1Var.d).a(d1Var, d1Var.N, true);
                    break;
                }
                break;
            case 1:
                this.b.n();
                break;
            default:
                this.b.s();
                break;
        }
    }
}
