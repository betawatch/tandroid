package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ vf0(dg0 dg0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = dg0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new se0(5, dg0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new tf0(dg0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(this.b, tL_error, this.c, tLObject));
                break;
        }
    }
}
