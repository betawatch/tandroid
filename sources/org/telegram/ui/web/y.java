package org.telegram.ui.web;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
