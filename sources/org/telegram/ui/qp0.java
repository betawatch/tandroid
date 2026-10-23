package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class qp0 implements lq0 {
    public final /* synthetic */ vp0 a;

    public qp0(vp0 vp0Var) {
        this.a = vp0Var;
    }

    @Override // org.telegram.ui.lq0
    public final void a() {
        vp0 vp0Var = this.a;
        if (vp0Var.b.size() != 0) {
            vp0Var.Q.invalidate();
            vp0Var.W(true);
        } else {
            vp0Var.Q.setPivotX(0.0f);
            vp0Var.Q.setPivotY(0.0f);
            vp0Var.W(false);
        }
    }

    @Override // org.telegram.ui.lq0
    public final void b(Editable editable) {
        vp0 vp0Var = this.a;
        org.telegram.ui.Components.qu quVar = vp0Var.M;
        vp0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.lq0
    public final void h(int i10, boolean z10, boolean z11) {
        vp0 vp0Var = this.a;
        vp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        vp0Var.V(vp0Var.b, vp0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.lq0
    public final /* synthetic */ void g() {
    }
}
