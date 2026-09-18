package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g91 b;

    public /* synthetic */ v81(g91 g91Var, int i10) {
        this.a = i10;
        this.b = g91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                g91 g91Var = this.b;
                g91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new v81(g91Var, 1));
                break;
            default:
                this.b.getMessagesController().loadAppConfig();
                break;
        }
    }
}
