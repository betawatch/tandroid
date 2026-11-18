package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ ua0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b;
                ee0Var.b[ee0Var.a].d();
                ee0Var.C1(true, true);
                break;
            default:
                ee0 ee0Var2 = this.b;
                ee0Var2.m0 = true;
                if (ee0Var2.a != 0) {
                    ee0Var2.M1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
