package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements org.telegram.ui.Components.pt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ ua0(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    @Override // org.telegram.ui.Components.pt0
    public final void K(int i3, boolean z10) {
        nd0 nd0Var;
        bi0 bi0Var;
        switch (this.a) {
            case 0:
                xd0 xd0Var = (xd0) this.b;
                if (i3 > org.telegram.messenger.g0.L(20.0f) && xd0Var.q1()) {
                    org.telegram.messenger.g0.v1(xd0Var.fragmentView);
                }
                if (i3 <= org.telegram.messenger.g0.L(20.0f) && (nd0Var = xd0Var.U) != null) {
                    nd0Var.run();
                    xd0Var.U = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i3 >= org.telegram.messenger.g0.L(20.0f) && (bi0Var = passcodeActivity.U) != null) {
                    bi0Var.run();
                    passcodeActivity.U = null;
                    break;
                }
                break;
        }
    }
}
