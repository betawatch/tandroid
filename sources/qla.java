// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qla implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sla b;

    public /* synthetic */ qla(sla slaVar, byte b) {
        this.a = b;
        this.b = slaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sla slaVar = this.b;
        switch (b) {
            case 0:
                slaVar.W0 = false;
                if (!slaVar.Z0 && slaVar.X0) {
                    slaVar.x(true);
                    break;
                }
                break;
            case 1:
                slaVar.W0 = false;
                break;
            case 2:
                slaVar.Z0 = false;
                if (!slaVar.W0 && slaVar.X0) {
                    slaVar.x(true);
                    break;
                }
                break;
            default:
                slaVar.Z0 = false;
                break;
        }
    }
}
