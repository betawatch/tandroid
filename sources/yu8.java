// default package

import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
