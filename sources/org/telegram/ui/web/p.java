package org.telegram.ui.web;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ p(y0 y0Var, String str, int i9) {
        this.a = i9;
        this.b = y0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b.a;
                if (v0Var != null) {
                    v0Var.d(this.c);
                    break;
                }
                break;
            default:
                y0 y0Var = this.b;
                y0Var.J = false;
                y0Var.L = 0L;
                y0Var.P = false;
                String str = this.c;
                y0Var.b = str;
                y0Var.c();
                v0 v0Var2 = y0Var.a;
                if (v0Var2 != null) {
                    v0Var2.onResume();
                    y0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
