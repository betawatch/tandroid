package org.telegram.ui.web;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ n0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
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
                of.f.s(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
