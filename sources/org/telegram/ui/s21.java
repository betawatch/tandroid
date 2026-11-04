package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements org.telegram.messenger.s10, org.telegram.messenger.t10, r0.m {
    public final /* synthetic */ c31 a;

    public /* synthetic */ s21(c31 c31Var) {
        this.a = c31Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = I0.d;
        c31 c31Var = this.a;
        c31Var.d0 = i3;
        int i10 = I0.b;
        if (c31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = c31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                c31Var.Q.setLayoutParams(layoutParams);
            }
        }
        pi.a.e(c31Var.c, i10, i3, org.telegram.messenger.g0.L(12.0f), c31Var.e0);
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(org.telegram.ui.Components.r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(c31.Z(this.a, r31Var, view));
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c31.h0(this.a, (org.telegram.ui.Components.r31) obj);
    }
}
