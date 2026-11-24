// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ qac c;

    public /* synthetic */ rn3(qac qacVar, String str) {
        this.c = qacVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qac qacVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                qacVar.a(str);
                break;
            default:
                gm.c3(new ey8(qacVar, ix8.c(str, gm.L(240.0f), g54.c, 0.75f, null), (byte) 3));
                break;
        }
    }

    public /* synthetic */ rn3(String str, qac qacVar) {
        this.b = str;
        this.c = qacVar;
    }
}
