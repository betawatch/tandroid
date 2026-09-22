package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ wd0(ge0 ge0Var, String str, int i10) {
        this.a = i10;
        this.b = ge0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
