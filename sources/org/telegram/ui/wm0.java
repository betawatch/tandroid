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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wm0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ kn0 e;

    public wm0(kn0 kn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = kn0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        int i11;
        kn0 kn0Var = this.e;
        if (kn0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, kn0Var.e1);
        }
        AndroidUtilities.hideKeyboard(kn0Var.Y[0]);
        kn0Var.f1 = true;
        long j10 = kn0Var.c;
        kn0 kn0Var2 = new kn0(j10 == 0 ? 8 : 0, j10, kn0Var.h, kn0Var.r, kn0Var.d, kn0Var.e, kn0Var.n, kn0Var.y, kn0Var.J);
        kn0Var2.d1 = kn0Var.d1;
        i10 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.r2) kn0Var2).currentAccount = i10;
        kn0Var2.e1 = kn0Var.e1;
        kn0Var2.c1 = kn0Var.c1;
        kn0Var2.b1 = kn0Var.b1;
        kn0Var2.C1 = kn0Var.C1;
        j5Var = ((org.telegram.ui.ActionBar.r2) kn0Var).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) kn0Var).parentLayout;
            if (((ActionBarLayout) j5Var2).i()) {
                kn0Var.h1 = kn0Var2;
                return;
            }
        }
        kn0Var.presentFragment(kn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        kn0 kn0Var = this.e;
        TL_account.Password password = kn0Var.J;
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
        i10 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new um0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new bi.s9((Object) this, tLObject, (Object) this.d, this.a, 25));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new f80(this, this.a, tL_error, 4));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.r2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fi.m3(9, this, this.a), 8);
    }
}
