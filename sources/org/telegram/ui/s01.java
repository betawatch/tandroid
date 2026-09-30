package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class s01 implements z4.e {
    public int a;
    public final /* synthetic */ t01 b;

    public s01(t01 t01Var) {
        this.b = t01Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        t01 t01Var = this.b;
        ProfileActivity profileActivity = t01Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        t01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new vz0(t01Var, 2), 500L);
        } else {
            t01Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
