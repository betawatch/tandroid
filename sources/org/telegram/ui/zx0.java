package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zx0 implements z4.e {
    public int a;
    public final /* synthetic */ ay0 b;

    public zx0(ay0 ay0Var) {
        this.b = ay0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        ay0 ay0Var = this.b;
        ProfileActivity profileActivity = ay0Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        ay0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.i0.h3(new wv0(ay0Var, 6), 500L);
        } else {
            ay0Var.c();
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ei.r rVar;
        rVar = ((org.telegram.ui.ActionBar.k2) this.b.n).glassEngine;
        rVar.g();
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
