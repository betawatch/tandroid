package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements org.telegram.messenger.o20, org.telegram.messenger.p20, r0.m {
    public final /* synthetic */ e51 a;

    public /* synthetic */ t41(e51 e51Var) {
        this.a = e51Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.d;
        e51 e51Var = this.a;
        e51Var.c0 = i10;
        int i11 = I0.b;
        if (e51Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = e51Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                e51Var.P.setLayoutParams(layoutParams);
            }
        }
        ei.b.e(e51Var.c, i11, i10, org.telegram.messenger.i0.L(12.0f), e51Var.d0);
        return r0.j1.b;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(org.telegram.ui.Components.a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(e51.Y(this.a, a51Var, view));
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e51.g0(this.a, (org.telegram.ui.Components.a51) obj);
    }
}
