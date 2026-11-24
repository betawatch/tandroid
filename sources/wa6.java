// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class wa6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb6 b;

    public /* synthetic */ wa6(eb6 eb6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    eb6Var.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                if (tL_error == null) {
                    eb6Var.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    eb6Var.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    eb6Var.getMessagesController().P3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
