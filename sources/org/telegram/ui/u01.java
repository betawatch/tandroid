package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
            AndroidUtilities.runOnUIThread(new hz0(v01Var, 3), 500L);
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
