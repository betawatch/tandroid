package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz0 b;

    public /* synthetic */ qz0(tz0 tz0Var, int i7) {
        this.a = i7;
        this.b = tz0Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        tz0 tz0Var = this.b;
        tz0Var.e = I0;
        tz0Var.c.setPadding(I0.a, I0.b, I0.c, I0.d);
        tz0Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.b.d0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    break;
                }
                break;
            default:
                tz0 tz0Var = this.b;
                org.telegram.ui.ActionBar.u1 u1Var3 = tz0Var.d0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    tz0Var.d0 = null;
                }
                tz0Var.dismiss();
                break;
        }
    }
}
