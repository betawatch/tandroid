package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.nl0 {
    public final /* synthetic */ wf1 a;

    public /* synthetic */ ve1(wf1 wf1Var) {
        this.a = wf1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        wf1 wf1Var = this.a;
        wf1Var.e1 = i10;
        sf1 sf1Var = wf1Var.r0;
        if (sf1Var != null) {
            sf1Var.setPadding(0, 0, 0, i10);
        }
        mf1 mf1Var = wf1Var.n;
        if (mf1Var != null) {
            mf1Var.a.setTranslationY((-wf1Var.e1) - wf1Var.d1);
        }
        wf1Var.h.setTranslationY(((-wf1Var.X0) - wf1Var.e1) - wf1Var.d1);
        wf1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.nl0
    public boolean c(float f7, float f10, int i10, View view) {
        return wf1.W(this.a, view, f7);
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        wf1 wf1Var = this.a;
        wf1Var.U0.i(wf1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return wf1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q(float f7) {
    }
}
