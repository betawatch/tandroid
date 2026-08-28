package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x01 b;
    public final /* synthetic */ int c;

    public /* synthetic */ t01(x01 x01Var, int i9, int i10) {
        this.a = i10;
        this.b = x01Var;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x01 x01Var = this.b;
                org.telegram.ui.Components.m71 m71Var = x01Var.n;
                w01 w01Var = x01Var.s;
                int i9 = this.c;
                m71Var.d(i9, w01Var.i(i9));
                break;
            default:
                x01 x01Var2 = this.b;
                org.telegram.ui.Components.m71 m71Var2 = x01Var2.n;
                w01 w01Var2 = x01Var2.s;
                int i10 = this.c;
                m71Var2.d(i10, w01Var2.i(i10));
                break;
        }
    }
}
