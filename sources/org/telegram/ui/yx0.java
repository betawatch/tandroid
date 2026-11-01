package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yx0 implements z4.e {
    public int a;
    public final /* synthetic */ zx0 b;

    public yx0(zx0 zx0Var) {
        this.b = zx0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        zx0 zx0Var = this.b;
        ProfileActivity profileActivity = zx0Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        zx0Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.i0.h3(new vv0(zx0Var, 6), 500L);
        } else {
            zx0Var.c();
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
