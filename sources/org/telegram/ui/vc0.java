package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ vc0(dd0 dd0Var, Bundle bundle, int i3) {
        this.a = i3;
        this.b = dd0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                dd0 dd0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new tb0(6, dd0Var, tL_error));
                        break;
                    }
                } else {
                    Bundle bundle = this.c;
                    org.telegram.messenger.g0.h3(new hc0(dd0Var, bundle, tLObject, false, 4));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(this.b, tL_error, this.c, tLObject, 25));
                break;
        }
    }
}
