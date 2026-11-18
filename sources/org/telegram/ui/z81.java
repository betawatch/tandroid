package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z81 implements zh.c, org.telegram.messenger.xo, r0.m, org.telegram.ui.Components.rj0 {
    public final /* synthetic */ y91 a;

    public /* synthetic */ z81(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = l1Var.a.f(519).d;
        y91 y91Var = this.a;
        y91Var.h1 = i7;
        u91 u91Var = y91Var.s0;
        if (u91Var != null) {
            u91Var.setPadding(0, 0, 0, i7);
        }
        u81 u81Var = y91Var.n;
        if (u81Var != null) {
            ((TextView) u81Var.d).setTranslationY((-y91Var.h1) - y91Var.g1);
        }
        y91Var.h.setTranslationY(((-y91Var.Y0) - y91Var.h1) - y91Var.g1);
        y91Var.F0();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        return y91.Z(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.rj0
    public boolean f(float f10, float f11, int i7, View view) {
        return y91.b0(this.a, view, f10);
    }

    @Override // zh.c
    public void g(boolean z10, boolean z11) {
        y91 y91Var = this.a;
        y91Var.V0.j(y91Var.S0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void j() {
    }
}
