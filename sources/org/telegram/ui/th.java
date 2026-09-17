package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ th(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = coVar;
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
