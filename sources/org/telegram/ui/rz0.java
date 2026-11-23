package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz0 b;

    public /* synthetic */ rz0(uz0 uz0Var, int i7) {
        this.a = i7;
        this.b = uz0Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        uz0 uz0Var = this.b;
        uz0Var.e = I0;
        uz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        uz0Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.b.d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    break;
                }
                break;
            default:
                uz0 uz0Var = this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = uz0Var.d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    uz0Var.d0 = null;
                }
                uz0Var.dismiss();
                break;
        }
    }
}
