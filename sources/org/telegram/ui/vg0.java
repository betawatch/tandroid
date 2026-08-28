package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ vg0(hh0 hh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9) {
        this.a = i9;
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
                hh0.U(this.b, this.c, this.d);
                break;
        }
    }
}
