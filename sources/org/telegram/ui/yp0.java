package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            cq0Var.X(true);
        } else {
            cq0Var.Q.setPivotX(0.0f);
            cq0Var.Q.setPivotY(0.0f);
            cq0Var.X(false);
        }
    }

    @Override // org.telegram.ui.sq0
    public final void b(Editable editable) {
        cq0 cq0Var = this.a;
        org.telegram.ui.Components.ru ruVar = cq0Var.M;
        cq0Var.a = editable;
        ruVar.setText(editable);
    }

    @Override // org.telegram.ui.sq0
    public final void d(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.a;
        cq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        cq0Var.W(cq0Var.b, cq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ void c() {
    }
}
