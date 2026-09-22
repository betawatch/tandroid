package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y11(c21 c21Var, int i10, int i11) {
        this.a = i11;
        this.b = c21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c21 c21Var = this.b;
                org.telegram.ui.Components.h81 h81Var = c21Var.n;
                b21 b21Var = c21Var.s;
                int i10 = this.c;
                h81Var.d(i10, b21Var.i(i10));
                break;
            default:
                c21 c21Var2 = this.b;
                org.telegram.ui.Components.h81 h81Var2 = c21Var2.n;
                b21 b21Var2 = c21Var2.s;
                int i11 = this.c;
                h81Var2.d(i11, b21Var2.i(i11));
                break;
        }
    }
}
