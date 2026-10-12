package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public /* synthetic */ qp0(aq0 aq0Var, int i10) {
        this.a = i10;
        this.b = aq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        aq0 aq0Var = this.b;
        switch (i10) {
            case 0:
                if (aq0Var.G) {
                    aq0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                aq0Var.h();
                break;
            case 2:
                int i11 = aq0.q0;
                aq0Var.h();
                break;
            default:
                int i12 = aq0.q0;
                aq0Var.h();
                break;
        }
    }
}
