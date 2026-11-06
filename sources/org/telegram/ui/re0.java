package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ re0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = cf0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cf0 cf0Var = this.b;
                cf0Var.getNotificationCenter().d(new re0(cf0Var, this.c, this.d, 1));
                break;
            default:
                cf0.a0(this.b, this.c, this.d);
                break;
        }
    }
}
