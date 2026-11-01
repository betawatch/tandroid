package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r41 implements org.telegram.messenger.p20, org.telegram.messenger.q20, r0.m {
    public final /* synthetic */ c51 a;

    public /* synthetic */ r41(c51 c51Var) {
        this.a = c51Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.d;
        c51 c51Var = this.a;
        c51Var.c0 = i10;
        int i11 = I0.b;
        if (c51Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = c51Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                c51Var.P.setLayoutParams(layoutParams);
            }
        }
        ei.b.e(c51Var.c, i11, i10, org.telegram.messenger.i0.L(12.0f), c51Var.d0);
        return r0.j1.b;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(org.telegram.ui.Components.b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(c51.Z(this.a, b51Var, view));
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c51.h0(this.a, (org.telegram.ui.Components.b51) obj);
    }
}
