package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ xc0(hd0 hd0Var, Bundle bundle, int i7) {
        this.a = i7;
        this.b = hd0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hd0 hd0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.g0.g3(new o60(22, hd0Var, tL_error));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.g3(new mc0(hd0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(this.b, tL_error, this.c, tLObject));
                break;
        }
    }
}
