package zh;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ h3(l3 l3Var, int i7) {
        this.a = i7;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d1();
                break;
            default:
                l3 l3Var = this.b;
                l3Var.a2.O(true);
                org.telegram.messenger.g0.i3(new h3(l3Var, 0), 150L);
                break;
        }
    }
}
