package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ s20(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                if (updates != null) {
                    x50Var.d.getMessagesController().lambda$processUpdates$379(updates, false);
                }
                AndroidUtilities.runOnUIThread(new j20(x50Var, 10));
                break;
            default:
                x50 x50Var2 = this.b;
                if (updates == null) {
                    x50Var2.getClass();
                    break;
                } else {
                    x50Var2.d.getMessagesController().lambda$processUpdates$379(updates, false);
                    break;
                }
        }
    }
}
