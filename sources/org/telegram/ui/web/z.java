package org.telegram.ui.web;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(z0 z0Var, String str, int i10) {
        this.a = i10;
        this.b = z0Var;
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
                z0 z0Var = this.b;
                z0Var.N = false;
                z0Var.P = 0L;
                z0Var.T = false;
                String str = this.c;
                z0Var.b = str;
                z0Var.c();
                v0 v0Var2 = z0Var.a;
                if (v0Var2 != null) {
                    v0Var2.onResume();
                    z0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
