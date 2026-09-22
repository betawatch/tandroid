package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z21 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ x21(z21 z21Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = z21Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.d);
                break;
            case 1:
                this.b.b(this.c, this.d);
                break;
            default:
                this.b.b(this.c, this.d);
                break;
        }
    }
}
