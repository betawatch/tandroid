package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class yp0 implements sq0 {
    public final /* synthetic */ cq0 a;

    public yp0(cq0 cq0Var) {
        this.a = cq0Var;
    }

    @Override // org.telegram.ui.sq0
    public final void a() {
        cq0 cq0Var = this.a;
        if (cq0Var.b.size() != 0) {
            cq0Var.Q.invalidate();
            cq0Var.W(true);
        } else {
            cq0Var.Q.setPivotX(0.0f);
            cq0Var.Q.setPivotY(0.0f);
            cq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.sq0
    public final void b(Editable editable) {
        cq0 cq0Var = this.a;
        org.telegram.ui.Components.ku kuVar = cq0Var.M;
        cq0Var.a = editable;
        kuVar.setText(editable);
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.sq0
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.a;
        cq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        cq0Var.V(cq0Var.b, cq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ void g() {
    }
}
