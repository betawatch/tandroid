package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ti extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ org.telegram.ui.Components.mj0 o;
    public final /* synthetic */ un p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(un unVar, cb cbVar, org.telegram.ui.Components.mj0 mj0Var) {
        super(cbVar, -2, -2);
        this.p = unVar;
        this.o = mj0Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.mj0 mj0Var = this.o;
        if (mj0Var != null) {
            mj0Var.d(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        un unVar = this.p;
        if (unVar.e9 != this) {
            return;
        }
        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
        org.telegram.ui.Components.wb wbVar2 = unVar.B1;
        if (wbVar == wbVar2 && wbVar2 != null) {
            wbVar2.b();
            unVar.B1 = null;
        }
        unVar.e9 = null;
        unVar.h9 = null;
        unVar.g9 = null;
        unVar.B0.R = true;
        if (unVar.f9) {
            unVar.o8(false, true, 0.0f);
        } else {
            unVar.f9 = true;
        }
        mk mkVar = unVar.Z;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        unVar.Z.getEditField().setAllowDrawCursor(true);
    }
}
