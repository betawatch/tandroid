package org.telegram.ui.web;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ k0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b.e;
                z0 z0Var = w0Var.M;
                if (z0Var != null) {
                    w0Var.h = false;
                    z0Var.A(null, false);
                    break;
                }
                break;
            case 1:
                z0 z0Var2 = this.b.e.M;
                if (z0Var2 != null) {
                    z0Var2.F(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                we.e.s(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
