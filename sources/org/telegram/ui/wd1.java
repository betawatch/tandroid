package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dm0 {
    public final /* synthetic */ ye1 a;

    public /* synthetic */ wd1(ye1 ye1Var) {
        this.a = ye1Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
        ye1 ye1Var = this.a;
        ye1Var.f1 = i10;
        te1 te1Var = ye1Var.r0;
        if (te1Var != null) {
            te1Var.setPadding(0, 0, 0, i10);
        }
        ne1 ne1Var = ye1Var.n;
        if (ne1Var != null) {
            ne1Var.a.setTranslationY((-ye1Var.f1) - ye1Var.e1);
        }
        ye1Var.h.setTranslationY(((-ye1Var.X0) - ye1Var.f1) - ye1Var.e1);
        ye1Var.A0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean c(float f7, float f10, int i10, View view) {
        return ye1.W(this.a, view, f7);
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        ye1 ye1Var = this.a;
        ye1Var.U0.i(ye1Var.R0.b(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ye1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }
}
