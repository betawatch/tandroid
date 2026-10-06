package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
