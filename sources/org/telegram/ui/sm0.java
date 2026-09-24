package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class sm0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ gn0 e;

    public sm0(gn0 gn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = gn0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        gn0 gn0Var = this.e;
        if (gn0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, gn0Var.e1);
        }
        AndroidUtilities.hideKeyboard(gn0Var.Y[0]);
        gn0Var.f1 = true;
        long j3 = gn0Var.c;
        gn0 gn0Var2 = new gn0(j3 == 0 ? 8 : 0, j3, gn0Var.h, gn0Var.r, gn0Var.d, gn0Var.e, gn0Var.n, gn0Var.y, gn0Var.J);
        gn0Var2.d1 = gn0Var.d1;
        i10 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) gn0Var2).currentAccount = i10;
        gn0Var2.e1 = gn0Var.e1;
        gn0Var2.c1 = gn0Var.c1;
        gn0Var2.b1 = gn0Var.b1;
        gn0Var2.C1 = gn0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) gn0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) gn0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                gn0Var.h1 = gn0Var2;
                return;
            }
        }
        gn0Var.presentFragment(gn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        gn0 gn0Var = this.e;
        TL_account.Password password = gn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        updatepasswordsettings.new_settings = passwordinputsettings;
        passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
        tL_secureSecretSettings.secure_secret = new byte[0];
        tL_secureSecretSettings.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
        TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
        passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
        passwordinputsettings2.flags |= 4;
        i10 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new qm0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.a, 25));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new da0(this, this.a, tL_error, 2));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.m2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.t3(9, this, this.a), 8);
    }
}
