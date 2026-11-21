package sg;

import android.os.Looper;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                s4.s0 s0Var2 = s0Var.x;
                r0 r0Var = s0Var.s;
                if (r0Var != null) {
                    s0Var.cancelRunnable(r0Var);
                    s0Var.s = null;
                }
                s0Var.cancelRunnable(s0Var2);
                s0Var.postRunnable(s0Var2);
                break;
            case 1:
                s0 s0Var3 = this.b;
                s0Var3.s = null;
                s0Var3.x.run();
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
