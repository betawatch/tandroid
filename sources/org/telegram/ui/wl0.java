package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ wl0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oe0(this.b, tL_error, tLObject, 13));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new yl0(1, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new sl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yl0(0, this.b, tLObject));
                break;
        }
    }
}
