package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ wc0(fg0 fg0Var, int i9) {
        this.a = i9;
        this.b = fg0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.b[fg0Var.a].d();
                fg0Var.k1(true, true);
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.h0 = true;
                if (fg0Var2.a != 0) {
                    fg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
