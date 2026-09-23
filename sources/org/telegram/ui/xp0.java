package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ dq0 a;

    public xp0(dq0 dq0Var) {
        this.a = dq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        dq0 dq0Var = this.a;
        if (i10 == -1) {
            dq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                dq0.U(dq0Var, null);
            }
        } else if (dq0Var.V != null) {
            dq0Var.finishFragment(false);
            dq0Var.V.b();
        }
    }
}
