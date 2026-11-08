package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
