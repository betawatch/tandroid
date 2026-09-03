package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ zg0(qh0 qh0Var, int i10) {
        this.a = i10;
        this.b = qh0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new eh0(this.b, tL_error, tLObject, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ue0(8, this.b, tL_error));
                break;
        }
    }
}
