package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xt0 extends z21 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(PremiumPreviewFragment premiumPreviewFragment, wt0 wt0Var) {
        super(wt0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.z21, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.u0 = null;
    }
}
