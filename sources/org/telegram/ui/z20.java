package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z20 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ z20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                d60 d60Var = this.b;
                if (updates != null) {
                    d60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new q20(d60Var, 10));
                break;
            default:
                d60 d60Var2 = this.b;
                if (updates == null) {
                    d60Var2.getClass();
                    break;
                } else {
                    d60Var2.d.getMessagesController().processUpdates(updates, false);
                    break;
                }
        }
    }
}
