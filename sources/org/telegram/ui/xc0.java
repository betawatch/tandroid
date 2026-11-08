package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ xc0(gd0 gd0Var, Bundle bundle, int i7) {
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
                        org.telegram.messenger.g0.h3(new zc0(1, gd0Var, tL_error));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new mc0(gd0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(this.b, tL_error, this.c, tLObject, 19));
                break;
        }
    }
}
