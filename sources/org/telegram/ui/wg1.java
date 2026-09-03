package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class wg1 extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.ActionBar.l0 B;
    public boolean C;
    public int D;
    public boolean E;
    public AnimatorSet F;
    public final ArrayList G;
    public AnimatorSet H;
    public RadialProgressView I;
    public boolean J;
    public boolean K;
    public final int L;
    public String M;
    public String N;
    public String O;
    public boolean P;
    public boolean Q;
    public TL_account.Password R;
    public byte[] S;
    public long T;
    public byte[] U;
    public boolean V;
    public boolean W;
    public String X;
    public n7.qa Y;
    public org.telegram.ui.Components.a20 Z;
    public org.telegram.ui.Components.jj0 a;
    public org.telegram.ui.Components.e31 a0;
    public TextView b;
    public org.telegram.ui.Components.rr b0;
    public TextView c;
    public org.telegram.ui.Components.gj0[] c0;
    public ih.s d;
    public ng1 d0;
    public TextView e;
    public final Runnable e0;
    public TextView f;
    public final Runnable f0;
    public sb0 g0;
    public TextView h;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.bd0 s;
    public org.telegram.ui.Components.bd0 v;
    public xd0 w;
    public vg1 x;
    public eg.i0 y;

    public wg1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.C = false;
        this.D = -1;
        this.G = new ArrayList();
        this.S = new byte[0];
        this.e0 = new ng1(this, 2);
        this.f0 = new ng1(this, 3);
        this.currentAccount = i10;
        this.L = i11;
        this.R = password;
        this.Q = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.R == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new og1(this, 0), 10);
            }
        }
    }

    public static void U(wg1 wg1Var, TLObject tLObject, boolean z4, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = wg1Var.R;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(wg1Var.S, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z4 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = wg1Var.R.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        }
        jh.g gVar = new jh.g(wg1Var, bArr, str, passwordinputsettings, z4, 4);
        if (z4) {
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(tLObject, gVar, 10);
            return;
        }
        if (str != null && (bArr3 = wg1Var.U) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = wg1Var.R.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(wg1Var.U, 0, bArr6, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = wg1Var.T;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = wg1Var.R.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            gVar.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                gVar.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(tLObject, gVar, 10);
    }

    public static void V(wg1 wg1Var) {
        ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new nh.p5(4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        wg1Var.showDialog(alertDialog$Builder.a);
    }

    public static void W(wg1 wg1Var, byte[] bArr) {
        ArrayList arrayList = wg1Var.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = wg1Var.R;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = wg1Var.R;
        if (bArr == null) {
            bArr = wg1Var.S;
        }
        twoStepVerificationActivity.v0(password2, bArr, wg1Var.T, wg1Var.U);
        twoStepVerificationActivity.U = wg1Var.D;
        wg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        sb0 sb0Var = wg1Var.g0;
        if (sb0Var != null) {
            AndroidUtilities.runOnUIThread(sb0Var);
            wg1Var.g0 = null;
        }
    }

    public static void X(wg1 wg1Var) {
        ArrayList arrayList = wg1Var.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(wg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = wg1Var.S;
        TL_account.Password password = wg1Var.R;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, wg1Var.O, wg1Var.N, null, wg1Var.M);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = wg1Var.R;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, wg1Var.S, wg1Var.T, wg1Var.U);
        twoStepVerificationActivity.U = wg1Var.D;
        wg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        sb0 sb0Var = wg1Var.g0;
        if (sb0Var != null) {
            AndroidUtilities.runOnUIThread(sb0Var);
            wg1Var.g0 = null;
        }
    }

    public static /* synthetic */ void Y(wg1 wg1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = wg1Var.R.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        ub0 ub0Var = new ub0(29, wg1Var, x10);
        TL_account.Password password = wg1Var.R;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            ub0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(getpasswordsettings, ub0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        ub0Var.run(null, tL_error2);
    }

    public static void Z(wg1 wg1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new og1(wg1Var, 4), 8);
            return;
        }
        wg1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            wg1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            wg1Var.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
            wg1Var.z0(wg1Var.s, wg1Var.n, true);
            wg1Var.H0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            wg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            wg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
        }
    }

    public static /* synthetic */ void a0(wg1 wg1Var) {
        ArrayList arrayList = wg1Var.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        wg1Var.finishFragment();
    }

    public static /* synthetic */ void b0(wg1 wg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            wg1Var.R = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.z4.x0(wg1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            wg1Var.Q = !TextUtils.isEmpty(wg1Var.R.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(wg1Var.R);
            if (!wg1Var.P && wg1Var.V) {
                TL_account.Password password2 = wg1Var.R;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!wg1Var.Q && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        wg1Var.finishFragment();
                    }
                }
            }
            if (wg1Var.K) {
                wg1Var.w0();
                wg1Var.C0();
            }
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        }
    }

    public static /* synthetic */ void c0(wg1 wg1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            wg1Var.R = password;
            TwoStepVerificationActivity.m0(password);
            wg1Var.E0(z4);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        }
    }

    public static void d0(wg1 wg1Var, TLRPC.TL_error tL_error, boolean z4, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = wg1Var.G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.zd(11, wg1Var, z4), 8);
            return;
        }
        wg1Var.w0();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        wg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        wg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        wg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(wg1Var.currentAccount);
                int i11 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = wg1Var.R;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = wg1Var.O;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, wg1Var.N, str2, wg1Var.M);
                TL_account.Password password3 = wg1Var.R;
                password3.email_unconfirmed_pattern = wg1Var.O;
                wg1 wg1Var2 = new wg1(5, password3);
                wg1Var2.E = wg1Var.E;
                wg1Var2.D0(bArr != null ? bArr : wg1Var.S, wg1Var.T, wg1Var.U, wg1Var.W);
                wg1Var2.V = wg1Var.V;
                wg1Var2.D = wg1Var.D;
                wg1Var.presentFragment(wg1Var2, true);
                return;
            }
            return;
        }
        wg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z4) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((org.telegram.ui.ActionBar.p2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            wg1Var.finishFragment();
            return;
        }
        if (wg1Var.getParentActivity() == null) {
            return;
        }
        if (wg1Var.R.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new vl0(26, wg1Var, bArr));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            if (str == null && (password = wg1Var.R) != null && password.has_password) {
                d2Var.Q = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            d2Var.O = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = wg1Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i13)).removeSelfFromStack();
        }
        TL_account.Password password4 = wg1Var.R;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (wg1Var.V) {
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        wg1 wg1Var3 = new wg1(7, wg1Var.R);
        wg1Var3.E = wg1Var.E;
        wg1Var3.D0(bArr != null ? bArr : wg1Var.S, wg1Var.T, wg1Var.U, wg1Var.W);
        wg1Var3.V = wg1Var.V;
        wg1Var3.D = wg1Var.D;
        wg1Var.presentFragment(wg1Var3, true);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
    }

    public static void e0(wg1 wg1Var, TLRPC.TL_error tL_error) {
        wg1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = wg1Var.R;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, wg1Var.S, wg1Var.T, wg1Var.U);
            twoStepVerificationActivity.U = wg1Var.D;
            wg1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            sb0 sb0Var = wg1Var.g0;
            if (sb0Var != null) {
                AndroidUtilities.runOnUIThread(sb0Var);
                wg1Var.g0 = null;
            }
        }
    }

    public static void f0(wg1 wg1Var) {
        ArrayList arrayList = wg1Var.G;
        int i10 = 4;
        if (wg1Var.R.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new mg1(wg1Var, i10));
            boolean z4 = wg1Var.R.has_recovery;
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            if (z4) {
                d2Var.Q = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                d2Var.Q = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            d2Var.O = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = wg1Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i11)).removeSelfFromStack();
        }
        TL_account.Password password = wg1Var.R;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        wg1 wg1Var2 = new wg1(7, password);
        wg1Var2.E = wg1Var.E;
        wg1Var2.D0(wg1Var.S, wg1Var.T, wg1Var.U, wg1Var.W);
        wg1Var2.G.addAll(arrayList);
        wg1Var2.V = wg1Var.V;
        wg1Var2.D = wg1Var.D;
        wg1Var.presentFragment(wg1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(wg1Var.currentAccount);
        int i12 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = wg1Var.S;
        TL_account.Password password2 = wg1Var.R;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, wg1Var.O, wg1Var.N, null, wg1Var.M);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
    }

    public static void g0(wg1 wg1Var, String str) {
        wg1 wg1Var2 = new wg1(wg1Var.currentAccount, 0, wg1Var.R);
        wg1Var2.E = wg1Var.E;
        wg1Var2.G.addAll(wg1Var.G);
        wg1Var2.G.add(wg1Var);
        wg1Var2.X = str;
        wg1Var2.D = wg1Var.D;
        wg1Var.presentFragment(wg1Var2, true);
    }

    public static /* synthetic */ void h0(wg1 wg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            wg1Var.R = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
            wg1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.R;
        if (password.has_recovery) {
            this.O = "";
            E0(false);
            return;
        }
        wg1 wg1Var = new wg1(this.currentAccount, 3, password);
        wg1Var.E = this.E;
        wg1Var.D0(this.S, this.T, this.U, this.W);
        wg1Var.M = this.M;
        wg1Var.N = this.N;
        wg1Var.G.addAll(this.G);
        wg1Var.G.add(this);
        wg1Var.V = this.V;
        wg1Var.D = this.D;
        presentFragment(wg1Var);
    }

    public final void C0() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.L) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    z0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.M) || this.L != 1) {
                    wg1 wg1Var = new wg1(this.currentAccount, this.L != 0 ? 2 : 1, this.R);
                    wg1Var.E = this.E;
                    wg1Var.M = this.n.getText().toString();
                    wg1Var.D0(this.S, this.T, this.U, this.W);
                    wg1Var.X = this.X;
                    wg1Var.G.addAll(this.G);
                    wg1Var.G.add(this);
                    wg1Var.V = this.V;
                    wg1Var.D = this.D;
                    presentFragment(wg1Var);
                    break;
                } else {
                    AndroidUtilities.shakeViewSpring(this.s, 5.0f);
                    try {
                        this.s.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            case 2:
                String obj = this.n.getText().toString();
                this.N = obj;
                if (!obj.equalsIgnoreCase(this.M)) {
                    A0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    z0(this.s, this.n, false);
                    break;
                }
            case 3:
                if (!this.W && this.h.getAlpha() < 1.0f) {
                    this.h.animate().cancel();
                    this.h.animate().alpha(1.0f).start();
                }
                String obj2 = this.n.getText().toString();
                this.O = obj2;
                if (obj2 != null && obj2.length() >= 3) {
                    int lastIndexOf = obj2.lastIndexOf(46);
                    int lastIndexOf2 = obj2.lastIndexOf(64);
                    if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                        E0(false);
                        break;
                    }
                }
                z0(this.s, this.n, false);
                break;
            case 4:
                String code = this.w.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new ub0(28, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.w.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new og1(this, 2), 10);
                x0();
                break;
            case 6:
                TL_account.Password password = this.R;
                if (password != null) {
                    wg1 wg1Var2 = new wg1(this.currentAccount, 0, password);
                    wg1Var2.E = this.E;
                    wg1Var2.V = this.V;
                    wg1Var2.D = this.D;
                    presentFragment(wg1Var2, true);
                    break;
                } else {
                    x0();
                    this.K = true;
                    break;
                }
            case 7:
                if (!this.V) {
                    if (!this.E) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.R, this.S, this.T, this.U);
                        twoStepVerificationActivity.U = this.D;
                        presentFragment(twoStepVerificationActivity, true);
                        sb0 sb0Var = this.g0;
                        if (sb0Var != null) {
                            AndroidUtilities.runOnUIThread(sb0Var);
                            this.g0 = null;
                            break;
                        }
                    } else {
                        Bundle i10 = android.support.v4.media.a.i("afterSignup", true);
                        xg0 xg0Var = new xg0();
                        xg0Var.l0(i10);
                        presentFragment(xg0Var, true);
                        break;
                    }
                } else {
                    finishFragment();
                    break;
                }
                break;
            case 8:
                if (this.R != null) {
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() != 0) {
                        byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                        x0();
                        Utilities.globalQueue.postRunnable(new pg1(this, stringBytes, 0));
                        break;
                    } else {
                        z0(this.s, this.n, false);
                        break;
                    }
                } else {
                    x0();
                    this.K = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z4) {
        this.S = bArr;
        this.U = bArr2;
        this.T = j10;
        this.W = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(boolean z4) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z4 && this.Q && this.R.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new og1(this, 3));
            return;
        }
        String str = this.M;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z4) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.U = null;
            if (this.Q) {
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
            if (this.N == null && (password = this.R) != null) {
                this.N = password.hint;
            }
            if (this.N == null) {
                this.N = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.N;
                passwordinputsettings.new_algo = this.R.new_algo;
            }
            if (this.O.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.O.trim();
            }
        }
        if (this.X != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.X;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.S;
            if (bArr == null || bArr.length == 0 || (z4 && this.Q)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        x0();
        Utilities.globalQueue.postRunnable(new gg.j(this, updatepasswordsettings3, z4, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.i0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z4) {
        if (this.L != 0) {
            return;
        }
        ng1 ng1Var = this.d0;
        if (ng1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ng1Var);
        }
        org.telegram.ui.Components.gj0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z4) {
            org.telegram.ui.Components.gj0[] gj0VarArr = this.c0;
            if (animatedDrawable != gj0VarArr[0]) {
                if (animatedDrawable != gj0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    ng1 ng1Var2 = new ng1(this, 4);
                    this.d0 = ng1Var2;
                    AndroidUtilities.runOnUIThread(ng1Var2, Utilities.random.nextInt(2000) + 5000);
                }
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            this.a.setAnimation(this.c0[0]);
            this.c0[0].Q(0.0f, true);
        } else {
            this.a.setAnimation(this.c0[1]);
            this.c0[1].Q(0.0f, true);
        }
        if (!z4) {
            this.a.d();
        }
        ng1 ng1Var22 = new ng1(this, 4);
        this.d0 = ng1Var22;
        AndroidUtilities.runOnUIThread(ng1Var22, Utilities.random.nextInt(2000) + 5000);
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void H0(boolean z4) {
        if (z4 == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z4 ? 1 : null);
        this.F = new AnimatorSet();
        int i10 = 3;
        if (z4) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.F;
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
            AnimatorSet animatorSet3 = this.F;
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
        this.F.addListener(new s61(i10, this, z4));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.Q = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.D, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new mg1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ug1(this));
        final int i13 = 1;
        int i14 = this.L;
        if (i14 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.Z = a20Var;
        this.Y = new n7.qa(a20Var);
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
            public final /* synthetic */ wg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        wg1 wg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        break;
                    case 2:
                        wg1.V(this.b);
                        break;
                    case 3:
                        wg1 wg1Var2 = this.b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i15 = wg1Var2.L;
                            if (i15 != 0) {
                                if (i15 != 3) {
                                    if (i15 == 2) {
                                        wg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                    wg1Var2.showDialog(d2Var2);
                                    TextView textView = (TextView) d2Var2.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        wg1 wg1Var3 = this.b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.g0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        wg1 wg1Var4 = this.b;
                        int i16 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.n.getTransformationMethod() == null) {
                            wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.a.setAnimation(gj0Var);
                                    wg1Var4.c0[3].L(18, false, false);
                                }
                                wg1Var4.a.d();
                            }
                        } else {
                            wg1Var4.n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.a.setAnimation(gj0Var2);
                                }
                                wg1Var4.c0[3].Q(0.0f, false);
                                wg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(context);
        this.a0 = e31Var;
        e31Var.setTransformType(1);
        this.a0.setProgress(0.0f);
        this.a0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.a0.setDrawBackground(false);
        this.Z.setContentDescription(LocaleController.getString(R.string.Next));
        this.Z.addView(this.a0, k7.b6.e(56, 56, 17));
        this.Z.a(this.a0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        n7.qa.V(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        final int i15 = 3;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
            public final /* synthetic */ wg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        wg1 wg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        break;
                    case 2:
                        wg1.V(this.b);
                        break;
                    case 3:
                        wg1 wg1Var2 = this.b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = wg1Var2.L;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        wg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                    wg1Var2.showDialog(d2Var2);
                                    TextView textView2 = (TextView) d2Var2.d(-1);
                                    if (textView2 != null) {
                                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        wg1 wg1Var3 = this.b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.g0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        wg1 wg1Var4 = this.b;
                        int i16 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.n.getTransformationMethod() == null) {
                            wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.a.setAnimation(gj0Var);
                                    wg1Var4.c0[3].L(18, false, false);
                                }
                                wg1Var4.a.d();
                            }
                        } else {
                            wg1Var4.n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.a.setAnimation(gj0Var2);
                                }
                                wg1Var4.c0[3].Q(0.0f, false);
                                wg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
        this.a = jj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        jj0Var.setScaleType(scaleType);
        if (i14 == 2 && AndroidUtilities.isSmallScreen()) {
            this.a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.jj0 jj0Var2 = this.a;
            Point point = AndroidUtilities.displaySize;
            jj0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.c.setGravity(1);
        this.c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        ih.s sVar = new ih.s(context);
        this.d = sVar;
        int i16 = org.telegram.ui.ActionBar.j6.D6;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        final int i17 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
            public final /* synthetic */ wg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        wg1 wg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        break;
                    case 2:
                        wg1.V(this.b);
                        break;
                    case 3:
                        wg1 wg1Var2 = this.b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = wg1Var2.L;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        wg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                    wg1Var2.showDialog(d2Var2);
                                    TextView textView22 = (TextView) d2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        wg1 wg1Var3 = this.b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.g0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        wg1 wg1Var4 = this.b;
                        int i162 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.n.getTransformationMethod() == null) {
                            wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.a.setAnimation(gj0Var);
                                    wg1Var4.c0[3].L(18, false, false);
                                }
                                wg1Var4.a.d();
                            }
                        } else {
                            wg1Var4.n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.a.setAnimation(gj0Var2);
                                }
                                wg1Var4.c0[3].Q(0.0f, false);
                                wg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.b.setGravity(17);
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        final int i18 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
            public final /* synthetic */ wg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        wg1 wg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        break;
                    case 2:
                        wg1.V(this.b);
                        break;
                    case 3:
                        wg1 wg1Var2 = this.b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = wg1Var2.L;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        wg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                    wg1Var2.showDialog(d2Var2);
                                    TextView textView22 = (TextView) d2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        wg1 wg1Var3 = this.b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.g0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        wg1 wg1Var4 = this.b;
                        int i162 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.n.getTransformationMethod() == null) {
                            wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.a.setAnimation(gj0Var);
                                    wg1Var4.c0[3].L(18, false, false);
                                }
                                wg1Var4.a.d();
                            }
                        } else {
                            wg1Var4.n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                wg1Var4.c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.a.setAnimation(gj0Var2);
                                }
                                wg1Var4.c0[3].Q(0.0f, false);
                                wg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        break;
                }
            }
        });
        if (i14 == 6 || i14 == 7 || i14 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(AndroidUtilities.bold());
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
                n0 n0Var = new n0(this, context, 26);
                org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(this, context, n0Var, 2);
                y90Var.addView(n0Var);
                u9 u9Var = new u9(this, context, y90Var);
                vg1 vg1Var = new vg1(this, context);
                this.x = vg1Var;
                vg1Var.setVerticalScrollBarEnabled(false);
                n0Var.addView(this.x, k7.b6.c(-1.0f, -1));
                n0Var.addView(this.h, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                n0Var.addView(this.Z, org.telegram.ui.Components.a20.b());
                u9Var.addView(y90Var, k7.b6.c(-1.0f, -1));
                pb1 pb1Var = new pb1(this, context, 16);
                pb1Var.setOrientation(1);
                this.x.addView(pb1Var, k7.b6.x(-1, -1, 51));
                pb1Var.addView(this.a, k7.b6.t(-2, -2, 49, 0, 69, 0, 0));
                pb1Var.addView(this.c, k7.b6.t(-2, -2, 49, 0, 8, 0, 0));
                pb1Var.addView(this.d, k7.b6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(context, null);
                this.s = bd0Var;
                bd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i19 = org.telegram.ui.ActionBar.j6.l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kg1
                    public final /* synthetic */ wg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i20, KeyEvent keyEvent) {
                        switch (i13) {
                            case 0:
                                wg1 wg1Var = this.b;
                                wg1Var.getClass();
                                if (i20 != 5 && i20 != 6) {
                                    return false;
                                }
                                wg1Var.C0();
                                return true;
                            default:
                                wg1 wg1Var2 = this.b;
                                wg1Var2.getClass();
                                if (i20 != 5 && i20 != 6) {
                                    return false;
                                }
                                if (wg1Var2.v.getVisibility() == 0) {
                                    wg1Var2.r.requestFocus();
                                } else {
                                    wg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                final int i20 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.lg1
                    public final /* synthetic */ wg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z4) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.Components.bd0 bd0Var2 = this.b.v;
                                float f10 = z4 ? 1.0f : 0.0f;
                                bd0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                wg1 wg1Var = this.b;
                                if (!z4) {
                                    wg1Var.getClass();
                                    break;
                                } else {
                                    wg1Var.b0.setEditText((EditText) view);
                                    wg1Var.b0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.bd0 bd0Var3 = this.b.s;
                                float f11 = z4 ? 1.0f : 0.0f;
                                bd0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, k7.b6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, context, 3);
                this.B = l0Var;
                l0Var.setImageResource(R.drawable.msg_message);
                this.B.setScaleType(scaleType);
                this.B.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.B.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
                this.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.B, false, 0.1f, false);
                final int i21 = 6;
                this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
                    public final /* synthetic */ wg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                wg1 wg1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                d2Var.Q = string;
                                wg1Var.showDialog(d2Var);
                                break;
                            case 2:
                                wg1.V(this.b);
                                break;
                            case 3:
                                wg1 wg1Var2 = this.b;
                                if (wg1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = wg1Var2.L;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                wg1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                            wg1Var2.showDialog(d2Var2);
                                            TextView textView22 = (TextView) d2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        wg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = wg1Var2.X;
                                        wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                wg1 wg1Var3 = this.b;
                                if (wg1Var3.L == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.T = true;
                                    twoStepVerificationActivity.F = wg1Var3.R;
                                    twoStepVerificationActivity.G = false;
                                    twoStepVerificationActivity.U = wg1Var3.D;
                                    wg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    sb0 sb0Var = wg1Var3.g0;
                                    if (sb0Var != null) {
                                        AndroidUtilities.runOnUIThread(sb0Var);
                                        wg1Var3.g0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                wg1 wg1Var4 = this.b;
                                int i162 = wg1Var4.L;
                                wg1Var4.J = true;
                                if (wg1Var4.n.getTransformationMethod() == null) {
                                    wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                        wg1Var4.c0[3].N(-1);
                                        org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var = wg1Var4.c0[3];
                                        if (animatedDrawable != gj0Var) {
                                            wg1Var4.a.setAnimation(gj0Var);
                                            wg1Var4.c0[3].L(18, false, false);
                                        }
                                        wg1Var4.a.d();
                                    }
                                } else {
                                    wg1Var4.n.setTransformationMethod(null);
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                        wg1Var4.c0[3].N(18);
                                        org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                        if (animatedDrawable2 != gj0Var2) {
                                            wg1Var4.a.setAnimation(gj0Var2);
                                        }
                                        wg1Var4.c0[3].Q(0.0f, false);
                                        wg1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = wg1Var4.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                wg1Var4.J = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.B, k7.b6.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new tg1(this, 2));
                this.s.addView(linearLayout, k7.b6.c(-2.0f, -1));
                pb1Var.addView(this.s, k7.b6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.bd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.r.setPadding(dp2, dp2, dp2, dp2);
                this.r.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kg1
                    public final /* synthetic */ wg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i202, KeyEvent keyEvent) {
                        switch (i11) {
                            case 0:
                                wg1 wg1Var = this.b;
                                wg1Var.getClass();
                                if (i202 != 5 && i202 != 6) {
                                    return false;
                                }
                                wg1Var.C0();
                                return true;
                            default:
                                wg1 wg1Var2 = this.b;
                                wg1Var2.getClass();
                                if (i202 != 5 && i202 != 6) {
                                    return false;
                                }
                                if (wg1Var2.v.getVisibility() == 0) {
                                    wg1Var2.r.requestFocus();
                                } else {
                                    wg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.lg1
                    public final /* synthetic */ wg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z4) {
                        switch (i11) {
                            case 0:
                                org.telegram.ui.Components.bd0 bd0Var2 = this.b.v;
                                float f10 = z4 ? 1.0f : 0.0f;
                                bd0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                wg1 wg1Var = this.b;
                                if (!z4) {
                                    wg1Var.getClass();
                                    break;
                                } else {
                                    wg1Var.b0.setEditText((EditText) view);
                                    wg1Var.b0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.bd0 bd0Var3 = this.b.s;
                                float f11 = z4 ? 1.0f : 0.0f;
                                bd0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                this.v.addView(this.r, k7.b6.c(-2.0f, -1));
                pb1Var.addView(this.v, k7.b6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.rr rrVar = new org.telegram.ui.Components.rr(context);
                this.b0 = rrVar;
                rrVar.setVisibility(8);
                y90Var.addView(this.b0);
                xd0 xd0Var = new xd0(this, context, 3);
                this.w = xd0Var;
                final int i22 = 1;
                xd0Var.b(6, 1);
                ds[] dsVarArr = this.w.f;
                int length = dsVarArr.length;
                int i23 = 0;
                while (i23 < length) {
                    ds dsVar = dsVarArr[i23];
                    dsVar.setShowSoftInputOnFocusCompat((v0() ? 1 : 0) ^ i22);
                    dsVar.addTextChangedListener(new tg1(this, i11));
                    dsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.lg1
                        public final /* synthetic */ wg1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z4) {
                            switch (i22) {
                                case 0:
                                    org.telegram.ui.Components.bd0 bd0Var2 = this.b.v;
                                    float f10 = z4 ? 1.0f : 0.0f;
                                    bd0Var2.b(f10, f10, true);
                                    break;
                                case 1:
                                    wg1 wg1Var = this.b;
                                    if (!z4) {
                                        wg1Var.getClass();
                                        break;
                                    } else {
                                        wg1Var.b0.setEditText((EditText) view);
                                        wg1Var.b0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.bd0 bd0Var3 = this.b.s;
                                    float f11 = z4 ? 1.0f : 0.0f;
                                    bd0Var3.b(f11, f11, true);
                                    break;
                            }
                        }
                    });
                    i23++;
                    i22 = 1;
                }
                this.w.setVisibility(8);
                pb1Var.addView(this.w, k7.b6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                pb1Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, k7.b6.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    pb1Var.addView(this.f, k7.b6.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i24 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
                        public final /* synthetic */ wg1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    this.b.C0();
                                    break;
                                case 1:
                                    wg1 wg1Var = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                    d2Var.Q = string;
                                    wg1Var.showDialog(d2Var);
                                    break;
                                case 2:
                                    wg1.V(this.b);
                                    break;
                                case 3:
                                    wg1 wg1Var2 = this.b;
                                    if (wg1Var2.h.getAlpha() >= 0.5f) {
                                        int i152 = wg1Var2.L;
                                        if (i152 != 0) {
                                            if (i152 != 3) {
                                                if (i152 == 2) {
                                                    wg1Var2.A0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                                alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                                wg1Var2.showDialog(d2Var2);
                                                TextView textView22 = (TextView) d2Var2.d(-1);
                                                if (textView22 != null) {
                                                    textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                    break;
                                                }
                                            }
                                        } else {
                                            wg1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = wg1Var2.X;
                                            wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    wg1 wg1Var3 = this.b;
                                    if (wg1Var3.L == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.T = true;
                                        twoStepVerificationActivity.F = wg1Var3.R;
                                        twoStepVerificationActivity.G = false;
                                        twoStepVerificationActivity.U = wg1Var3.D;
                                        wg1Var3.presentFragment(twoStepVerificationActivity, true);
                                        sb0 sb0Var = wg1Var3.g0;
                                        if (sb0Var != null) {
                                            AndroidUtilities.runOnUIThread(sb0Var);
                                            wg1Var3.g0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.b.C0();
                                    break;
                                default:
                                    wg1 wg1Var4 = this.b;
                                    int i162 = wg1Var4.L;
                                    wg1Var4.J = true;
                                    if (wg1Var4.n.getTransformationMethod() == null) {
                                        wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                            wg1Var4.c0[3].N(-1);
                                            org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.gj0 gj0Var = wg1Var4.c0[3];
                                            if (animatedDrawable != gj0Var) {
                                                wg1Var4.a.setAnimation(gj0Var);
                                                wg1Var4.c0[3].L(18, false, false);
                                            }
                                            wg1Var4.a.d();
                                        }
                                    } else {
                                        wg1Var4.n.setTransformationMethod(null);
                                        wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                            wg1Var4.c0[3].N(18);
                                            org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                            if (animatedDrawable2 != gj0Var2) {
                                                wg1Var4.a.setAnimation(gj0Var2);
                                            }
                                            wg1Var4.c0[3].Q(0.0f, false);
                                            wg1Var4.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = wg1Var4.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    wg1Var4.J = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = u9Var;
                eg.i0 i0Var = new eg.i0(this, context);
                this.y = i0Var;
                i0Var.setAlpha(0.0f);
                u9Var.addView(this.y);
                u9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.I = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.I.setAlpha(0.0f);
                this.I.setScaleX(0.1f);
                this.I.setScaleY(0.1f);
                this.I.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false));
                n0Var.addView(this.I, k7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                g gVar = new g(this, context, 3);
                gVar.setOnTouchListener(new oh.d(2));
                gVar.addView(this.actionBar);
                gVar.addView(this.a);
                gVar.addView(this.c);
                gVar.addView(this.d);
                gVar.addView(this.b);
                this.fragmentView = gVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        switch (i14) {
            case 0:
            case 1:
                if (this.R.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    String string = LocaleController.getString(i14 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.c.setText(string);
                }
                if (!TextUtils.isEmpty(this.X)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(LocaleController.getString(i14 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.n.setContentDescription(LocaleController.getString(i14 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.n.setImeOptions(268435461);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.C = i14 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.B, false, 0.1f, false);
                org.telegram.ui.Components.gj0[] gj0VarArr = new org.telegram.ui.Components.gj0[7];
                this.c0 = gj0VarArr;
                gj0VarArr[0] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.c0[1] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.c0[2] = new org.telegram.ui.Components.gj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.c0[3] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.c0[4] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.c0[5] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.c0[6] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.gj0 gj0Var = this.c0[6];
                gj0Var.h = true;
                gj0Var.N(19);
                this.c0[2].P(97, this.f0);
                F0(true);
                if (i14 != 1) {
                    this.n.dispatchTextWatchersTextChanged();
                    i10 = 1;
                    F0(true);
                    break;
                } else {
                    ng1 ng1Var = this.d0;
                    if (ng1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ng1Var);
                    }
                    this.a.setAnimation(this.c0[6]);
                    this.a.d();
                    i10 = 1;
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.W) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.v.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.b0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.R.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01();
                    s01Var.a |= 256;
                    s01Var.b = indexOf;
                    int i25 = lastIndexOf + 1;
                    s01Var.c = i25;
                    valueOf.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), indexOf, i25, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.Z.e(false, false);
                this.w.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.VerificationCode));
                this.s.setVisibility(8);
                this.b0.setVisibility(0);
                ih.s sVar2 = this.d;
                int i26 = R.string.EmailPasswordConfirmText2;
                String str3 = this.R.email_unconfirmed_pattern;
                sVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i26, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.Z.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                final int i27 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jg1
                    public final /* synthetic */ wg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                wg1 wg1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                                alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                d2Var.Q = string2;
                                wg1Var.showDialog(d2Var);
                                break;
                            case 2:
                                wg1.V(this.b);
                                break;
                            case 3:
                                wg1 wg1Var2 = this.b;
                                if (wg1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = wg1Var2.L;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                wg1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                                            wg1Var2.showDialog(d2Var2);
                                            TextView textView22 = (TextView) d2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        wg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = wg1Var2.X;
                                        wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                wg1 wg1Var3 = this.b;
                                if (wg1Var3.L == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.T = true;
                                    twoStepVerificationActivity.F = wg1Var3.R;
                                    twoStepVerificationActivity.G = false;
                                    twoStepVerificationActivity.U = wg1Var3.D;
                                    wg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    sb0 sb0Var = wg1Var3.g0;
                                    if (sb0Var != null) {
                                        AndroidUtilities.runOnUIThread(sb0Var);
                                        wg1Var3.g0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                wg1 wg1Var4 = this.b;
                                int i162 = wg1Var4.L;
                                wg1Var4.J = true;
                                if (wg1Var4.n.getTransformationMethod() == null) {
                                    wg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                        wg1Var4.c0[3].N(-1);
                                        org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.c0[3];
                                        if (animatedDrawable != gj0Var2) {
                                            wg1Var4.a.setAnimation(gj0Var2);
                                            wg1Var4.c0[3].L(18, false, false);
                                        }
                                        wg1Var4.a.d();
                                    }
                                } else {
                                    wg1Var4.n.setTransformationMethod(null);
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && wg1Var4.n.length() > 0 && wg1Var4.n.hasFocus()) {
                                        wg1Var4.c0[3].N(18);
                                        org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var22 = wg1Var4.c0[3];
                                        if (animatedDrawable2 != gj0Var22) {
                                            wg1Var4.a.setAnimation(gj0Var22);
                                        }
                                        wg1Var4.c0[3].Q(0.0f, false);
                                        wg1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = wg1Var4.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                wg1Var4.J = false;
                                break;
                        }
                    }
                });
                this.w.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 6:
                this.c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.a.d();
                i10 = 1;
                break;
            case 7:
                this.c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.V) {
                    this.b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.E) {
                    this.b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, 160, 160, null);
                this.a.d();
                i10 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.o6, false));
                this.s.setText(LocaleController.getString(R.string.LoginPassword));
                this.n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.n.setImeOptions(268435462);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 9:
                this.c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, 140, 140, null);
                this.a.d();
                i10 = 1;
                break;
            default:
                i10 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor4 = this.n;
        if (editTextBoldCursor4 != null) {
            editTextBoldCursor4.addTextChangedListener(new tg1(this, i10));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean finishFragment(boolean z4) {
        for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
            if (p2Var != this && (p2Var instanceof wg1)) {
                ((org.telegram.ui.Components.t61) ((wg1) p2Var).Y.b).b = true;
            }
        }
        return super.finishFragment(z4);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hideKeyboardOnShow() {
        int i10 = this.L;
        return i10 == 7 || i10 == 9;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.D < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.D < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z4) {
                finishFragment();
            }
            return true;
        }
        if (!z4) {
            return false;
        }
        I0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i10 = this.L;
            if (i10 == 2 && AndroidUtilities.isSmallScreen()) {
                this.a.setVisibility(8);
            } else if (i10 != 6 && i10 != 9 && i10 != 7) {
                org.telegram.ui.Components.jj0 jj0Var = this.a;
                Point point = AndroidUtilities.displaySize;
                jj0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.rr rrVar = this.b0;
        if (rrVar != null) {
            rrVar.setVisibility(v0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K = false;
        ng1 ng1Var = this.d0;
        if (ng1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ng1Var);
            this.d0 = null;
        }
        if (this.c0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.gj0[] gj0VarArr = this.c0;
                if (i10 >= gj0VarArr.length) {
                    break;
                }
                gj0VarArr[i10].A(false);
                i10++;
            }
            this.c0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.P = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        this.P = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            if (this.n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new ng1(this, 0), 200L);
            }
            xd0 xd0Var = this.w;
            if (xd0Var == null || xd0Var.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ng1(this, 1), 200L);
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            xd0 xd0Var = this.w;
            ds[] dsVarArr = xd0Var.f;
            if (i10 >= dsVarArr.length) {
                xd0Var.postDelayed(new sg1(0, this, runnable), (dsVarArr.length * 75) + 350);
                return;
            } else {
                ds dsVar = dsVarArr[i10];
                dsVar.postDelayed(new dl0(dsVar, 1), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.L;
        if ((i10 != 5 && i10 != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final void w0() {
        this.Z.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.Z.f(true, true);
    }

    public final void y0() {
        for (ds dsVar : this.w.f) {
            dsVar.setText("");
            dsVar.i(1.0f);
        }
        this.w.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.w, 8.0f, new ng1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.bd0 bd0Var, EditTextBoldCursor editTextBoldCursor, boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            editTextBoldCursor.setText("");
        }
        AndroidUtilities.shakeViewSpring(bd0Var, 5.0f);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        if (this.D >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = android.support.v4.media.a.i("afterSignup", true);
            xg0 xg0Var = new xg0();
            xg0Var.l0(i10);
            presentFragment(xg0Var, true);
            return;
        }
        super.finishFragment();
    }

    public wg1(int i10, TL_account.Password password) {
        super(null);
        this.C = false;
        this.D = -1;
        this.G = new ArrayList();
        this.S = new byte[0];
        this.e0 = new ng1(this, 2);
        this.f0 = new ng1(this, 3);
        this.L = i10;
        this.R = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new og1(this, 0), 10);
        } else {
            this.Q = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void B0() {
    }
}
