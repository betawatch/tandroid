package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ yg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new zg(this.b, this.c, tL_error, this.d));
                break;
            default:
                org.telegram.messenger.g0.h3(new zg(this.b, tL_error, this.c, this.d));
                break;
        }
    }
}
