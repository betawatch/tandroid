package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bo b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLRPC.TL_attachMenuBot d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ wh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = boVar;
        this.d = tL_attachMenuBot;
        this.c = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo.w1(this.b, this.d, this.c, this.e);
                break;
            default:
                bo.W(this.b, this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ wh(bo boVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = boVar;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
