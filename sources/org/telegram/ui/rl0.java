package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ rl0(dn0 dn0Var, int i10) {
        this.a = i10;
        this.b = dn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hf0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fe0(22, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new nl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new fe0(21, this.b, tLObject));
                break;
        }
    }
}
