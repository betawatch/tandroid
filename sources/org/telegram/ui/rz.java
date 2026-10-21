package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ rz(n00 n00Var, int i10) {
        this.a = i10;
        this.b = n00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lt(15, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
