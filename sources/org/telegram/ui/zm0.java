package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;

    public /* synthetic */ zm0(en0 en0Var, int i10) {
        this.a = i10;
        this.b = en0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
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
