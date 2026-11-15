package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ wc0(ed0 ed0Var, Bundle bundle, int i7) {
        this.a = i7;
        this.b = ed0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ed0 ed0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new g50(27, ed0Var, tL_error));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new lc0(ed0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80(this.b, tL_error, this.c, tLObject, 23));
                break;
        }
    }
}
