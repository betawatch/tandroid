package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ tn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(tn tnVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.o = tnVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        tn tnVar = this.o;
        if (tnVar.M8 != this) {
            return;
        }
        tnVar.M8 = null;
        tnVar.P8 = null;
        tnVar.O8 = null;
        tnVar.v0.R = true;
        if (tnVar.N8) {
            tnVar.g8(false, true, 0.0f);
        } else {
            tnVar.N8 = true;
        }
        dk dkVar = tnVar.U;
        if (dkVar == null || dkVar.getEditField() == null) {
            return;
        }
        tnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
