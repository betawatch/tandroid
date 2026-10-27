package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj0 b;

    public /* synthetic */ rj0(zj0 zj0Var, int i10) {
        this.a = i10;
        this.b = zj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kb0(23, this.b, tLObject));
                break;
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                zj0 zj0Var = this.b;
                if (!z10) {
                    zj0Var.getClass();
                    break;
                } else {
                    zj0Var.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
