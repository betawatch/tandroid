package si;

import org.telegram.ui.Components.d11;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ h0(u0 u0Var, q0 q0Var, int i10, int i11) {
        this.a = i11;
        this.b = u0Var;
        this.c = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                q0 q0Var = this.c;
                ((d11) u0Var.e).c(q0Var.a);
                return;
            case 1:
                u0 u0Var2 = this.b;
                q0 q0Var2 = this.c;
                r0 r0Var = u0Var2.e;
                long j10 = q0Var2.a;
                d11 d11Var = (d11) r0Var;
                synchronized (d11Var) {
                    d11Var.c(j10);
                }
                return;
            default:
                u0 u0Var3 = this.b;
                q0 q0Var3 = this.c;
                ((d11) u0Var3.e).c(q0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.a = 1;
        this.b = u0Var;
        this.c = q0Var;
    }
}
