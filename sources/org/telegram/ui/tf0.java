package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ tf0(bg0 bg0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = bg0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                bg0 bg0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new oa0(18, bg0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new rf0(bg0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(this.b, tL_error, this.c, tLObject, 20));
                break;
        }
    }
}
