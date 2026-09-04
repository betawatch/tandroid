package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class qx extends a71 {
    public final /* synthetic */ uy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(uy uyVar, px pxVar) {
        super(pxVar);
        this.e = uyVar;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
