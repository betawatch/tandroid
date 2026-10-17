package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class z11 extends q51 {
    public final /* synthetic */ b21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z11(b21 b21Var, y11 y11Var) {
        super(y11Var);
        this.e = b21Var;
    }

    @Override // org.telegram.ui.q51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
