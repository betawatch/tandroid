package qg;

import android.os.Looper;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                p4.s0 s0Var = c1Var.w;
                b1 b1Var = c1Var.s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.s = null;
                }
                c1Var.cancelRunnable(s0Var);
                c1Var.postRunnable(s0Var);
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
