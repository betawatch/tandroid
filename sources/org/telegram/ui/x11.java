package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
