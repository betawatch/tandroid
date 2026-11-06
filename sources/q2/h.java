package q2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(j jVar, k kVar, int i7) {
        this.a = i7;
        this.b = jVar;
        this.c = kVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, q2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                this.c.z(jVar.a, jVar.b);
                break;
            default:
                j jVar2 = this.b;
                this.c.w(jVar2.a, jVar2.b);
                break;
        }
    }
}
