package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;

    public /* synthetic */ qn0(qo0 qo0Var, int i10) {
        this.a = i10;
        this.b = qo0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gl0(7, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new pn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new jn0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jn0(this.b, tLObject, 0));
                break;
        }
    }
}
