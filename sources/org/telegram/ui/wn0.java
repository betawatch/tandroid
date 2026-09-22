package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;

    public /* synthetic */ wn0(wo0 wo0Var, int i10) {
        this.a = i10;
        this.b = wo0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ml0(7, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new vn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new pn0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new pn0(this.b, tLObject, 0));
                break;
        }
    }
}
