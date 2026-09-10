package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ti extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ org.telegram.ui.Components.pk0 o;
    public final /* synthetic */ eo p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(eo eoVar, fb fbVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(fbVar, -2, -2);
        this.p = eoVar;
        this.o = pk0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        eo eoVar = this.p;
        if (eoVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        org.telegram.ui.Components.pc pcVar2 = eoVar.n1;
        if (pcVar == pcVar2 && pcVar2 != null) {
            pcVar2.b();
            eoVar.n1 = null;
        }
        eoVar.Q8 = null;
        eoVar.T8 = null;
        eoVar.S8 = null;
        eoVar.z0.R = true;
        if (eoVar.R8) {
            eoVar.g8(false, true, 0.0f);
        } else {
            eoVar.R8 = true;
        }
        ok okVar = eoVar.Y;
        if (okVar == null || okVar.getEditField() == null) {
            return;
        }
        eoVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
