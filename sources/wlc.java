// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class wlc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ kf7 c;

    public /* synthetic */ wlc(VoIPService voIPService, kf7 kf7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = kf7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        kf7 kf7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startOutgoingCall$11(kf7Var, tLObject, tL_error);
                break;
            default:
                voIPService.lambda$acceptIncomingCall$100(kf7Var, tLObject, tL_error);
                break;
        }
    }
}
