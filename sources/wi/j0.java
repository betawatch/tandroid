package wi;

import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j0(nh nhVar, Exception exc, int i3) {
        this.a = i3;
        this.b = nhVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b.b;
                t0Var.m.a("recording segment interrupted in state=".concat(t4.c.t(t0Var.Z)), this.c);
                int i3 = t0Var.Z;
                if (i3 != 3) {
                    if (i3 == 2) {
                        t0Var.D = true;
                        break;
                    }
                } else {
                    t0Var.q();
                    break;
                }
                break;
            default:
                ((t0) this.b.b).h(this.c);
                break;
        }
    }
}
