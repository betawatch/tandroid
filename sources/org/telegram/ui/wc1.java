package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yc1 a;

    public wc1(yc1 yc1Var) {
        this.a = yc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        yc1 yc1Var = this.a;
        org.telegram.messenger.ij ijVar = yc1Var.n;
        if (i7 == -1) {
            yc1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                yc1.a0(yc1Var.d, ijVar, yc1Var.getParentActivity(), yc1Var.r, yc1Var.e);
            }
        } else if (ijVar != null) {
            ijVar.k.with_my_score = false;
            yc1Var.showDialog(org.telegram.ui.Components.mo0.N0(yc1Var.getParentActivity(), ijVar, null, false, yc1Var.h));
        }
    }
}
