package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ he0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xd0(he0 he0Var, String str, int i10) {
        this.a = i10;
        this.b = he0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
