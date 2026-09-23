package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ String c;

    public /* synthetic */ re(xn xnVar, String str, int i10) {
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
                i4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
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
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.ul.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            case 8:
                xn.u1(this.b, this.c);
                break;
            case 9:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.ul.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            default:
                nf.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
