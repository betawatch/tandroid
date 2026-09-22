package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qx extends y61 {
    public final /* synthetic */ uy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(uy uyVar, px pxVar) {
        super(pxVar);
        this.e = uyVar;
    }

    @Override // org.telegram.ui.y61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
