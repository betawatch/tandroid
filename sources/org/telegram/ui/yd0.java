package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
