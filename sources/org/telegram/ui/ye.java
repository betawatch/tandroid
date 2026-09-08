package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ org.telegram.ui.Components.am0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ye(co coVar, org.telegram.ui.Components.am0 am0Var, String str, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = am0Var;
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
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.wl.o(i10, a02);
    }
}
