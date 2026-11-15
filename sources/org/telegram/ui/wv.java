package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wv extends e11 {
    public final /* synthetic */ yw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(yw ywVar, vv vvVar) {
        super(vvVar);
        this.e = ywVar;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
