package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy0 b;

    public /* synthetic */ wy0(zy0 zy0Var, int i10) {
        this.a = i10;
        this.b = zy0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                zy0 zy0Var = this.b;
                zy0Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new wy0(zy0Var, 1));
                break;
            default:
                this.b.c.getMessagesController().loadAppConfig();
                break;
        }
    }
}
