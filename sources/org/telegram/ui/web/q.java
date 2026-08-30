package org.telegram.ui.web;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ q(a1 a1Var, String str, int i10) {
        this.a = i10;
        this.b = a1Var;
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
                a1 a1Var = this.b;
                a1Var.K = false;
                a1Var.M = 0L;
                a1Var.Q = false;
                String str = this.c;
                a1Var.b = str;
                a1Var.c();
                w0 w0Var2 = a1Var.a;
                if (w0Var2 != null) {
                    w0Var2.onResume();
                    a1Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
