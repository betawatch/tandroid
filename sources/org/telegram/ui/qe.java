package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ym0 b;

    public /* synthetic */ qe(org.telegram.ui.Components.ym0 ym0Var, int i10) {
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
