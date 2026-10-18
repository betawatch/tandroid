package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
