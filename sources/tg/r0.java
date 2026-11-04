package tg;

import android.os.Looper;
import org.telegram.ui.Components.lt;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i3) {
        this.a = i3;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                lt ltVar = s0Var.x;
                r0 r0Var = s0Var.s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.s = null;
                }
                s0Var.cancelRunnable(ltVar);
                s0Var.postRunnable(ltVar);
                break;
            case 1:
                s0 s0Var2 = this.b;
                s0Var2.s = null;
                s0Var2.x.run();
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
