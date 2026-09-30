package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ org.telegram.ui.Components.om0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ xe(wn wnVar, org.telegram.ui.Components.om0 om0Var, String str, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = om0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.yc a02;
        int i10;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.ok.o(i10, a02);
    }
}
