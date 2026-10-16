package qg;

import android.os.Looper;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                p4.s0 s0Var = a1Var.w;
                z0 z0Var = a1Var.s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.s = null;
                }
                a1Var.cancelRunnable(s0Var);
                a1Var.postRunnable(s0Var);
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
