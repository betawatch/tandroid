package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp0 b;

    public /* synthetic */ xo0(hp0 hp0Var, int i10) {
        this.a = i10;
        this.b = hp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        hp0 hp0Var = this.b;
        switch (i10) {
            case 0:
                if (hp0Var.D) {
                    hp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                hp0Var.h();
                break;
            case 2:
                int i11 = hp0.n0;
                hp0Var.h();
                break;
            default:
                int i12 = hp0.n0;
                hp0Var.h();
                break;
        }
    }
}
