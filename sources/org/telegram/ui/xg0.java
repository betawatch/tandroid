package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ xg0(jh0 jh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = jh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jh0 jh0Var = this.b;
                jh0Var.getNotificationCenter().doOnIdle(new xg0(jh0Var, this.c, this.d, 1));
                break;
            default:
                jh0.W(this.b, this.c, this.d);
                break;
        }
    }
}
