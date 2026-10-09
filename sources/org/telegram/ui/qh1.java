package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh1 b;

    public /* synthetic */ qh1(rh1 rh1Var, int i10) {
        this.a = i10;
        this.b = rh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.e71 e71Var = this.b.a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.e71 e71Var2 = this.b.a;
                if (e71Var2 != null) {
                    e71Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
