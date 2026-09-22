package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
