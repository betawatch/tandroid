package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ wg0(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.a = i10;
        this.b = kh0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kh0 kh0Var = this.b;
                kh0Var.getNotificationCenter().doOnIdle(new wg0(kh0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                kh0.U(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
