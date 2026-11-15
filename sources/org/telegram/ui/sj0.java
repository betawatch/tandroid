package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sj0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ek0 e;

    public sj0(ek0 ek0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = ek0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        int i10;
        ek0 ek0Var = this.e;
        if (ek0Var.Z == null) {
            return;
        }
        if (!this.a) {
            i10 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.m10 i11 = org.telegram.messenger.m10.i(i10);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.k0 = bArr;
            i11.l0 = bArr2;
        }
        org.telegram.messenger.g0.v1(this.e.Z[0]);
        ek0 ek0Var2 = this.e;
        ek0Var2.g1 = true;
        long j3 = ek0Var2.c;
        ek0 ek0Var3 = new ek0(j3 == 0 ? 8 : 0, j3, ek0Var2.h, ek0Var2.r, ek0Var2.d, ek0Var2.e, ek0Var2.n, ek0Var2.E, ek0Var2.K);
        ek0 ek0Var4 = this.e;
        ek0Var3.e1 = ek0Var4.e1;
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.e2) ek0Var3).currentAccount = i7;
        ek0 ek0Var5 = this.e;
        ek0Var3.f1 = ek0Var5.f1;
        ek0Var3.d1 = ek0Var5.d1;
        ek0Var3.c1 = ek0Var5.c1;
        ek0Var3.D1 = ek0Var5.D1;
        o4Var = ((org.telegram.ui.ActionBar.e2) ek0Var5).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) this.e).parentLayout;
            if (((ActionBarLayout) o4Var2).i()) {
                this.e.i1 = ek0Var3;
                return;
            }
        }
        this.e.presentFragment(ek0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        ek0 ek0Var = this.e;
        TL_account.Password password = ek0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.nv.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.c, new qj0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.e.c(new wn((Object) this, tLObject, (Object) this.d, this.a, 11));
                return;
            } else {
                org.telegram.messenger.g0.h3(new f60(this, this.a, tL_error, 4));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i7 = ((org.telegram.ui.ActionBar.e2) this.e).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hi.b3(8, this, this.a), 8);
    }
}
