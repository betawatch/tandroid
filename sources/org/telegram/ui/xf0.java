package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ xf0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hg0 hg0Var = this.b;
                mj0 mj0Var = hg0Var.a;
                ig0 ig0Var = hg0Var.R;
                eg0 eg0Var = hg0Var.b;
                if (eg0Var != null) {
                    if (ig0Var.Y) {
                        mj0Var.clearFocus();
                        eg0Var.clearFocus();
                    } else if (mj0Var.length() != 0) {
                        eg0Var.requestFocus();
                        if (!hg0Var.N) {
                            eg0Var.setSelection(eg0Var.length());
                        }
                        ig0.T0(ig0Var, eg0Var);
                    } else {
                        mj0Var.requestFocus();
                        ig0.T0(ig0Var, mj0Var);
                    }
                }
                if (ig0Var.B == 0) {
                    hg0Var.t(false);
                    break;
                }
                break;
            case 1:
                hg0 hg0Var2 = this.b;
                hg0Var2.postDelayed(new xf0(hg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                hg0 hg0Var3 = this.b;
                ig0.T0(hg0Var3.R, hg0Var3.b);
                break;
        }
    }
}
