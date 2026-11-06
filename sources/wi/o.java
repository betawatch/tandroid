package wi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ o(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    break;
                }
                break;
            default:
                this.b.c();
                break;
        }
    }
}
