package qg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                l7 l7Var = a1Var.w;
                z0 z0Var = a1Var.s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.s = null;
                }
                a1Var.cancelRunnable(l7Var);
                a1Var.postRunnable(l7Var);
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
