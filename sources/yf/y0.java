package yf;

import android.os.Looper;
import org.telegram.ui.Components.mu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ y0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                mu0 mu0Var = z0Var.w;
                y0 y0Var = z0Var.s;
                if (y0Var != null) {
                    z0Var.cancelRunnable(y0Var);
                    z0Var.s = null;
                }
                z0Var.cancelRunnable(mu0Var);
                z0Var.postRunnable(mu0Var);
                break;
            case 1:
                z0 z0Var2 = this.b;
                z0Var2.s = null;
                z0Var2.w.run();
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
