package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ rf0(zf0 zf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = zf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                zf0 zf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new r80(24, zf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new pf0(zf0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(this.b, tL_error, this.c, tLObject, 20));
                break;
        }
    }
}
