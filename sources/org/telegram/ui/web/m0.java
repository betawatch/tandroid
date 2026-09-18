package org.telegram.ui.web;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ m0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b.e;
                d1 d1Var = z0Var.Q;
                if (d1Var != null) {
                    z0Var.h = false;
                    d1Var.E(null, false);
                    break;
                }
                break;
            case 1:
                d1 d1Var2 = this.b.e.Q;
                if (d1Var2 != null) {
                    d1Var2.J(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                nf.f.s(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
