package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ wg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ah(this.b, this.c, tL_error, this.d));
                break;
            default:
                org.telegram.messenger.g0.h3(new ah(this.b, tL_error, this.c, this.d));
                break;
        }
    }
}
