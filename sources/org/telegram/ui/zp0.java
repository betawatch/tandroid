package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fq0 a;

    public zp0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        fq0 fq0Var = this.a;
        if (i10 == -1) {
            fq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                fq0.S(fq0Var, null);
            }
        } else if (fq0Var.V != null) {
            fq0Var.finishFragment(false);
            fq0Var.V.b();
        }
    }
}
