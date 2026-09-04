package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ String c;

    public /* synthetic */ se(co coVar, String str, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co.W0(this.b, this.c);
                break;
            case 1:
                co.h1(this.b, this.c);
                break;
            case 2:
                i4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
                break;
            case 3:
                co coVar = this.b;
                String str = this.c;
                if (str != null) {
                    coVar.getClass();
                    if (str.length() != 0) {
                        coVar.getMessagesController().sendBotStart(coVar.f, str);
                        break;
                    }
                }
                coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                of.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.b));
                break;
            case 8:
                co.u1(this.b, this.c);
                break;
            case 9:
                of.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.b));
                break;
            default:
                of.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
