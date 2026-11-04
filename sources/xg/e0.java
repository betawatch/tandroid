package xg;

import org.telegram.messenger.h10;
import vg.h1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ e0(g0 g0Var, int i3) {
        this.a = i3;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.l1(this.b);
                break;
            default:
                g0 g0Var = this.b;
                h1 h1Var = new h1(g0Var.p1, h10.t0, null, null, null, g0Var.J0);
                h1Var.C2 = true;
                h1Var.D2 = true;
                h1Var.V1 = true;
                g0Var.p1.showDialog(h1Var);
                break;
        }
    }
}
