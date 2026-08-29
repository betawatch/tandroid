package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wv0 extends u51 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(PremiumPreviewFragment premiumPreviewFragment, vv0 vv0Var) {
        super(vv0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.u51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
