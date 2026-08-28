package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud1 implements eh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.pk0 {
    public final /* synthetic */ we1 a;

    public /* synthetic */ ud1(we1 we1Var) {
        this.a = we1Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = m1Var.a.f(519).d;
        we1 we1Var = this.a;
        we1Var.a1 = i9;
        re1 re1Var = we1Var.n0;
        if (re1Var != null) {
            re1Var.setPadding(0, 0, 0, i9);
        }
        le1 le1Var = we1Var.n;
        if (le1Var != null) {
            le1Var.a.setTranslationY((-we1Var.a1) - we1Var.Z0);
        }
        we1Var.h.setTranslationY(((-we1Var.T0) - we1Var.a1) - we1Var.Z0);
        we1Var.A0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, View view) {
        return we1.V(this.a, view, f10);
    }

    @Override // eh.d
    public void e(boolean z10, boolean z11) {
        we1 we1Var = this.a;
        we1Var.Q0.i(we1Var.N0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return we1.T(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void u(float f10) {
    }
}
