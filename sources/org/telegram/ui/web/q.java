package org.telegram.ui.web;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                x0 x0Var = this.b.a;
                if (x0Var != null) {
                    x0Var.d(this.c);
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
