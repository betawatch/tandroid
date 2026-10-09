package pg;

import android.os.Looper;
import org.telegram.ui.Wallet.n5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ b1(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                n5 n5Var = c1Var.w;
                b1 b1Var = c1Var.s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.s = null;
                }
                c1Var.cancelRunnable(n5Var);
                c1Var.postRunnable(n5Var);
                break;
            case 1:
                c1 c1Var2 = this.b;
                c1Var2.s = null;
                c1Var2.w.run();
                break;
            default:
                this.b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
        }
    }
}
