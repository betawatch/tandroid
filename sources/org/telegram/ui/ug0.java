package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ug0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i9) {
        this.a = i9;
        this.b = hh0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hh0 hh0Var = this.b;
                hh0Var.getNotificationCenter().doOnIdle(new ug0(hh0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                hh0.T(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
