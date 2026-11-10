package org.telegram.ui.web;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ i0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b.e;
                x0 x0Var = u0Var.Q;
                if (x0Var != null) {
                    u0Var.h = false;
                    x0Var.E(false, null);
                    break;
                }
                break;
            case 1:
                x0 x0Var2 = this.b.e.Q;
                if (x0Var2 != null) {
                    x0Var2.J(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                vf.c.t(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
