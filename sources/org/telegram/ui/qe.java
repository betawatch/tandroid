package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.cn0 b;

    public /* synthetic */ qe(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.a = i10;
        this.b = cn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.cn0 cn0Var = this.b;
                if (!cn0Var.M) {
                    cn0Var.M = true;
                    cn0Var.c(new org.telegram.ui.Components.an0(cn0Var, 0), false);
                    cn0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
