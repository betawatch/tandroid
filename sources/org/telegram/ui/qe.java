package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ String c;

    public /* synthetic */ qe(xn xnVar, String str, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn.W0(this.b, this.c);
                break;
            case 1:
                xn.h1(this.b, this.c);
                break;
            case 2:
                l4.f(this.c, r1.currentAccount, r1.U0, null, this.b.ba);
                break;
            case 3:
                xn xnVar = this.b;
                String str = this.c;
                if (str != null) {
                    xnVar.getClass();
                    if (str.length() != 0) {
                        xnVar.getMessagesController().sendBotStart(xnVar.f, str);
                        break;
                    }
                }
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                af.g.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.b));
                break;
            case 8:
                xn.u1(this.b, this.c);
                break;
            case 9:
                af.g.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.b));
                break;
            default:
                af.g.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
