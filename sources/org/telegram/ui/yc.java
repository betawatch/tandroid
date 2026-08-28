package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;

    public /* synthetic */ yc(id idVar, int i9) {
        this.a = i9;
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
                AndroidUtilities.runOnUIThread(new t1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
