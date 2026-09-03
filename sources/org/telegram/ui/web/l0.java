package org.telegram.ui.web;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ l0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b.e;
                c1 c1Var = y0Var.N;
                if (c1Var != null) {
                    y0Var.h = false;
                    c1Var.E(null, false);
                    break;
                }
                break;
            case 1:
                c1 c1Var2 = this.b.e.N;
                if (c1Var2 != null) {
                    c1Var2.J(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                ze.d.s(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
