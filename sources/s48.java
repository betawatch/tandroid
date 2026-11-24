// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class s48 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a8b b;

    public /* synthetic */ s48(a8b a8bVar, byte b) {
        this.a = b;
        this.b = a8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a8b a8bVar = this.b;
        switch (b) {
            case 0:
                a8bVar.dismiss();
                break;
            case 1:
                a8bVar.dismiss();
                break;
            default:
                a8bVar.onBackPressed();
                break;
        }
    }
}
