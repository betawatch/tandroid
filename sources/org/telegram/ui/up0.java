package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class up0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ aq0 a;

    public up0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        aq0 aq0Var = this.a;
        if (i10 == -1) {
            aq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                aq0.V(aq0Var, null);
            }
        } else if (aq0Var.V != null) {
            aq0Var.finishFragment(false);
            aq0Var.V.b();
        }
    }
}
