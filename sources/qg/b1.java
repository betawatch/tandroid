package qg;

import android.os.Looper;
import org.telegram.ui.Wallet.m4;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                m4 m4Var = c1Var.w;
                b1 b1Var = c1Var.s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.s = null;
                }
                c1Var.cancelRunnable(m4Var);
                c1Var.postRunnable(m4Var);
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
