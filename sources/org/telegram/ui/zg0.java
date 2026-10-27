package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ zg0(lh0 lh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = lh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lh0 lh0Var = this.b;
                lh0Var.getNotificationCenter().doOnIdle(new zg0(lh0Var, this.c, this.d, 1));
                break;
            default:
                lh0.W(this.b, this.c, this.d);
                break;
        }
    }
}
