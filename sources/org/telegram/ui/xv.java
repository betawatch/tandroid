package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xv extends k11 {
    public final /* synthetic */ zw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(zw zwVar, wv wvVar) {
        super(wvVar);
        this.e = zwVar;
    }

    @Override // org.telegram.ui.k11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
