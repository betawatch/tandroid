package q2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
