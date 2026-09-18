package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sx extends z61 {
    public final /* synthetic */ wy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(wy wyVar, rx rxVar) {
        super(rxVar);
        this.e = wyVar;
    }

    @Override // org.telegram.ui.z61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
