package org.telegram.ui.web;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                x0 x0Var = this.b.e;
                a1 a1Var = x0Var.Q;
                if (a1Var != null) {
                    x0Var.h = false;
                    a1Var.D(false, null);
                    break;
                }
                break;
            case 1:
                a1 a1Var2 = this.b.e.Q;
                if (a1Var2 != null) {
                    a1Var2.I(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                qf.d.r(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
