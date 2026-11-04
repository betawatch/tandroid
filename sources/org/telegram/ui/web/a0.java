package org.telegram.ui.web;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ a0(w0 w0Var, String str, int i3) {
        this.a = i3;
        this.b = w0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b.a;
                if (t0Var != null) {
                    t0Var.d(this.c);
                    break;
                }
                break;
            default:
                w0 w0Var = this.b;
                w0Var.O = false;
                w0Var.Q = 0L;
                w0Var.U = false;
                String str = this.c;
                w0Var.b = str;
                w0Var.c();
                t0 t0Var2 = w0Var.a;
                if (t0Var2 != null) {
                    t0Var2.onResume();
                    w0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
