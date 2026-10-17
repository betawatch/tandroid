package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ String c;

    public /* synthetic */ te(sn snVar, String str, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn.q1(this.b, this.c);
                break;
            case 1:
                sn.u1(this.b, this.c);
                break;
            case 2:
                l4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
                break;
            case 3:
                sn snVar = this.b;
                String str = this.c;
                if (str != null) {
                    snVar.getClass();
                    if (str.length() != 0) {
                        snVar.getMessagesController().sendBotStart(snVar.f, str);
                        break;
                    }
                }
                snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.qa(this.c);
                break;
            case 5:
                this.b.ia(this.c, false);
                break;
            case 6:
                pf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wh.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            case 8:
                sn.d1(this.b, this.c);
                break;
            case 9:
                pf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wh.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            case 11:
                sn snVar2 = this.b;
                snVar2.getClass();
                snVar2.presentFragment(new org.telegram.ui.Wallet.l9(this.c));
                break;
            case 12:
                sn snVar3 = this.b;
                String str2 = snVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = snVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.c));
                pf.d.t(parentActivity, u10.toString());
                break;
            default:
                pf.d.r(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
