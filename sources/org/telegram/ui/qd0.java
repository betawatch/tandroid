package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qd0(ae0 ae0Var, String str, int i10) {
        this.a = i10;
        this.b = ae0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
