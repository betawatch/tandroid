// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm8 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm8 b;

    public /* synthetic */ rm8(tm8 tm8Var, byte b) {
        this.a = b;
        this.b = tm8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        tm8 tm8Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                tm8Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new rm8(tm8Var, b2));
                break;
            default:
                tm8Var.c.getMessagesController().T2(true);
                break;
        }
    }
}
