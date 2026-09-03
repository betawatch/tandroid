package org.telegram.ui.web;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                x0 x0Var = this.b.e;
                a1 a1Var = x0Var.N;
                if (a1Var != null) {
                    x0Var.h = false;
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
