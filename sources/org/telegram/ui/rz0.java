package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz0 b;

    public /* synthetic */ rz0(uz0 uz0Var, int i7) {
        this.a = i7;
        this.b = uz0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        uz0 uz0Var = this.b;
        uz0Var.e = I0;
        uz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        uz0Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.b.c0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    break;
                }
                break;
            default:
                uz0 uz0Var = this.b;
                org.telegram.ui.ActionBar.u1 u1Var3 = uz0Var.c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    uz0Var.c0 = null;
                }
                uz0Var.dismiss();
                break;
        }
    }
}
