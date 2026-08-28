package xf;

import android.os.Looper;
import org.telegram.ui.Components.ju0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i9) {
        this.a = i9;
        this.b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                ju0 ju0Var = a1Var.w;
                z0 z0Var = a1Var.s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.s = null;
                }
                a1Var.cancelRunnable(ju0Var);
                a1Var.postRunnable(ju0Var);
                break;
            case 1:
                a1 a1Var2 = this.b;
                a1Var2.s = null;
                a1Var2.w.run();
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
