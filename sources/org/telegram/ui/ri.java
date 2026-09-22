package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.fk0 o;
    public final /* synthetic */ bo p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(bo boVar, db dbVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(dbVar, -2, -2);
        this.p = boVar;
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
        bo boVar = this.p;
        if (boVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
        org.telegram.ui.Components.oc ocVar2 = boVar.n1;
        if (ocVar == ocVar2 && ocVar2 != null) {
            ocVar2.b();
            boVar.n1 = null;
        }
        boVar.Q8 = null;
        boVar.T8 = null;
        boVar.S8 = null;
        boVar.z0.R = true;
        if (boVar.R8) {
            boVar.g8(false, true, 0.0f);
        } else {
            boVar.R8 = true;
        }
        mk mkVar = boVar.Y;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        boVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
