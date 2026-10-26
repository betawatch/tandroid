package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.ui.Components.hn0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ve(un unVar, org.telegram.ui.Components.hn0 hn0Var, String str, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = hn0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.vh.m(i10, b02);
    }
}
