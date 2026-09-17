package qg;

import android.os.Looper;
import org.telegram.ui.Cells.l7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
