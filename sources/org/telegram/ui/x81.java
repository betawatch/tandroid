package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements zh.c, org.telegram.messenger.xo, r0.m, org.telegram.ui.Components.tj0 {
    public final /* synthetic */ w91 a;

    public /* synthetic */ x81(w91 w91Var) {
        this.a = w91Var;
    }

    @Override // org.telegram.messenger.xo
    public boolean d(TLRPC.TL_error tL_error) {
        return w91.Z(this.a, tL_error);
    }

    @Override // zh.c
    public void e(boolean z10, boolean z11) {
        w91 w91Var = this.a;
        w91Var.V0.j(w91Var.S0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean g(float f10, float f11, int i7, View view) {
        return w91.b0(this.a, view, f10);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int i7 = l1Var.a.f(519).d;
        w91 w91Var = this.a;
        w91Var.h1 = i7;
        s91 s91Var = w91Var.s0;
        if (s91Var != null) {
            s91Var.setPadding(0, 0, 0, i7);
        }
        s81 s81Var = w91Var.n;
        if (s81Var != null) {
            ((TextView) s81Var.d).setTranslationY((-w91Var.h1) - w91Var.g1);
        }
        w91Var.h.setTranslationY(((-w91Var.Y0) - w91Var.h1) - w91Var.g1);
        w91Var.F0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void l(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void h() {
    }
}
