package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ud0(ee0 ee0Var, String str, int i10) {
        this.a = i10;
        this.b = ee0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new wd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
