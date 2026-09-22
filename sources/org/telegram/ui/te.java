package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ String c;

    public /* synthetic */ te(zn znVar, String str, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn.l1(this.b, this.c);
                break;
            case 1:
                zn.p1(this.b, this.c);
                break;
            case 2:
                h4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
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
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                org.telegram.messenger.rk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            case 8:
                zn.S0(this.b, this.c);
                break;
            case 9:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.rk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            default:
                nf.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
