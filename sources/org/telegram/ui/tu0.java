package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu0 b;

    public /* synthetic */ tu0(vu0 vu0Var, int i7) {
        this.a = i7;
        this.b = vu0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vu0 vu0Var = this.b;
                vu0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new tu0(vu0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().X2(true);
                break;
        }
    }
}
