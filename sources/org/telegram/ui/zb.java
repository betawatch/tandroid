package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zb extends x01 {
    public final /* synthetic */ pc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(pc pcVar, yb ybVar) {
        super(ybVar);
        this.e = pcVar;
    }

    @Override // org.telegram.ui.x01, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.R = null;
    }
}
