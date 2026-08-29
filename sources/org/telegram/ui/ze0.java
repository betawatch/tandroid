package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ ze0(if0 if0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = if0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new x60(27, if0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new xe0(if0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new n20(this.b, tL_error, this.c, tLObject, 13));
                break;
        }
    }
}
