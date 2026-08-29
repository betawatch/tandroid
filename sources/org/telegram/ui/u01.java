package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y01 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u01(y01 y01Var, int i10, int i11) {
        this.a = i11;
        this.b = y01Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y01 y01Var = this.b;
                org.telegram.ui.Components.y71 y71Var = y01Var.n;
                x01 x01Var = y01Var.s;
                int i10 = this.c;
                y71Var.d(i10, x01Var.i(i10));
                break;
            default:
                y01 y01Var2 = this.b;
                org.telegram.ui.Components.y71 y71Var2 = y01Var2.n;
                x01 x01Var2 = y01Var2.s;
                int i11 = this.c;
                y71Var2.d(i11, x01Var2.i(i11));
                break;
        }
    }
}
