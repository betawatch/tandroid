package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
