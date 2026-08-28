package org.telegram.ui.web;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ j0(k0 k0Var, int i9) {
        this.a = i9;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b.e;
                y0 y0Var = v0Var.M;
                if (y0Var != null) {
                    v0Var.h = false;
                    y0Var.A(null, false);
                    break;
                }
                break;
            case 1:
                y0 y0Var2 = this.b.e.M;
                if (y0Var2 != null) {
                    y0Var2.F(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                ve.e.s(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
