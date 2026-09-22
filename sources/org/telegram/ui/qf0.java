package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ qf0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
