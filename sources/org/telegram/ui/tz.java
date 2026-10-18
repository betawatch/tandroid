package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ tz(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nt(15, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
