package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ co b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLRPC.TL_attachMenuBot d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ wh(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = coVar;
        this.d = tL_attachMenuBot;
        this.c = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co.w1(this.b, this.d, this.c, this.e);
                break;
            default:
                co.W(this.b, this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ wh(co coVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = coVar;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
