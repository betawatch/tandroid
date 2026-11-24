// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ tt2(boolean z, int i, int i2) {
        this.a = (byte) 1;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.c, this.b, this.d);
                break;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.b, this.c, this.d);
                break;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.c, this.b, this.d);
                break;
        }
    }

    public /* synthetic */ tt2(int i, boolean z, int i2, byte b) {
        this.a = b;
        this.c = i;
        this.b = z;
        this.d = i2;
    }
}
