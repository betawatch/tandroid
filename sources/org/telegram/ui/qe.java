package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ org.telegram.ui.Components.ll0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ qe(qn qnVar, org.telegram.ui.Components.ll0 ll0Var, String str, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = ll0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.oc a02;
        int i9;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.oc.a0(this.b);
                i9 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.oc.a0(this.b);
                i9 = R.string.UsernameCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.oc.a0(this.b);
                i9 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.ll.o(i9, a02);
    }
}
