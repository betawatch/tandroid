package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vi extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ qn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(qn qnVar, ti tiVar) {
        super(tiVar, -2, -2);
        this.o = qnVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        qn qnVar = this.o;
        if (qnVar.M8 != this) {
            return;
        }
        qnVar.M8 = null;
        qnVar.P8 = null;
        qnVar.O8 = null;
        qnVar.v0.R = true;
        if (qnVar.N8) {
            qnVar.g8(false, true, 0.0f);
        } else {
            qnVar.N8 = true;
        }
        ak akVar = qnVar.U;
        if (akVar == null || akVar.getEditField() == null) {
            return;
        }
        qnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
