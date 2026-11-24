// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ujc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ ujc(VoIPService voIPService, byte b) {
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
