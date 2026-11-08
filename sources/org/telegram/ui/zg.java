package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ an b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ zg(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = anVar;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.i0(this.b, this.c, this.d, this.e);
                break;
            default:
                an.t0(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ zg(an anVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = anVar;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
