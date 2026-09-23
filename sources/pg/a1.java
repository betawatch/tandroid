package pg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ a1(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                l7 l7Var = b1Var.w;
                a1 a1Var = b1Var.s;
                if (a1Var != null) {
                    b1Var.cancelRunnable(a1Var);
                    b1Var.s = null;
                }
                b1Var.cancelRunnable(l7Var);
                b1Var.postRunnable(l7Var);
                break;
            case 1:
                b1 b1Var2 = this.b;
                b1Var2.s = null;
                b1Var2.w.run();
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
