package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh1 b;

    public /* synthetic */ wh1(xh1 xh1Var, int i10) {
        this.a = i10;
        this.b = xh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.c71 c71Var = this.b.a;
                if (c71Var != null) {
                    c71Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.c71 c71Var2 = this.b.a;
                if (c71Var2 != null) {
                    c71Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
