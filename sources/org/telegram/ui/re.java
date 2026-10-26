package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.hn0 b;

    public /* synthetic */ re(org.telegram.ui.Components.hn0 hn0Var, int i10) {
        this.a = i10;
        this.b = hn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.hn0 hn0Var = this.b;
                if (!hn0Var.M) {
                    hn0Var.M = true;
                    hn0Var.c(new org.telegram.ui.Components.fn0(hn0Var, 0), false);
                    hn0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
