package rh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b6(c6 c6Var, long j10, int i10) {
        this.a = i10;
        this.b = c6Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c6 c6Var = this.b;
                c6Var.q.b0(c6Var.b, c6Var.c, this.c, true, true, c6Var.n);
                break;
            default:
                c6 c6Var2 = this.b;
                c6Var2.q.b0(c6Var2.b, c6Var2.c, this.c, true, true, c6Var2.n);
                break;
        }
    }
}
