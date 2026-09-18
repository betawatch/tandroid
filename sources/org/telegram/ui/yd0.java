package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ yd0(ie0 ie0Var, String str, int i10) {
        this.a = i10;
        this.b = ie0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ae0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ae0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
