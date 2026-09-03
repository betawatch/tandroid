package org.telegram.ui.web;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                y0 y0Var = this.b.a;
                if (y0Var != null) {
                    y0Var.d(this.c);
                    break;
                }
                break;
            default:
                c1 c1Var = this.b;
                c1Var.K = false;
                c1Var.M = 0L;
                c1Var.Q = false;
                String str = this.c;
                c1Var.b = str;
                c1Var.c();
                y0 y0Var2 = c1Var.a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    c1Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
