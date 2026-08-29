package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd1 implements hh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.cl0 {
    public final /* synthetic */ ze1 a;

    public /* synthetic */ wd1(ze1 ze1Var) {
        this.a = ze1Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        ze1 ze1Var = this.a;
        ze1Var.a1 = i10;
        ve1 ve1Var = ze1Var.n0;
        if (ve1Var != null) {
            ve1Var.setPadding(0, 0, 0, i10);
        }
        oe1 oe1Var = ze1Var.n;
        if (oe1Var != null) {
            oe1Var.a.setTranslationY((-ze1Var.a1) - ze1Var.Z0);
        }
        ze1Var.h.setTranslationY(((-ze1Var.T0) - ze1Var.a1) - ze1Var.Z0);
        ze1Var.B0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, View view) {
        return ze1.W(this.a, view, f9);
    }

    @Override // hh.d
    public void f(boolean z10, boolean z11) {
        ze1 ze1Var = this.a;
        ze1Var.Q0.i(ze1Var.N0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ze1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void r(float f9) {
    }
}
