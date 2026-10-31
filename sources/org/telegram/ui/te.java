package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ String c;

    public /* synthetic */ te(un unVar, String str, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = this.c;
        un unVar = this.b;
        switch (i10) {
            case 0:
                un.F0(unVar, str);
                break;
            case 1:
                un.x0(unVar, str);
                break;
            case 2:
                h4.d(str, unVar.currentAccount, unVar.l1, null, unVar.xa);
                break;
            case 3:
                if (str != null) {
                    unVar.getClass();
                    if (str.length() != 0) {
                        unVar.getMessagesController().x4(str, unVar.f);
                        break;
                    }
                }
                unVar.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/start", unVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                unVar.Ba(str);
                break;
            case 5:
                unVar.ta(str, false);
                break;
            case 6:
                gf.f.r(unVar.getParentActivity(), "tel:" + str);
                break;
            case 7:
                org.telegram.messenger.i0.g(str);
                org.telegram.messenger.z20.r(null, 2131747311, org.telegram.ui.Components.cc.a0(unVar));
                break;
            case 8:
                un.I0(unVar, str);
                break;
            case 9:
                gf.f.r(unVar.getParentActivity(), "tel:" + str);
                break;
            case 10:
                org.telegram.messenger.i0.g(str);
                org.telegram.messenger.z20.r(null, 2131747311, org.telegram.ui.Components.cc.a0(unVar));
                break;
            case 11:
                unVar.getClass();
                unVar.presentFragment(new org.telegram.ui.Wallet.r9(str));
                break;
            case 12:
                String str2 = unVar.getMessagesController().I6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = unVar.getParentActivity();
                StringBuilder t10 = a1.g.t(str2);
                t10.append(Uri.encode(str));
                gf.f.t(parentActivity, t10.toString());
                break;
            default:
                gf.f.r(unVar.getParentActivity(), "https://fragment.com/username/" + str);
                break;
        }
    }
}
