package vh;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ h0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        n0 n0Var = this.b;
        switch (i10) {
            case 0:
                n0Var.b();
                break;
            case 1:
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
                if (n0Var.c && n0Var.r != null) {
                    n0Var.n.b(R.raw.error, 3500, dd.M0("VideoConvertFail"));
                    n0Var.c = false;
                    n0Var.d();
                    break;
                }
                break;
        }
    }
}
