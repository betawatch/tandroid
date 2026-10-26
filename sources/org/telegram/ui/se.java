package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ String c;

    public /* synthetic */ se(un unVar, String str, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.o0(this.b, this.c);
                break;
            case 1:
                un.g0(this.b, this.c);
                break;
            case 2:
                j4.f(this.c, r1.currentAccount, r1.j1, null, this.b.qa);
                break;
            case 3:
                un unVar = this.b;
                String str = this.c;
                if (str != null) {
                    unVar.getClass();
                    if (str.length() != 0) {
                        unVar.getMessagesController().sendBotStart(unVar.f, str);
                        break;
                    }
                }
                unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", unVar.f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.va(this.c);
                break;
            case 5:
                this.b.na(this.c, false);
                break;
            case 6:
                qf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.vh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.b));
                break;
            case 8:
                un.e0(this.b, this.c);
                break;
            case 9:
                qf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.vh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.b));
                break;
            case 11:
                un unVar2 = this.b;
                unVar2.getClass();
                unVar2.presentFragment(new org.telegram.ui.Wallet.i9(this.c));
                break;
            case 12:
                un unVar3 = this.b;
                String str2 = unVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = unVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.c));
                qf.d.t(parentActivity, u10.toString());
                break;
            default:
                qf.d.r(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
