package q2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(k kVar, l lVar, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q2.l] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, q2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                this.c.z(kVar.a, kVar.b);
                break;
            default:
                k kVar2 = this.b;
                this.c.w(kVar2.a, kVar2.b);
                break;
        }
    }
}
