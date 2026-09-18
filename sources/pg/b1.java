package pg;

import android.os.Looper;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                p8.b bVar = c1Var.w;
                b1 b1Var = c1Var.s;
                if (b1Var != null) {
                    c1Var.cancelRunnable(b1Var);
                    c1Var.s = null;
                }
                c1Var.cancelRunnable(bVar);
                c1Var.postRunnable(bVar);
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
