package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm0 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn0 b;

    public /* synthetic */ vm0(rn0 rn0Var, int i10) {
        this.a = i10;
        this.b = rn0Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        rn0 rn0Var = this.b;
        rn0Var.b0 = I0;
        cn0 cn0Var = rn0Var.h.b;
        int i10 = I0.a;
        int paddingTop = cn0Var.getPaddingTop();
        i0.c cVar = rn0Var.b0;
        cn0Var.setPadding(i10, paddingTop, cVar.c, org.telegram.messenger.i0.L(72.0f) + cVar.d);
        cn0 cn0Var2 = rn0Var.n.b;
        int i11 = rn0Var.b0.a;
        int paddingTop2 = cn0Var2.getPaddingTop();
        i0.c cVar2 = rn0Var.b0;
        cn0Var2.setPadding(i11, paddingTop2, cVar2.c, org.telegram.messenger.i0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = rn0Var.P;
        i0.c cVar3 = rn0Var.b0;
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
                this.b.D0();
                break;
        }
    }
}
