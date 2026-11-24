// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iga b;
    public final /* synthetic */ int c;

    public /* synthetic */ xda(iga igaVar, int i, byte b) {
        this.a = b;
        this.b = igaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        iga igaVar = this.b;
        switch (b) {
            case 0:
                igaVar.h.scrollBy(0, i);
                break;
            case 1:
                igaVar.h.scrollBy(0, i);
                break;
            default:
                igaVar.h.scrollBy(0, i);
                break;
        }
    }
}
