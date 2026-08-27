package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xz0 implements m2.e {
    public int a;
    public final /* synthetic */ yz0 b;

    public xz0(yz0 yz0Var) {
        this.b = yz0Var;
    }

    @Override // m2.e
    public final void b(int i10) {
        yz0 yz0Var = this.b;
        ProfileActivity profileActivity = yz0Var.n;
        int k10 = profileActivity.j0.z0.k(i10);
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
    public final void d(int i10) {
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
    }
}
