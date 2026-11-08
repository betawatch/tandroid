package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm0 b;

    public /* synthetic */ rl0(bm0 bm0Var, int i7) {
        this.a = i7;
        this.b = bm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        bm0 bm0Var = this.b;
        switch (i7) {
            case 0:
                if (bm0Var.G) {
                    bm0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                bm0Var.h();
                break;
            case 2:
                int i10 = bm0.q0;
                bm0Var.h();
                break;
            default:
                int i11 = bm0.q0;
                bm0Var.h();
                break;
        }
    }
}
