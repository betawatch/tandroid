package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.zl0 {
    public final /* synthetic */ te1 a;

    public /* synthetic */ sd1(te1 te1Var) {
        this.a = te1Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
        te1 te1Var = this.a;
        te1Var.e1 = i10;
        pe1 pe1Var = te1Var.r0;
        if (pe1Var != null) {
            pe1Var.setPadding(0, 0, 0, i10);
        }
        je1 je1Var = te1Var.n;
        if (je1Var != null) {
            je1Var.a.setTranslationY((-te1Var.e1) - te1Var.d1);
        }
        te1Var.h.setTranslationY(((-te1Var.X0) - te1Var.e1) - te1Var.d1);
        te1Var.B0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean d(float f7, float f10, int i10, View view) {
        return te1.W(this.a, view, f7);
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        te1 te1Var = this.a;
        te1Var.U0.i(te1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return te1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ void o(float f7) {
    }
}
