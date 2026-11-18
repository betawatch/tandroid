package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ org.telegram.ui.Components.vi0 o;
    public final /* synthetic */ bn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(bn bnVar, wa waVar, org.telegram.ui.Components.vi0 vi0Var) {
        super(waVar, -2, -2);
        this.p = bnVar;
        this.o = vi0Var;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.vi0 vi0Var = this.o;
        if (vi0Var != null) {
            vi0Var.d(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        bn bnVar = this.p;
        if (bnVar.g9 != this) {
            return;
        }
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        org.telegram.ui.Components.gc gcVar2 = bnVar.C1;
        if (gcVar == gcVar2 && gcVar2 != null) {
            gcVar2.b();
            bnVar.C1 = null;
        }
        bnVar.g9 = null;
        bnVar.l9 = null;
        bnVar.k9 = null;
        bnVar.C0.R = true;
        if (bnVar.h9) {
            bnVar.x8(false, true, 0.0f);
        } else {
            bnVar.h9 = true;
        }
        rj rjVar = bnVar.a0;
        if (rjVar == null || rjVar.getEditField() == null) {
            return;
        }
        bnVar.a0.getEditField().setAllowDrawCursor(true);
    }
}
