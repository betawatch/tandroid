package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;

    public /* synthetic */ x80(e90 e90Var, int i3) {
        this.a = i3;
        this.b = e90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        e90 e90Var = this.b;
        switch (i3) {
            case 0:
                sf.c.t(e90Var.getParentActivity(), org.telegram.messenger.bd.M0(2131746166, null));
                break;
            case 1:
                e90Var.r.d.requestFocus();
                org.telegram.messenger.g0.K3(e90Var.r.d);
                break;
            default:
                e90Var.r.d.clearFocus();
                org.telegram.messenger.g0.v1(e90Var.r.d);
                break;
        }
    }
}
