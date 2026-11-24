// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oxa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eya b;

    public /* synthetic */ oxa(eya eyaVar, byte b) {
        this.a = b;
        this.b = eyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eya eyaVar = this.b;
        switch (b) {
            case 0:
                eyaVar.N1 = true;
                eyaVar.E0(null);
                gm.d3(new oxa(eyaVar, (byte) 1), 240L);
                break;
            case 1:
                eyaVar.dismiss();
                break;
            default:
                txa txaVar = eyaVar.s1;
                txaVar.G = false;
                txaVar.invalidate();
                break;
        }
    }
}
