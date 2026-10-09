package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public /* synthetic */ vn0(vo0 vo0Var, int i10) {
        this.a = i10;
        this.b = vo0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tf0(21, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new un0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new on0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new on0(this.b, tLObject, 0));
                break;
        }
    }
}
