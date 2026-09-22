package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements org.telegram.ui.Components.c20, org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ e70 b;

    public /* synthetic */ t60(e70 e70Var, int i10) {
        this.a = i10;
        this.b = e70Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        e70 e70Var = this.b;
        e70Var.m0 = i10;
        ai.v7 v7Var = e70Var.F;
        if (v7Var != null) {
            v7Var.setPadding(0, 0, 0, i10);
        }
        e70Var.j0();
        e70Var.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.c20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.o0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
