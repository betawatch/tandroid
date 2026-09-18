package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bo b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLRPC.TL_attachMenuBot d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ yh(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
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

    public /* synthetic */ yh(bo boVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = boVar;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
