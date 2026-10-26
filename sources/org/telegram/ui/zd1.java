package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd1 implements yh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cm0 {
    public final /* synthetic */ af1 a;

    public /* synthetic */ zd1(af1 af1Var) {
        this.a = af1Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
        af1 af1Var = this.a;
        af1Var.f1 = i10;
        we1 we1Var = af1Var.r0;
        if (we1Var != null) {
            we1Var.setPadding(0, 0, 0, i10);
        }
        qe1 qe1Var = af1Var.n;
        if (qe1Var != null) {
            qe1Var.a.setTranslationY((-af1Var.f1) - af1Var.e1);
        }
        af1Var.h.setTranslationY(((-af1Var.X0) - af1Var.f1) - af1Var.e1);
        af1Var.B0();
        return r0.k1.b;
    }

    @Override // yh.c
    public void d(boolean z10, boolean z11) {
        af1 af1Var = this.a;
        af1Var.U0.i(af1Var.R0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean e(float f7, float f10, int i10, View view) {
        return af1.X(this.a, view, f7);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return af1.V(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.cm0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.cm0
    public /* synthetic */ void o(float f7) {
    }
}
