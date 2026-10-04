package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.pl0 {
    public final /* synthetic */ yf1 a;

    public /* synthetic */ xe1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        yf1 yf1Var = this.a;
        yf1Var.e1 = i10;
        uf1 uf1Var = yf1Var.r0;
        if (uf1Var != null) {
            uf1Var.setPadding(0, 0, 0, i10);
        }
        of1 of1Var = yf1Var.n;
        if (of1Var != null) {
            of1Var.a.setTranslationY((-yf1Var.e1) - yf1Var.d1);
        }
        yf1Var.h.setTranslationY(((-yf1Var.X0) - yf1Var.e1) - yf1Var.d1);
        yf1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        return yf1.U(this.a, view, f7);
    }

    @Override // wh.c
    public void e(boolean z10, boolean z11) {
        yf1 yf1Var = this.a;
        yf1Var.U0.i(yf1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return yf1.S(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void q(float f7) {
    }
}
