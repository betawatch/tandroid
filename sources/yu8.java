// default package

import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class yu8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ yu8(String str, String str2, long j, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                PushListenerController.lambda$processRemoteMessage$6(str2, str, j);
                break;
            default:
                PushListenerController.lambda$processRemoteMessage$7(str2, str, j);
                break;
        }
    }
}
