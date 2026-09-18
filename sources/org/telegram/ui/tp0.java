package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class tp0 extends x61 {
    public final /* synthetic */ wp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(wp0 wp0Var, sp0 sp0Var) {
        super(sp0Var);
        this.e = wp0Var;
    }

    @Override // org.telegram.ui.x61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
