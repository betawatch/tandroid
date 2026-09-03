package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ org.telegram.ui.Components.im0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ve(xn xnVar, org.telegram.ui.Components.im0 im0Var, String str, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = im0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        switch (this.a) {
            case 0:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        b.m(i10, a02);
    }
}
