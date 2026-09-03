package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ String c;

    public /* synthetic */ se(zn znVar, String str, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn.W0(this.b, this.c);
                break;
            case 1:
                zn.h1(this.b, this.c);
                break;
            case 2:
                n4.f(this.c, r1.currentAccount, r1.U0, null, this.b.ba);
                break;
            case 3:
                zn znVar = this.b;
                String str = this.c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f, str);
                        break;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                ze.d.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.b));
                break;
            case 8:
                zn.u1(this.b, this.c);
                break;
            case 9:
                ze.d.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.b));
                break;
            default:
                ze.d.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
