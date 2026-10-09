package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.kl0 o;
    public final /* synthetic */ zn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(zn znVar, eb ebVar, org.telegram.ui.Components.kl0 kl0Var) {
        super(ebVar, -2, -2);
        this.p = znVar;
        this.o = kl0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.kl0 kl0Var = this.o;
        if (kl0Var != null) {
            kl0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zn znVar = this.p;
        if (znVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
        org.telegram.ui.Components.tc tcVar2 = znVar.n1;
        if (tcVar == tcVar2 && tcVar2 != null) {
            tcVar2.b();
            znVar.n1 = null;
        }
        znVar.Q8 = null;
        znVar.T8 = null;
        znVar.S8 = null;
        znVar.z0.R = true;
        if (znVar.R8) {
            znVar.j8(false, true, 0.0f);
        } else {
            znVar.R8 = true;
        }
        ok okVar = znVar.Y;
        if (okVar == null || okVar.getEditField() == null) {
            return;
        }
        znVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
