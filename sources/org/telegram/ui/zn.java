package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ zn(ho hoVar, int i9) {
        this.a = i9;
        this.b = hoVar;
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
