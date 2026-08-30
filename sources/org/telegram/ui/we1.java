package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe1 b;

    public /* synthetic */ we1(xe1 xe1Var, int i10) {
        this.a = i10;
        this.b = xe1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xe1 xe1Var = this.b;
                xe1Var.F = null;
                if (xe1Var.G != -1) {
                    xe1Var.H.getNotificationCenter().onAnimationFinish(xe1Var.G);
                    xe1Var.G = -1;
                    break;
                }
                break;
            default:
                xe1 xe1Var2 = this.b;
                xe1Var2.F = null;
                if (xe1Var2.G != -1) {
                    xe1Var2.H.getNotificationCenter().onAnimationFinish(xe1Var2.G);
                    xe1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
