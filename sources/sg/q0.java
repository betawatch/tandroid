package sg;

import android.os.Looper;
import org.telegram.ui.Wallet.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ q0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                o5 o5Var = r0Var.x;
                q0 q0Var = r0Var.s;
                if (q0Var != null) {
                    r0Var.cancelRunnable(q0Var);
                    r0Var.s = null;
                }
                r0Var.cancelRunnable(o5Var);
                r0Var.postRunnable(o5Var);
                break;
            case 1:
                r0 r0Var2 = this.b;
                r0Var2.s = null;
                r0Var2.x.run();
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
