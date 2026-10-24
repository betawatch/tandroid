package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ zg0(mh0 mh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = mh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mh0 mh0Var = this.b;
                mh0Var.getNotificationCenter().doOnIdle(new zg0(mh0Var, this.c, this.d, 1));
                break;
            default:
                mh0.V(this.b, this.c, this.d);
                break;
        }
    }
}
