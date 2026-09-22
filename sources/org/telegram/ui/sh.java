package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ sh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wh(this.b, this.c, tL_error, this.d));
                break;
            default:
                AndroidUtilities.runOnUIThread(new wh(this.b, tL_error, this.c, this.d));
                break;
        }
    }
}
