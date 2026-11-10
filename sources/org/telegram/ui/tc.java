package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ tc(bd bdVar, int i7) {
        this.a = i7;
        this.b = bdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(27, this.b, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(25, this.b, tL_error));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new sc(this.b, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new o1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
