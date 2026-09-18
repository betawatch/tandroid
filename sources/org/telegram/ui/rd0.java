package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ rd0(yg0 yg0Var, int i10) {
        this.a = i10;
        this.b = yg0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                yg0 yg0Var = this.b;
                yg0Var.b[yg0Var.a].d();
                yg0Var.k1(true, true);
                break;
            default:
                yg0 yg0Var2 = this.b;
                yg0Var2.l0 = true;
                if (yg0Var2.a != 0) {
                    yg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
