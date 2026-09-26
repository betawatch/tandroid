package org.telegram.ui.web;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
