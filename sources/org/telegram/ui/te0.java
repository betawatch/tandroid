package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ te0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.a = i7;
        this.b = ff0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                ff0Var.getNotificationCenter().d(new te0(ff0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                ff0.Z(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
