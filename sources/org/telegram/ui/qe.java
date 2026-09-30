package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
