package zh;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ q1(a2 a2Var, int i7) {
        this.a = i7;
        this.b = a2Var;
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
