package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ux extends i71 {
    public final /* synthetic */ yy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(yy yyVar, tx txVar) {
        super(txVar);
        this.e = yyVar;
    }

    @Override // org.telegram.ui.i71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
