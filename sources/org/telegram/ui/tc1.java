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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class tc1 extends org.telegram.ui.ActionBar.k2 {
    public kg.f0 D;
    public org.telegram.ui.ActionBar.g0 E;
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
    public org.telegram.ui.Components.ei0 a;
    public String a0;
    public TextView b;
    public li.k b0;
    public TextView c;
    public org.telegram.ui.Components.f10 c0;
    public nh.p d;
    public org.telegram.ui.Components.v21 d0;
    public TextView e;
    public org.telegram.ui.Components.lr e0;
    public TextView f;
    public org.telegram.ui.Components.bi0[] f0;
    public kc1 g0;
    public TextView h;
    public final Runnable h0;
    public final Runnable i0;
    public qa0 j0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.ec0 s;
    public org.telegram.ui.Components.ec0 w;
    public uc0 x;
    public sc1 y;

    public tc1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new kc1(this, 0);
        this.i0 = new kc1(this, 1);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new mc1(this, 0), 10);
            }
        }
    }

    public static void Y(tc1 tc1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = tc1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.aw.d(tc1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] h12 = org.telegram.messenger.i0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = tc1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.aw.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        }
        ag.m1 m1Var = new ag.m1(tc1Var, z10, bArr, str, passwordinputsettings);
        if (z10) {
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(tLObject, m1Var, 10);
            return;
        }
        if (str != null && (bArr3 = tc1Var.X) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tc1Var.U.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(m10, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(m10, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(tc1Var.X, 0, bArr6, 0, 32);
                Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = tc1Var.W;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = tc1Var.U.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            m1Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] b10 = org.telegram.messenger.aw.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = b10;
            if (b10 == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                m1Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(tLObject, m1Var, 10);
    }

    public static void Z(tc1 tc1Var) {
        ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ag.c3(4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131746137, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131743956, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        tc1Var.showDialog(x1Var);
    }

    public static void a0(tc1 tc1Var, byte[] bArr) {
        ArrayList arrayList = tc1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = tc1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = tc1Var.U;
        if (bArr == null) {
            bArr = tc1Var.V;
        }
        twoStepVerificationActivity.z0(password2, bArr, tc1Var.W, tc1Var.X);
        twoStepVerificationActivity.X = tc1Var.G;
        tc1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.q0, tc1Var.U);
        qa0 qa0Var = tc1Var.j0;
        if (qa0Var != null) {
            org.telegram.messenger.i0.g3(qa0Var);
            tc1Var.j0 = null;
        }
    }

    public static void b0(tc1 tc1Var) {
        ArrayList arrayList = tc1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(tc1Var.currentAccount);
        byte[] bArr = tc1Var.V;
        TL_account.Password password = tc1Var.U;
        f7.k(org.telegram.messenger.zs.p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, tc1Var.R, tc1Var.Q, null, tc1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = tc1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.z0(password2, tc1Var.V, tc1Var.W, tc1Var.X);
        twoStepVerificationActivity.X = tc1Var.G;
        tc1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.q0, tc1Var.U);
        qa0 qa0Var = tc1Var.j0;
        if (qa0Var != null) {
            org.telegram.messenger.i0.g3(qa0Var);
            tc1Var.j0 = null;
        }
    }

    public static /* synthetic */ void c0(tc1 tc1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = tc1Var.U.current_algo;
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.aw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        ul0 ul0Var = new ul0(19, tc1Var, c10);
        TL_account.Password password = tc1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            ul0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(getpasswordsettings, ul0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        ul0Var.run(null, tL_error2);
    }

    public static void d0(tc1 tc1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(new TL_account.getPassword(), new mc1(tc1Var, 4), 8);
            return;
        }
        tc1Var.A0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            tc1Var.d.setText(org.telegram.messenger.cd.L0(2131752157, null));
            org.telegram.ui.ActionBar.a7.V(tc1Var.d, org.telegram.ui.ActionBar.t6.p7, null);
            tc1Var.D0(tc1Var.s, tc1Var.n, true);
            tc1Var.L0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static /* synthetic */ void e0(tc1 tc1Var) {
        ArrayList arrayList = tc1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.p0, new Object[0]);
        tc1Var.finishFragment();
    }

    public static void f0(tc1 tc1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            tc1Var.U = password;
            if (!TwoStepVerificationActivity.m0(password, false)) {
                org.telegram.ui.Components.s4.w0(tc1Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                return;
            }
            tc1Var.T = !TextUtils.isEmpty(tc1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.q0(tc1Var.U);
            if (!tc1Var.S && tc1Var.Y) {
                TL_account.Password password2 = tc1Var.U;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!tc1Var.T && passwordKdfAlgo != null) {
                        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        tc1Var.finishFragment();
                    }
                }
            }
            if (tc1Var.N) {
                tc1Var.A0();
                tc1Var.G0();
            }
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.q0, tc1Var.U);
        }
    }

    public static /* synthetic */ void g0(tc1 tc1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            tc1Var.U = password;
            TwoStepVerificationActivity.q0(password);
            tc1Var.I0(z10);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.q0, tc1Var.U);
        }
    }

    public static void h0(tc1 tc1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = tc1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.voip.u0(10, tc1Var, z10), 8);
            return;
        }
        tc1Var.A0();
        int i10 = org.telegram.messenger.zs.p0;
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.L0(2131747461, null));
                        return;
                    }
                    if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                        tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.L0(2131751201, null));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        tc1Var.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                        return;
                    }
                }
                org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i10, new Object[0]);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.k2) arrayList.get(i11)).removeSelfFromStack();
                }
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(tc1Var.currentAccount);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = tc1Var.U;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = tc1Var.R;
                f7.k(i10, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, tc1Var.Q, str2, tc1Var.P);
                TL_account.Password password3 = tc1Var.U;
                password3.email_unconfirmed_pattern = tc1Var.R;
                tc1 tc1Var2 = new tc1(5, password3);
                tc1Var2.H = tc1Var.H;
                tc1Var2.H0(bArr != null ? bArr : tc1Var.V, tc1Var.W, tc1Var.X, tc1Var.Z);
                tc1Var2.Y = tc1Var.Y;
                tc1Var2.G = tc1Var.G;
                tc1Var.presentFragment(tc1Var2, true);
                return;
            }
            return;
        }
        tc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
        int i12 = org.telegram.messenger.zs.q0;
        if (z10) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((org.telegram.ui.ActionBar.k2) arrayList.get(i13)).removeSelfFromStack();
            }
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.r0, new Object[0]);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i12, new Object[0]);
            tc1Var.finishFragment();
            return;
        }
        if (tc1Var.getParentActivity() == null) {
            return;
        }
        if (tc1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new ep0(21, tc1Var, bArr));
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            if (str == null && (password = tc1Var.U) != null && password.has_password) {
                x1Var.T = org.telegram.messenger.cd.L0(2131742838, null);
            } else {
                x1Var.T = org.telegram.messenger.cd.L0(2131742829, null);
            }
            x1Var.R = org.telegram.messenger.cd.L0(2131742823, null);
            Dialog showDialog = tc1Var.showDialog(x1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i14 = 0; i14 < size3; i14++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i14)).removeSelfFromStack();
        }
        TL_account.Password password4 = tc1Var.U;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (tc1Var.Y) {
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i10, new Object[0]);
        }
        tc1 tc1Var3 = new tc1(7, tc1Var.U);
        tc1Var3.H = tc1Var.H;
        tc1Var3.H0(bArr != null ? bArr : tc1Var.V, tc1Var.W, tc1Var.X, tc1Var.Z);
        tc1Var3.Y = tc1Var.Y;
        tc1Var3.G = tc1Var.G;
        tc1Var.presentFragment(tc1Var3, true);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i12, tc1Var.U);
    }

    public static void i0(tc1 tc1Var, TLRPC.TL_error tL_error) {
        tc1Var.A0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = tc1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.z0(password, tc1Var.V, tc1Var.W, tc1Var.X);
            twoStepVerificationActivity.X = tc1Var.G;
            tc1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.r0, new Object[0]);
            qa0 qa0Var = tc1Var.j0;
            if (qa0Var != null) {
                org.telegram.messenger.i0.g3(qa0Var);
                tc1Var.j0 = null;
            }
        }
    }

    public static void j0(tc1 tc1Var) {
        ArrayList arrayList = tc1Var.J;
        int i10 = 4;
        if (tc1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new lc1(tc1Var, i10));
            boolean z10 = tc1Var.U.has_recovery;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            if (z10) {
                x1Var.T = org.telegram.messenger.cd.L0(2131742839, null);
            } else {
                x1Var.T = org.telegram.messenger.cd.L0(2131742838, null);
            }
            x1Var.R = org.telegram.messenger.cd.L0(2131742823, null);
            Dialog showDialog = tc1Var.showDialog(x1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i11)).removeSelfFromStack();
        }
        TL_account.Password password = tc1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        tc1 tc1Var2 = new tc1(7, password);
        tc1Var2.H = tc1Var.H;
        tc1Var2.H0(tc1Var.V, tc1Var.W, tc1Var.X, tc1Var.Z);
        tc1Var2.J.addAll(arrayList);
        tc1Var2.Y = tc1Var.Y;
        tc1Var2.G = tc1Var.G;
        tc1Var.presentFragment(tc1Var2, true);
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(tc1Var.currentAccount);
        byte[] bArr = tc1Var.V;
        TL_account.Password password2 = tc1Var.U;
        f7.k(org.telegram.messenger.zs.p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, tc1Var.R, tc1Var.Q, null, tc1Var.P);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.q0, tc1Var.U);
    }

    public static void k0(tc1 tc1Var, String str) {
        tc1 tc1Var2 = new tc1(tc1Var.currentAccount, 0, tc1Var.U);
        tc1Var2.H = tc1Var.H;
        tc1Var2.J.addAll(tc1Var.J);
        tc1Var2.J.add(tc1Var);
        tc1Var2.a0 = str;
        tc1Var2.G = tc1Var.G;
        tc1Var.presentFragment(tc1Var2, true);
    }

    public static /* synthetic */ void l0(tc1 tc1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            tc1Var.U = password;
            TwoStepVerificationActivity.q0(password);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.q0, tc1Var.U);
            tc1Var.G0();
        }
    }

    public final void A0() {
        this.c0.f(false, true);
    }

    public final void B0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.c0.f(true, true);
    }

    public final void C0() {
        for (bs bsVar : this.x.f) {
            bsVar.setText("");
            bsVar.z(1.0f);
        }
        this.x.f[0].requestFocus();
        org.telegram.messenger.i0.F3(8.0f, this.x, new kc1(this, 6));
    }

    public final void D0(org.telegram.ui.Components.ec0 ec0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        org.telegram.messenger.i0.F3(5.0f, ec0Var, null);
    }

    public final void E0() {
        TL_account.Password password = this.U;
        if (password.has_recovery) {
            this.R = "";
            I0(false);
            return;
        }
        tc1 tc1Var = new tc1(this.currentAccount, 3, password);
        tc1Var.H = this.H;
        tc1Var.H0(this.V, this.W, this.X, this.Z);
        tc1Var.P = this.P;
        tc1Var.Q = this.Q;
        tc1Var.J.addAll(this.J);
        tc1Var.J.add(this);
        tc1Var.Y = this.Y;
        tc1Var.G = this.G;
        presentFragment(tc1Var);
    }

    public final void G0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        switch (this.O) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    D0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.P) || this.O != 1) {
                    tc1 tc1Var = new tc1(this.currentAccount, this.O == 0 ? 1 : 2, this.U);
                    tc1Var.H = this.H;
                    tc1Var.P = this.n.getText().toString();
                    tc1Var.H0(this.V, this.W, this.X, this.Z);
                    tc1Var.a0 = this.a0;
                    tc1Var.J.addAll(this.J);
                    tc1Var.J.add(this);
                    tc1Var.Y = this.Y;
                    tc1Var.G = this.G;
                    presentFragment(tc1Var);
                    break;
                } else {
                    org.telegram.messenger.i0.F3(5.0f, this.s, null);
                    try {
                        this.s.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131747462, null), 0).show();
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
            case 2:
                String obj = this.n.getText().toString();
                this.Q = obj;
                if (!obj.equalsIgnoreCase(this.P)) {
                    E0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131747464, null), 0).show();
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                    D0(this.s, this.n, false);
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
                        I0(false);
                        break;
                    }
                }
                D0(this.s, this.n, false);
                break;
            case 4:
                String code = this.x.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new ul0(18, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.x.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new mc1(this, r1), 10);
                B0();
                break;
            case 6:
                TL_account.Password password = this.U;
                if (password != null) {
                    tc1 tc1Var2 = new tc1(this.currentAccount, 0, password);
                    tc1Var2.H = this.H;
                    tc1Var2.Y = this.Y;
                    tc1Var2.G = this.G;
                    presentFragment(tc1Var2, true);
                    break;
                } else {
                    B0();
                    this.N = true;
                    break;
                }
            case 7:
                if (!this.Y) {
                    if (!this.H) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.z0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        qa0 qa0Var = this.j0;
                        if (qa0Var != null) {
                            org.telegram.messenger.i0.g3(qa0Var);
                            this.j0 = null;
                            break;
                        }
                    } else {
                        Bundle g10 = a1.g.g("afterSignup", true);
                        pf0 pf0Var = new pf0();
                        pf0Var.q0(g10);
                        presentFragment(pf0Var, true);
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
                        byte[] h12 = org.telegram.messenger.i0.h1(obj3);
                        B0();
                        Utilities.e.c(new nc1(this, h12, i10));
                        break;
                    } else {
                        D0(this.s, this.n, false);
                        break;
                    }
                } else {
                    B0();
                    this.N = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void H0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j10;
        this.Z = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            B0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new mc1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            org.telegram.messenger.d20.i(this.currentAccount).u();
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
            if (bArr == null || bArr.length == 0 || (z10 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        B0();
        Utilities.e.c(new ag.n0(this, updatepasswordsettings3, z10, str, passwordinputsettings, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.k0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(boolean z10) {
        if (this.O != 0) {
            return;
        }
        kc1 kc1Var = this.g0;
        if (kc1Var != null) {
            org.telegram.messenger.i0.r(kc1Var);
        }
        org.telegram.ui.Components.bi0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z10) {
            org.telegram.ui.Components.bi0[] bi0VarArr = this.f0;
            if (animatedDrawable != bi0VarArr[0]) {
                if (animatedDrawable != bi0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    kc1 kc1Var2 = new kc1(this, 4);
                    this.g0 = kc1Var2;
                    org.telegram.messenger.i0.h3(kc1Var2, Utilities.b.nextInt(2000) + 5000);
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
        if (!z10) {
            this.a.d();
        }
        kc1 kc1Var22 = new kc1(this, 4);
        this.g0 = kc1Var22;
        org.telegram.messenger.i0.h3(kc1Var22, Utilities.b.nextInt(2000) + 5000);
    }

    public final void K0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void L0(boolean z10) {
        if (z10 == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z10 ? 1 : null);
        this.I = new AnimatorSet();
        if (z10) {
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
        this.I.addListener(new org.telegram.ui.Components.ha0(27, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void M0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131742974, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.G(this.G, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743958, null), null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131750595, null), new lc1(this, 0));
        org.telegram.ui.ActionBar.a7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.t6.q7, null);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10;
        ?? r12;
        ?? r92;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 5, i12, null);
        final int i13 = 1;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i12, null);
        final int i14 = 3;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new rc1(this));
        int i15 = this.O;
        if (i15 == 5) {
            this.actionBar.p().a(0, R.drawable.ic_ab_other).f(1, org.telegram.messenger.cd.L0(2131754947, null));
        }
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.c0 = f10Var;
        this.b0 = new li.k(f10Var);
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i11;
                int i17 = 1;
                tc1 tc1Var = this.b;
                switch (i16) {
                    case 0:
                        tc1Var.G0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        break;
                    case 2:
                        tc1.Z(tc1Var);
                        break;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i18 = tc1Var.O;
                            if (i18 != 0) {
                                if (i18 != 3) {
                                    if (i18 == 2) {
                                        tc1Var.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.T = L02;
                                    x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    tc1Var.showDialog(x1Var2);
                                    TextView textView = (TextView) x1Var2.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i17));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        tc1Var.G0();
                        break;
                    default:
                        int i19 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.n.getTransformationMethod() == null) {
                            tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i19 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.a.setAnimation(bi0Var);
                                    tc1Var.f0[3].N(18, false, false);
                                }
                                tc1Var.a.d();
                            }
                        } else {
                            tc1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i19 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.a.setAnimation(bi0Var2);
                                }
                                tc1Var.f0[3].T(false, 0.0f);
                                tc1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.v21 v21Var = new org.telegram.ui.Components.v21(context);
        this.d0 = v21Var;
        v21Var.setTransformType(1);
        this.d0.setProgress(0.0f);
        this.d0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
        this.d0.setDrawBackground(false);
        this.c0.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        int i16 = 17;
        this.c0.addView(this.d0, w7.b6.e(56, 56, 17));
        this.c0.a(this.d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        li.k.i(this.h);
        this.h.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i14;
                int i17 = 1;
                tc1 tc1Var = this.b;
                switch (i162) {
                    case 0:
                        tc1Var.G0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        break;
                    case 2:
                        tc1.Z(tc1Var);
                        break;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i18 = tc1Var.O;
                            if (i18 != 0) {
                                if (i18 != 3) {
                                    if (i18 == 2) {
                                        tc1Var.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.T = L02;
                                    x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    tc1Var.showDialog(x1Var2);
                                    TextView textView2 = (TextView) x1Var2.d(-1);
                                    if (textView2 != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i17));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        tc1Var.G0();
                        break;
                    default:
                        int i19 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.n.getTransformationMethod() == null) {
                            tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i19 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.a.setAnimation(bi0Var);
                                    tc1Var.f0[3].N(18, false, false);
                                }
                                tc1Var.a.d();
                            }
                        } else {
                            tc1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i19 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.a.setAnimation(bi0Var2);
                                }
                                tc1Var.f0[3].T(false, 0.0f);
                                tc1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.a = ei0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ei0Var.setScaleType(scaleType);
        if (i15 == 2 && org.telegram.messenger.i0.O1()) {
            this.a.setVisibility(8);
        } else if (i15 != 6 && i15 != 9 && i15 != 7) {
            org.telegram.ui.Components.ei0 ei0Var2 = this.a;
            Point point = org.telegram.messenger.i0.q;
            ei0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
        this.c.setGravity(1);
        this.c.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        nh.p pVar = new nh.p(context);
        this.d = pVar;
        int i17 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(pVar, i17, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i17, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        this.e.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.e.setVisibility(8);
        final int i18 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i18;
                int i172 = 1;
                tc1 tc1Var = this.b;
                switch (i162) {
                    case 0:
                        tc1Var.G0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        break;
                    case 2:
                        tc1.Z(tc1Var);
                        break;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i182 = tc1Var.O;
                            if (i182 != 0) {
                                if (i182 != 3) {
                                    if (i182 == 2) {
                                        tc1Var.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.T = L02;
                                    x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    tc1Var.showDialog(x1Var2);
                                    TextView textView22 = (TextView) x1Var2.d(-1);
                                    if (textView22 != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i172));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        tc1Var.G0();
                        break;
                    default:
                        int i19 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.n.getTransformationMethod() == null) {
                            tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i19 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.a.setAnimation(bi0Var);
                                    tc1Var.f0[3].N(18, false, false);
                                }
                                tc1Var.a.d();
                            }
                        } else {
                            tc1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i19 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.a.setAnimation(bi0Var2);
                                }
                                tc1Var.f0[3].T(false, 0.0f);
                                tc1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(org.telegram.messenger.i0.L(220.0f));
        this.b.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        this.b.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(this.b, org.telegram.ui.ActionBar.t6.Gi, null);
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(org.telegram.messenger.i0.o());
        this.b.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 24.0f));
        final int i19 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
            public final /* synthetic */ tc1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i19;
                int i172 = 1;
                tc1 tc1Var = this.b;
                switch (i162) {
                    case 0:
                        tc1Var.G0();
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        break;
                    case 2:
                        tc1.Z(tc1Var);
                        break;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i182 = tc1Var.O;
                            if (i182 != 0) {
                                if (i182 != 3) {
                                    if (i182 == 2) {
                                        tc1Var.E0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.T = L02;
                                    x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    tc1Var.showDialog(x1Var2);
                                    TextView textView22 = (TextView) x1Var2.d(-1);
                                    if (textView22 != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i172));
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        tc1Var.G0();
                        break;
                    default:
                        int i192 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.n.getTransformationMethod() == null) {
                            tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.a.setAnimation(bi0Var);
                                    tc1Var.f0[3].N(18, false, false);
                                }
                                tc1Var.a.d();
                            }
                        } else {
                            tc1Var.n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                tc1Var.f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.a.setAnimation(bi0Var2);
                                }
                                tc1Var.f0[3].T(false, 0.0f);
                                tc1Var.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        break;
                }
            }
        });
        if (i15 == 6 || i15 == 7 || i15 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(org.telegram.messenger.i0.o());
            this.c.setTextSize(1, 18.0f);
        }
        switch (i15) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                uc1 uc1Var = new uc1(this, context);
                oj0 oj0Var = new oj0(this, context, uc1Var, i13);
                oj0Var.addView(uc1Var);
                q9 q9Var = new q9(this, context, oj0Var);
                sc1 sc1Var = new sc1(this, context);
                this.y = sc1Var;
                sc1Var.setVerticalScrollBarEnabled(false);
                uc1Var.addView(this.y, w7.b6.c(-1.0f, -1));
                uc1Var.addView(this.h, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                uc1Var.addView(this.c0, org.telegram.ui.Components.f10.b());
                q9Var.addView(oj0Var, w7.b6.c(-1.0f, -1));
                u71 u71Var = new u71(this, context, i16);
                u71Var.setOrientation(1);
                this.y.addView(u71Var, w7.b6.x(-1, -1, 51));
                u71Var.addView(this.a, w7.b6.t(-2, -2, 49, 0, 69, 0, 0));
                u71Var.addView(this.c, w7.b6.t(-2, -2, 49, 0, 8, 0, 0));
                u71Var.addView(this.d, w7.b6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
                this.s = ec0Var;
                ec0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.i0.L(16.0f);
                this.n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i20 = org.telegram.ui.ActionBar.t6.l6;
                org.telegram.ui.ActionBar.a7.w(editTextBoldCursor2, i20, null);
                org.telegram.ui.ActionBar.a7.V(this.n, i12, null);
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ic1
                    public final /* synthetic */ tc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i21, KeyEvent keyEvent) {
                        switch (i13) {
                            case 0:
                                tc1 tc1Var = this.b;
                                tc1Var.getClass();
                                if (i21 == 5 || i21 == 6) {
                                    tc1Var.G0();
                                    break;
                                }
                                break;
                            default:
                                tc1 tc1Var2 = this.b;
                                tc1Var2.getClass();
                                if (i21 == 5 || i21 == 6) {
                                    if (tc1Var2.w.getVisibility() == 0) {
                                        tc1Var2.r.requestFocus();
                                    } else {
                                        tc1Var2.G0();
                                    }
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                });
                this.s.e(this.n);
                final int i21 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.jc1
                    public final /* synthetic */ tc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.Components.ec0 ec0Var2 = this.b.w;
                                float f7 = z10 ? 1.0f : 0.0f;
                                ec0Var2.b(f7, f7, true);
                                break;
                            case 1:
                                tc1 tc1Var = this.b;
                                if (!z10) {
                                    tc1Var.getClass();
                                    break;
                                } else {
                                    tc1Var.e0.setEditText((EditText) view);
                                    tc1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.ec0 ec0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                ec0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, w7.b6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(this, context, 4);
                this.E = g0Var;
                g0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(org.telegram.messenger.cd.L0(2131743957, null));
                org.telegram.ui.ActionBar.g0 g0Var2 = this.E;
                int i22 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.ActionBar.a7.R(g0Var2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i22, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i22), null);
                org.telegram.ui.ActionBar.a7.t(this.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.i0.Y3(this.E, false, 0.1f, true, false);
                final int i23 = 6;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
                    public final /* synthetic */ tc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162 = i23;
                        int i172 = 1;
                        tc1 tc1Var = this.b;
                        switch (i162) {
                            case 0:
                                tc1Var.G0();
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                                String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                                tc1Var.showDialog(x1Var);
                                break;
                            case 2:
                                tc1.Z(tc1Var);
                                break;
                            case 3:
                                if (tc1Var.h.getAlpha() >= 0.5f) {
                                    int i182 = tc1Var.O;
                                    if (i182 != 0) {
                                        if (i182 != 3) {
                                            if (i182 == 2) {
                                                tc1Var.E0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                            String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                            x1Var2.T = L02;
                                            x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                            tc1Var.showDialog(x1Var2);
                                            TextView textView22 = (TextView) x1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        tc1Var.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = tc1Var.a0;
                                        tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i172));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (tc1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = tc1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = tc1Var.G;
                                    tc1Var.presentFragment(twoStepVerificationActivity, true);
                                    qa0 qa0Var = tc1Var.j0;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        tc1Var.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                tc1Var.G0();
                                break;
                            default:
                                int i192 = tc1Var.O;
                                tc1Var.M = true;
                                if (tc1Var.n.getTransformationMethod() == null) {
                                    tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                        tc1Var.f0[3].P(-1);
                                        org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var = tc1Var.f0[3];
                                        if (animatedDrawable != bi0Var) {
                                            tc1Var.a.setAnimation(bi0Var);
                                            tc1Var.f0[3].N(18, false, false);
                                        }
                                        tc1Var.a.d();
                                    }
                                } else {
                                    tc1Var.n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                        tc1Var.f0[3].P(18);
                                        org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                        if (animatedDrawable2 != bi0Var2) {
                                            tc1Var.a.setAnimation(bi0Var2);
                                        }
                                        tc1Var.f0[3].T(false, 0.0f);
                                        tc1Var.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = tc1Var.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                tc1Var.M = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.b6.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new qc1(this, 2));
                this.s.addView(linearLayout, w7.b6.c(-2.0f, -1));
                u71Var.addView(this.s, w7.b6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new org.telegram.ui.Components.ec0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.i0.L(16.0f);
                this.r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.a7.w(this.r, i20, null);
                org.telegram.ui.ActionBar.a7.V(this.r, i12, null);
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                final int i24 = 0;
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ic1
                    public final /* synthetic */ tc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i212, KeyEvent keyEvent) {
                        switch (i24) {
                            case 0:
                                tc1 tc1Var = this.b;
                                tc1Var.getClass();
                                if (i212 == 5 || i212 == 6) {
                                    tc1Var.G0();
                                    break;
                                }
                                break;
                            default:
                                tc1 tc1Var2 = this.b;
                                tc1Var2.getClass();
                                if (i212 == 5 || i212 == 6) {
                                    if (tc1Var2.w.getVisibility() == 0) {
                                        tc1Var2.r.requestFocus();
                                    } else {
                                        tc1Var2.G0();
                                    }
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.jc1
                    public final /* synthetic */ tc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i24) {
                            case 0:
                                org.telegram.ui.Components.ec0 ec0Var2 = this.b.w;
                                float f7 = z10 ? 1.0f : 0.0f;
                                ec0Var2.b(f7, f7, true);
                                break;
                            case 1:
                                tc1 tc1Var = this.b;
                                if (!z10) {
                                    tc1Var.getClass();
                                    break;
                                } else {
                                    tc1Var.e0.setEditText((EditText) view);
                                    tc1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.ec0 ec0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                ec0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                this.w.addView(this.r, w7.b6.c(-2.0f, -1));
                u71Var.addView(this.w, w7.b6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(context);
                this.e0 = lrVar;
                lrVar.setVisibility(8);
                oj0Var.addView(this.e0);
                uc0 uc0Var = new uc0(this, context, 3);
                this.x = uc0Var;
                final int i25 = 1;
                uc0Var.b(6, 1);
                bs[] bsVarArr = this.x.f;
                int length = bsVarArr.length;
                int i26 = 0;
                while (i26 < length) {
                    bs bsVar = bsVarArr[i26];
                    bsVar.setShowSoftInputOnFocusCompat((z0() ? 1 : 0) ^ i25);
                    bsVar.addTextChangedListener(new qc1(this, 0));
                    bsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.jc1
                        public final /* synthetic */ tc1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i25) {
                                case 0:
                                    org.telegram.ui.Components.ec0 ec0Var2 = this.b.w;
                                    float f7 = z10 ? 1.0f : 0.0f;
                                    ec0Var2.b(f7, f7, true);
                                    break;
                                case 1:
                                    tc1 tc1Var = this.b;
                                    if (!z10) {
                                        tc1Var.getClass();
                                        break;
                                    } else {
                                        tc1Var.e0.setEditText((EditText) view);
                                        tc1Var.e0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.ec0 ec0Var3 = this.b.s;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    ec0Var3.b(f10, f10, true);
                                    break;
                            }
                        }
                    });
                    i26++;
                    i25 = 1;
                }
                this.x.setVisibility(8);
                u71Var.addView(this.x, w7.b6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                u71Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.b6.e(-2, -2, 49));
                if (i15 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    org.telegram.ui.ActionBar.a7.V(textView5, org.telegram.ui.ActionBar.t6.J6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    this.f.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
                    this.f.setText(org.telegram.messenger.cd.L0(2131746093, null));
                    u71Var.addView(this.f, w7.b6.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i27 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
                        public final /* synthetic */ tc1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i27;
                            int i172 = 1;
                            tc1 tc1Var = this.b;
                            switch (i162) {
                                case 0:
                                    tc1Var.G0();
                                    break;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                                    String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                                    tc1Var.showDialog(x1Var);
                                    break;
                                case 2:
                                    tc1.Z(tc1Var);
                                    break;
                                case 3:
                                    if (tc1Var.h.getAlpha() >= 0.5f) {
                                        int i182 = tc1Var.O;
                                        if (i182 != 0) {
                                            if (i182 != 3) {
                                                if (i182 == 2) {
                                                    tc1Var.E0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                                String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                                x1Var2.T = L02;
                                                x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                                tc1Var.showDialog(x1Var2);
                                                TextView textView22 = (TextView) x1Var2.d(-1);
                                                if (textView22 != null) {
                                                    org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.q7, null);
                                                    break;
                                                }
                                            }
                                        } else {
                                            tc1Var.B0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = tc1Var.a0;
                                            tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i172));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (tc1Var.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = tc1Var.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = tc1Var.G;
                                        tc1Var.presentFragment(twoStepVerificationActivity, true);
                                        qa0 qa0Var = tc1Var.j0;
                                        if (qa0Var != null) {
                                            org.telegram.messenger.i0.g3(qa0Var);
                                            tc1Var.j0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    tc1Var.G0();
                                    break;
                                default:
                                    int i192 = tc1Var.O;
                                    tc1Var.M = true;
                                    if (tc1Var.n.getTransformationMethod() == null) {
                                        tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                                        if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                            tc1Var.f0[3].P(-1);
                                            org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.bi0 bi0Var = tc1Var.f0[3];
                                            if (animatedDrawable != bi0Var) {
                                                tc1Var.a.setAnimation(bi0Var);
                                                tc1Var.f0[3].N(18, false, false);
                                            }
                                            tc1Var.a.d();
                                        }
                                    } else {
                                        tc1Var.n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                                        if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                            tc1Var.f0[3].P(18);
                                            org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                            if (animatedDrawable2 != bi0Var2) {
                                                tc1Var.a.setAnimation(bi0Var2);
                                            }
                                            tc1Var.f0[3].T(false, 0.0f);
                                            tc1Var.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = tc1Var.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    tc1Var.M = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = q9Var;
                kg.f0 f0Var = new kg.f0(this, context);
                this.D = f0Var;
                f0Var.setAlpha(0.0f);
                q9Var.addView(this.D);
                q9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.i0.L(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l6, false));
                uc1Var.addView(this.L, w7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                jf.g gVar = new jf.g(this, context, i18);
                gVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i13));
                gVar.addView(this.actionBar);
                gVar.addView(this.a);
                gVar.addView(this.c);
                gVar.addView(this.d);
                gVar.addView(this.b);
                this.fragmentView = gVar;
                break;
        }
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.fragmentView, null);
        switch (i15) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747226, null));
                    this.c.setText(org.telegram.messenger.cd.L0(2131747226, null));
                } else {
                    String L0 = org.telegram.messenger.cd.L0(i15 == 0 ? 2131751706 : 2131746428, null);
                    this.actionBar.setTitle(L0);
                    this.c.setText(L0);
                }
                if (!TextUtils.isEmpty(this.a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.cd.L0(2131742842, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(org.telegram.messenger.cd.L0(i15 == 0 ? 2131751117 : 2131746428, null));
                this.n.setContentDescription(org.telegram.messenger.cd.L0(i15 == 0 ? 2131751117 : 2131746428, null));
                this.n.setImeOptions(268435461);
                this.n.setInputType(org.telegram.messenger.zs.N1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.F = i15 == 0;
                org.telegram.messenger.i0.Y3(this.E, false, 0.1f, true, false);
                org.telegram.ui.Components.bi0[] bi0VarArr = new org.telegram.ui.Components.bi0[7];
                this.f0 = bi0VarArr;
                bi0VarArr[0] = new org.telegram.ui.Components.bi0(R.raw.tsv_setup_monkey_idle1, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f0[1] = new org.telegram.ui.Components.bi0(R.raw.tsv_setup_monkey_idle2, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f0[2] = new org.telegram.ui.Components.bi0(R.raw.tsv_monkey_close, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f0[3] = new org.telegram.ui.Components.bi0(R.raw.tsv_setup_monkey_peek, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f0[4] = new org.telegram.ui.Components.bi0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f0[5] = new org.telegram.ui.Components.bi0(R.raw.tsv_setup_monkey_close_and_peek, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f0[6] = new org.telegram.ui.Components.bi0(R.raw.tsv_setup_monkey_tracking, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                org.telegram.ui.Components.bi0 bi0Var = this.f0[6];
                bi0Var.h = true;
                bi0Var.P(19);
                this.f0[2].S(97, this.i0);
                J0(true);
                if (!(i15 == 1)) {
                    EditTextBoldCursor editTextBoldCursor4 = this.n;
                    ArrayList arrayList = editTextBoldCursor4.f1;
                    int size = arrayList.size();
                    int i28 = 0;
                    while (i28 < size) {
                        Object obj = arrayList.get(i28);
                        i28++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.onTextChanged(editTextBoldCursor4.getText(), 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.afterTextChanged(editTextBoldCursor4.getText());
                    }
                    i10 = 1;
                    J0(true);
                    break;
                } else {
                    kc1 kc1Var = this.g0;
                    if (kc1Var != null) {
                        org.telegram.messenger.i0.r(kc1Var);
                    }
                    this.a.setAnimation(this.f0[6]);
                    this.a.d();
                    i10 = 1;
                    break;
                }
            case 2:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747460, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.cd.L0(2131742842, null));
                this.c.setText(org.telegram.messenger.cd.L0(2131747460, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131747459, null));
                this.d.setVisibility(0);
                this.s.setText(org.telegram.messenger.cd.L0(2131747458, null));
                this.n.setContentDescription(org.telegram.messenger.cd.L0(2131747458, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131746359, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (this.Z) {
                    r12 = 0;
                } else {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.cd.L0(2131742842, null));
                }
                this.c.setText(org.telegram.messenger.cd.L0(2131746359, r12));
                this.d.setText(org.telegram.messenger.cd.L0(2131746360, r12));
                this.d.setVisibility(0);
                this.s.setText(org.telegram.messenger.cd.L0(2131747392, r12));
                this.n.setContentDescription(org.telegram.messenger.cd.L0(2131747392, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, 120, 120, r12);
                this.a.d();
                i10 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747453, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(org.telegram.messenger.cd.L0(2131747453, null));
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
                    org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                    yz0Var.a |= 256;
                    yz0Var.b = indexOf;
                    int i29 = lastIndexOf + 1;
                    yz0Var.c = i29;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i29, 0);
                }
                nh.p pVar2 = this.d;
                String L02 = org.telegram.messenger.cd.L0(2131746097, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                pVar2.setText(org.telegram.messenger.i0.m0(L02, charSequenceArr));
                this.d.setVisibility(r92);
                this.c0.e(r92, r92);
                this.x.setVisibility(r92);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131743645, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(org.telegram.messenger.cd.L0(2131743645, null));
                this.s.setVisibility(8);
                this.e0.setVisibility(0);
                nh.p pVar3 = this.d;
                String str3 = this.U.email_unconfirmed_pattern;
                pVar3.setText(org.telegram.messenger.cd.a0("EmailPasswordConfirmText2", null, 2131751200, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.cd.L0(2131746138, null));
                final int i30 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hc1
                    public final /* synthetic */ tc1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162 = i30;
                        int i172 = 1;
                        tc1 tc1Var = this.b;
                        switch (i162) {
                            case 0:
                                tc1Var.G0();
                                break;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                                String L03 = org.telegram.messenger.cd.L0(2131746110, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L03;
                                x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                                tc1Var.showDialog(x1Var);
                                break;
                            case 2:
                                tc1.Z(tc1Var);
                                break;
                            case 3:
                                if (tc1Var.h.getAlpha() >= 0.5f) {
                                    int i182 = tc1Var.O;
                                    if (i182 != 0) {
                                        if (i182 != 3) {
                                            if (i182 == 2) {
                                                tc1Var.E0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                            String L022 = org.telegram.messenger.cd.L0(2131742840, null);
                                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                            x1Var2.T = L022;
                                            x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                            tc1Var.showDialog(x1Var2);
                                            TextView textView22 = (TextView) x1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        tc1Var.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = tc1Var.a0;
                                        tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, i172));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (tc1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = tc1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = tc1Var.G;
                                    tc1Var.presentFragment(twoStepVerificationActivity, true);
                                    qa0 qa0Var = tc1Var.j0;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        tc1Var.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                tc1Var.G0();
                                break;
                            default:
                                int i192 = tc1Var.O;
                                tc1Var.M = true;
                                if (tc1Var.n.getTransformationMethod() == null) {
                                    tc1Var.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                        tc1Var.f0[3].P(-1);
                                        org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f0[3];
                                        if (animatedDrawable != bi0Var2) {
                                            tc1Var.a.setAnimation(bi0Var2);
                                            tc1Var.f0[3].N(18, false, false);
                                        }
                                        tc1Var.a.d();
                                    }
                                } else {
                                    tc1Var.n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i192 == 0 && tc1Var.n.length() > 0 && tc1Var.n.hasFocus()) {
                                        tc1Var.f0[3].P(18);
                                        org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var22 = tc1Var.f0[3];
                                        if (animatedDrawable2 != bi0Var22) {
                                            tc1Var.a.setAnimation(bi0Var22);
                                        }
                                        tc1Var.f0[3].T(false, 0.0f);
                                        tc1Var.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = tc1Var.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                tc1Var.M = false;
                                break;
                        }
                    }
                });
                this.x.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 6:
                this.c.setText(org.telegram.messenger.cd.L0(2131743956, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131745565, null));
                this.b.setText(org.telegram.messenger.cd.L0(2131743958, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, org.telegram.messenger.zs.W1, org.telegram.messenger.zs.W1, null);
                this.a.d();
                i10 = 1;
                break;
            case 7:
                this.c.setText(org.telegram.messenger.cd.L0(2131743960, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131743959, null));
                if (this.Y) {
                    this.b.setText(org.telegram.messenger.cd.L0(2131743962, null));
                } else if (this.H) {
                    this.b.setText(org.telegram.messenger.cd.L0(2131751771, null));
                } else {
                    this.b.setText(org.telegram.messenger.cd.L0(2131743961, null));
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, org.telegram.messenger.zs.q2, org.telegram.messenger.zs.q2, null);
                this.a.d();
                i10 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747232, null));
                this.c.setText(org.telegram.messenger.cd.L0(2131747232, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(org.telegram.messenger.cd.L0(2131750592, null));
                org.telegram.ui.ActionBar.a7.V(this.e, org.telegram.ui.ActionBar.t6.o6, null);
                this.s.setText(org.telegram.messenger.cd.L0(2131748737, null));
                this.n.setContentDescription(org.telegram.messenger.cd.L0(2131748737, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(org.telegram.messenger.zs.N1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 9:
                this.c.setText(org.telegram.messenger.cd.L0(2131752159, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131752158, null));
                this.b.setText(org.telegram.messenger.cd.L0(2131752161, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, org.telegram.messenger.zs.W1, org.telegram.messenger.zs.W1, null);
                this.a.d();
                i10 = 1;
                break;
            default:
                i10 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new qc1(this, i10));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.k2 k2Var : getParentLayout().getFragmentStack()) {
            if (k2Var != this && (k2Var instanceof tc1)) {
                ((org.telegram.ui.Components.h61) ((tc1) k2Var).b0.b).b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hideKeyboardOnShow() {
        int i10 = this.O;
        return i10 == 7 || i10 == 9;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z10) {
                finishFragment();
            }
            return true;
        }
        if (!z10) {
            return false;
        }
        M0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i10 = this.O;
            if (i10 == 2 && org.telegram.messenger.i0.O1()) {
                this.a.setVisibility(8);
            } else if (i10 != 6 && i10 != 9 && i10 != 7) {
                org.telegram.ui.Components.ei0 ei0Var = this.a;
                Point point = org.telegram.messenger.i0.q;
                ei0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.lr lrVar = this.e0;
        if (lrVar != null) {
            lrVar.setVisibility(z0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        kc1 kc1Var = this.g0;
        if (kc1Var != null) {
            org.telegram.messenger.i0.r(kc1Var);
            this.g0 = null;
        }
        if (this.f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.bi0[] bi0VarArr = this.f0;
                if (i10 >= bi0VarArr.length) {
                    break;
                }
                bi0VarArr[i10].C(false);
                i10++;
            }
            this.f0 = null;
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
        if (z0()) {
            org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        this.S = false;
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        if (z0()) {
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.i0.v1(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.v21 v21Var = this.d0;
            if (v21Var != null) {
                v21Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.n != null && !z0()) {
                org.telegram.messenger.i0.h3(new kc1(this, 2), 200L);
            }
            uc0 uc0Var = this.x;
            if (uc0Var == null || uc0Var.getVisibility() != 0) {
                return;
            }
            org.telegram.messenger.i0.h3(new kc1(this, 3), 200L);
        }
    }

    public final void y0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            uc0 uc0Var = this.x;
            bs[] bsVarArr = uc0Var.f;
            if (i10 >= bsVarArr.length) {
                uc0Var.postDelayed(new t11(19, this, runnable), (bsVarArr.length * 75) + 350);
                return;
            } else {
                bs bsVar = bsVarArr[i10];
                bsVar.postDelayed(new nj0(bsVar, 1), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean z0() {
        int i10 = this.O;
        if ((i10 != 5 && i10 != 4) || org.telegram.messenger.i0.Q1()) {
            return false;
        }
        Point point = org.telegram.messenger.i0.q;
        return point.x < point.y && !org.telegram.messenger.i0.C1();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle g10 = a1.g.g("afterSignup", true);
            pf0 pf0Var = new pf0();
            pf0Var.q0(g10);
            presentFragment(pf0Var, true);
            return;
        }
        super.finishFragment();
    }

    public tc1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new kc1(this, 0);
        this.i0 = new kc1(this, 1);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new mc1(this, 0), 10);
        } else {
            this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void F0() {
    }
}
