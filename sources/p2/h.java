package p2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(j jVar, k kVar, int i3) {
        this.a = i3;
        this.b = jVar;
        this.c = kVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p2.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                this.c.b(jVar.a, jVar.b);
                break;
            default:
                j jVar2 = this.b;
                this.c.I(jVar2.a, jVar2.b);
                break;
        }
    }
}
