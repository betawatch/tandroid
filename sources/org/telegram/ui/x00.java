package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;

    public /* synthetic */ x00(y00 y00Var, int i10) {
        this.a = i10;
        this.b = y00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                y00 y00Var = this.b;
                y00Var.b(y00Var.y);
                break;
        }
    }
}
