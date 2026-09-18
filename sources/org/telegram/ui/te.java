package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ String c;

    public /* synthetic */ te(bo boVar, String str, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo.W0(this.b, this.c);
                break;
            case 1:
                bo.h1(this.b, this.c);
                break;
            case 2:
                h4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
                break;
            case 3:
                bo boVar = this.b;
                String str = this.c;
                if (str != null) {
                    boVar.getClass();
                    if (str.length() != 0) {
                        boVar.getMessagesController().sendBotStart(boVar.f, str);
                        break;
                    }
                }
                boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(this.b));
                break;
            case 8:
                bo.u1(this.b, this.c);
                break;
            case 9:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(this.b));
                break;
            default:
                nf.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
