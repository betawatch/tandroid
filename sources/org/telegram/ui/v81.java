package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v81 implements zh.c, org.telegram.messenger.yo, r0.m, org.telegram.ui.Components.jj0 {
    public final /* synthetic */ u91 a;

    public /* synthetic */ v81(u91 u91Var) {
        this.a = u91Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i7 = k1Var.a.f(519).d;
        u91 u91Var = this.a;
        u91Var.g1 = i7;
        q91 q91Var = u91Var.s0;
        if (q91Var != null) {
            q91Var.setPadding(0, 0, 0, i7);
        }
        q81 q81Var = u91Var.n;
        if (q81Var != null) {
            ((TextView) q81Var.d).setTranslationY((-u91Var.g1) - u91Var.f1);
        }
        u91Var.h.setTranslationY(((-u91Var.Y0) - u91Var.g1) - u91Var.f1);
        u91Var.F0();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.yo
    public boolean d(TLRPC.TL_error tL_error) {
        return u91.Z(this.a, tL_error);
    }

    @Override // zh.c
    public void e(boolean z10, boolean z11) {
        u91 u91Var = this.a;
        u91Var.V0.i(u91Var.S0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.jj0
    public boolean f(float f10, float f11, int i7, View view) {
        return u91.b0(this.a, view, f10);
    }

    @Override // org.telegram.ui.Components.jj0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.jj0
    public /* synthetic */ void i() {
    }
}
