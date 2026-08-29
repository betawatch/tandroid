package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ tz(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(19, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
