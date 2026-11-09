package wi;

import org.telegram.ui.Components.iy0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ((iy0) t0Var.e).c(p0Var.a);
                return;
            case 1:
                t0 t0Var2 = this.b;
                p0 p0Var2 = this.c;
                q0 q0Var = t0Var2.e;
                long j3 = p0Var2.a;
                iy0 iy0Var = (iy0) q0Var;
                synchronized (iy0Var) {
                    iy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.b;
                p0 p0Var3 = this.c;
                ((iy0) t0Var3.e).c(p0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.a = 1;
        this.b = t0Var;
        this.c = p0Var;
    }
}
