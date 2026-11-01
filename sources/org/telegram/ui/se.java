package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ol0 b;

    public /* synthetic */ se(org.telegram.ui.Components.ol0 ol0Var, int i10) {
        this.a = i10;
        this.b = ol0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ol0 ol0Var = this.b;
                if (!ol0Var.M) {
                    ol0Var.M = true;
                    ol0Var.c(new org.telegram.ui.Components.ml0(ol0Var, 0), false);
                    ol0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
