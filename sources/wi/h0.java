package wi;

import org.telegram.ui.Components.hy0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;

    public /* synthetic */ h0(t0 t0Var, p0 p0Var, int i7, int i10) {
        this.a = i10;
        this.b = t0Var;
        this.c = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                p0 p0Var = this.c;
                ((hy0) t0Var.e).c(p0Var.a);
                return;
            case 1:
                t0 t0Var2 = this.b;
                p0 p0Var2 = this.c;
                q0 q0Var = t0Var2.e;
                long j3 = p0Var2.a;
                hy0 hy0Var = (hy0) q0Var;
                synchronized (hy0Var) {
                    hy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.b;
                p0 p0Var3 = this.c;
                ((hy0) t0Var3.e).c(p0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.a = 1;
        this.b = t0Var;
        this.c = p0Var;
    }
}
