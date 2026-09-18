package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ org.telegram.ui.Components.bm0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ze(bo boVar, org.telegram.ui.Components.bm0 bm0Var, String str, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = bm0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.vc a02;
        int i10;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.wl.o(i10, a02);
    }
}
