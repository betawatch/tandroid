package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ org.telegram.ui.Components.gk0 o;
    public final /* synthetic */ bo p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(bo boVar, fb fbVar, org.telegram.ui.Components.gk0 gk0Var) {
        super(fbVar, -2, -2);
        this.p = boVar;
        this.o = gk0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gk0 gk0Var = this.o;
        if (gk0Var != null) {
            gk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
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
        nk nkVar = boVar.Y;
        if (nkVar == null || nkVar.getEditField() == null) {
            return;
        }
        boVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
