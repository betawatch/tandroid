package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ ul0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jf0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new sj0(9, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ql0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sj0(8, this.b, tLObject));
                break;
        }
    }
}
