package org.telegram.ui.web;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
