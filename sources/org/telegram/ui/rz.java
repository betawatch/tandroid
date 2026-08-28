package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ rz(n00 n00Var, int i9) {
        this.a = i9;
        this.b = n00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(22, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
