package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wt0 extends x21 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt0(PremiumPreviewFragment premiumPreviewFragment, vt0 vt0Var) {
        super(vt0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.x21, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.u0 = null;
    }
}
