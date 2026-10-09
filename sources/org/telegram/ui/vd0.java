package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vd0(fe0 fe0Var, String str, int i10) {
        this.a = i10;
        this.b = fe0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
