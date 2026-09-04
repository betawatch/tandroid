package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.fk0 o;
    public final /* synthetic */ co p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(co coVar, db dbVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(dbVar, -2, -2);
        this.p = coVar;
        this.o = fk0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fk0 fk0Var = this.o;
        if (fk0Var != null) {
            fk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        co coVar = this.p;
        if (coVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = coVar.n1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            coVar.n1 = null;
        }
        coVar.Q8 = null;
        coVar.T8 = null;
        coVar.S8 = null;
        coVar.z0.R = true;
        if (coVar.R8) {
            coVar.g8(false, true, 0.0f);
        } else {
            coVar.R8 = true;
        }
        mk mkVar = coVar.Y;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        coVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
