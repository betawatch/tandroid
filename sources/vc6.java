// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class vc6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd6 b;

    public /* synthetic */ vc6(dd6 dd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    dd6Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                if (tL_error == null) {
                    dd6Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    dd6Var.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    dd6Var.getMessagesController().R3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
