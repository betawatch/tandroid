package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wn b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ sh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = wnVar;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn.Y0(this.b, this.c, this.d, this.e);
                break;
            default:
                wn.K0(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ sh(wn wnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = wnVar;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
