package pg;

import android.os.Looper;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ b1(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                c1 c1Var = d1Var.w;
                b1 b1Var = d1Var.s;
                if (b1Var != null) {
                    d1Var.cancelRunnable(b1Var);
                    d1Var.s = null;
                }
                d1Var.cancelRunnable(c1Var);
                d1Var.postRunnable(c1Var);
                break;
            case 1:
                d1 d1Var2 = this.b;
                d1Var2.s = null;
                d1Var2.w.run();
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
