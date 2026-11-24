// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wna implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xna b;
    public final /* synthetic */ int c;

    public /* synthetic */ wna(xna xnaVar, int i, byte b) {
        this.a = b;
        this.b = xnaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        xna xnaVar = this.b;
        switch (b) {
            case 0:
                xnaVar.post(new wna(xnaVar, i, b2));
                break;
            default:
                if (i == xnaVar.h) {
                    xnaVar.f = false;
                    xnaVar.d = true;
                    xnaVar.b();
                    break;
                }
                break;
        }
    }
}
