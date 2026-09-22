package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ org.telegram.ui.Components.am0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ xe(bo boVar, org.telegram.ui.Components.am0 am0Var, String str, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = am0Var;
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
        org.telegram.messenger.vl.p(i10, a02);
    }
}
