package sg;

import android.os.Looper;
import org.telegram.ui.Components.dt;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                dt dtVar = u0Var.x;
                s0 s0Var = u0Var.s;
                if (s0Var != null) {
                    u0Var.cancelRunnable(s0Var);
                    u0Var.s = null;
                }
                u0Var.cancelRunnable(dtVar);
                u0Var.postRunnable(dtVar);
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
