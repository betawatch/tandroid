package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm0 b;

    public /* synthetic */ tl0(dm0 dm0Var, int i7) {
        this.a = i7;
        this.b = dm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        dm0 dm0Var = this.b;
        switch (i7) {
            case 0:
                if (dm0Var.H) {
                    dm0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                dm0Var.h();
                break;
            case 2:
                int i10 = dm0.r0;
                dm0Var.h();
                break;
            default:
                int i11 = dm0.r0;
                dm0Var.h();
                break;
        }
    }
}
