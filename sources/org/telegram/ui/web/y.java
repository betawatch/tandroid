package org.telegram.ui.web;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(a1 a1Var, String str, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b.a;
                if (x0Var != null) {
                    x0Var.d(this.c);
                    break;
                }
                break;
            default:
                a1 a1Var = this.b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.c;
                a1Var.b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
