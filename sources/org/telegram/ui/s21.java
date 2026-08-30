package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s21 extends g61 {
    public final /* synthetic */ u21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(u21 u21Var, r21 r21Var) {
        super(r21Var);
        this.e = u21Var;
    }

    @Override // org.telegram.ui.g61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
