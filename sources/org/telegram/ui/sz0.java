package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ sz0(vz0 vz0Var, int i7) {
        this.a = i7;
        this.b = vz0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        vz0 vz0Var = this.b;
        vz0Var.e = I0;
        vz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        vz0Var.b.requestLayout();
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
                vz0 vz0Var = this.b;
                org.telegram.ui.ActionBar.u1 u1Var3 = vz0Var.c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    vz0Var.c0 = null;
                }
                vz0Var.dismiss();
                break;
        }
    }
}
