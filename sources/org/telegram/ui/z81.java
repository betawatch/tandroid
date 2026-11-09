package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z81 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.fj0 {
    public final /* synthetic */ y91 a;

    public /* synthetic */ z81(y91 y91Var) {
        this.a = y91Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.a.f(519).d;
        y91 y91Var = this.a;
        y91Var.f1 = i7;
        u91 u91Var = y91Var.r0;
        if (u91Var != null) {
            u91Var.setPadding(0, 0, 0, i7);
        }
        u81 u81Var = y91Var.n;
        if (u81Var != null) {
            ((TextView) u81Var.d).setTranslationY((-y91Var.f1) - y91Var.e1);
        }
        y91Var.h.setTranslationY(((-y91Var.X0) - y91Var.f1) - y91Var.e1);
        y91Var.F0();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        return y91.Z(this.a, tL_error);
    }

    @Override // yh.c
    public void d(boolean z9, boolean z10) {
        y91 y91Var = this.a;
        y91Var.U0.i(y91Var.R0.b(), z9, z10);
    }

    @Override // org.telegram.ui.Components.fj0
    public boolean f(float f10, float f11, int i7, View view) {
        return y91.b0(this.a, view, f10);
    }

    @Override // org.telegram.ui.Components.fj0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.fj0
    public /* synthetic */ void i() {
    }
}
