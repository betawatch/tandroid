package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public /* synthetic */ so0(cp0 cp0Var, int i10) {
        this.a = i10;
        this.b = cp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        cp0 cp0Var = this.b;
        switch (i10) {
            case 0:
                if (cp0Var.G) {
                    cp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                cp0Var.h();
                break;
            case 2:
                int i11 = cp0.q0;
                cp0Var.h();
                break;
            default:
                int i12 = cp0.q0;
                cp0Var.h();
                break;
        }
    }
}
