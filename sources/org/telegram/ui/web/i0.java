package org.telegram.ui.web;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ i0(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b.e;
                z0 z0Var = v0Var.Q;
                if (z0Var != null) {
                    v0Var.h = false;
                    z0Var.D(false, null);
                    break;
                }
                break;
            case 1:
                z0 z0Var2 = this.b.e.Q;
                if (z0Var2 != null) {
                    z0Var2.I(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                gf.f.r(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
