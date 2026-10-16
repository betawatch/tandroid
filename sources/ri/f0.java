package ri;

import org.telegram.ui.Components.d11;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ n0 c;

    public /* synthetic */ f0(r0 r0Var, n0 n0Var, int i10, int i11) {
        this.a = i11;
        this.b = r0Var;
        this.c = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                n0 n0Var = this.c;
                ((d11) r0Var.e).c(n0Var.a);
                return;
            case 1:
                r0 r0Var2 = this.b;
                n0 n0Var2 = this.c;
                o0 o0Var = r0Var2.e;
                long j10 = n0Var2.a;
                d11 d11Var = (d11) o0Var;
                synchronized (d11Var) {
                    d11Var.c(j10);
                }
                return;
            default:
                r0 r0Var3 = this.b;
                n0 n0Var3 = this.c;
                ((d11) r0Var3.e).c(n0Var3.a);
                return;
        }
    }

    public /* synthetic */ f0(r0 r0Var, n0 n0Var, Exception exc) {
        this.a = 1;
        this.b = r0Var;
        this.c = n0Var;
    }
}
