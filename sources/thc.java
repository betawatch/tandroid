// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class thc implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ thc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        VoIPService voIPService = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (b) {
            case 0:
                voIPService.lambda$switchToSpeaker$87(bool, bool2);
                break;
            default:
                voIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$91(bool, bool2);
                break;
        }
    }
}
