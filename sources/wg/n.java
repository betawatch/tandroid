package wg;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lv0;
import tg.v1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;
    public final /* synthetic */ z10 c;

    public /* synthetic */ n(z10 z10Var, z10 z10Var2, int i7) {
        this.a = i7;
        this.b = z10Var;
        this.c = z10Var2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new lv0(tL_error, this.b, this.c, 25));
                break;
            default:
                org.telegram.messenger.g0.h3(new v1(tL_error, this.b, tLObject, this.c, 2));
                break;
        }
    }
}
