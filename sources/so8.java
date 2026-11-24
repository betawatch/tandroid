// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class so8 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uo8 b;

    public /* synthetic */ so8(uo8 uo8Var, byte b) {
        this.a = b;
        this.b = uo8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        uo8 uo8Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                uo8Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new so8(uo8Var, b2));
                break;
            default:
                uo8Var.c.getMessagesController().W2(true);
                break;
        }
    }
}
