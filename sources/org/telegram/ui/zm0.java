package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;

    public /* synthetic */ zm0(en0 en0Var, int i10) {
        this.a = i10;
        this.b = en0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                en0 en0Var = this.b;
                en0Var.c(true);
                en0Var.Q.finishFragment();
                break;
            default:
                en0 en0Var2 = this.b;
                en0Var2.c(true);
                en0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
