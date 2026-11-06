package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ org.telegram.ui.Components.ii0 o;
    public final /* synthetic */ an p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(an anVar, xa xaVar, org.telegram.ui.Components.ii0 ii0Var) {
        super(xaVar, -2, -2);
        this.p = anVar;
        this.o = ii0Var;
    }

    @Override // org.telegram.ui.ActionBar.g1
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ii0 ii0Var = this.o;
        if (ii0Var != null) {
            ii0Var.d(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        an anVar = this.p;
        if (anVar.e9 != this) {
            return;
        }
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        org.telegram.ui.Components.cc ccVar2 = anVar.B1;
        if (ccVar == ccVar2 && ccVar2 != null) {
            ccVar2.b();
            anVar.B1 = null;
        }
        anVar.e9 = null;
        anVar.h9 = null;
        anVar.g9 = null;
        anVar.B0.R = true;
        if (anVar.f9) {
            anVar.v8(false, true, 0.0f);
        } else {
            anVar.f9 = true;
        }
        qj qjVar = anVar.Z;
        if (qjVar == null || qjVar.getEditField() == null) {
            return;
        }
        anVar.Z.getEditField().setAllowDrawCursor(true);
    }
}
