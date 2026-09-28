package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.om0 b;

    public /* synthetic */ qe(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.a = i10;
        this.b = om0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.om0 om0Var = this.b;
                if (!om0Var.M) {
                    om0Var.M = true;
                    om0Var.c(new org.telegram.ui.Components.mm0(om0Var, 0), false);
                    om0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
