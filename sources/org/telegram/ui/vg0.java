package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ vg0(hh0 hh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = hh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hh0 hh0Var = this.b;
                hh0Var.getNotificationCenter().doOnIdle(new vg0(hh0Var, this.c, this.d, 1));
                break;
            default:
                hh0.V(this.b, this.c, this.d);
                break;
        }
    }
}
