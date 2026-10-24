package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                AndroidUtilities.runOnUIThread(new ot(15, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
