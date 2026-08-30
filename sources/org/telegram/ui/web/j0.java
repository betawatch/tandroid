package org.telegram.ui.web;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ j0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b.e;
                a1 a1Var = w0Var.N;
                if (a1Var != null) {
                    w0Var.h = false;
                    a1Var.A(null, false);
                    break;
                }
                break;
            case 1:
                a1 a1Var2 = this.b.e.N;
                if (a1Var2 != null) {
                    a1Var2.F(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                af.g.s(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
