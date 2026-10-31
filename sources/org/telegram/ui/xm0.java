package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn0 b;

    public /* synthetic */ xm0(tn0 tn0Var, int i10) {
        this.a = i10;
        this.b = tn0Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        tn0 tn0Var = this.b;
        tn0Var.b0 = I0;
        en0 en0Var = tn0Var.h.b;
        int i10 = I0.a;
        int paddingTop = en0Var.getPaddingTop();
        i0.c cVar = tn0Var.b0;
        en0Var.setPadding(i10, paddingTop, cVar.c, org.telegram.messenger.i0.L(72.0f) + cVar.d);
        en0 en0Var2 = tn0Var.n.b;
        int i11 = tn0Var.b0.a;
        int paddingTop2 = en0Var2.getPaddingTop();
        i0.c cVar2 = tn0Var.b0;
        en0Var2.setPadding(i11, paddingTop2, cVar2.c, org.telegram.messenger.i0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = tn0Var.P;
        i0.c cVar3 = tn0Var.b0;
        frameLayout.setPadding(cVar3.a, 0, cVar3.c, cVar3.d);
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.C0();
                break;
        }
    }
}
