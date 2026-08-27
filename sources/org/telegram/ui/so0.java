package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class so0 extends r51 {
    public final /* synthetic */ vo0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(vo0 vo0Var, ro0 ro0Var) {
        super(ro0Var);
        this.e = vo0Var;
    }

    @Override // org.telegram.ui.r51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.e0 = null;
    }
}
