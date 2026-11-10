package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ vb0(xb0 xb0Var, String str, String str2, int i7) {
        this.a = i7;
        this.b = xb0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new sb0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new sb0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
