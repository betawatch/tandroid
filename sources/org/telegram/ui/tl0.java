package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tl0 extends x01 {
    public final /* synthetic */ wl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(wl0 wl0Var, sl0 sl0Var) {
        super(sl0Var);
        this.e = wl0Var;
    }

    @Override // org.telegram.ui.x01, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
