package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ wc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.a = i7;
        this.b = gd0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.g0.g3(new n60(22, gd0Var, tL_error));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.g3(new lc0(gd0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(this.b, tL_error, this.c, tLObject));
                break;
        }
    }
}
