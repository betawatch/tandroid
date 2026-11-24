// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class uhc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ uhc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$updateConnectionState$78();
                break;
            case 1:
                voIPService.lambda$updateConnectionState$79();
                break;
            case 2:
                voIPService.lambda$onConnectionStateChanged$113();
                break;
            case 3:
                voIPService.lambda$onConnectionStateChanged$114();
                break;
            default:
                voIPService.lambda$playConnectedSound$84();
                break;
        }
    }
}
