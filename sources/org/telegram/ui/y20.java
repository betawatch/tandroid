package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ y20(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                c60 c60Var = this.b;
                if (updates != null) {
                    c60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new p20(c60Var, 10));
                break;
            default:
                c60 c60Var2 = this.b;
                if (updates == null) {
                    c60Var2.getClass();
                    break;
                } else {
                    c60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
