package ph;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ h0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                n0 n0Var = this.b;
                n0Var.e = false;
                k0 k0Var = n0Var.s;
                if (k0Var != null) {
                    k0Var.a(true);
                    n0Var.s = null;
                }
                m0 m0Var = n0Var.n;
                if (m0Var != null) {
                    m0Var.a();
                }
                n0Var.c = false;
                n0Var.d();
                break;
            default:
                n0 n0Var2 = this.b;
                if (n0Var2.c && n0Var2.r != null) {
                    n0Var2.n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    n0Var2.c = false;
                    n0Var2.d();
                    break;
                }
                break;
        }
    }
}
