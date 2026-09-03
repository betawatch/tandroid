package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re1 implements kh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ sf1 a;

    public /* synthetic */ re1(sf1 sf1Var) {
        this.a = sf1Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        sf1 sf1Var = this.a;
        sf1Var.b1 = i10;
        of1 of1Var = sf1Var.o0;
        if (of1Var != null) {
            of1Var.setPadding(0, 0, 0, i10);
        }
        if1 if1Var = sf1Var.n;
        if (if1Var != null) {
            if1Var.a.setTranslationY((-sf1Var.b1) - sf1Var.a1);
        }
        sf1Var.h.setTranslationY(((-sf1Var.U0) - sf1Var.b1) - sf1Var.a1);
        sf1Var.B0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, View view) {
        return sf1.W(this.a, view, f10);
    }

    @Override // kh.d
    public void g(boolean z4, boolean z10) {
        sf1 sf1Var = this.a;
        sf1Var.R0.i(sf1Var.O0.c(), z4, z10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return sf1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void p(float f10) {
    }
}
