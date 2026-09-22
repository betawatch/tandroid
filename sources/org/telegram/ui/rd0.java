package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ rd0(yg0 yg0Var, int i10) {
        this.a = i10;
        this.b = yg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
