package org.telegram.ui.web;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ q(z0 z0Var, String str, int i10) {
        this.a = i10;
        this.b = z0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b.a;
                if (w0Var != null) {
                    w0Var.d(this.c);
                    break;
                }
                break;
            default:
                z0 z0Var = this.b;
                z0Var.J = false;
                z0Var.L = 0L;
                z0Var.P = false;
                String str = this.c;
                z0Var.b = str;
                z0Var.c();
                w0 w0Var2 = z0Var.a;
                if (w0Var2 != null) {
                    w0Var2.onResume();
                    z0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
