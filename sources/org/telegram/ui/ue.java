package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ String c;

    public /* synthetic */ ue(yn ynVar, String str, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn.V0(this.b, this.c);
                break;
            case 1:
                yn.h1(this.b, this.c);
                break;
            case 2:
                i4.f(this.c, r1.currentAccount, r1.V0, null, this.b.ca);
                break;
            case 3:
                yn ynVar = this.b;
                String str = this.c;
                if (str != null) {
                    ynVar.getClass();
                    if (str.length() != 0) {
                        ynVar.getMessagesController().sendBotStart(ynVar.f, str);
                        break;
                    }
                }
                ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.ka(this.c);
                break;
            case 5:
                this.b.ca(this.c, false);
                break;
            case 6:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.bi.n(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.b));
                break;
            case 8:
                yn.v1(this.b, this.c);
                break;
            case 9:
                nf.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.bi.n(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.b));
                break;
            default:
                nf.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
