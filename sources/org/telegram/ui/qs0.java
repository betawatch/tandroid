package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qs0 extends k11 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(PremiumPreviewFragment premiumPreviewFragment, ps0 ps0Var) {
        super(ps0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.k11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.u0 = null;
    }
}
