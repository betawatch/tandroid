package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ xe0(jf0 jf0Var, int i9) {
        this.a = i9;
        this.b = jf0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                jf0 jf0Var = this.b;
                jf0Var.c(true);
                jf0Var.o0.u1(0, true, null, true);
                break;
            default:
                this.b.o0.u1(0, true, null, true);
                break;
        }
    }
}
