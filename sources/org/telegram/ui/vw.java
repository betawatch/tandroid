package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vw extends t51 {
    public final /* synthetic */ cy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(cy cyVar, uw uwVar) {
        super(uwVar);
        this.e = cyVar;
    }

    @Override // org.telegram.ui.t51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
