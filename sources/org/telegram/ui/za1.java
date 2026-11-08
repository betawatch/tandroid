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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class za1 extends org.telegram.ui.ActionBar.f2 {
    public fi.p5 D;
    public org.telegram.ui.ActionBar.f0 E;
    public boolean F;
    public int G;
    public boolean H;
    public AnimatorSet I;
    public final ArrayList J;
    public AnimatorSet K;
    public RadialProgressView L;
    public boolean M;
    public boolean N;
    public final int O;
    public String P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public TL_account.Password U;
    public byte[] V;
    public long W;
    public byte[] X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.Components.ch0 a;
    public String a0;
    public TextView b;
    public h6.m b0;
    public TextView c;
    public org.telegram.ui.Components.q00 c0;
    public xh.l d;
    public org.telegram.ui.Components.t11 d0;
    public TextView e;
    public org.telegram.ui.Components.br e0;
    public TextView f;
    public org.telegram.ui.Components.zg0[] f0;
    public qa1 g0;
    public TextView h;
    public final Runnable h0;
    public final Runnable i0;
    public l90 j0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.lb0 s;
    public org.telegram.ui.Components.lb0 w;
    public lb0 x;
    public ya1 y;

    public za1(int i7, int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new qa1(this, 0);
        this.i0 = new qa1(this, 1);
        this.currentAccount = i7;
        this.O = i10;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new sa1(this, 0), 10);
            }
        }
    }

    public static void Z(za1 za1Var, TLObject tLObject, boolean z9, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = za1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.pv.d(za1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z9 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] h12 = org.telegram.messenger.g0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = za1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.pv.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        }
        kg.l0 l0Var = new kg.l0(za1Var, z9, bArr, str, passwordinputsettings);
        if (z9) {
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
            return;
        }
        if (str != null && (bArr3 = za1Var.X) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = za1Var.U.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(m10, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(m10, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(za1Var.X, 0, bArr6, 0, 32);
                Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = za1Var.W;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = za1Var.U.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            l0Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] b10 = org.telegram.messenger.pv.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = b10;
            if (b10 == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                l0Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
    }

    public static void a0(za1 za1Var) {
        ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new di.u5(9));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131746123, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131743934, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        za1Var.showDialog(u1Var);
    }

    public static void b0(za1 za1Var, byte[] bArr) {
        ArrayList arrayList = za1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = za1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = za1Var.U;
        if (bArr == null) {
            bArr = za1Var.V;
        }
        twoStepVerificationActivity.A0(password2, bArr, za1Var.W, za1Var.X);
        twoStepVerificationActivity.X = za1Var.G;
        za1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.q0, za1Var.U);
        l90 l90Var = za1Var.j0;
        if (l90Var != null) {
            org.telegram.messenger.g0.h3(l90Var);
            za1Var.j0 = null;
        }
    }

    public static void c0(za1 za1Var) {
        ArrayList arrayList = za1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(za1Var.currentAccount);
        byte[] bArr = za1Var.V;
        TL_account.Password password = za1Var.U;
        f10.k(org.telegram.messenger.qs.p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, za1Var.R, za1Var.Q, null, za1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = za1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, za1Var.V, za1Var.W, za1Var.X);
        twoStepVerificationActivity.X = za1Var.G;
        za1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.q0, za1Var.U);
        l90 l90Var = za1Var.j0;
        if (l90Var != null) {
            org.telegram.messenger.g0.h3(l90Var);
            za1Var.j0 = null;
        }
    }

    public static /* synthetic */ void d0(za1 za1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = za1Var.U.current_algo;
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        n41 n41Var = new n41(5, za1Var, c10);
        TL_account.Password password = za1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            n41Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(getpasswordsettings, n41Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        n41Var.run(null, tL_error2);
    }

    public static void e0(za1 za1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(new TL_account.getPassword(), new sa1(za1Var, 4), 8);
            return;
        }
        za1Var.B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            za1Var.d.setText(org.telegram.messenger.id.M0(2131752157, null));
            org.telegram.ui.ActionBar.r6.V(za1Var.d, org.telegram.ui.ActionBar.k6.p7, null);
            za1Var.E0(za1Var.s, za1Var.n, true);
            za1Var.M0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            za1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            za1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static /* synthetic */ void f0(za1 za1Var) {
        ArrayList arrayList = za1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.p0, new Object[0]);
        za1Var.finishFragment();
    }

    public static void g0(za1 za1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            za1Var.U = password;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.v4.u0(za1Var.getParentActivity(), org.telegram.messenger.id.M0(2131743823, null), true);
                return;
            }
            za1Var.T = !TextUtils.isEmpty(za1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.r0(za1Var.U);
            if (!za1Var.S && za1Var.Y) {
                TL_account.Password password2 = za1Var.U;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!za1Var.T && passwordKdfAlgo != null) {
                        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        za1Var.finishFragment();
                    }
                }
            }
            if (za1Var.N) {
                za1Var.B0();
                za1Var.H0();
            }
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.q0, za1Var.U);
        }
    }

    public static /* synthetic */ void h0(za1 za1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            za1Var.U = password;
            TwoStepVerificationActivity.r0(password);
            za1Var.J0(z9);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.q0, za1Var.U);
        }
    }

    public static void i0(za1 za1Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = za1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(new TL_account.getPassword(), new fi.d3(11, za1Var, z9), 8);
            return;
        }
        za1Var.B0();
        int i7 = org.telegram.messenger.qs.p0;
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        za1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), org.telegram.messenger.id.M0(2131747446, null));
                        return;
                    }
                    if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                        za1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), org.telegram.messenger.id.M0(2131751201, null));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        za1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        za1Var.L0(org.telegram.messenger.id.M0(R.string.AppName, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                        return;
                    }
                }
                org.telegram.messenger.qs.f(za1Var.currentAccount).k(i7, new Object[0]);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.f2) arrayList.get(i10)).removeSelfFromStack();
                }
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(za1Var.currentAccount);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = za1Var.U;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = za1Var.R;
                f10.k(i7, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, za1Var.Q, str2, za1Var.P);
                TL_account.Password password3 = za1Var.U;
                password3.email_unconfirmed_pattern = za1Var.R;
                za1 za1Var2 = new za1(5, password3);
                za1Var2.H = za1Var.H;
                za1Var2.I0(bArr != null ? bArr : za1Var.V, za1Var.W, za1Var.X, za1Var.Z);
                za1Var2.Y = za1Var.Y;
                za1Var2.G = za1Var.G;
                za1Var.presentFragment(za1Var2, true);
                return;
            }
            return;
        }
        za1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
        int i11 = org.telegram.messenger.qs.q0;
        if (z9) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((org.telegram.ui.ActionBar.f2) arrayList.get(i12)).removeSelfFromStack();
            }
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.r0, new Object[0]);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(i11, new Object[0]);
            za1Var.finishFragment();
            return;
        }
        if (za1Var.getParentActivity() == null) {
            return;
        }
        if (za1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new lk0(22, za1Var, bArr));
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            if (str == null && (password = za1Var.U) != null && password.has_password) {
                u1Var.T = org.telegram.messenger.id.M0(2131742816, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131742807, null);
            }
            u1Var.R = org.telegram.messenger.id.M0(2131742801, null);
            Dialog showDialog = za1Var.showDialog(u1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i13)).removeSelfFromStack();
        }
        TL_account.Password password4 = za1Var.U;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (za1Var.Y) {
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(i7, new Object[0]);
        }
        za1 za1Var3 = new za1(7, za1Var.U);
        za1Var3.H = za1Var.H;
        za1Var3.I0(bArr != null ? bArr : za1Var.V, za1Var.W, za1Var.X, za1Var.Z);
        za1Var3.Y = za1Var.Y;
        za1Var3.G = za1Var.G;
        za1Var.presentFragment(za1Var3, true);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(i11, za1Var.U);
    }

    public static void j0(za1 za1Var, TLRPC.TL_error tL_error) {
        za1Var.B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = za1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, za1Var.V, za1Var.W, za1Var.X);
            twoStepVerificationActivity.X = za1Var.G;
            za1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.r0, new Object[0]);
            l90 l90Var = za1Var.j0;
            if (l90Var != null) {
                org.telegram.messenger.g0.h3(l90Var);
                za1Var.j0 = null;
            }
        }
    }

    public static void k0(za1 za1Var) {
        ArrayList arrayList = za1Var.J;
        int i7 = 4;
        if (za1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new ra1(za1Var, i7));
            boolean z9 = za1Var.U.has_recovery;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            if (z9) {
                u1Var.T = org.telegram.messenger.id.M0(2131742817, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131742816, null);
            }
            u1Var.R = org.telegram.messenger.id.M0(2131742801, null);
            Dialog showDialog = za1Var.showDialog(u1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = za1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        za1 za1Var2 = new za1(7, password);
        za1Var2.H = za1Var.H;
        za1Var2.I0(za1Var.V, za1Var.W, za1Var.X, za1Var.Z);
        za1Var2.J.addAll(arrayList);
        za1Var2.Y = za1Var.Y;
        za1Var2.G = za1Var.G;
        za1Var.presentFragment(za1Var2, true);
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(za1Var.currentAccount);
        byte[] bArr = za1Var.V;
        TL_account.Password password2 = za1Var.U;
        f10.k(org.telegram.messenger.qs.p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, za1Var.R, za1Var.Q, null, za1Var.P);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.q0, za1Var.U);
    }

    public static void l0(za1 za1Var, String str) {
        za1 za1Var2 = new za1(za1Var.currentAccount, 0, za1Var.U);
        za1Var2.H = za1Var.H;
        za1Var2.J.addAll(za1Var.J);
        za1Var2.J.add(za1Var);
        za1Var2.a0 = str;
        za1Var2.G = za1Var.G;
        za1Var.presentFragment(za1Var2, true);
    }

    public static /* synthetic */ void m0(za1 za1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            za1Var.U = password;
            TwoStepVerificationActivity.r0(password);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.q0, za1Var.U);
            za1Var.H0();
        }
    }

    public final boolean A0() {
        int i7 = this.O;
        if ((i7 != 5 && i7 != 4) || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x < point.y && !org.telegram.messenger.g0.C1();
    }

    public final void B0() {
        this.c0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.c0.f(true, true);
    }

    public final void D0() {
        for (br brVar : this.x.f) {
            brVar.setText("");
            brVar.z(1.0f);
        }
        this.x.f[0].requestFocus();
        org.telegram.messenger.g0.G3(8.0f, this.x, new qa1(this, 6));
    }

    public final void E0(org.telegram.ui.Components.lb0 lb0Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            editTextBoldCursor.setText("");
        }
        org.telegram.messenger.g0.G3(5.0f, lb0Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.U;
        if (password.has_recovery) {
            this.R = "";
            J0(false);
            return;
        }
        za1 za1Var = new za1(this.currentAccount, 3, password);
        za1Var.H = this.H;
        za1Var.I0(this.V, this.W, this.X, this.Z);
        za1Var.P = this.P;
        za1Var.Q = this.Q;
        za1Var.J.addAll(this.J);
        za1Var.J.add(this);
        za1Var.Y = this.Y;
        za1Var.G = this.G;
        presentFragment(za1Var);
    }

    public final void H0() {
        if (getParentActivity() == null) {
            return;
        }
        int i7 = 0;
        switch (this.O) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    E0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.P) || this.O != 1) {
                    za1 za1Var = new za1(this.currentAccount, this.O == 0 ? 1 : 2, this.U);
                    za1Var.H = this.H;
                    za1Var.P = this.n.getText().toString();
                    za1Var.I0(this.V, this.W, this.X, this.Z);
                    za1Var.a0 = this.a0;
                    za1Var.J.addAll(this.J);
                    za1Var.J.add(this);
                    za1Var.Y = this.Y;
                    za1Var.G = this.G;
                    presentFragment(za1Var);
                    break;
                } else {
                    org.telegram.messenger.g0.G3(5.0f, this.s, null);
                    try {
                        this.s.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131747447, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
            case 2:
                String obj = this.n.getText().toString();
                this.Q = obj;
                if (!obj.equalsIgnoreCase(this.P)) {
                    F0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131747449, null), 0).show();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    E0(this.s, this.n, false);
                    break;
                }
            case 3:
                if (!this.Z && this.h.getAlpha() < 1.0f) {
                    this.h.animate().cancel();
                    this.h.animate().alpha(1.0f).start();
                }
                String obj2 = this.n.getText().toString();
                this.R = obj2;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new n41(4, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.x.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new sa1(this, r1), 10);
                C0();
                break;
            case 6:
                TL_account.Password password = this.U;
                if (password != null) {
                    za1 za1Var2 = new za1(this.currentAccount, 0, password);
                    za1Var2.H = this.H;
                    za1Var2.Y = this.Y;
                    za1Var2.G = this.G;
                    presentFragment(za1Var2, true);
                    break;
                } else {
                    C0();
                    this.N = true;
                    break;
                }
            case 7:
                if (!this.Y) {
                    if (!this.H) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        l90 l90Var = this.j0;
                        if (l90Var != null) {
                            org.telegram.messenger.g0.h3(l90Var);
                            this.j0 = null;
                            break;
                        }
                    } else {
                        Bundle k10 = a8.p0.k("afterSignup", true);
                        je0 je0Var = new je0();
                        je0Var.r0(k10);
                        presentFragment(je0Var, true);
                        break;
                    }
                } else {
                    finishFragment();
                    break;
                }
                break;
            case 8:
                if (this.U != null) {
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() != 0) {
                        byte[] h12 = org.telegram.messenger.g0.h1(obj3);
                        C0();
                        Utilities.e.c(new ta1(this, h12, i7));
                        break;
                    } else {
                        E0(this.s, this.n, false);
                        break;
                    }
                } else {
                    C0();
                    this.N = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void I0(byte[] bArr, long j3, byte[] bArr2, boolean z9) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j3;
        this.Z = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(boolean z9) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z9 && this.T && this.U.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new sa1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z9) {
            org.telegram.messenger.p10.i(this.currentAccount).u();
            this.X = null;
            if (this.T) {
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
            if (this.Q == null && (password = this.U) != null) {
                this.Q = password.hint;
            }
            if (this.Q == null) {
                this.Q = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.Q;
                passwordinputsettings.new_algo = this.U.new_algo;
            }
            if (this.R.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.R.trim();
            }
        }
        if (this.a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.a0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.V;
            if (bArr == null || bArr.length == 0 || (z9 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.e.c(new fi.q1(this, updatepasswordsettings3, z9, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.k0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(boolean z9) {
        if (this.O != 0) {
            return;
        }
        qa1 qa1Var = this.g0;
        if (qa1Var != null) {
            org.telegram.messenger.g0.r(qa1Var);
        }
        org.telegram.ui.Components.zg0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z9) {
            org.telegram.ui.Components.zg0[] zg0VarArr = this.f0;
            if (animatedDrawable != zg0VarArr[0]) {
                if (animatedDrawable != zg0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    qa1 qa1Var2 = new qa1(this, 4);
                    this.g0 = qa1Var2;
                    org.telegram.messenger.g0.i3(qa1Var2, Utilities.b.nextInt(2000) + 5000);
                }
            }
        }
        if (Utilities.b.nextInt() % 2 == 0) {
            this.a.setAnimation(this.f0[0]);
            this.f0[0].T(true, 0.0f);
        } else {
            this.a.setAnimation(this.f0[1]);
            this.f0[1].T(true, 0.0f);
        }
        if (!z9) {
            this.a.d();
        }
        qa1 qa1Var22 = new qa1(this, 4);
        this.g0 = qa1Var22;
        org.telegram.messenger.g0.i3(qa1Var22, Utilities.b.nextInt(2000) + 5000);
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void M0(boolean z9) {
        if (z9 == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z9 ? 1 : null);
        this.I = new AnimatorSet();
        if (z9) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
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
            AnimatorSet animatorSet3 = this.I;
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
        this.I.addListener(new z40(11, this, z9));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131742951, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.G(this.G, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743936, null), null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131750595, null), new ra1(this, 0));
        org.telegram.ui.ActionBar.r6.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.q7, null);
    }

    @Override // org.telegram.ui.ActionBar.f2
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
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7;
        ?? r12;
        ?? r92;
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
        this.actionBar.setActionBarMenuOnItemClick(new xa1(this));
        int i14 = this.O;
        if (i14 == 5) {
            this.actionBar.q().a(0, R.drawable.ic_ab_other).f(1, org.telegram.messenger.id.M0(2131754947, null));
        }
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.c0 = q00Var;
        this.b0 = new h6.m(q00Var);
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
            public final /* synthetic */ za1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i10;
                int i16 = 1;
                za1 za1Var = this.b;
                switch (i15) {
                    case 0:
                        za1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        break;
                    case 2:
                        za1.a0(za1Var);
                        break;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i17 = za1Var.O;
                            if (i17 != 0) {
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        za1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.T = M02;
                                    u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    za1Var.showDialog(u1Var2);
                                    TextView textView = (TextView) u1Var2.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i16));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        za1Var.H0();
                        break;
                    default:
                        int i18 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.n.getTransformationMethod() == null) {
                            za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.a.setAnimation(zg0Var);
                                    za1Var.f0[3].N(18, false, false);
                                }
                                za1Var.a.d();
                            }
                        } else {
                            za1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.a.setAnimation(zg0Var2);
                                }
                                za1Var.f0[3].T(false, 0.0f);
                                za1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(context);
        this.d0 = t11Var;
        t11Var.setTransformType(1);
        this.d0.setProgress(0.0f);
        this.d0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.d0.setDrawBackground(false);
        this.c0.setContentDescription(org.telegram.messenger.id.M0(2131748251, null));
        this.c0.addView(this.d0, c8.ha.e(56, 56, 17));
        this.c0.a(this.d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        h6.m.g(this.h);
        this.h.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
            public final /* synthetic */ za1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                int i16 = 1;
                za1 za1Var = this.b;
                switch (i15) {
                    case 0:
                        za1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        break;
                    case 2:
                        za1.a0(za1Var);
                        break;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i17 = za1Var.O;
                            if (i17 != 0) {
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        za1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.T = M02;
                                    u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    za1Var.showDialog(u1Var2);
                                    TextView textView2 = (TextView) u1Var2.d(-1);
                                    if (textView2 != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i16));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        za1Var.H0();
                        break;
                    default:
                        int i18 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.n.getTransformationMethod() == null) {
                            za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.a.setAnimation(zg0Var);
                                    za1Var.f0[3].N(18, false, false);
                                }
                                za1Var.a.d();
                            }
                        } else {
                            za1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.a.setAnimation(zg0Var2);
                                }
                                za1Var.f0[3].T(false, 0.0f);
                                za1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.a = ch0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ch0Var.setScaleType(scaleType);
        if (i14 == 2 && org.telegram.messenger.g0.O1()) {
            this.a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.ch0 ch0Var2 = this.a;
            Point point = org.telegram.messenger.g0.q;
            ch0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        this.c.setGravity(1);
        this.c.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        xh.l lVar = new xh.l(context);
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
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
            public final /* synthetic */ za1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i16;
                int i162 = 1;
                za1 za1Var = this.b;
                switch (i152) {
                    case 0:
                        za1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        break;
                    case 2:
                        za1.a0(za1Var);
                        break;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i17 = za1Var.O;
                            if (i17 != 0) {
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        za1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.T = M02;
                                    u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    za1Var.showDialog(u1Var2);
                                    TextView textView22 = (TextView) u1Var2.d(-1);
                                    if (textView22 != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i162));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        za1Var.H0();
                        break;
                    default:
                        int i18 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.n.getTransformationMethod() == null) {
                            za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.a.setAnimation(zg0Var);
                                    za1Var.f0[3].N(18, false, false);
                                }
                                za1Var.a.d();
                            }
                        } else {
                            za1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.a.setAnimation(zg0Var2);
                                }
                                za1Var.f0[3].T(false, 0.0f);
                                za1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
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
        this.b.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 24.0f));
        final int i17 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
            public final /* synthetic */ za1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i17;
                int i162 = 1;
                za1 za1Var = this.b;
                switch (i152) {
                    case 0:
                        za1Var.H0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        break;
                    case 2:
                        za1.a0(za1Var);
                        break;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i172 = za1Var.O;
                            if (i172 != 0) {
                                if (i172 != 3) {
                                    if (i172 == 2) {
                                        za1Var.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                    String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.T = M02;
                                    u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    za1Var.showDialog(u1Var2);
                                    TextView textView22 = (TextView) u1Var2.d(-1);
                                    if (textView22 != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i162));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        za1Var.H0();
                        break;
                    default:
                        int i18 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.n.getTransformationMethod() == null) {
                            za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.a.setAnimation(zg0Var);
                                    za1Var.f0[3].N(18, false, false);
                                }
                                za1Var.a.d();
                            }
                        } else {
                            za1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                za1Var.f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.a.setAnimation(zg0Var2);
                                }
                                za1Var.f0[3].T(false, 0.0f);
                                za1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
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
                k0 k0Var = new k0(28, context, this);
                gi0 gi0Var = new gi0(this, context, k0Var, i12);
                gi0Var.addView(k0Var);
                p9 p9Var = new p9(this, context, gi0Var);
                ya1 ya1Var = new ya1(this, context);
                this.y = ya1Var;
                ya1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.y, c8.ha.c(-1.0f, -1));
                k0Var.addView(this.h, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                k0Var.addView(this.c0, org.telegram.ui.Components.q00.b());
                p9Var.addView(gi0Var, c8.ha.c(-1.0f, -1));
                c61 c61Var = new c61(21, context, this);
                c61Var.setOrientation(1);
                this.y.addView(c61Var, c8.ha.x(-1, -1, 51));
                c61Var.addView(this.a, c8.ha.t(-2, -2, 49, 0, 69, 0, 0));
                c61Var.addView(this.c, c8.ha.t(-2, -2, 49, 0, 8, 0, 0));
                c61Var.addView(this.d, c8.ha.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
                this.s = lb0Var;
                lb0Var.b(1.0f, 1.0f, false);
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
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.oa1
                    public final /* synthetic */ za1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (i12) {
                            case 0:
                                za1 za1Var = this.b;
                                za1Var.getClass();
                                if (i19 == 5 || i19 == 6) {
                                    za1Var.H0();
                                    break;
                                }
                                break;
                            default:
                                za1 za1Var2 = this.b;
                                za1Var2.getClass();
                                if (i19 == 5 || i19 == 6) {
                                    if (za1Var2.w.getVisibility() == 0) {
                                        za1Var2.r.requestFocus();
                                    } else {
                                        za1Var2.H0();
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
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.pa1
                    public final /* synthetic */ za1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z9) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.Components.lb0 lb0Var2 = this.b.w;
                                float f10 = z9 ? 1.0f : 0.0f;
                                lb0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                za1 za1Var = this.b;
                                if (!z9) {
                                    za1Var.getClass();
                                    break;
                                } else {
                                    za1Var.e0.setEditText((EditText) view);
                                    za1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.lb0 lb0Var3 = this.b.s;
                                float f11 = z9 ? 1.0f : 0.0f;
                                lb0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, c8.ha.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(4, context, this);
                this.E = f0Var;
                f0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(org.telegram.messenger.id.M0(2131743935, null));
                org.telegram.ui.ActionBar.f0 f0Var2 = this.E;
                int i20 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(f0Var2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i20, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i20), null);
                org.telegram.ui.ActionBar.r6.t(this.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.g0.Z3(this.E, false, 0.1f, true, false);
                final int i21 = 6;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
                    public final /* synthetic */ za1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152 = i21;
                        int i162 = 1;
                        za1 za1Var = this.b;
                        switch (i152) {
                            case 0:
                                za1Var.H0();
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                                String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                                za1Var.showDialog(u1Var);
                                break;
                            case 2:
                                za1.a0(za1Var);
                                break;
                            case 3:
                                if (za1Var.h.getAlpha() >= 0.5f) {
                                    int i172 = za1Var.O;
                                    if (i172 != 0) {
                                        if (i172 != 3) {
                                            if (i172 == 2) {
                                                za1Var.F0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                            String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                            u1Var2.T = M02;
                                            u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                            za1Var.showDialog(u1Var2);
                                            TextView textView22 = (TextView) u1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        za1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = za1Var.a0;
                                        za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i162));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (za1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = za1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = za1Var.G;
                                    za1Var.presentFragment(twoStepVerificationActivity, true);
                                    l90 l90Var = za1Var.j0;
                                    if (l90Var != null) {
                                        org.telegram.messenger.g0.h3(l90Var);
                                        za1Var.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                za1Var.H0();
                                break;
                            default:
                                int i182 = za1Var.O;
                                za1Var.M = true;
                                if (za1Var.n.getTransformationMethod() == null) {
                                    za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                        za1Var.f0[3].P(-1);
                                        org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var = za1Var.f0[3];
                                        if (animatedDrawable != zg0Var) {
                                            za1Var.a.setAnimation(zg0Var);
                                            za1Var.f0[3].N(18, false, false);
                                        }
                                        za1Var.a.d();
                                    }
                                } else {
                                    za1Var.n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                        za1Var.f0[3].P(18);
                                        org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                        if (animatedDrawable2 != zg0Var2) {
                                            za1Var.a.setAnimation(zg0Var2);
                                        }
                                        za1Var.f0[3].T(false, 0.0f);
                                        za1Var.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = za1Var.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                za1Var.M = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.E, c8.ha.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new wa1(this, 2));
                this.s.addView(linearLayout, c8.ha.c(-2.0f, -1));
                c61Var.addView(this.s, c8.ha.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new org.telegram.ui.Components.lb0(context, null);
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
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.oa1
                    public final /* synthetic */ za1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i192, KeyEvent keyEvent) {
                        switch (i22) {
                            case 0:
                                za1 za1Var = this.b;
                                za1Var.getClass();
                                if (i192 == 5 || i192 == 6) {
                                    za1Var.H0();
                                    break;
                                }
                                break;
                            default:
                                za1 za1Var2 = this.b;
                                za1Var2.getClass();
                                if (i192 == 5 || i192 == 6) {
                                    if (za1Var2.w.getVisibility() == 0) {
                                        za1Var2.r.requestFocus();
                                    } else {
                                        za1Var2.H0();
                                    }
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.pa1
                    public final /* synthetic */ za1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z9) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.Components.lb0 lb0Var2 = this.b.w;
                                float f10 = z9 ? 1.0f : 0.0f;
                                lb0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                za1 za1Var = this.b;
                                if (!z9) {
                                    za1Var.getClass();
                                    break;
                                } else {
                                    za1Var.e0.setEditText((EditText) view);
                                    za1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.lb0 lb0Var3 = this.b.s;
                                float f11 = z9 ? 1.0f : 0.0f;
                                lb0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                this.w.addView(this.r, c8.ha.c(-2.0f, -1));
                c61Var.addView(this.w, c8.ha.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
                this.e0 = brVar;
                brVar.setVisibility(8);
                gi0Var.addView(this.e0);
                lb0 lb0Var2 = new lb0(3, context, this);
                this.x = lb0Var2;
                final int i23 = 1;
                lb0Var2.b(6, 1);
                br[] brVarArr = this.x.f;
                int length = brVarArr.length;
                int i24 = 0;
                while (i24 < length) {
                    br brVar2 = brVarArr[i24];
                    brVar2.setShowSoftInputOnFocusCompat((A0() ? 1 : 0) ^ i23);
                    brVar2.addTextChangedListener(new wa1(this, 0));
                    brVar2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.pa1
                        public final /* synthetic */ za1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z9) {
                            switch (i23) {
                                case 0:
                                    org.telegram.ui.Components.lb0 lb0Var22 = this.b.w;
                                    float f10 = z9 ? 1.0f : 0.0f;
                                    lb0Var22.b(f10, f10, true);
                                    break;
                                case 1:
                                    za1 za1Var = this.b;
                                    if (!z9) {
                                        za1Var.getClass();
                                        break;
                                    } else {
                                        za1Var.e0.setEditText((EditText) view);
                                        za1Var.e0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.lb0 lb0Var3 = this.b.s;
                                    float f11 = z9 ? 1.0f : 0.0f;
                                    lb0Var3.b(f11, f11, true);
                                    break;
                            }
                        }
                    });
                    i24++;
                    i23 = 1;
                }
                this.x.setVisibility(8);
                c61Var.addView(this.x, c8.ha.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                c61Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, c8.ha.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.J6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    this.f.setText(org.telegram.messenger.id.M0(2131746079, null));
                    c61Var.addView(this.f, c8.ha.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i25 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
                        public final /* synthetic */ za1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i25;
                            int i162 = 1;
                            za1 za1Var = this.b;
                            switch (i152) {
                                case 0:
                                    za1Var.H0();
                                    break;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                                    String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                                    za1Var.showDialog(u1Var);
                                    break;
                                case 2:
                                    za1.a0(za1Var);
                                    break;
                                case 3:
                                    if (za1Var.h.getAlpha() >= 0.5f) {
                                        int i172 = za1Var.O;
                                        if (i172 != 0) {
                                            if (i172 != 3) {
                                                if (i172 == 2) {
                                                    za1Var.F0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                                String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                                u1Var2.T = M02;
                                                u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                                za1Var.showDialog(u1Var2);
                                                TextView textView22 = (TextView) u1Var2.d(-1);
                                                if (textView22 != null) {
                                                    org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                                    break;
                                                }
                                            }
                                        } else {
                                            za1Var.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = za1Var.a0;
                                            za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i162));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (za1Var.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = za1Var.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = za1Var.G;
                                        za1Var.presentFragment(twoStepVerificationActivity, true);
                                        l90 l90Var = za1Var.j0;
                                        if (l90Var != null) {
                                            org.telegram.messenger.g0.h3(l90Var);
                                            za1Var.j0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    za1Var.H0();
                                    break;
                                default:
                                    int i182 = za1Var.O;
                                    za1Var.M = true;
                                    if (za1Var.n.getTransformationMethod() == null) {
                                        za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                            za1Var.f0[3].P(-1);
                                            org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.zg0 zg0Var = za1Var.f0[3];
                                            if (animatedDrawable != zg0Var) {
                                                za1Var.a.setAnimation(zg0Var);
                                                za1Var.f0[3].N(18, false, false);
                                            }
                                            za1Var.a.d();
                                        }
                                    } else {
                                        za1Var.n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                            za1Var.f0[3].P(18);
                                            org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                            if (animatedDrawable2 != zg0Var2) {
                                                za1Var.a.setAnimation(zg0Var2);
                                            }
                                            za1Var.f0[3].T(false, 0.0f);
                                            za1Var.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = za1Var.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    za1Var.M = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = p9Var;
                fi.p5 p5Var = new fi.p5(this, context);
                this.D = p5Var;
                p5Var.setAlpha(0.0f);
                p9Var.addView(this.D);
                p9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false));
                k0Var.addView(this.L, c8.ha.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(i12, context, this);
                eVar.setOnTouchListener(new ei.b(2));
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
                if (this.U.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747212, null));
                    this.c.setText(org.telegram.messenger.id.M0(2131747212, null));
                } else {
                    String M0 = org.telegram.messenger.id.M0(i14 == 0 ? 2131751706 : 2131746414, null);
                    this.actionBar.setTitle(M0);
                    this.c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.id.M0(2131742820, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(org.telegram.messenger.id.M0(i14 == 0 ? 2131751117 : 2131746414, null));
                this.n.setContentDescription(org.telegram.messenger.id.M0(i14 == 0 ? 2131751117 : 2131746414, null));
                this.n.setImeOptions(268435461);
                this.n.setInputType(org.telegram.messenger.qs.N1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.F = i14 == 0;
                org.telegram.messenger.g0.Z3(this.E, false, 0.1f, true, false);
                org.telegram.ui.Components.zg0[] zg0VarArr = new org.telegram.ui.Components.zg0[7];
                this.f0 = zg0VarArr;
                zg0VarArr[0] = new org.telegram.ui.Components.zg0(R.raw.tsv_setup_monkey_idle1, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f0[1] = new org.telegram.ui.Components.zg0(R.raw.tsv_setup_monkey_idle2, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f0[2] = new org.telegram.ui.Components.zg0(R.raw.tsv_monkey_close, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f0[3] = new org.telegram.ui.Components.zg0(R.raw.tsv_setup_monkey_peek, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f0[4] = new org.telegram.ui.Components.zg0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f0[5] = new org.telegram.ui.Components.zg0(R.raw.tsv_setup_monkey_close_and_peek, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f0[6] = new org.telegram.ui.Components.zg0(R.raw.tsv_setup_monkey_tracking, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                org.telegram.ui.Components.zg0 zg0Var = this.f0[6];
                zg0Var.h = true;
                zg0Var.P(19);
                this.f0[2].S(97, this.i0);
                K0(true);
                if (!(i14 == 1)) {
                    EditTextBoldCursor editTextBoldCursor4 = this.n;
                    ArrayList arrayList = editTextBoldCursor4.f1;
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
                    i7 = 1;
                    K0(true);
                    break;
                } else {
                    qa1 qa1Var = this.g0;
                    if (qa1Var != null) {
                        org.telegram.messenger.g0.r(qa1Var);
                    }
                    this.a.setAnimation(this.f0[6]);
                    this.a.d();
                    i7 = 1;
                    break;
                }
            case 2:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747445, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.id.M0(2131742820, null));
                this.c.setText(org.telegram.messenger.id.M0(2131747445, null));
                this.d.setText(org.telegram.messenger.id.M0(2131747444, null));
                this.d.setVisibility(0);
                this.s.setText(org.telegram.messenger.id.M0(2131747443, null));
                this.n.setContentDescription(org.telegram.messenger.id.M0(2131747443, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.a.d();
                i7 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131746345, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (this.Z) {
                    r12 = 0;
                } else {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.id.M0(2131742820, null));
                }
                this.c.setText(org.telegram.messenger.id.M0(2131746345, r12));
                this.d.setText(org.telegram.messenger.id.M0(2131746346, r12));
                this.d.setVisibility(0);
                this.s.setText(org.telegram.messenger.id.M0(2131747377, r12));
                this.n.setContentDescription(org.telegram.messenger.id.M0(2131747377, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, 120, 120, r12);
                this.a.d();
                i7 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747438, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(org.telegram.messenger.id.M0(2131747438, null));
                this.e0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.U.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf == lastIndexOf || indexOf == -1 || lastIndexOf == -1) {
                    r92 = 0;
                } else {
                    org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                    uy0Var.a |= 256;
                    uy0Var.b = indexOf;
                    int i27 = lastIndexOf + 1;
                    uy0Var.c = i27;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i27, 0);
                }
                xh.l lVar2 = this.d;
                String M02 = org.telegram.messenger.id.M0(2131746083, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                lVar2.setText(org.telegram.messenger.g0.m0(M02, charSequenceArr));
                this.d.setVisibility(r92);
                this.c0.e(r92, r92);
                this.x.setVisibility(r92);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i7 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131743622, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(org.telegram.messenger.id.M0(2131743622, null));
                this.s.setVisibility(8);
                this.e0.setVisibility(0);
                xh.l lVar3 = this.d;
                String str3 = this.U.email_unconfirmed_pattern;
                lVar3.setText(org.telegram.messenger.id.a0("EmailPasswordConfirmText2", null, 2131751200, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.id.M0(2131746124, null));
                final int i28 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.na1
                    public final /* synthetic */ za1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152 = i28;
                        int i162 = 1;
                        za1 za1Var = this.b;
                        switch (i152) {
                            case 0:
                                za1Var.H0();
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                                String M03 = org.telegram.messenger.id.M0(2131746096, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M03;
                                u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                                za1Var.showDialog(u1Var);
                                break;
                            case 2:
                                za1.a0(za1Var);
                                break;
                            case 3:
                                if (za1Var.h.getAlpha() >= 0.5f) {
                                    int i172 = za1Var.O;
                                    if (i172 != 0) {
                                        if (i172 != 3) {
                                            if (i172 == 2) {
                                                za1Var.F0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                            String M022 = org.telegram.messenger.id.M0(2131742818, null);
                                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                            u1Var2.T = M022;
                                            u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                            za1Var.showDialog(u1Var2);
                                            TextView textView22 = (TextView) u1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        za1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = za1Var.a0;
                                        za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, i162));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (za1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = za1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = za1Var.G;
                                    za1Var.presentFragment(twoStepVerificationActivity, true);
                                    l90 l90Var = za1Var.j0;
                                    if (l90Var != null) {
                                        org.telegram.messenger.g0.h3(l90Var);
                                        za1Var.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                za1Var.H0();
                                break;
                            default:
                                int i182 = za1Var.O;
                                za1Var.M = true;
                                if (za1Var.n.getTransformationMethod() == null) {
                                    za1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                        za1Var.f0[3].P(-1);
                                        org.telegram.ui.Components.zg0 animatedDrawable = za1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f0[3];
                                        if (animatedDrawable != zg0Var2) {
                                            za1Var.a.setAnimation(zg0Var2);
                                            za1Var.f0[3].N(18, false, false);
                                        }
                                        za1Var.a.d();
                                    }
                                } else {
                                    za1Var.n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && za1Var.n.length() > 0 && za1Var.n.hasFocus()) {
                                        za1Var.f0[3].P(18);
                                        org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var22 = za1Var.f0[3];
                                        if (animatedDrawable2 != zg0Var22) {
                                            za1Var.a.setAnimation(zg0Var22);
                                        }
                                        za1Var.f0[3].T(false, 0.0f);
                                        za1Var.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = za1Var.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                za1Var.M = false;
                                break;
                        }
                    }
                });
                this.x.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i7 = 1;
                break;
            case 6:
                this.c.setText(org.telegram.messenger.id.M0(2131743934, null));
                this.d.setText(org.telegram.messenger.id.M0(2131745551, null));
                this.b.setText(org.telegram.messenger.id.M0(2131743936, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, org.telegram.messenger.qs.W1, org.telegram.messenger.qs.W1, null);
                this.a.d();
                i7 = 1;
                break;
            case 7:
                this.c.setText(org.telegram.messenger.id.M0(2131743938, null));
                this.d.setText(org.telegram.messenger.id.M0(2131743937, null));
                if (this.Y) {
                    this.b.setText(org.telegram.messenger.id.M0(2131743940, null));
                } else if (this.H) {
                    this.b.setText(org.telegram.messenger.id.M0(2131751771, null));
                } else {
                    this.b.setText(org.telegram.messenger.id.M0(2131743939, null));
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, org.telegram.messenger.qs.q2, org.telegram.messenger.qs.q2, null);
                this.a.d();
                i7 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747218, null));
                this.c.setText(org.telegram.messenger.id.M0(2131747218, null));
                this.d.setText(org.telegram.messenger.id.M0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(org.telegram.messenger.id.M0(2131750592, null));
                org.telegram.ui.ActionBar.r6.V(this.e, org.telegram.ui.ActionBar.k6.o6, null);
                this.s.setText(org.telegram.messenger.id.M0(2131748727, null));
                this.n.setContentDescription(org.telegram.messenger.id.M0(2131748727, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(org.telegram.messenger.qs.N1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                i7 = 1;
                break;
            case 9:
                this.c.setText(org.telegram.messenger.id.M0(2131752159, null));
                this.d.setText(org.telegram.messenger.id.M0(2131752158, null));
                this.b.setText(org.telegram.messenger.id.M0(2131752161, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, org.telegram.messenger.qs.W1, org.telegram.messenger.qs.W1, null);
                this.a.d();
                i7 = 1;
                break;
            default:
                i7 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new wa1(this, i7));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean finishFragment(boolean z9) {
        for (org.telegram.ui.ActionBar.f2 f2Var : getParentLayout().getFragmentStack()) {
            if (f2Var != this && (f2Var instanceof za1)) {
                ((org.telegram.ui.Components.e51) ((za1) f2Var).b0.b).b = true;
            }
        }
        return super.finishFragment(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hideKeyboardOnShow() {
        int i7 = this.O;
        return i7 == 7 || i7 == 9;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z9) {
                finishFragment();
            }
            return true;
        }
        if (!z9) {
            return false;
        }
        N0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i7 = this.O;
            if (i7 == 2 && org.telegram.messenger.g0.O1()) {
                this.a.setVisibility(8);
            } else if (i7 != 6 && i7 != 9 && i7 != 7) {
                org.telegram.ui.Components.ch0 ch0Var = this.a;
                Point point = org.telegram.messenger.g0.q;
                ch0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.br brVar = this.e0;
        if (brVar != null) {
            brVar.setVisibility(A0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        qa1 qa1Var = this.g0;
        if (qa1Var != null) {
            org.telegram.messenger.g0.r(qa1Var);
            this.g0 = null;
        }
        if (this.f0 != null) {
            int i7 = 0;
            while (true) {
                org.telegram.ui.Components.zg0[] zg0VarArr = this.f0;
                if (i7 >= zg0VarArr.length) {
                    break;
                }
                zg0VarArr[i7].C(false);
                i7++;
            }
            this.f0 = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        this.S = false;
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.v1(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.t11 t11Var = this.d0;
            if (t11Var != null) {
                t11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            if (this.n != null && !A0()) {
                org.telegram.messenger.g0.i3(new qa1(this, 2), 200L);
            }
            lb0 lb0Var = this.x;
            if (lb0Var == null || lb0Var.getVisibility() != 0) {
                return;
            }
            org.telegram.messenger.g0.i3(new qa1(this, 3), 200L);
        }
    }

    public final void z0(Runnable runnable) {
        int i7 = 0;
        while (true) {
            lb0 lb0Var = this.x;
            br[] brVarArr = lb0Var.f;
            if (i7 >= brVarArr.length) {
                lb0Var.postDelayed(new by0(26, this, runnable), (brVarArr.length * 75) + 350);
                return;
            } else {
                br brVar = brVarArr[i7];
                brVar.postDelayed(new fi0(brVar, 1), i7 * 75);
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle k10 = a8.p0.k("afterSignup", true);
            je0 je0Var = new je0();
            je0Var.r0(k10);
            presentFragment(je0Var, true);
            return;
        }
        super.finishFragment();
    }

    public za1(int i7, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new qa1(this, 0);
        this.i0 = new qa1(this, 1);
        this.O = i7;
        this.U = password;
        if (password == null && (i7 == 6 || i7 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new sa1(this, 0), 10);
        } else {
            this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void G0() {
    }
}
