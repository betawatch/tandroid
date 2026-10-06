package org.telegram.ui.web;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
