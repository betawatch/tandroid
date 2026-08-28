package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag1 b;

    public /* synthetic */ rf1(ag1 ag1Var, int i9) {
        this.a = i9;
        this.b = ag1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                ag1 ag1Var = this.b;
                ag1Var.A0();
                ag1Var.finishFragment();
                break;
            case 2:
                ag1 ag1Var2 = this.b;
                ag1Var2.N = "";
                ag1Var2.D0(false);
                break;
            case 3:
                ag1.Z(this.b);
                break;
            default:
                ag1.W(this.b);
                break;
        }
    }
}
