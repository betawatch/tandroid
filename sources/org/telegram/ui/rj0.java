package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rj0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dk0 e;

    public rj0(dk0 dk0Var, boolean z9, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = dk0Var;
        this.a = z9;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i10;
        dk0 dk0Var = this.e;
        if (dk0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i10 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
            org.telegram.messenger.p10 i11 = org.telegram.messenger.p10.i(i10);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.e1;
            i11.l0 = SystemClock.elapsedRealtime();
            i11.j0 = bArr;
            i11.k0 = bArr2;
        }
        org.telegram.messenger.g0.v1(this.e.Y[0]);
        dk0 dk0Var2 = this.e;
        dk0Var2.f1 = true;
        long j3 = dk0Var2.c;
        dk0 dk0Var3 = new dk0(j3 == 0 ? 8 : 0, j3, dk0Var2.h, dk0Var2.r, dk0Var2.d, dk0Var2.e, dk0Var2.n, dk0Var2.D, dk0Var2.J);
        dk0 dk0Var4 = this.e;
        dk0Var3.d1 = dk0Var4.d1;
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.f2) dk0Var3).currentAccount = i7;
        dk0 dk0Var5 = this.e;
        dk0Var3.e1 = dk0Var5.e1;
        dk0Var3.c1 = dk0Var5.c1;
        dk0Var3.b1 = dk0Var5.b1;
        dk0Var3.C1 = dk0Var5.C1;
        q4Var = ((org.telegram.ui.ActionBar.f2) dk0Var5).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) this.e).parentLayout;
            if (((ActionBarLayout) q4Var2).i()) {
                this.e.h1 = dk0Var3;
                return;
            }
        }
        this.e.presentFragment(dk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        dk0 dk0Var = this.e;
        TL_account.Password password = dk0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.pv.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.c, new pj0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.e.c(new xn((Object) this, tLObject, (Object) this.d, this.a, 11));
                return;
            } else {
                org.telegram.messenger.g0.h3(new i60(this, this.a, tL_error, 4));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i7 = ((org.telegram.ui.ActionBar.f2) this.e).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(getpassword, new fi.d3(8, this, this.a), 8);
    }
}
