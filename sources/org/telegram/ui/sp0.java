package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.Components.fu fuVar = wp0Var.J;
        wp0Var.a = editable;
        fuVar.setText(editable);
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
