package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y81 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.ej0 {
    public final /* synthetic */ w91 a;

    public /* synthetic */ y81(w91 w91Var) {
        this.a = w91Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.a.f(519).d;
        w91 w91Var = this.a;
        w91Var.f1 = i7;
        s91 s91Var = w91Var.r0;
        if (s91Var != null) {
            s91Var.setPadding(0, 0, 0, i7);
        }
        t81 t81Var = w91Var.n;
        if (t81Var != null) {
            ((TextView) t81Var.d).setTranslationY((-w91Var.f1) - w91Var.e1);
        }
        w91Var.h.setTranslationY(((-w91Var.X0) - w91Var.f1) - w91Var.e1);
        w91Var.F0();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        return w91.Z(this.a, tL_error);
    }

    @Override // yh.c
    public void d(boolean z9, boolean z10) {
        w91 w91Var = this.a;
        w91Var.U0.i(w91Var.R0.b(), z9, z10);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        return w91.b0(this.a, view, f10);
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }
}
