package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ zn(io ioVar, int i10) {
        this.a = i10;
        this.b = ioVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new bo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bo(this.b, 4));
                break;
        }
    }
}
