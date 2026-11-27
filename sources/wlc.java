// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
