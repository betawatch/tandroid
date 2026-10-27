package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ String c;

    public /* synthetic */ se(wn wnVar, String str, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn.f0(this.b, this.c);
                break;
            case 1:
                wn.g1(this.b, this.c);
                break;
            case 2:
                j4.f(this.c, r1.currentAccount, r1.j1, null, this.b.ua);
                break;
            case 3:
                wn wnVar = this.b;
                String str = this.c;
                if (str != null) {
                    wnVar.getClass();
                    if (str.length() != 0) {
                        wnVar.getMessagesController().sendBotStart(wnVar.f, str);
                        break;
                    }
                }
                wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", wnVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.ya(this.c);
                break;
            case 5:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                wnVar2.presentFragment(new org.telegram.ui.Wallet.i9(this.c));
                break;
            case 6:
                wn wnVar3 = this.b;
                String str2 = wnVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = wnVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.c));
                qf.d.t(parentActivity, u10.toString());
                break;
            case 7:
                this.b.qa(this.c, false);
                break;
            case 8:
                qf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 9:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.b));
                break;
            case 10:
                wn.j1(this.b, this.c);
                break;
            case 11:
                qf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 12:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.wh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.b));
                break;
            default:
                qf.d.r(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
