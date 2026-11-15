package org.telegram.ui.web;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ h0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b.e;
                v0 v0Var = s0Var.R;
                if (v0Var != null) {
                    s0Var.h = false;
                    v0Var.E(false, null);
                    break;
                }
                break;
            case 1:
                v0 v0Var2 = this.b.e.R;
                if (v0Var2 != null) {
                    v0Var2.J(!r0.canGoBack(), !r0.canGoForward());
                    break;
                }
                break;
            default:
                vf.c.t(this.b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
