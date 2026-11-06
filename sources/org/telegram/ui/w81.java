package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v91 b;

    public /* synthetic */ w81(v91 v91Var, int i7) {
        this.a = i7;
        this.b = v91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v91 v91Var = this.b;
                v91Var.B0();
                v91Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                v91 v91Var2 = this.b;
                v91Var2.A0 = null;
                v91Var2.Z0(true, false);
                break;
            default:
                v91 v91Var3 = this.b;
                v91Var3.N.postOnAnimation(new w81(v91Var3, 1));
                break;
        }
    }
}
