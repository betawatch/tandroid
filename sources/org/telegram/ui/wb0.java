package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ wb0(ec0 ec0Var, String str, int i10) {
        this.a = i10;
        this.b = ec0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ec0 ec0Var = this.b;
                ec0Var.c();
                if (passkeys != null) {
                    ec0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.c)) {
                        ec0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str = (String) obj2;
                ec0 ec0Var2 = this.b;
                ec0Var2.c();
                if (y1Var != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && U.getContext() != null) {
                        org.telegram.ui.Wallet.d2.B(U.getContext(), ec0Var2.b, y1Var, null, U.getResourceProvider(), null, new zb0(ec0Var2, this.c, 1));
                        break;
                    }
                } else {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.ad.b0(str);
                    break;
                }
                break;
        }
    }
}
