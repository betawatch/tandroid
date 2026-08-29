package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xz0 implements m2.e {
    public int a;
    public final /* synthetic */ yz0 b;

    public xz0(yz0 yz0Var) {
        this.b = yz0Var;
    }

    @Override // m2.e
    public final void a(int i10) {
        yz0 yz0Var = this.b;
        ProfileActivity profileActivity = yz0Var.n;
        int k9 = profileActivity.j0.z0.k(i10);
        yz0Var.a(this.a != k9);
        this.a = k9;
        if (profileActivity.m0 == null) {
            return;
        }
        if (profileActivity.P0.t()) {
            AndroidUtilities.runOnUIThread(new ky0(yz0Var, 3), 500L);
        } else {
            yz0Var.c();
        }
    }

    @Override // m2.e
    public final void c(int i10) {
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
    }
}
