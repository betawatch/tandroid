package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class st implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt b;

    public /* synthetic */ st(vt vtVar, int i7) {
        this.a = i7;
        this.b = vtVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vt vtVar = this.b;
                vtVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new st(vtVar, 1));
                break;
            default:
                this.b.getMessagesController().X2(true);
                break;
        }
    }
}
