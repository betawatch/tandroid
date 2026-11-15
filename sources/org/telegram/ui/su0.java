package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class su0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu0 b;

    public /* synthetic */ su0(uu0 uu0Var, int i7) {
        this.a = i7;
        this.b = uu0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                uu0 uu0Var = this.b;
                uu0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new su0(uu0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().R2(true);
                break;
        }
    }
}
