package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vj0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ hk0 e;

    public vj0(hk0 hk0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = hk0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        int i10;
        hk0 hk0Var = this.e;
        if (hk0Var.Z == null) {
            return;
        }
        if (!this.a) {
            i10 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
            org.telegram.messenger.j10 i11 = org.telegram.messenger.j10.i(i10);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.k0 = bArr;
            i11.l0 = bArr2;
        }
        org.telegram.messenger.g0.v1(this.e.Z[0]);
        hk0 hk0Var2 = this.e;
        hk0Var2.g1 = true;
        long j3 = hk0Var2.c;
        hk0 hk0Var3 = new hk0(j3 == 0 ? 8 : 0, j3, hk0Var2.h, hk0Var2.r, hk0Var2.d, hk0Var2.e, hk0Var2.n, hk0Var2.E, hk0Var2.K);
        hk0 hk0Var4 = this.e;
        hk0Var3.e1 = hk0Var4.e1;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.h2) hk0Var3).currentAccount = i7;
        hk0 hk0Var5 = this.e;
        hk0Var3.f1 = hk0Var5.f1;
        hk0Var3.d1 = hk0Var5.d1;
        hk0Var3.c1 = hk0Var5.c1;
        hk0Var3.D1 = hk0Var5.D1;
        s4Var = ((org.telegram.ui.ActionBar.h2) hk0Var5).parentLayout;
        if (s4Var != null) {
            s4Var2 = ((org.telegram.ui.ActionBar.h2) this.e).parentLayout;
            if (((ActionBarLayout) s4Var2).i()) {
                this.e.i1 = hk0Var3;
                return;
            }
        }
        this.e.presentFragment(hk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        hk0 hk0Var = this.e;
        TL_account.Password password = hk0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.jv.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.c, new tj0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.e.c(new yn((Object) this, tLObject, (Object) this.d, this.a, 11));
                return;
            } else {
                org.telegram.messenger.g0.g3(new a80(this, this.a, tL_error, 3));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i7 = ((org.telegram.ui.ActionBar.h2) this.e).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hi.c3(8, this, this.a), 8);
    }
}
