package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ String c;

    public /* synthetic */ ue(zn znVar, String str, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn.q1(this.b, this.c);
                break;
            case 1:
                zn.u1(this.b, this.c);
                break;
            case 2:
                i4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
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
                this.b.qa(this.c);
                break;
            case 5:
                this.b.ia(this.c, false);
                break;
            case 6:
                of.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.bi.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.b));
                break;
            case 8:
                zn.d1(this.b, this.c);
                break;
            case 9:
                of.f.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.bi.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.b));
                break;
            case 11:
                zn znVar2 = this.b;
                znVar2.getClass();
                znVar2.presentFragment(new org.telegram.ui.Wallet.j8(this.c));
                break;
            case 12:
                zn znVar3 = this.b;
                String str2 = znVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = znVar3.getParentActivity();
                StringBuilder v = a1.g.v(str2);
                v.append(Uri.encode(this.c));
                of.f.u(parentActivity, v.toString());
                break;
            default:
                of.f.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
