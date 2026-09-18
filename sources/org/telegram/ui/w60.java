package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g70 b;

    public /* synthetic */ w60(g70 g70Var, int i10) {
        this.a = i10;
        this.b = g70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                g70 g70Var = this.b;
                g70Var.i0();
                g70Var.e0();
                break;
            case 2:
                g70 g70Var2 = this.b;
                g70Var2.getClass();
                g70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                g70 g70Var3 = this.b;
                g70Var3.n.postOnAnimation(new w60(g70Var3, 1));
                break;
        }
    }
}
