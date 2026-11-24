// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ ze(int i, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = i;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                na7.q1(i).R3(updates, false);
                break;
            case 1:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(i, updates);
                break;
            default:
                na7.q1(i).R3(updates, false);
                break;
        }
    }
}
