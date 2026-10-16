package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vi extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ org.telegram.ui.Components.gl0 o;
    public final /* synthetic */ fo p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(fo foVar, ib ibVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(ibVar, -2, -2);
        this.p = foVar;
        this.o = gl0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gl0 gl0Var = this.o;
        if (gl0Var != null) {
            gl0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        fo foVar = this.p;
        if (foVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
        org.telegram.ui.Components.sc scVar2 = foVar.n1;
        if (scVar == scVar2 && scVar2 != null) {
            scVar2.b();
            foVar.n1 = null;
        }
        foVar.Q8 = null;
        foVar.T8 = null;
        foVar.S8 = null;
        foVar.z0.R = true;
        if (foVar.R8) {
            foVar.j8(false, true, 0.0f);
        } else {
            foVar.R8 = true;
        }
        sk skVar = foVar.Y;
        if (skVar == null || skVar.getEditField() == null) {
            return;
        }
        foVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
