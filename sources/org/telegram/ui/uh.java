package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uh extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ org.telegram.ui.Components.li0 o;
    public final /* synthetic */ wm p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(wm wmVar, va vaVar, org.telegram.ui.Components.li0 li0Var) {
        super(vaVar, -2, -2);
        this.p = wmVar;
        this.o = li0Var;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.li0 li0Var = this.o;
        if (li0Var != null) {
            li0Var.d(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wm wmVar = this.p;
        if (wmVar.f9 != this) {
            return;
        }
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
        org.telegram.ui.Components.ac acVar2 = wmVar.C1;
        if (acVar == acVar2 && acVar2 != null) {
            acVar2.b();
            wmVar.C1 = null;
        }
        wmVar.f9 = null;
        wmVar.i9 = null;
        wmVar.h9 = null;
        wmVar.C0.R = true;
        if (wmVar.g9) {
            wmVar.v8(false, true, 0.0f);
        } else {
            wmVar.g9 = true;
        }
        mj mjVar = wmVar.a0;
        if (mjVar == null || mjVar.getEditField() == null) {
            return;
        }
        wmVar.a0.getEditField().setAllowDrawCursor(true);
    }
}
