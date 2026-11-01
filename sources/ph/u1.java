package ph;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ u1(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setReordering(true);
                break;
            case 1:
                this.b.setReordering(true);
                break;
            case 2:
                this.b.f(false);
                break;
            default:
                this.b.setReordering(true);
                break;
        }
    }
}
