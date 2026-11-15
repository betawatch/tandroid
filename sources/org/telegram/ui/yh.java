package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ org.telegram.ui.Components.mi0 o;
    public final /* synthetic */ an p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(an anVar, wa waVar, org.telegram.ui.Components.mi0 mi0Var) {
        super(waVar, -2, -2);
        this.p = anVar;
        this.o = mi0Var;
    }

    @Override // org.telegram.ui.ActionBar.g1
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.mi0 mi0Var = this.o;
        if (mi0Var != null) {
            mi0Var.d(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        an anVar = this.p;
        if (anVar.f9 != this) {
            return;
        }
        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
        org.telegram.ui.Components.xb xbVar2 = anVar.C1;
        if (xbVar == xbVar2 && xbVar2 != null) {
            xbVar2.b();
            anVar.C1 = null;
        }
        anVar.f9 = null;
        anVar.k9 = null;
        anVar.j9 = null;
        anVar.C0.R = true;
        if (anVar.g9) {
            anVar.x8(false, true, 0.0f);
        } else {
            anVar.g9 = true;
        }
        qj qjVar = anVar.a0;
        if (qjVar == null || qjVar.getEditField() == null) {
            return;
        }
        anVar.a0.getEditField().setAllowDrawCursor(true);
    }
}
