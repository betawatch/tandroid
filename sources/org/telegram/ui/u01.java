package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u01 implements z4.e {
    public int a;
    public final /* synthetic */ v01 b;

    public u01(v01 v01Var) {
        this.b = v01Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        v01 v01Var = this.b;
        ProfileActivity profileActivity = v01Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        v01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new xz0(v01Var, 2), 500L);
        } else {
            v01Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
