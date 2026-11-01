package vh;

import org.telegram.messenger.dd;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ o7 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ n7(o7 o7Var, Runnable runnable, boolean z10) {
        this.b = o7Var;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = this.d;
        Runnable runnable = this.c;
        o7 o7Var = this.b;
        switch (i10) {
            case 0:
                o7Var.g(runnable, z10);
                break;
            default:
                runnable.run();
                o8 o8Var = o7Var.a;
                o2 o2Var = o8Var.T0;
                o2Var.a.t(dd.L0(z10 ? 2131744679 : 2131744680, null), false, true);
                o2Var.invalidate();
                o8Var.g(true, true);
                o8Var.c0(true);
                o8Var.I0.a(false, true);
                o8Var.J0.b(true, true);
                o8Var.h0(true, true);
                break;
        }
    }

    public /* synthetic */ n7(o7 o7Var, boolean z10, Runnable runnable) {
        this.b = o7Var;
        this.d = z10;
        this.c = runnable;
    }
}
