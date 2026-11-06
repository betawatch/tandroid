package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be0 b;

    public /* synthetic */ qd0(be0 be0Var, int i7) {
        this.a = i7;
        this.b = be0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                be0 be0Var = this.b;
                zd0 zd0Var = be0Var.a;
                ce0 ce0Var = be0Var.g0;
                zd0 zd0Var2 = be0Var.b;
                if (zd0Var2 != null) {
                    if (ce0Var.c0) {
                        zd0Var.clearFocus();
                        zd0Var2.clearFocus();
                    } else if (zd0Var.length() != 0) {
                        zd0Var2.requestFocus();
                        if (!be0Var.T) {
                            zd0Var2.setSelection(zd0Var2.length());
                        }
                        ce0.b1(ce0Var, zd0Var2);
                    } else {
                        zd0Var.requestFocus();
                        ce0.b1(ce0Var, zd0Var);
                    }
                }
                if (ce0Var.F == 0) {
                    be0Var.s();
                    break;
                }
                break;
            case 1:
                be0 be0Var2 = this.b;
                be0Var2.postDelayed(new qd0(be0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                be0 be0Var3 = this.b;
                ce0.b1(be0Var3.g0, be0Var3.b);
                break;
        }
    }
}
