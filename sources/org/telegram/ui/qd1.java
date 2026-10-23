package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.am0 {
    public final /* synthetic */ re1 a;

    public /* synthetic */ qd1(re1 re1Var) {
        this.a = re1Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
        re1 re1Var = this.a;
        re1Var.e1 = i10;
        ne1 ne1Var = re1Var.r0;
        if (ne1Var != null) {
            ne1Var.setPadding(0, 0, 0, i10);
        }
        he1 he1Var = re1Var.n;
        if (he1Var != null) {
            he1Var.a.setTranslationY((-re1Var.e1) - re1Var.d1);
        }
        re1Var.h.setTranslationY(((-re1Var.X0) - re1Var.e1) - re1Var.d1);
        re1Var.B0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.am0
    public boolean d(float f7, float f10, int i10, View view) {
        return re1.W(this.a, view, f7);
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        re1 re1Var = this.a;
        re1Var.U0.i(re1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return re1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void o(float f7) {
    }
}
