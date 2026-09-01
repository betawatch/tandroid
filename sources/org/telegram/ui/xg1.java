package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg1 b;

    public /* synthetic */ xg1(yg1 yg1Var, int i10) {
        this.a = i10;
        this.b = yg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.b61 b61Var = this.b.a;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.b61 b61Var2 = this.b.a;
                if (b61Var2 != null) {
                    b61Var2.V2.N(true);
                    break;
                }
                break;
        }
    }
}
