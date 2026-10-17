package si;

import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;

    public /* synthetic */ h0(t0 t0Var, p0 p0Var, int i10, int i11) {
        this.a = i11;
        this.b = t0Var;
        this.c = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                p0 p0Var = this.c;
                ((y01) t0Var.e).c(p0Var.a);
                return;
            case 1:
                t0 t0Var2 = this.b;
                p0 p0Var2 = this.c;
                q0 q0Var = t0Var2.e;
                long j10 = p0Var2.a;
                y01 y01Var = (y01) q0Var;
                synchronized (y01Var) {
                    y01Var.c(j10);
                }
                return;
            default:
                t0 t0Var3 = this.b;
                p0 p0Var3 = this.c;
                ((y01) t0Var3.e).c(p0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.a = 1;
        this.b = t0Var;
        this.c = p0Var;
    }
}
