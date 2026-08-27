package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xv0 extends r51 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(PremiumPreviewFragment premiumPreviewFragment, wv0 wv0Var) {
        super(wv0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.r51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
