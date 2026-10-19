package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ String c;

    public /* synthetic */ re(qn qnVar, String str, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn.q1(this.b, this.c);
                break;
            case 1:
                qn.u1(this.b, this.c);
                break;
            case 2:
                l4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
                break;
            case 3:
                qn qnVar = this.b;
                String str = this.c;
                if (str != null) {
                    qnVar.getClass();
                    if (str.length() != 0) {
                        qnVar.getMessagesController().sendBotStart(qnVar.f, str);
                        break;
                    }
                }
                qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
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
                org.telegram.messenger.kk.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            case 8:
                qn.d1(this.b, this.c);
                break;
            case 9:
                pf.d.r(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.kk.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.b));
                break;
            case 11:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                qnVar2.presentFragment(new org.telegram.ui.Wallet.i9(this.c));
                break;
            case 12:
                qn qnVar3 = this.b;
                String str2 = qnVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = qnVar3.getParentActivity();
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
