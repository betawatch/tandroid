package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ ug(wm wmVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new vg(this.b, this.c, tL_error, this.d));
                break;
            default:
                org.telegram.messenger.g0.h3(new vg(this.b, tL_error, this.c, this.d));
                break;
        }
    }
}
