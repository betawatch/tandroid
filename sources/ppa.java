// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ppa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ long c;

    public /* synthetic */ ppa(wsa wsaVar, long j, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.Y1(j);
                break;
            case 1:
                wsaVar.Y1(j);
                break;
            case 2:
                npa npaVar = wsaVar.s3;
                wsaVar.z2(1, true, null);
                if (j > 0) {
                    gm.r(npaVar);
                    gm.c3(npaVar);
                    break;
                }
                break;
            case 3:
                wsaVar.Y1(j);
                break;
            case 4:
                wsaVar.Y1(j);
                break;
            case 5:
                wsaVar.U1(j);
                break;
            case 6:
                dxa dxaVar = new dxa(wsaVar.getContext(), wsaVar.J0, this.c, 10, null, new e6a(wsaVar, new boolean[]{false}, (byte) 21), 0L);
                dxaVar.setOnDismissListener(new qqa(wsaVar, (byte) 0));
                dxaVar.show();
                break;
            case 7:
                wsaVar.Y1(j);
                break;
            case 8:
                wsaVar.U1(j);
                break;
            case 9:
                wsaVar.Y1(j);
                break;
            case 10:
                wsaVar.U1(j);
                break;
            case 11:
                wsaVar.Y1(j);
                break;
            default:
                wsaVar.U1(j);
                break;
        }
    }
}
