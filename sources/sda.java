// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nha b;
    public final /* synthetic */ int c;

    public /* synthetic */ sda(nha nhaVar, int i, byte b) {
        this.a = b;
        this.b = nhaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        nha nhaVar = this.b;
        switch (b) {
            case 0:
                nhaVar.o1(i);
                break;
            case 1:
                nhaVar.U0(i, nhaVar.m1, nhaVar.y1);
                break;
            case 2:
                nhaVar.n1(i, false);
                break;
            case 3:
                nhaVar.o1(i);
                break;
            default:
                nhaVar.V0(i, nhaVar.m1, nhaVar.y1);
                break;
        }
    }
}
