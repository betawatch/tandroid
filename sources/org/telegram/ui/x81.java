package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.ej0 {
    public final /* synthetic */ v91 a;

    public /* synthetic */ x81(v91 v91Var) {
        this.a = v91Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.a.f(519).d;
        v91 v91Var = this.a;
        v91Var.f1 = i7;
        r91 r91Var = v91Var.r0;
        if (r91Var != null) {
            r91Var.setPadding(0, 0, 0, i7);
        }
        s81 s81Var = v91Var.n;
        if (s81Var != null) {
            ((TextView) s81Var.d).setTranslationY((-v91Var.f1) - v91Var.e1);
        }
        v91Var.h.setTranslationY(((-v91Var.X0) - v91Var.f1) - v91Var.e1);
        v91Var.F0();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        return v91.Z(this.a, tL_error);
    }

    @Override // yh.c
    public void d(boolean z9, boolean z10) {
        v91 v91Var = this.a;
        v91Var.U0.i(v91Var.R0.b(), z9, z10);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        return v91.b0(this.a, view, f10);
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }
}
