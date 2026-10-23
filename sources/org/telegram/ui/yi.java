package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ qn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(qn qnVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.o = qnVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        qn qnVar = this.o;
        if (qnVar.Q8 != this) {
            return;
        }
        qnVar.Q8 = null;
        qnVar.T8 = null;
        qnVar.S8 = null;
        qnVar.z0.R = true;
        if (qnVar.R8) {
            qnVar.j8(false, true, 0.0f);
        } else {
            qnVar.R8 = true;
        }
        fk fkVar = qnVar.Y;
        if (fkVar == null || fkVar.getEditField() == null) {
            return;
        }
        qnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
