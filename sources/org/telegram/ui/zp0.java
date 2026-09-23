package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zp0 implements tq0 {
    public final /* synthetic */ dq0 a;

    public zp0(dq0 dq0Var) {
        this.a = dq0Var;
    }

    @Override // org.telegram.ui.tq0
    public final void a() {
        dq0 dq0Var = this.a;
        if (dq0Var.b.size() != 0) {
            dq0Var.Q.invalidate();
            dq0Var.W(true);
        } else {
            dq0Var.Q.setPivotX(0.0f);
            dq0Var.Q.setPivotY(0.0f);
            dq0Var.W(false);
        }
    }

    @Override // org.telegram.ui.tq0
    public final void b(Editable editable) {
        dq0 dq0Var = this.a;
        org.telegram.ui.Components.ku kuVar = dq0Var.M;
        dq0Var.a = editable;
        kuVar.setText(editable);
    }

    @Override // org.telegram.ui.tq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.tq0
    public final void i(int i10, boolean z10, boolean z11) {
        dq0 dq0Var = this.a;
        dq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        dq0Var.V(dq0Var.b, dq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.tq0
    public final /* synthetic */ void g() {
    }
}
