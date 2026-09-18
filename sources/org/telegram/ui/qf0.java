package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ qf0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                bg0 bg0Var = this.b;
                bg0Var.c(true);
                bg0Var.s0.u1(0, true, null, true);
                break;
            default:
                this.b.s0.u1(0, true, null, true);
                break;
        }
    }
}
