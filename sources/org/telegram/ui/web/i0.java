package org.telegram.ui.web;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ i0(j0 j0Var, int i3) {
        this.a = i3;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b.e;
                w0 w0Var = t0Var.R;
                if (w0Var != null) {
                    t0Var.h = false;
                    w0Var.D(false, null);
                    break;
                }
                break;
            case 1:
                w0 w0Var2 = this.b.e.R;
                if (w0Var2 != null) {
                    w0Var2.I(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                sf.c.t(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
