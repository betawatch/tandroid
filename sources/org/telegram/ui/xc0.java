package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ xc0(id0 id0Var, int i7) {
        this.a = i7;
        this.b = id0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                id0 id0Var = this.b;
                id0Var.c(true);
                id0Var.u0.M1(0, true, null, true);
                break;
            default:
                this.b.u0.M1(0, true, null, true);
                break;
        }
    }
}
