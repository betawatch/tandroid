package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sp0 implements lq0 {
    public final /* synthetic */ wp0 a;

    public sp0(wp0 wp0Var) {
        this.a = wp0Var;
    }

    @Override // org.telegram.ui.lq0
    public final void a() {
        wp0 wp0Var = this.a;
        if (wp0Var.b.size() != 0) {
            wp0Var.N.invalidate();
            wp0Var.W(true);
        } else {
            wp0Var.N.setPivotX(0.0f);
            wp0Var.N.setPivotY(0.0f);
            wp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.lq0
    public final void c(Editable editable) {
        wp0 wp0Var = this.a;
        org.telegram.ui.Components.cu cuVar = wp0Var.J;
        wp0Var.a = editable;
        cuVar.setText(editable);
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.lq0
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.a;
        wp0Var.removeSelfFromStack();
        if (z4) {
            return;
        }
        wp0Var.V(wp0Var.b, wp0Var.c, z10, i10);
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ void d() {
    }
}
