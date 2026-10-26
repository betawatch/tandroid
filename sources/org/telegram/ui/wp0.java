package org.telegram.ui;

import android.text.Editable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wp0 implements qq0 {
    public final /* synthetic */ aq0 a;

    public wp0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // org.telegram.ui.qq0
    public final void a() {
        aq0 aq0Var = this.a;
        if (aq0Var.b.size() != 0) {
            aq0Var.Q.invalidate();
            aq0Var.X(true);
        } else {
            aq0Var.Q.setPivotX(0.0f);
            aq0Var.Q.setPivotY(0.0f);
            aq0Var.X(false);
        }
    }

    @Override // org.telegram.ui.qq0
    public final void b(Editable editable) {
        aq0 aq0Var = this.a;
        org.telegram.ui.Components.ru ruVar = aq0Var.M;
        aq0Var.a = editable;
        ruVar.setText(editable);
    }

    @Override // org.telegram.ui.qq0
    public final void d(int i10, boolean z10, boolean z11) {
        aq0 aq0Var = this.a;
        aq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        aq0Var.W(aq0Var.b, aq0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.qq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.qq0
    public final /* synthetic */ void c() {
    }
}
