package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp0 b;

    public /* synthetic */ to0(dp0 dp0Var, int i10) {
        this.a = i10;
        this.b = dp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        dp0 dp0Var = this.b;
        switch (i10) {
            case 0:
                if (dp0Var.G) {
                    dp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                dp0Var.h();
                break;
            case 2:
                int i11 = dp0.q0;
                dp0Var.h();
                break;
            default:
                int i12 = dp0.q0;
                dp0Var.h();
                break;
        }
    }
}
