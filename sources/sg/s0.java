package sg;

import android.os.Looper;
import org.telegram.ui.Components.dt;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ s0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                dt dtVar = t0Var.x;
                s0 s0Var = t0Var.s;
                if (s0Var != null) {
                    t0Var.cancelRunnable(s0Var);
                    t0Var.s = null;
                }
                t0Var.cancelRunnable(dtVar);
                t0Var.postRunnable(dtVar);
                break;
            case 1:
                t0 t0Var2 = this.b;
                t0Var2.s = null;
                t0Var2.x.run();
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
