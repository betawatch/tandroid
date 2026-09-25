package org.telegram.ui.web;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(b1 b1Var, String str, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b.a;
                if (y0Var != null) {
                    y0Var.d(this.c);
                    break;
                }
                break;
            default:
                b1 b1Var = this.b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.c;
                b1Var.b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
