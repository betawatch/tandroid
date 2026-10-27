package vi;

import org.telegram.ui.Components.m11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ((m11) u0Var.e).c(q0Var.a);
                return;
            case 1:
                u0 u0Var2 = this.b;
                q0 q0Var2 = this.c;
                r0 r0Var = u0Var2.e;
                long j10 = q0Var2.a;
                m11 m11Var = (m11) r0Var;
                synchronized (m11Var) {
                    m11Var.c(j10);
                }
                return;
            default:
                u0 u0Var3 = this.b;
                q0 q0Var3 = this.c;
                ((m11) u0Var3.e).c(q0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.a = 1;
        this.b = u0Var;
        this.c = q0Var;
    }
}
