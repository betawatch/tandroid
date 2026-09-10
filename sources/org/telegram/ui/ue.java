package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ String c;

    public /* synthetic */ ue(eo eoVar, String str, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo.W0(this.b, this.c);
                break;
            case 1:
                eo.h1(this.b, this.c);
                break;
            case 2:
                j4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
                break;
            case 3:
                eo eoVar = this.b;
                String str = this.c;
                if (str != null) {
                    eoVar.getClass();
                    if (str.length() != 0) {
                        eoVar.getMessagesController().sendBotStart(eoVar.f, str);
                        break;
                    }
                }
                eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                org.telegram.messenger.em.o(R.string.PhoneCopied, org.telegram.ui.Components.wc.a0(this.b));
                break;
            case 8:
                eo.u1(this.b, this.c);
                break;
            case 9:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.em.o(R.string.PhoneCopied, org.telegram.ui.Components.wc.a0(this.b));
                break;
            default:
                nf.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
