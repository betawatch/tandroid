package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ra1 extends org.telegram.ui.ActionBar.d2 {
    public gi.n5 E;
    public org.telegram.ui.ActionBar.e0 F;
    public boolean G;
    public int H;
    public boolean I;
    public AnimatorSet J;
    public final ArrayList K;
    public AnimatorSet L;
    public RadialProgressView M;
    public boolean N;
    public boolean O;
    public final int P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public TL_account.Password V;
    public byte[] W;
    public long X;
    public byte[] Y;
    public boolean Z;
    public org.telegram.ui.Components.fh0 a;
    public boolean a0;
    public TextView b;
    public String b0;
    public TextView c;
    public k4.j c0;
    public yh.l d;
    public org.telegram.ui.Components.l00 d0;
    public TextView e;
    public org.telegram.ui.Components.n11 e0;
    public TextView f;
    public org.telegram.ui.Components.br f0;
    public org.telegram.ui.Components.ch0[] g0;
    public TextView h;
    public ga1 h0;
    public final Runnable i0;
    public final Runnable j0;
    public i90 k0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.gb0 s;
    public org.telegram.ui.Components.gb0 w;
    public ib0 x;
    public qa1 y;

    public ra1(int i3, int i10, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new ga1(this, 0);
        this.j0 = new ga1(this, 1);
        this.currentAccount = i3;
        this.P = i10;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ia1(this, 0), 10);
            }
        }
    }

    public static void Z(ra1 ra1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = ra1Var.V;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.hv.d(ra1Var.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] h12 = org.telegram.messenger.g0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = ra1Var.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.hv.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        }
        lg.m0 m0Var = new lg.m0(ra1Var, z10, bArr, str, passwordinputsettings);
        if (z10) {
            ConnectionsManager.getInstance(ra1Var.currentAccount).sendRequest(tLObject, m0Var, 10);
            return;
        }
        if (str != null && (bArr3 = ra1Var.Y) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = ra1Var.V.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(m10, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(m10, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(ra1Var.Y, 0, bArr6, 0, 32);
                Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = ra1Var.X;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = ra1Var.V.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            m0Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] b10 = org.telegram.messenger.hv.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = b10;
            if (b10 == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                m0Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(ra1Var.currentAccount).sendRequest(tLObject, m0Var, 10);
    }

    public static void a0(ra1 ra1Var) {
        ConnectionsManager.getInstance(ra1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ei.u5(9));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131746130, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(2131743941, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        ra1Var.showDialog(s1Var);
    }

    public static void b0(ra1 ra1Var, byte[] bArr) {
        ArrayList arrayList = ra1Var.K;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((org.telegram.ui.ActionBar.d2) arrayList.get(i3)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = ra1Var.V;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = ra1Var.V;
        if (bArr == null) {
            bArr = ra1Var.W;
        }
        twoStepVerificationActivity.A0(password2, bArr, ra1Var.X, ra1Var.Y);
        twoStepVerificationActivity.Y = ra1Var.H;
        ra1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.q0, ra1Var.V);
        i90 i90Var = ra1Var.k0;
        if (i90Var != null) {
            org.telegram.messenger.g0.h3(i90Var);
            ra1Var.k0 = null;
        }
    }

    public static void c0(ra1 ra1Var) {
        ArrayList arrayList = ra1Var.K;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((org.telegram.ui.ActionBar.d2) arrayList.get(i3)).removeSelfFromStack();
        }
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(ra1Var.currentAccount);
        byte[] bArr = ra1Var.W;
        TL_account.Password password = ra1Var.V;
        f10.k(org.telegram.messenger.hs.p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, ra1Var.S, ra1Var.R, null, ra1Var.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = ra1Var.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, ra1Var.W, ra1Var.X, ra1Var.Y);
        twoStepVerificationActivity.Y = ra1Var.H;
        ra1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.q0, ra1Var.V);
        i90 i90Var = ra1Var.k0;
        if (i90Var != null) {
            org.telegram.messenger.g0.h3(i90Var);
            ra1Var.k0 = null;
        }
    }

    public static /* synthetic */ void d0(ra1 ra1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = ra1Var.V.current_algo;
        byte[] c2 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.hv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        m21 m21Var = new m21(8, ra1Var, c2);
        TL_account.Password password = ra1Var.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            m21Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(c2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(ra1Var.currentAccount).sendRequest(getpasswordsettings, m21Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        m21Var.run(null, tL_error2);
    }

    public static void e0(ra1 ra1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ra1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ia1(ra1Var, 4), 8);
            return;
        }
        ra1Var.B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            ra1Var.d.setText(org.telegram.messenger.bd.M0(2131752157, null));
            org.telegram.ui.ActionBar.r6.V(ra1Var.d, org.telegram.ui.ActionBar.k6.p7, null);
            ra1Var.E0(ra1Var.s, ra1Var.n, true);
            ra1Var.M0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static /* synthetic */ void f0(ra1 ra1Var) {
        ArrayList arrayList = ra1Var.K;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((org.telegram.ui.ActionBar.d2) arrayList.get(i3)).removeSelfFromStack();
        }
        org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.p0, new Object[0]);
        ra1Var.finishFragment();
    }

    public static void g0(ra1 ra1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ra1Var.V = password;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.t4.w0(ra1Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                return;
            }
            ra1Var.U = !TextUtils.isEmpty(ra1Var.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.r0(ra1Var.V);
            if (!ra1Var.T && ra1Var.Z) {
                TL_account.Password password2 = ra1Var.V;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!ra1Var.U && passwordKdfAlgo != null) {
                        org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        ra1Var.finishFragment();
                    }
                }
            }
            if (ra1Var.O) {
                ra1Var.B0();
                ra1Var.H0();
            }
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.q0, ra1Var.V);
        }
    }

    public static /* synthetic */ void h0(ra1 ra1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ra1Var.V = password;
            TwoStepVerificationActivity.r0(password);
            ra1Var.J0(z10);
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.q0, ra1Var.V);
        }
    }

    public static void i0(ra1 ra1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = ra1Var.K;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ra1Var.currentAccount).sendRequest(new TL_account.getPassword(), new gi.b3(11, ra1Var, z10), 8);
            return;
        }
        ra1Var.B0();
        int i3 = org.telegram.messenger.hs.p0;
        int i10 = 0;
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.M0(2131747453, null));
                        return;
                    }
                    if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                        ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.M0(2131751201, null));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        ra1Var.L0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                        return;
                    }
                }
                org.telegram.messenger.hs.f(ra1Var.currentAccount).k(i3, new Object[0]);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.d2) arrayList.get(i11)).removeSelfFromStack();
                }
                org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(ra1Var.currentAccount);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = ra1Var.V;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = ra1Var.S;
                f10.k(i3, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, ra1Var.R, str2, ra1Var.Q);
                TL_account.Password password3 = ra1Var.V;
                password3.email_unconfirmed_pattern = ra1Var.S;
                ra1 ra1Var2 = new ra1(5, password3);
                ra1Var2.I = ra1Var.I;
                ra1Var2.I0(bArr != null ? bArr : ra1Var.W, ra1Var.X, ra1Var.Y, ra1Var.a0);
                ra1Var2.Z = ra1Var.Z;
                ra1Var2.H = ra1Var.H;
                ra1Var.presentFragment(ra1Var2, true);
                return;
            }
            return;
        }
        ra1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
        int i12 = org.telegram.messenger.hs.q0;
        if (z10) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((org.telegram.ui.ActionBar.d2) arrayList.get(i13)).removeSelfFromStack();
            }
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.r0, new Object[0]);
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(i12, new Object[0]);
            ra1Var.finishFragment();
            return;
        }
        if (ra1Var.getParentActivity() == null) {
            return;
        }
        if (ra1Var.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new na1(i10, ra1Var, bArr));
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            if (str == null && (password = ra1Var.V) != null && password.has_password) {
                s1Var.U = org.telegram.messenger.bd.M0(2131742823, null);
            } else {
                s1Var.U = org.telegram.messenger.bd.M0(2131742814, null);
            }
            s1Var.S = org.telegram.messenger.bd.M0(2131742808, null);
            Dialog showDialog = ra1Var.showDialog(s1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i14 = 0; i14 < size3; i14++) {
            ((org.telegram.ui.ActionBar.d2) arrayList.get(i14)).removeSelfFromStack();
        }
        TL_account.Password password4 = ra1Var.V;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (ra1Var.Z) {
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(i3, new Object[0]);
        }
        ra1 ra1Var3 = new ra1(7, ra1Var.V);
        ra1Var3.I = ra1Var.I;
        ra1Var3.I0(bArr != null ? bArr : ra1Var.W, ra1Var.X, ra1Var.Y, ra1Var.a0);
        ra1Var3.Z = ra1Var.Z;
        ra1Var3.H = ra1Var.H;
        ra1Var.presentFragment(ra1Var3, true);
        org.telegram.messenger.hs.f(ra1Var.currentAccount).k(i12, ra1Var.V);
    }

    public static void j0(ra1 ra1Var, TLRPC.TL_error tL_error) {
        ra1Var.B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = ra1Var.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, ra1Var.W, ra1Var.X, ra1Var.Y);
            twoStepVerificationActivity.Y = ra1Var.H;
            ra1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.r0, new Object[0]);
            i90 i90Var = ra1Var.k0;
            if (i90Var != null) {
                org.telegram.messenger.g0.h3(i90Var);
                ra1Var.k0 = null;
            }
        }
    }

    public static void k0(ra1 ra1Var) {
        ArrayList arrayList = ra1Var.K;
        int i3 = 4;
        if (ra1Var.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new ha1(ra1Var, i3));
            boolean z10 = ra1Var.V.has_recovery;
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            if (z10) {
                s1Var.U = org.telegram.messenger.bd.M0(2131742824, null);
            } else {
                s1Var.U = org.telegram.messenger.bd.M0(2131742823, null);
            }
            s1Var.S = org.telegram.messenger.bd.M0(2131742808, null);
            Dialog showDialog = ra1Var.showDialog(s1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.d2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = ra1Var.V;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        ra1 ra1Var2 = new ra1(7, password);
        ra1Var2.I = ra1Var.I;
        ra1Var2.I0(ra1Var.W, ra1Var.X, ra1Var.Y, ra1Var.a0);
        ra1Var2.K.addAll(arrayList);
        ra1Var2.Z = ra1Var.Z;
        ra1Var2.H = ra1Var.H;
        ra1Var.presentFragment(ra1Var2, true);
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(ra1Var.currentAccount);
        byte[] bArr = ra1Var.W;
        TL_account.Password password2 = ra1Var.V;
        f10.k(org.telegram.messenger.hs.p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, ra1Var.S, ra1Var.R, null, ra1Var.Q);
        org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.q0, ra1Var.V);
    }

    public static void l0(ra1 ra1Var, String str) {
        ra1 ra1Var2 = new ra1(ra1Var.currentAccount, 0, ra1Var.V);
        ra1Var2.I = ra1Var.I;
        ra1Var2.K.addAll(ra1Var.K);
        ra1Var2.K.add(ra1Var);
        ra1Var2.b0 = str;
        ra1Var2.H = ra1Var.H;
        ra1Var.presentFragment(ra1Var2, true);
    }

    public static /* synthetic */ void m0(ra1 ra1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ra1Var.V = password;
            TwoStepVerificationActivity.r0(password);
            org.telegram.messenger.hs.f(ra1Var.currentAccount).k(org.telegram.messenger.hs.q0, ra1Var.V);
            ra1Var.H0();
        }
    }

    public final boolean A0() {
        int i3 = this.P;
        if ((i3 != 5 && i3 != 4) || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x < point.y && !org.telegram.messenger.g0.C1();
    }

    public final void B0() {
        this.d0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.d0.f(true, true);
    }

    public final void D0() {
        for (zq zqVar : this.x.f) {
            zqVar.setText("");
            zqVar.z(1.0f);
        }
        this.x.f[0].requestFocus();
        org.telegram.messenger.g0.G3(8.0f, this.x, new ga1(this, 6));
    }

    public final void E0(org.telegram.ui.Components.gb0 gb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            editTextBoldCursor.setText("");
        }
        org.telegram.messenger.g0.G3(5.0f, gb0Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.V;
        if (password.has_recovery) {
            this.S = "";
            J0(false);
            return;
        }
        ra1 ra1Var = new ra1(this.currentAccount, 3, password);
        ra1Var.I = this.I;
        ra1Var.I0(this.W, this.X, this.Y, this.a0);
        ra1Var.Q = this.Q;
        ra1Var.R = this.R;
        ra1Var.K.addAll(this.K);
        ra1Var.K.add(this);
        ra1Var.Z = this.Z;
        ra1Var.H = this.H;
        presentFragment(ra1Var);
    }

    public final void H0() {
        if (getParentActivity() == null) {
            return;
        }
        int i3 = 0;
        switch (this.P) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    E0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.Q) || this.P != 1) {
                    ra1 ra1Var = new ra1(this.currentAccount, this.P == 0 ? 1 : 2, this.V);
                    ra1Var.I = this.I;
                    ra1Var.Q = this.n.getText().toString();
                    ra1Var.I0(this.W, this.X, this.Y, this.a0);
                    ra1Var.b0 = this.b0;
                    ra1Var.K.addAll(this.K);
                    ra1Var.K.add(this);
                    ra1Var.Z = this.Z;
                    ra1Var.H = this.H;
                    presentFragment(ra1Var);
                    break;
                } else {
                    org.telegram.messenger.g0.G3(5.0f, this.s, null);
                    try {
                        this.s.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131747454, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
            case 2:
                String obj = this.n.getText().toString();
                this.R = obj;
                if (!obj.equalsIgnoreCase(this.Q)) {
                    F0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131747456, null), 0).show();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    E0(this.s, this.n, false);
                    break;
                }
            case 3:
                if (!this.a0 && this.h.getAlpha() < 1.0f) {
                    this.h.animate().cancel();
                    this.h.animate().alpha(1.0f).start();
                }
                String obj2 = this.n.getText().toString();
                this.S = obj2;
                if (obj2 != null && obj2.length() >= 3) {
                    int lastIndexOf = obj2.lastIndexOf(46);
                    int lastIndexOf2 = obj2.lastIndexOf(64);
                    if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                        J0(false);
                        break;
                    }
                }
                E0(this.s, this.n, false);
                break;
            case 4:
                String code = this.x.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new m21(7, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.x.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ia1(this, r1), 10);
                C0();
                break;
            case 6:
                TL_account.Password password = this.V;
                if (password != null) {
                    ra1 ra1Var2 = new ra1(this.currentAccount, 0, password);
                    ra1Var2.I = this.I;
                    ra1Var2.Z = this.Z;
                    ra1Var2.H = this.H;
                    presentFragment(ra1Var2, true);
                    break;
                } else {
                    C0();
                    this.O = true;
                    break;
                }
            case 7:
                if (!this.Z) {
                    if (!this.I) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.V, this.W, this.X, this.Y);
                        twoStepVerificationActivity.Y = this.H;
                        presentFragment(twoStepVerificationActivity, true);
                        i90 i90Var = this.k0;
                        if (i90Var != null) {
                            org.telegram.messenger.g0.h3(i90Var);
                            this.k0 = null;
                            break;
                        }
                    } else {
                        Bundle k10 = a1.g.k("afterSignup", true);
                        ee0 ee0Var = new ee0();
                        ee0Var.r0(k10);
                        presentFragment(ee0Var, true);
                        break;
                    }
                } else {
                    finishFragment();
                    break;
                }
                break;
            case 8:
                if (this.V != null) {
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() != 0) {
                        byte[] h12 = org.telegram.messenger.g0.h1(obj3);
                        C0();
                        Utilities.e.c(new ja1(this, h12, i3));
                        break;
                    } else {
                        E0(this.s, this.n, false);
                        break;
                    }
                } else {
                    C0();
                    this.O = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void I0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j10;
        this.a0 = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.U && this.V.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new ia1(this, 3));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            org.telegram.messenger.h10.i(this.currentAccount).u();
            this.Y = null;
            if (this.U) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            if (this.R == null && (password = this.V) != null) {
                this.R = password.hint;
            }
            if (this.R == null) {
                this.R = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.R;
                passwordinputsettings.new_algo = this.V.new_algo;
            }
            if (this.S.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.S.trim();
            }
        }
        if (this.b0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.b0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.W;
            if (bArr == null || bArr.length == 0 || (z10 && this.U)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.e.c(new gi.q1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.l0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(boolean z10) {
        if (this.P != 0) {
            return;
        }
        ga1 ga1Var = this.h0;
        if (ga1Var != null) {
            org.telegram.messenger.g0.r(ga1Var);
        }
        org.telegram.ui.Components.ch0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z10) {
            org.telegram.ui.Components.ch0[] ch0VarArr = this.g0;
            if (animatedDrawable != ch0VarArr[0]) {
                if (animatedDrawable != ch0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    ga1 ga1Var2 = new ga1(this, 4);
                    this.h0 = ga1Var2;
                    org.telegram.messenger.g0.i3(ga1Var2, Utilities.b.nextInt(2000) + 5000);
                }
            }
        }
        if (Utilities.b.nextInt() % 2 == 0) {
            this.a.setAnimation(this.g0[0]);
            this.g0[0].T(true, 0.0f);
        } else {
            this.a.setAnimation(this.g0[1]);
            this.g0[1].T(true, 0.0f);
        }
        if (!z10) {
            this.a.d();
        }
        ga1 ga1Var22 = new ga1(this, 4);
        this.h0 = ga1Var22;
        org.telegram.messenger.g0.i3(ga1Var22, Utilities.b.nextInt(2000) + 5000);
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void M0(boolean z10) {
        if (z10 == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z10 ? 1 : null);
        this.J = new AnimatorSet();
        if (z10) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.J;
            TextView textView = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.9f);
            TextView textView2 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.9f);
            TextView textView3 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.J;
            TextView textView4 = this.b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.9f);
            TextView textView5 = this.b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.9f);
            TextView textView6 = this.b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property6, 1.0f));
        }
        this.J.addListener(new u40(11, this, z10));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131742958, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743943, null), null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131750595, null), new ha1(this, 0));
        org.telegram.ui.ActionBar.r6.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.q7, null);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3;
        ?? r12;
        ?? r9;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i11, null);
        final int i12 = 1;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i11, null);
        final int i13 = 3;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new pa1(this));
        int i14 = this.P;
        if (i14 == 5) {
            this.actionBar.q().a(0, R.drawable.ic_ab_other).f(1, org.telegram.messenger.bd.M0(2131754947, null));
        }
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.d0 = l00Var;
        this.c0 = new k4.j(l00Var);
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
            public final /* synthetic */ ra1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i10;
                int i16 = 1;
                ra1 ra1Var = this.b;
                switch (i15) {
                    case 0:
                        ra1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                        String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                        ra1Var.showDialog(s1Var);
                        break;
                    case 2:
                        ra1.a0(ra1Var);
                        break;
                    case 3:
                        if (ra1Var.h.getAlpha() >= 0.5f) {
                            int i17 = ra1Var.P;
                            if (i17 != 0) {
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        ra1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.bd.M0(2131742825, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.U = M02;
                                    s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    ra1Var.showDialog(s1Var2);
                                    TextView textView = (TextView) s1Var2.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                ra1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ra1Var.b0;
                                ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i16));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (ra1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = ra1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = ra1Var.H;
                            ra1Var.presentFragment(twoStepVerificationActivity, true);
                            i90 i90Var = ra1Var.k0;
                            if (i90Var != null) {
                                org.telegram.messenger.g0.h3(i90Var);
                                ra1Var.k0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        ra1Var.H0();
                        break;
                    default:
                        int i18 = ra1Var.P;
                        ra1Var.N = true;
                        if (ra1Var.n.getTransformationMethod() == null) {
                            ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = ra1Var.g0[3];
                                if (animatedDrawable != ch0Var) {
                                    ra1Var.a.setAnimation(ch0Var);
                                    ra1Var.g0[3].N(18, false, false);
                                }
                                ra1Var.a.d();
                            }
                        } else {
                            ra1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    ra1Var.a.setAnimation(ch0Var2);
                                }
                                ra1Var.g0[3].T(false, 0.0f);
                                ra1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ra1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ra1Var.N = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(context);
        this.e0 = n11Var;
        n11Var.setTransformType(1);
        this.e0.setProgress(0.0f);
        this.e0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.e0.setDrawBackground(false);
        this.d0.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        this.d0.addView(this.e0, b8.mf.e(56, 56, 17));
        this.d0.a(this.e0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        k4.j.k(this.h);
        this.h.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
            public final /* synthetic */ ra1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                int i16 = 1;
                ra1 ra1Var = this.b;
                switch (i15) {
                    case 0:
                        ra1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                        String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                        ra1Var.showDialog(s1Var);
                        break;
                    case 2:
                        ra1.a0(ra1Var);
                        break;
                    case 3:
                        if (ra1Var.h.getAlpha() >= 0.5f) {
                            int i17 = ra1Var.P;
                            if (i17 != 0) {
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        ra1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.bd.M0(2131742825, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.U = M02;
                                    s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    ra1Var.showDialog(s1Var2);
                                    TextView textView2 = (TextView) s1Var2.d(-1);
                                    if (textView2 != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                ra1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ra1Var.b0;
                                ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i16));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (ra1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = ra1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = ra1Var.H;
                            ra1Var.presentFragment(twoStepVerificationActivity, true);
                            i90 i90Var = ra1Var.k0;
                            if (i90Var != null) {
                                org.telegram.messenger.g0.h3(i90Var);
                                ra1Var.k0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        ra1Var.H0();
                        break;
                    default:
                        int i18 = ra1Var.P;
                        ra1Var.N = true;
                        if (ra1Var.n.getTransformationMethod() == null) {
                            ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = ra1Var.g0[3];
                                if (animatedDrawable != ch0Var) {
                                    ra1Var.a.setAnimation(ch0Var);
                                    ra1Var.g0[3].N(18, false, false);
                                }
                                ra1Var.a.d();
                            }
                        } else {
                            ra1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    ra1Var.a.setAnimation(ch0Var2);
                                }
                                ra1Var.g0[3].T(false, 0.0f);
                                ra1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ra1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ra1Var.N = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.a = fh0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fh0Var.setScaleType(scaleType);
        if (i14 == 2 && org.telegram.messenger.g0.O1()) {
            this.a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.fh0 fh0Var2 = this.a;
            Point point = org.telegram.messenger.g0.q;
            fh0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        this.c.setGravity(1);
        this.c.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        yh.l lVar = new yh.l(context);
        this.d = lVar;
        int i15 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(lVar, i15, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i15, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.e.setVisibility(8);
        final int i16 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
            public final /* synthetic */ ra1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i16;
                int i162 = 1;
                ra1 ra1Var = this.b;
                switch (i152) {
                    case 0:
                        ra1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                        String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                        ra1Var.showDialog(s1Var);
                        break;
                    case 2:
                        ra1.a0(ra1Var);
                        break;
                    case 3:
                        if (ra1Var.h.getAlpha() >= 0.5f) {
                            int i17 = ra1Var.P;
                            if (i17 != 0) {
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        ra1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.bd.M0(2131742825, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.U = M02;
                                    s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    ra1Var.showDialog(s1Var2);
                                    TextView textView22 = (TextView) s1Var2.d(-1);
                                    if (textView22 != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                ra1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ra1Var.b0;
                                ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i162));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (ra1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = ra1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = ra1Var.H;
                            ra1Var.presentFragment(twoStepVerificationActivity, true);
                            i90 i90Var = ra1Var.k0;
                            if (i90Var != null) {
                                org.telegram.messenger.g0.h3(i90Var);
                                ra1Var.k0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        ra1Var.H0();
                        break;
                    default:
                        int i18 = ra1Var.P;
                        ra1Var.N = true;
                        if (ra1Var.n.getTransformationMethod() == null) {
                            ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = ra1Var.g0[3];
                                if (animatedDrawable != ch0Var) {
                                    ra1Var.a.setAnimation(ch0Var);
                                    ra1Var.g0[3].N(18, false, false);
                                }
                                ra1Var.a.d();
                            }
                        } else {
                            ra1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    ra1Var.a.setAnimation(ch0Var2);
                                }
                                ra1Var.g0[3].T(false, 0.0f);
                                ra1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ra1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ra1Var.N = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(org.telegram.messenger.g0.L(220.0f));
        this.b.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.b.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(this.b, org.telegram.ui.ActionBar.k6.Gi, null);
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(org.telegram.messenger.g0.o());
        this.b.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 24.0f));
        final int i17 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
            public final /* synthetic */ ra1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i17;
                int i162 = 1;
                ra1 ra1Var = this.b;
                switch (i152) {
                    case 0:
                        ra1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                        String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                        ra1Var.showDialog(s1Var);
                        break;
                    case 2:
                        ra1.a0(ra1Var);
                        break;
                    case 3:
                        if (ra1Var.h.getAlpha() >= 0.5f) {
                            int i172 = ra1Var.P;
                            if (i172 != 0) {
                                if (i172 != 3) {
                                    if (i172 == 2) {
                                        ra1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.bd.M0(2131742825, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.U = M02;
                                    s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    ra1Var.showDialog(s1Var2);
                                    TextView textView22 = (TextView) s1Var2.d(-1);
                                    if (textView22 != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                ra1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ra1Var.b0;
                                ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i162));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (ra1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = ra1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = ra1Var.H;
                            ra1Var.presentFragment(twoStepVerificationActivity, true);
                            i90 i90Var = ra1Var.k0;
                            if (i90Var != null) {
                                org.telegram.messenger.g0.h3(i90Var);
                                ra1Var.k0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        ra1Var.H0();
                        break;
                    default:
                        int i18 = ra1Var.P;
                        ra1Var.N = true;
                        if (ra1Var.n.getTransformationMethod() == null) {
                            ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = ra1Var.g0[3];
                                if (animatedDrawable != ch0Var) {
                                    ra1Var.a.setAnimation(ch0Var);
                                    ra1Var.g0[3].N(18, false, false);
                                }
                                ra1Var.a.d();
                            }
                        } else {
                            ra1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                ra1Var.g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    ra1Var.a.setAnimation(ch0Var2);
                                }
                                ra1Var.g0[3].T(false, 0.0f);
                                ra1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ra1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ra1Var.N = false;
                        break;
                }
            }
        });
        if (i14 == 6 || i14 == 7 || i14 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(org.telegram.messenger.g0.o());
            this.c.setTextSize(1, 18.0f);
        }
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                l0 l0Var = new l0(28, context, this);
                ei0 ei0Var = new ei0(this, context, l0Var, i12);
                ei0Var.addView(l0Var);
                p9 p9Var = new p9(this, context, ei0Var);
                qa1 qa1Var = new qa1(this, context);
                this.y = qa1Var;
                qa1Var.setVerticalScrollBarEnabled(false);
                l0Var.addView(this.y, b8.mf.c(-1.0f, -1));
                l0Var.addView(this.h, b8.mf.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                l0Var.addView(this.d0, org.telegram.ui.Components.l00.b());
                p9Var.addView(ei0Var, b8.mf.c(-1.0f, -1));
                s51 s51Var = new s51(22, context, this);
                s51Var.setOrientation(1);
                this.y.addView(s51Var, b8.mf.x(-1, -1, 51));
                s51Var.addView(this.a, b8.mf.t(-2, -2, 49, 0, 69, 0, 0));
                s51Var.addView(this.c, b8.mf.t(-2, -2, 49, 0, 8, 0, 0));
                s51Var.addView(this.d, b8.mf.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
                this.s = gb0Var;
                gb0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.g0.L(16.0f);
                this.n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i18 = org.telegram.ui.ActionBar.k6.l6;
                org.telegram.ui.ActionBar.r6.w(editTextBoldCursor2, i18, null);
                org.telegram.ui.ActionBar.r6.V(this.n, i11, null);
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ea1
                    public final /* synthetic */ ra1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (i12) {
                            case 0:
                                ra1 ra1Var = this.b;
                                ra1Var.getClass();
                                if (i19 == 5 || i19 == 6) {
                                    ra1Var.H0();
                                    break;
                                }
                                break;
                            default:
                                ra1 ra1Var2 = this.b;
                                ra1Var2.getClass();
                                if (i19 == 5 || i19 == 6) {
                                    if (ra1Var2.w.getVisibility() == 0) {
                                        ra1Var2.r.requestFocus();
                                    } else {
                                        ra1Var2.H0();
                                    }
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                });
                this.s.e(this.n);
                final int i19 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.fa1
                    public final /* synthetic */ ra1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.Components.gb0 gb0Var2 = this.b.w;
                                float f10 = z10 ? 1.0f : 0.0f;
                                gb0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                ra1 ra1Var = this.b;
                                if (!z10) {
                                    ra1Var.getClass();
                                    break;
                                } else {
                                    ra1Var.f0.setEditText((EditText) view);
                                    ra1Var.f0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.gb0 gb0Var3 = this.b.s;
                                float f11 = z10 ? 1.0f : 0.0f;
                                gb0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, b8.mf.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.e0 e0Var = new org.telegram.ui.ActionBar.e0(4, context, this);
                this.F = e0Var;
                e0Var.setImageResource(R.drawable.msg_message);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(org.telegram.messenger.bd.M0(2131743942, null));
                org.telegram.ui.ActionBar.e0 e0Var2 = this.F;
                int i20 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(e0Var2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i20, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i20), null);
                org.telegram.ui.ActionBar.r6.t(this.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.g0.Z3(this.F, false, 0.1f, true, false);
                final int i21 = 6;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
                    public final /* synthetic */ ra1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152 = i21;
                        int i162 = 1;
                        ra1 ra1Var = this.b;
                        switch (i152) {
                            case 0:
                                ra1Var.H0();
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                                String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                                ra1Var.showDialog(s1Var);
                                break;
                            case 2:
                                ra1.a0(ra1Var);
                                break;
                            case 3:
                                if (ra1Var.h.getAlpha() >= 0.5f) {
                                    int i172 = ra1Var.P;
                                    if (i172 != 0) {
                                        if (i172 != 3) {
                                            if (i172 == 2) {
                                                ra1Var.F0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                            String M02 = org.telegram.messenger.bd.M0(2131742825, null);
                                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                            s1Var2.U = M02;
                                            s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                            ra1Var.showDialog(s1Var2);
                                            TextView textView22 = (TextView) s1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ra1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = ra1Var.b0;
                                        ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i162));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (ra1Var.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = ra1Var.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = ra1Var.H;
                                    ra1Var.presentFragment(twoStepVerificationActivity, true);
                                    i90 i90Var = ra1Var.k0;
                                    if (i90Var != null) {
                                        org.telegram.messenger.g0.h3(i90Var);
                                        ra1Var.k0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                ra1Var.H0();
                                break;
                            default:
                                int i182 = ra1Var.P;
                                ra1Var.N = true;
                                if (ra1Var.n.getTransformationMethod() == null) {
                                    ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                        ra1Var.g0[3].P(-1);
                                        org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var = ra1Var.g0[3];
                                        if (animatedDrawable != ch0Var) {
                                            ra1Var.a.setAnimation(ch0Var);
                                            ra1Var.g0[3].N(18, false, false);
                                        }
                                        ra1Var.a.d();
                                    }
                                } else {
                                    ra1Var.n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                        ra1Var.g0[3].P(18);
                                        org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                        if (animatedDrawable2 != ch0Var2) {
                                            ra1Var.a.setAnimation(ch0Var2);
                                        }
                                        ra1Var.g0[3].T(false, 0.0f);
                                        ra1Var.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = ra1Var.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                ra1Var.N = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.F, b8.mf.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new oa1(this, 2));
                this.s.addView(linearLayout, b8.mf.c(-2.0f, -1));
                s51Var.addView(this.s, b8.mf.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new org.telegram.ui.Components.gb0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.r6.w(this.r, i18, null);
                org.telegram.ui.ActionBar.r6.V(this.r, i11, null);
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                final int i22 = 0;
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ea1
                    public final /* synthetic */ ra1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i192, KeyEvent keyEvent) {
                        switch (i22) {
                            case 0:
                                ra1 ra1Var = this.b;
                                ra1Var.getClass();
                                if (i192 == 5 || i192 == 6) {
                                    ra1Var.H0();
                                    break;
                                }
                                break;
                            default:
                                ra1 ra1Var2 = this.b;
                                ra1Var2.getClass();
                                if (i192 == 5 || i192 == 6) {
                                    if (ra1Var2.w.getVisibility() == 0) {
                                        ra1Var2.r.requestFocus();
                                    } else {
                                        ra1Var2.H0();
                                    }
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.fa1
                    public final /* synthetic */ ra1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.Components.gb0 gb0Var2 = this.b.w;
                                float f10 = z10 ? 1.0f : 0.0f;
                                gb0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                ra1 ra1Var = this.b;
                                if (!z10) {
                                    ra1Var.getClass();
                                    break;
                                } else {
                                    ra1Var.f0.setEditText((EditText) view);
                                    ra1Var.f0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.gb0 gb0Var3 = this.b.s;
                                float f11 = z10 ? 1.0f : 0.0f;
                                gb0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                this.w.addView(this.r, b8.mf.c(-2.0f, -1));
                s51Var.addView(this.w, b8.mf.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
                this.f0 = brVar;
                brVar.setVisibility(8);
                ei0Var.addView(this.f0);
                ib0 ib0Var = new ib0(3, context, this);
                this.x = ib0Var;
                final int i23 = 1;
                ib0Var.b(6, 1);
                zq[] zqVarArr = this.x.f;
                int length = zqVarArr.length;
                int i24 = 0;
                while (i24 < length) {
                    zq zqVar = zqVarArr[i24];
                    zqVar.setShowSoftInputOnFocusCompat((A0() ? 1 : 0) ^ i23);
                    zqVar.addTextChangedListener(new oa1(this, 0));
                    zqVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.fa1
                        public final /* synthetic */ ra1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i23) {
                                case 0:
                                    org.telegram.ui.Components.gb0 gb0Var2 = this.b.w;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    gb0Var2.b(f10, f10, true);
                                    break;
                                case 1:
                                    ra1 ra1Var = this.b;
                                    if (!z10) {
                                        ra1Var.getClass();
                                        break;
                                    } else {
                                        ra1Var.f0.setEditText((EditText) view);
                                        ra1Var.f0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.gb0 gb0Var3 = this.b.s;
                                    float f11 = z10 ? 1.0f : 0.0f;
                                    gb0Var3.b(f11, f11, true);
                                    break;
                            }
                        }
                    });
                    i24++;
                    i23 = 1;
                }
                this.x.setVisibility(8);
                s51Var.addView(this.x, b8.mf.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                s51Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, b8.mf.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.J6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    this.f.setText(org.telegram.messenger.bd.M0(2131746086, null));
                    s51Var.addView(this.f, b8.mf.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i25 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
                        public final /* synthetic */ ra1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i25;
                            int i162 = 1;
                            ra1 ra1Var = this.b;
                            switch (i152) {
                                case 0:
                                    ra1Var.H0();
                                    break;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                                    String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M0;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                                    ra1Var.showDialog(s1Var);
                                    break;
                                case 2:
                                    ra1.a0(ra1Var);
                                    break;
                                case 3:
                                    if (ra1Var.h.getAlpha() >= 0.5f) {
                                        int i172 = ra1Var.P;
                                        if (i172 != 0) {
                                            if (i172 != 3) {
                                                if (i172 == 2) {
                                                    ra1Var.F0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                                String M02 = org.telegram.messenger.bd.M0(2131742825, null);
                                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                                s1Var2.U = M02;
                                                s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                                ra1Var.showDialog(s1Var2);
                                                TextView textView22 = (TextView) s1Var2.d(-1);
                                                if (textView22 != null) {
                                                    org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ra1Var.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = ra1Var.b0;
                                            ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i162));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (ra1Var.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = ra1Var.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = ra1Var.H;
                                        ra1Var.presentFragment(twoStepVerificationActivity, true);
                                        i90 i90Var = ra1Var.k0;
                                        if (i90Var != null) {
                                            org.telegram.messenger.g0.h3(i90Var);
                                            ra1Var.k0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    ra1Var.H0();
                                    break;
                                default:
                                    int i182 = ra1Var.P;
                                    ra1Var.N = true;
                                    if (ra1Var.n.getTransformationMethod() == null) {
                                        ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                            ra1Var.g0[3].P(-1);
                                            org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ch0 ch0Var = ra1Var.g0[3];
                                            if (animatedDrawable != ch0Var) {
                                                ra1Var.a.setAnimation(ch0Var);
                                                ra1Var.g0[3].N(18, false, false);
                                            }
                                            ra1Var.a.d();
                                        }
                                    } else {
                                        ra1Var.n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                            ra1Var.g0[3].P(18);
                                            org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                            if (animatedDrawable2 != ch0Var2) {
                                                ra1Var.a.setAnimation(ch0Var2);
                                            }
                                            ra1Var.g0[3].T(false, 0.0f);
                                            ra1Var.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = ra1Var.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    ra1Var.N = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = p9Var;
                gi.n5 n5Var = new gi.n5(this, context);
                this.E = n5Var;
                n5Var.setAlpha(0.0f);
                p9Var.addView(this.E);
                p9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false));
                l0Var.addView(this.M, b8.mf.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(3, context, this);
                eVar.setOnTouchListener(new fi.a(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.a);
                eVar.addView(this.c);
                eVar.addView(this.d);
                eVar.addView(this.b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.fragmentView, null);
        switch (i14) {
            case 0:
            case 1:
                if (this.V.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747219, null));
                    this.c.setText(org.telegram.messenger.bd.M0(2131747219, null));
                } else {
                    String M0 = org.telegram.messenger.bd.M0(i14 == 0 ? 2131751706 : 2131746421, null);
                    this.actionBar.setTitle(M0);
                    this.c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.bd.M0(2131742827, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(org.telegram.messenger.bd.M0(i14 == 0 ? 2131751117 : 2131746421, null));
                this.n.setContentDescription(org.telegram.messenger.bd.M0(i14 == 0 ? 2131751117 : 2131746421, null));
                this.n.setImeOptions(268435461);
                this.n.setInputType(org.telegram.messenger.hs.N1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.G = i14 == 0;
                org.telegram.messenger.g0.Z3(this.F, false, 0.1f, true, false);
                org.telegram.ui.Components.ch0[] ch0VarArr = new org.telegram.ui.Components.ch0[7];
                this.g0 = ch0VarArr;
                ch0VarArr[0] = new org.telegram.ui.Components.ch0(R.raw.tsv_setup_monkey_idle1, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.g0[1] = new org.telegram.ui.Components.ch0(R.raw.tsv_setup_monkey_idle2, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.g0[2] = new org.telegram.ui.Components.ch0(R.raw.tsv_monkey_close, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.g0[3] = new org.telegram.ui.Components.ch0(R.raw.tsv_setup_monkey_peek, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.g0[4] = new org.telegram.ui.Components.ch0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.g0[5] = new org.telegram.ui.Components.ch0(R.raw.tsv_setup_monkey_close_and_peek, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.g0[6] = new org.telegram.ui.Components.ch0(R.raw.tsv_setup_monkey_tracking, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                org.telegram.ui.Components.ch0 ch0Var = this.g0[6];
                ch0Var.h = true;
                ch0Var.P(19);
                this.g0[2].S(97, this.j0);
                K0(true);
                if (!(i14 == 1)) {
                    EditTextBoldCursor editTextBoldCursor4 = this.n;
                    ArrayList arrayList = editTextBoldCursor4.g1;
                    int size = arrayList.size();
                    int i26 = 0;
                    while (i26 < size) {
                        Object obj = arrayList.get(i26);
                        i26++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.onTextChanged(editTextBoldCursor4.getText(), 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.afterTextChanged(editTextBoldCursor4.getText());
                    }
                    i3 = 1;
                    K0(true);
                    break;
                } else {
                    ga1 ga1Var = this.h0;
                    if (ga1Var != null) {
                        org.telegram.messenger.g0.r(ga1Var);
                    }
                    this.a.setAnimation(this.g0[6]);
                    this.a.d();
                    i3 = 1;
                    break;
                }
            case 2:
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747452, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.bd.M0(2131742827, null));
                this.c.setText(org.telegram.messenger.bd.M0(2131747452, null));
                this.d.setText(org.telegram.messenger.bd.M0(2131747451, null));
                this.d.setVisibility(0);
                this.s.setText(org.telegram.messenger.bd.M0(2131747450, null));
                this.n.setContentDescription(org.telegram.messenger.bd.M0(2131747450, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.a.d();
                i3 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131746352, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (this.a0) {
                    r12 = 0;
                } else {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.bd.M0(2131742827, null));
                }
                this.c.setText(org.telegram.messenger.bd.M0(2131746352, r12));
                this.d.setText(org.telegram.messenger.bd.M0(2131746353, r12));
                this.d.setVisibility(0);
                this.s.setText(org.telegram.messenger.bd.M0(2131747384, r12));
                this.n.setContentDescription(org.telegram.messenger.bd.M0(2131747384, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, 120, 120, r12);
                this.a.d();
                i3 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747445, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(org.telegram.messenger.bd.M0(2131747445, null));
                this.f0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.V.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf == lastIndexOf || indexOf == -1 || lastIndexOf == -1) {
                    r9 = 0;
                } else {
                    org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                    ty0Var.a |= 256;
                    ty0Var.b = indexOf;
                    int i27 = lastIndexOf + 1;
                    ty0Var.c = i27;
                    r9 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i27, 0);
                }
                yh.l lVar2 = this.d;
                String M02 = org.telegram.messenger.bd.M0(2131746090, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r9] = valueOf;
                lVar2.setText(org.telegram.messenger.g0.m0(M02, charSequenceArr));
                this.d.setVisibility(r9);
                this.d0.e(r9, r9);
                this.x.setVisibility(r9);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i3 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131743629, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(org.telegram.messenger.bd.M0(2131743629, null));
                this.s.setVisibility(8);
                this.f0.setVisibility(0);
                yh.l lVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                lVar3.setText(org.telegram.messenger.bd.a0("EmailPasswordConfirmText2", null, 2131751200, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.bd.M0(2131746131, null));
                final int i28 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.da1
                    public final /* synthetic */ ra1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152 = i28;
                        int i162 = 1;
                        ra1 ra1Var = this.b;
                        switch (i152) {
                            case 0:
                                ra1Var.H0();
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ha1(ra1Var, 1));
                                String M03 = org.telegram.messenger.bd.M0(2131746103, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M03;
                                s1Var.U = org.telegram.messenger.bd.M0(2131746084, null);
                                ra1Var.showDialog(s1Var);
                                break;
                            case 2:
                                ra1.a0(ra1Var);
                                break;
                            case 3:
                                if (ra1Var.h.getAlpha() >= 0.5f) {
                                    int i172 = ra1Var.P;
                                    if (i172 != 0) {
                                        if (i172 != 3) {
                                            if (i172 == 2) {
                                                ra1Var.F0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ra1Var.getParentActivity());
                                            String M022 = org.telegram.messenger.bd.M0(2131742825, null);
                                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                            s1Var2.U = M022;
                                            s1Var2.S = org.telegram.messenger.bd.M0(2131742826, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131742827, null), new ha1(ra1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                            ra1Var.showDialog(s1Var2);
                                            TextView textView22 = (TextView) s1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ra1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = ra1Var.b0;
                                        ra1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new ia1(ra1Var, i162));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (ra1Var.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = ra1Var.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = ra1Var.H;
                                    ra1Var.presentFragment(twoStepVerificationActivity, true);
                                    i90 i90Var = ra1Var.k0;
                                    if (i90Var != null) {
                                        org.telegram.messenger.g0.h3(i90Var);
                                        ra1Var.k0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                ra1Var.H0();
                                break;
                            default:
                                int i182 = ra1Var.P;
                                ra1Var.N = true;
                                if (ra1Var.n.getTransformationMethod() == null) {
                                    ra1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                        ra1Var.g0[3].P(-1);
                                        org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var2 = ra1Var.g0[3];
                                        if (animatedDrawable != ch0Var2) {
                                            ra1Var.a.setAnimation(ch0Var2);
                                            ra1Var.g0[3].N(18, false, false);
                                        }
                                        ra1Var.a.d();
                                    }
                                } else {
                                    ra1Var.n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(ra1Var.F, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && ra1Var.n.length() > 0 && ra1Var.n.hasFocus()) {
                                        ra1Var.g0[3].P(18);
                                        org.telegram.ui.Components.ch0 animatedDrawable2 = ra1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var22 = ra1Var.g0[3];
                                        if (animatedDrawable2 != ch0Var22) {
                                            ra1Var.a.setAnimation(ch0Var22);
                                        }
                                        ra1Var.g0[3].T(false, 0.0f);
                                        ra1Var.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = ra1Var.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                ra1Var.N = false;
                                break;
                        }
                    }
                });
                this.x.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i3 = 1;
                break;
            case 6:
                this.c.setText(org.telegram.messenger.bd.M0(2131743941, null));
                this.d.setText(org.telegram.messenger.bd.M0(2131745558, null));
                this.b.setText(org.telegram.messenger.bd.M0(2131743943, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, org.telegram.messenger.hs.W1, org.telegram.messenger.hs.W1, null);
                this.a.d();
                i3 = 1;
                break;
            case 7:
                this.c.setText(org.telegram.messenger.bd.M0(2131743945, null));
                this.d.setText(org.telegram.messenger.bd.M0(2131743944, null));
                if (this.Z) {
                    this.b.setText(org.telegram.messenger.bd.M0(2131743947, null));
                } else if (this.I) {
                    this.b.setText(org.telegram.messenger.bd.M0(2131751771, null));
                } else {
                    this.b.setText(org.telegram.messenger.bd.M0(2131743946, null));
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, null);
                this.a.d();
                i3 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747225, null));
                this.c.setText(org.telegram.messenger.bd.M0(2131747225, null));
                this.d.setText(org.telegram.messenger.bd.M0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(org.telegram.messenger.bd.M0(2131750592, null));
                org.telegram.ui.ActionBar.r6.V(this.e, org.telegram.ui.ActionBar.k6.o6, null);
                this.s.setText(org.telegram.messenger.bd.M0(2131748734, null));
                this.n.setContentDescription(org.telegram.messenger.bd.M0(2131748734, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(org.telegram.messenger.hs.N1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                i3 = 1;
                break;
            case 9:
                this.c.setText(org.telegram.messenger.bd.M0(2131752159, null));
                this.d.setText(org.telegram.messenger.bd.M0(2131752158, null));
                this.b.setText(org.telegram.messenger.bd.M0(2131752161, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, org.telegram.messenger.hs.W1, org.telegram.messenger.hs.W1, null);
                this.a.d();
                i3 = 1;
                break;
            default:
                i3 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new oa1(this, i3));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.d2 d2Var : getParentLayout().getFragmentStack()) {
            if (d2Var != this && (d2Var instanceof ra1)) {
                ((org.telegram.ui.Components.y41) ((ra1) d2Var).c0.a).b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean hideKeyboardOnShow() {
        int i3 = this.P;
        return i3 == 7 || i3 == 9;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.H < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (this.H < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z10) {
                finishFragment();
            }
            return true;
        }
        if (!z10) {
            return false;
        }
        N0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i3 = this.P;
            if (i3 == 2 && org.telegram.messenger.g0.O1()) {
                this.a.setVisibility(8);
            } else if (i3 != 6 && i3 != 9 && i3 != 7) {
                org.telegram.ui.Components.fh0 fh0Var = this.a;
                Point point = org.telegram.messenger.g0.q;
                fh0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.br brVar = this.f0;
        if (brVar != null) {
            brVar.setVisibility(A0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        ga1 ga1Var = this.h0;
        if (ga1Var != null) {
            org.telegram.messenger.g0.r(ga1Var);
            this.h0 = null;
        }
        if (this.g0 != null) {
            int i3 = 0;
            while (true) {
                org.telegram.ui.Components.ch0[] ch0VarArr = this.g0;
                if (i3 >= ch0VarArr.length) {
                    break;
                }
                ch0VarArr[i3].C(false);
                i3++;
            }
            this.g0 = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        this.T = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        this.T = false;
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.v1(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.n11 n11Var = this.e0;
            if (n11Var != null) {
                n11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.n != null && !A0()) {
                org.telegram.messenger.g0.i3(new ga1(this, 2), 200L);
            }
            ib0 ib0Var = this.x;
            if (ib0Var == null || ib0Var.getVisibility() != 0) {
                return;
            }
            org.telegram.messenger.g0.i3(new ga1(this, 3), 200L);
        }
    }

    public final void z0(Runnable runnable) {
        int i3 = 0;
        while (true) {
            ib0 ib0Var = this.x;
            zq[] zqVarArr = ib0Var.f;
            if (i3 >= zqVarArr.length) {
                ib0Var.postDelayed(new ma1(1, this, runnable), (zqVarArr.length * 75) + 350);
                return;
            } else {
                zq zqVar = zqVarArr[i3];
                zqVar.postDelayed(new di0(zqVar, 1), i3 * 75);
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle k10 = a1.g.k("afterSignup", true);
            ee0 ee0Var = new ee0();
            ee0Var.r0(k10);
            presentFragment(ee0Var, true);
            return;
        }
        super.finishFragment();
    }

    public ra1(int i3, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new ga1(this, 0);
        this.j0 = new ga1(this, 1);
        this.P = i3;
        this.V = password;
        if (password == null && (i3 == 6 || i3 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ia1(this, 0), 10);
        } else {
            this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void G0() {
    }
}
