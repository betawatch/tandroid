package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.am0 b;

    public /* synthetic */ qe(org.telegram.ui.Components.am0 am0Var, int i10) {
        this.a = i10;
        this.b = am0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.am0 am0Var = this.b;
                if (!am0Var.M) {
                    am0Var.M = true;
                    am0Var.c(new org.telegram.ui.Components.yl0(am0Var, 0), false);
                    am0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
