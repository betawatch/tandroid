package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ wf0(eg0 eg0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = eg0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new wc0(10, eg0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new uf0(eg0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(this.b, tL_error, this.c, tLObject, 19));
                break;
        }
    }
}
