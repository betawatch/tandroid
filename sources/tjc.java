// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tjc implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ tjc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // jac
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
