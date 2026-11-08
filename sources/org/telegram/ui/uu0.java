package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu0 b;

    public /* synthetic */ uu0(wu0 wu0Var, int i7) {
        this.a = i7;
        this.b = wu0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                wu0 wu0Var = this.b;
                wu0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new uu0(wu0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().R2(true);
                break;
        }
    }
}
