package zi;

import org.telegram.ui.Components.qy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ h0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.a = i10;
        this.b = u0Var;
        this.c = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                q0 q0Var = this.c;
                ((qy0) u0Var.e).c(q0Var.a);
                return;
            case 1:
                u0 u0Var2 = this.b;
                q0 q0Var2 = this.c;
                r0 r0Var = u0Var2.e;
                long j3 = q0Var2.a;
                qy0 qy0Var = (qy0) r0Var;
                synchronized (qy0Var) {
                    qy0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.b;
                q0 q0Var3 = this.c;
                ((qy0) u0Var3.e).c(q0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.a = 1;
        this.b = u0Var;
        this.c = q0Var;
    }
}
