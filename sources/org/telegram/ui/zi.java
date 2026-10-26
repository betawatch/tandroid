package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zi extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ un o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(un unVar, xi xiVar) {
        super(xiVar, -2, -2);
        this.o = unVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        un unVar = this.o;
        if (unVar.c9 != this) {
            return;
        }
        unVar.c9 = null;
        unVar.f9 = null;
        unVar.e9 = null;
        unVar.z0.R = true;
        if (unVar.d9) {
            unVar.n8(false, true, 0.0f);
        } else {
            unVar.d9 = true;
        }
        hk hkVar = unVar.Y;
        if (hkVar == null || hkVar.getEditField() == null) {
            return;
        }
        unVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
