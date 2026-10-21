package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class x11 extends o51 {
    public final /* synthetic */ z11 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x11(z11 z11Var, w11 w11Var) {
        super(w11Var);
        this.e = z11Var;
    }

    @Override // org.telegram.ui.o51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
