package org.telegram.ui.web;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(d1 d1Var, String str, int i10) {
        this.a = i10;
        this.b = d1Var;
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
                d1 d1Var = this.b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.c;
                d1Var.b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
