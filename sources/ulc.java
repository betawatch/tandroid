// default package

import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ulc implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;

    public /* synthetic */ ulc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        VoIPService voIPService = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (b) {
            case 0:
                voIPService.lambda$switchToSpeaker$88(bool, bool2);
                break;
            default:
                voIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$92(bool, bool2);
                break;
        }
    }
}
