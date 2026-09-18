package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ sf0(ag0 ag0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = ag0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ag0 ag0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new y80(22, ag0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new qf0(ag0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wn0(this.b, tL_error, this.c, tLObject, 20));
                break;
        }
    }
}
