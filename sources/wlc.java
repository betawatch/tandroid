// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class wlc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ jf7 c;

    public /* synthetic */ wlc(VoIPService voIPService, jf7 jf7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = jf7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jf7 jf7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startOutgoingCall$11(jf7Var, tLObject, tL_error);
                break;
            default:
                voIPService.lambda$acceptIncomingCall$100(jf7Var, tLObject, tL_error);
                break;
        }
    }
}
