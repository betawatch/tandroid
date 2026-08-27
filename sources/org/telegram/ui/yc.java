package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;

    public /* synthetic */ yc(id idVar, int i10) {
        this.a = i10;
        this.b = idVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(29, this.b, tLObject));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new zc(this.b, 3));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(27, this.b, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
