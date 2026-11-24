// default package

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class rt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ rt2(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i2, i);
                break;
            case 1:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i2, i);
                break;
            case 2:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
            case 3:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
            case 4:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
            case 5:
                String[] strArr = MediaController.W1;
                nm7.f(i2).k(nm7.m2, Integer.valueOf(i));
                break;
            default:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
        }
    }
}
