package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qx0 extends x01 {
    public final /* synthetic */ sx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(sx0 sx0Var, px0 px0Var) {
        super(px0Var);
        this.e = sx0Var;
    }

    @Override // org.telegram.ui.x01, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
