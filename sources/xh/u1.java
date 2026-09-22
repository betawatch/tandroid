package xh;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u1(n2 n2Var, int i10, int i11) {
        this.a = i11;
        this.b = n2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                i2 i2Var = this.b.f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
