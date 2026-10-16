package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ di0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rh0(di0 di0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = di0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                di0 di0Var = this.b;
                di0Var.getNotificationCenter().doOnIdle(new rh0(di0Var, this.c, this.d, 1));
                break;
            default:
                di0.V(this.b, this.c, this.d);
                break;
        }
    }
}
