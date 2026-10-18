package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ym0 b;

    public /* synthetic */ se(org.telegram.ui.Components.ym0 ym0Var, int i10) {
        this.a = i10;
        this.b = ym0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ym0 ym0Var = this.b;
                if (!ym0Var.M) {
                    ym0Var.M = true;
                    ym0Var.c(new org.telegram.ui.Components.wm0(ym0Var, 0), false);
                    ym0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
