package org.telegram.ui.web;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(x0 x0Var, String str, int i7) {
        this.a = i7;
        this.b = x0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b.a;
                if (u0Var != null) {
                    u0Var.d(this.c);
                    break;
                }
                break;
            default:
                x0 x0Var = this.b;
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                String str = this.c;
                x0Var.b = str;
                x0Var.c();
                u0 u0Var2 = x0Var.a;
                if (u0Var2 != null) {
                    u0Var2.onResume();
                    x0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
