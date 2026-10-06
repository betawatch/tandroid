package org.telegram.ui.web;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(c1 c1Var, String str, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b.a;
                if (z0Var != null) {
                    z0Var.d(this.c);
                    break;
                }
                break;
            default:
                c1 c1Var = this.b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.c;
                c1Var.b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
