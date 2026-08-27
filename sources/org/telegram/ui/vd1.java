package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd1 implements fh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.sk0 {
    public final /* synthetic */ we1 a;

    public /* synthetic */ vd1(we1 we1Var) {
        this.a = we1Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        we1 we1Var = this.a;
        we1Var.a1 = i10;
        se1 se1Var = we1Var.n0;
        if (se1Var != null) {
            se1Var.setPadding(0, 0, 0, i10);
        }
        me1 me1Var = we1Var.n;
        if (me1Var != null) {
            me1Var.a.setTranslationY((-we1Var.a1) - we1Var.Z0);
        }
        we1Var.h.setTranslationY(((-we1Var.T0) - we1Var.a1) - we1Var.Z0);
        we1Var.B0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean c(float f10, float f11, int i10, View view) {
        return we1.W(this.a, view, f10);
    }

    @Override // fh.d
    public void e(boolean z10, boolean z11) {
        we1 we1Var = this.a;
        we1Var.Q0.i(we1Var.N0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return we1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.sk0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.sk0
    public /* synthetic */ void s(float f10) {
    }
}
