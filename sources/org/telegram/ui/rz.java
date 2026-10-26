package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ o00 b;

    public /* synthetic */ rz(o00 o00Var, int i10) {
        this.a = i10;
        this.b = o00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sz(2, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new nq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
