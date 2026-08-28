package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xz0 implements m2.e {
    public int a;
    public final /* synthetic */ yz0 b;

    public xz0(yz0 yz0Var) {
        this.b = yz0Var;
    }

    @Override // m2.e
    public final void b(int i9) {
        yz0 yz0Var = this.b;
        ProfileActivity profileActivity = yz0Var.n;
        int k10 = profileActivity.j0.z0.k(i9);
        yz0Var.a(this.a != k10);
        this.a = k10;
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
    public final void d(int i9) {
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
    }
}
