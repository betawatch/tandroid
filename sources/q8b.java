// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ q8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.c(false);
                v9bVar.n2 = null;
                break;
            default:
                v9bVar.getClass();
                v9bVar.d(1.0f, true, new f8b(v9bVar, (byte) 27));
                v9bVar.c1.b(true, true);
                break;
        }
    }
}
