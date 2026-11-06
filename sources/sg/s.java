package sg;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ s(w wVar, int i7) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.a.g(hVar);
                    wVar.A = null;
                    break;
                }
                break;
            default:
                this.b.a(null, true, null);
                break;
        }
    }
}
