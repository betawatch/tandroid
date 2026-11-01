package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wk0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ jl0 e;

    public wk0(jl0 jl0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = jl0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i11;
        jl0 jl0Var = this.e;
        if (jl0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
            org.telegram.messenger.e20 i12 = org.telegram.messenger.e20.i(i11);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.e1;
            i12.l0 = SystemClock.elapsedRealtime();
            i12.j0 = bArr;
            i12.k0 = bArr2;
        }
        org.telegram.messenger.i0.v1(this.e.Y[0]);
        jl0 jl0Var2 = this.e;
        jl0Var2.f1 = true;
        long j10 = jl0Var2.c;
        jl0 jl0Var3 = new jl0(j10 == 0 ? 8 : 0, j10, jl0Var2.h, jl0Var2.r, jl0Var2.d, jl0Var2.e, jl0Var2.n, jl0Var2.D, jl0Var2.J);
        jl0 jl0Var4 = this.e;
        jl0Var3.d1 = jl0Var4.d1;
        i10 = ((org.telegram.ui.ActionBar.k2) jl0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.k2) jl0Var3).currentAccount = i10;
        jl0 jl0Var5 = this.e;
        jl0Var3.e1 = jl0Var5.e1;
        jl0Var3.c1 = jl0Var5.c1;
        jl0Var3.b1 = jl0Var5.b1;
        jl0Var3.C1 = jl0Var5.C1;
        z4Var = ((org.telegram.ui.ActionBar.k2) jl0Var5).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) this.e).parentLayout;
            if (((ActionBarLayout) z4Var2).i()) {
                this.e.h1 = jl0Var3;
                return;
            }
        }
        this.e.presentFragment(jl0Var3, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        jl0 jl0Var = this.e;
        TL_account.Password password = jl0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.bw.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new uk0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.e.c(new kp(this, tLObject, this.d, this.a, 9));
                return;
            } else {
                org.telegram.messenger.i0.g3(new zj0(this, this.a, tL_error, 1));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.k2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new org.telegram.messenger.voip.u0(7, this, this.a), 8);
    }
}
