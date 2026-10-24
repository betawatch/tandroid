package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ sn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(sn snVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.o = snVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        sn snVar = this.o;
        if (snVar.c9 != this) {
            return;
        }
        snVar.c9 = null;
        snVar.f9 = null;
        snVar.e9 = null;
        snVar.z0.R = true;
        if (snVar.d9) {
            snVar.j8(false, true, 0.0f);
        } else {
            snVar.d9 = true;
        }
        gk gkVar = snVar.Y;
        if (gkVar == null || gkVar.getEditField() == null) {
            return;
        }
        snVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
