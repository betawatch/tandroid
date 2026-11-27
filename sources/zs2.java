// default package

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class zs2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ zs2(int i, int i2, byte b) {
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
                jn7.f(i2).k(jn7.m2, Integer.valueOf(i));
                break;
            default:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
        }
    }
}
