package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze1 b;

    public /* synthetic */ ye1(ze1 ze1Var, int i10) {
        this.a = i10;
        this.b = ze1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze1 ze1Var = this.b;
                ze1Var.F = null;
                if (ze1Var.G != -1) {
                    ze1Var.H.getNotificationCenter().onAnimationFinish(ze1Var.G);
                    ze1Var.G = -1;
                    break;
                }
                break;
            default:
                ze1 ze1Var2 = this.b;
                ze1Var2.F = null;
                if (ze1Var2.G != -1) {
                    ze1Var2.H.getNotificationCenter().onAnimationFinish(ze1Var2.G);
                    ze1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
