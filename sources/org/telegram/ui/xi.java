package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xi extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ rn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(rn rnVar, vi viVar) {
        super(viVar, -2, -2);
        this.o = rnVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rn rnVar = this.o;
        if (rnVar.M8 != this) {
            return;
        }
        rnVar.M8 = null;
        rnVar.P8 = null;
        rnVar.O8 = null;
        rnVar.v0.R = true;
        if (rnVar.N8) {
            rnVar.g8(false, true, 0.0f);
        } else {
            rnVar.N8 = true;
        }
        ck ckVar = rnVar.U;
        if (ckVar == null || ckVar.getEditField() == null) {
            return;
        }
        rnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
