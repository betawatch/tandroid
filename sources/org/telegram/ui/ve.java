package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ org.telegram.ui.Components.in0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ve(wn wnVar, org.telegram.ui.Components.in0 in0Var, String str, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = in0Var;
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
        org.telegram.messenger.wh.m(i10, b02);
    }
}
