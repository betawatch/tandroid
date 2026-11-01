package vh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ m6 c;

    public /* synthetic */ v1(z1 z1Var, m6 m6Var, int i10) {
        this.a = i10;
        this.b = z1Var;
        this.c = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z1 z1Var = this.b;
                z1Var.getClass();
                org.telegram.messenger.i0.h3(new v1(z1Var, this.c, 1), 320L);
                break;
            default:
                z1 z1Var2 = this.b;
                z1Var2.getClass();
                this.c.a(new ph.h1(z1Var2, 22));
                break;
        }
    }
}
