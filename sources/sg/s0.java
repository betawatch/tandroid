package sg;

import android.os.Looper;
import org.telegram.ui.Components.et;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ s0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                et etVar = u0Var.x;
                s0 s0Var = u0Var.s;
                if (s0Var != null) {
                    u0Var.cancelRunnable(s0Var);
                    u0Var.s = null;
                }
                u0Var.cancelRunnable(etVar);
                u0Var.postRunnable(etVar);
                break;
            case 1:
                u0 u0Var2 = this.b;
                u0Var2.s = null;
                u0Var2.x.run();
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
