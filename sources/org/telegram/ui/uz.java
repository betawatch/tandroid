package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ uz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kz(3, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new pq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
