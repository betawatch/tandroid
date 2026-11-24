// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w0a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1a b;

    public /* synthetic */ w0a(b1a b1aVar, byte b) {
        this.a = b;
        this.b = b1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                b1aVar.d1(true);
                break;
            case 1:
                b1aVar.i1(true, false);
                break;
            case 2:
                b1aVar.Y0();
                break;
            case 3:
                b1aVar.i1(true, false);
                break;
            case 4:
                b1aVar.i1(true, false);
                break;
            case 5:
                b1aVar.i1(true, false);
                break;
            case 6:
                b1aVar.Z1.clear();
                b1aVar.a2.clear();
                b1aVar.dismiss();
                break;
            default:
                b1aVar.dismiss();
                break;
        }
    }
}
