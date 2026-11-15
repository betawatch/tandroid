package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xx0 extends e11 {
    public final /* synthetic */ zx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0(zx0 zx0Var, wx0 wx0Var) {
        super(wx0Var);
        this.e = zx0Var;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
