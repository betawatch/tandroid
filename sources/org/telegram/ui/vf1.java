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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public class vf1 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.ActionBar.j0 E;
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
    public org.telegram.ui.Components.yj0 a;
    public String a0;
    public TextView b;
    public m.g3 b0;
    public TextView c;
    public org.telegram.ui.Components.h20 c0;
    public wh.n d;
    public org.telegram.ui.Components.b41 d0;
    public TextView e;
    public org.telegram.ui.Components.fs e0;
    public TextView f;
    public org.telegram.ui.Components.vj0[] f0;
    public mf1 g0;
    public TextView h;
    public final Runnable h0;
    public final Runnable i0;
    public eb0 j0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.sd0 s;
    public org.telegram.ui.Components.sd0 v;
    public id0 w;
    public uf1 x;
    public ei.g6 y;

    public vf1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new mf1(this, 2);
        this.i0 = new mf1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nf1(this, 0), 10);
            }
        }
    }

    public static void U(vf1 vf1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = vf1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(vf1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = vf1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        }
        ig.o0 o0Var = new ig.o0(vf1Var, bArr, str, passwordinputsettings, z10, 4);
        if (z10) {
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
            return;
        }
        if (str != null && (bArr3 = vf1Var.X) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = vf1Var.U.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(vf1Var.X, 0, bArr6, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = vf1Var.W;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = vf1Var.U.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            o0Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                o0Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
    }

    public static void V(vf1 vf1Var) {
        ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ci.e6(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        vf1Var.showDialog(alertDialog$Builder.a);
    }

    public static void W(vf1 vf1Var, byte[] bArr) {
        ArrayList arrayList = vf1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = vf1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = vf1Var.U;
        if (bArr == null) {
            bArr = vf1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, vf1Var.W, vf1Var.X);
        twoStepVerificationActivity.X = vf1Var.G;
        vf1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        eb0 eb0Var = vf1Var.j0;
        if (eb0Var != null) {
            AndroidUtilities.runOnUIThread(eb0Var);
            vf1Var.j0 = null;
        }
    }

    public static void X(vf1 vf1Var) {
        ArrayList arrayList = vf1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(vf1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = vf1Var.V;
        TL_account.Password password = vf1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, vf1Var.R, vf1Var.Q, null, vf1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = vf1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, vf1Var.V, vf1Var.W, vf1Var.X);
        twoStepVerificationActivity.X = vf1Var.G;
        vf1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        eb0 eb0Var = vf1Var.j0;
        if (eb0Var != null) {
            AndroidUtilities.runOnUIThread(eb0Var);
            vf1Var.j0 = null;
        }
    }

    public static /* synthetic */ void Y(vf1 vf1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = vf1Var.U.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        m71 m71Var = new m71(6, vf1Var, x10);
        TL_account.Password password = vf1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            m71Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(getpasswordsettings, m71Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        m71Var.run(null, tL_error2);
    }

    public static void Z(vf1 vf1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(new TL_account.getPassword(), new nf1(vf1Var, 4), 8);
            return;
        }
        vf1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            vf1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            vf1Var.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
            vf1Var.z0(vf1Var.s, vf1Var.n, true);
            vf1Var.H0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            vf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
        }
    }

    public static /* synthetic */ void a0(vf1 vf1Var) {
        ArrayList arrayList = vf1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        vf1Var.finishFragment();
    }

    public static /* synthetic */ void b0(vf1 vf1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            vf1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.f5.w0(vf1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            vf1Var.T = !TextUtils.isEmpty(vf1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(vf1Var.U);
            if (!vf1Var.S && vf1Var.Y) {
                TL_account.Password password2 = vf1Var.U;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!vf1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        vf1Var.finishFragment();
                    }
                }
            }
            if (vf1Var.N) {
                vf1Var.w0();
                vf1Var.C0();
            }
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        }
    }

    public static /* synthetic */ void c0(vf1 vf1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            vf1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            vf1Var.E0(z10);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        }
    }

    public static void d0(vf1 vf1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = vf1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ei.o3(12, vf1Var, z10), 8);
            return;
        }
        vf1Var.w0();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    }
                    if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                        vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        vf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(vf1Var.currentAccount);
                int i11 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = vf1Var.U;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = vf1Var.R;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, vf1Var.Q, str2, vf1Var.P);
                TL_account.Password password3 = vf1Var.U;
                password3.email_unconfirmed_pattern = vf1Var.R;
                vf1 vf1Var2 = new vf1(5, password3);
                vf1Var2.H = vf1Var.H;
                vf1Var2.D0(bArr != null ? bArr : vf1Var.V, vf1Var.W, vf1Var.X, vf1Var.Z);
                vf1Var2.Y = vf1Var.Y;
                vf1Var2.G = vf1Var.G;
                vf1Var.presentFragment(vf1Var2, true);
                return;
            }
            return;
        }
        vf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z10) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((org.telegram.ui.ActionBar.n2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            vf1Var.finishFragment();
            return;
        }
        if (vf1Var.getParentActivity() == null) {
            return;
        }
        if (vf1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new en0(23, vf1Var, bArr));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            if (str == null && (password = vf1Var.U) != null && password.has_password) {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = vf1Var.showDialog(b2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i13)).removeSelfFromStack();
        }
        TL_account.Password password4 = vf1Var.U;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (vf1Var.Y) {
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        vf1 vf1Var3 = new vf1(7, vf1Var.U);
        vf1Var3.H = vf1Var.H;
        vf1Var3.D0(bArr != null ? bArr : vf1Var.V, vf1Var.W, vf1Var.X, vf1Var.Z);
        vf1Var3.Y = vf1Var.Y;
        vf1Var3.G = vf1Var.G;
        vf1Var.presentFragment(vf1Var3, true);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
    }

    public static void e0(vf1 vf1Var, TLRPC.TL_error tL_error) {
        vf1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = vf1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, vf1Var.V, vf1Var.W, vf1Var.X);
            twoStepVerificationActivity.X = vf1Var.G;
            vf1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            eb0 eb0Var = vf1Var.j0;
            if (eb0Var != null) {
                AndroidUtilities.runOnUIThread(eb0Var);
                vf1Var.j0 = null;
            }
        }
    }

    public static void f0(vf1 vf1Var) {
        ArrayList arrayList = vf1Var.J;
        int i10 = 4;
        if (vf1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new lf1(vf1Var, i10));
            boolean z10 = vf1Var.U.has_recovery;
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            if (z10) {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = vf1Var.showDialog(b2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i11)).removeSelfFromStack();
        }
        TL_account.Password password = vf1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        vf1 vf1Var2 = new vf1(7, password);
        vf1Var2.H = vf1Var.H;
        vf1Var2.D0(vf1Var.V, vf1Var.W, vf1Var.X, vf1Var.Z);
        vf1Var2.J.addAll(arrayList);
        vf1Var2.Y = vf1Var.Y;
        vf1Var2.G = vf1Var.G;
        vf1Var.presentFragment(vf1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(vf1Var.currentAccount);
        int i12 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = vf1Var.V;
        TL_account.Password password2 = vf1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, vf1Var.R, vf1Var.Q, null, vf1Var.P);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
    }

    public static void g0(vf1 vf1Var, String str) {
        vf1 vf1Var2 = new vf1(vf1Var.currentAccount, 0, vf1Var.U);
        vf1Var2.H = vf1Var.H;
        vf1Var2.J.addAll(vf1Var.J);
        vf1Var2.J.add(vf1Var);
        vf1Var2.a0 = str;
        vf1Var2.G = vf1Var.G;
        vf1Var.presentFragment(vf1Var2, true);
    }

    public static /* synthetic */ void h0(vf1 vf1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            vf1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
            vf1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (password.has_recovery) {
            this.R = "";
            E0(false);
            return;
        }
        vf1 vf1Var = new vf1(this.currentAccount, 3, password);
        vf1Var.H = this.H;
        vf1Var.D0(this.V, this.W, this.X, this.Z);
        vf1Var.P = this.P;
        vf1Var.Q = this.Q;
        vf1Var.J.addAll(this.J);
        vf1Var.J.add(this);
        vf1Var.Y = this.Y;
        vf1Var.G = this.G;
        presentFragment(vf1Var);
    }

    public final void C0() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.O) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    z0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.P) || this.O != 1) {
                    vf1 vf1Var = new vf1(this.currentAccount, this.O != 0 ? 2 : 1, this.U);
                    vf1Var.H = this.H;
                    vf1Var.P = this.n.getText().toString();
                    vf1Var.D0(this.V, this.W, this.X, this.Z);
                    vf1Var.a0 = this.a0;
                    vf1Var.J.addAll(this.J);
                    vf1Var.J.add(this);
                    vf1Var.Y = this.Y;
                    vf1Var.G = this.G;
                    presentFragment(vf1Var);
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
                this.Q = obj;
                if (!obj.equalsIgnoreCase(this.P)) {
                    A0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    z0(this.s, this.n, false);
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new m71(5, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.w.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new nf1(this, 2), 10);
                x0();
                break;
            case 6:
                TL_account.Password password = this.U;
                if (password != null) {
                    vf1 vf1Var2 = new vf1(this.currentAccount, 0, password);
                    vf1Var2.H = this.H;
                    vf1Var2.Y = this.Y;
                    vf1Var2.G = this.G;
                    presentFragment(vf1Var2, true);
                    break;
                } else {
                    x0();
                    this.N = true;
                    break;
                }
            case 7:
                if (!this.Y) {
                    if (!this.H) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        eb0 eb0Var = this.j0;
                        if (eb0Var != null) {
                            AndroidUtilities.runOnUIThread(eb0Var);
                            this.j0 = null;
                            break;
                        }
                    } else {
                        Bundle h = a1.g.h("afterSignup", true);
                        ng0 ng0Var = new ng0();
                        ng0Var.l0(h);
                        presentFragment(ng0Var, true);
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
                        byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                        x0();
                        Utilities.globalQueue.postRunnable(new of1(this, stringBytes, 0));
                        break;
                    } else {
                        z0(this.s, this.n, false);
                        break;
                    }
                } else {
                    x0();
                    this.N = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j10;
        this.Z = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new nf1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
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
        x0();
        Utilities.globalQueue.postRunnable(new ei.s1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.k0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z10) {
        if (this.O != 0) {
            return;
        }
        mf1 mf1Var = this.g0;
        if (mf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mf1Var);
        }
        org.telegram.ui.Components.vj0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z10) {
            org.telegram.ui.Components.vj0[] vj0VarArr = this.f0;
            if (animatedDrawable != vj0VarArr[0]) {
                if (animatedDrawable != vj0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    mf1 mf1Var2 = new mf1(this, 4);
                    this.g0 = mf1Var2;
                    AndroidUtilities.runOnUIThread(mf1Var2, Utilities.random.nextInt(2000) + 5000);
                }
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            this.a.setAnimation(this.f0[0]);
            this.f0[0].T(0.0f, true);
        } else {
            this.a.setAnimation(this.f0[1]);
            this.f0[1].T(0.0f, true);
        }
        if (!z10) {
            this.a.d();
        }
        mf1 mf1Var22 = new mf1(this, 4);
        this.g0 = mf1Var22;
        AndroidUtilities.runOnUIThread(mf1Var22, Utilities.random.nextInt(2000) + 5000);
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = str;
        b2Var.T = str2;
        showDialog(b2Var);
    }

    public final void H0(boolean z10) {
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
        this.I.addListener(new l40(12, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new lf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v72, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v73 */
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10;
        ?? r82;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new sf1(this));
        final int i13 = 1;
        int i14 = this.O;
        if (i14 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.c0 = h20Var;
        this.b0 = new m.g3(h20Var);
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ vf1 b;

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
                        vf1 vf1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        vf1.V(this.b);
                        break;
                    case 3:
                        vf1 vf1Var2 = this.b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i15 = vf1Var2.O;
                            if (i15 != 0) {
                                if (i15 != 3) {
                                    if (i15 == 2) {
                                        vf1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    vf1Var2.showDialog(b2Var2);
                                    TextView textView = (TextView) b2Var2.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        vf1 vf1Var3 = this.b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        vf1 vf1Var4 = this.b;
                        int i16 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.n.getTransformationMethod() == null) {
                            vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var = vf1Var4.f0[3];
                                if (animatedDrawable != vj0Var) {
                                    vf1Var4.a.setAnimation(vj0Var);
                                    vf1Var4.f0[3].N(18, false, false);
                                }
                                vf1Var4.a.d();
                            }
                        } else {
                            vf1Var4.n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(18);
                                org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                if (animatedDrawable2 != vj0Var2) {
                                    vf1Var4.a.setAnimation(vj0Var2);
                                }
                                vf1Var4.f0[3].T(0.0f, false);
                                vf1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(context);
        this.d0 = b41Var;
        b41Var.setTransformType(1);
        this.d0.setProgress(0.0f);
        this.d0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false));
        this.d0.setDrawBackground(false);
        this.c0.setContentDescription(LocaleController.getString(R.string.Next));
        int i15 = 17;
        this.c0.addView(this.d0, w7.z5.e(56, 56, 17));
        this.c0.a(this.d0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        m.g3.p(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        final int i16 = 3;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ vf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        vf1 vf1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        vf1.V(this.b);
                        break;
                    case 3:
                        vf1 vf1Var2 = this.b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = vf1Var2.O;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        vf1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    vf1Var2.showDialog(b2Var2);
                                    TextView textView2 = (TextView) b2Var2.d(-1);
                                    if (textView2 != null) {
                                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        vf1 vf1Var3 = this.b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        vf1 vf1Var4 = this.b;
                        int i162 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.n.getTransformationMethod() == null) {
                            vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var = vf1Var4.f0[3];
                                if (animatedDrawable != vj0Var) {
                                    vf1Var4.a.setAnimation(vj0Var);
                                    vf1Var4.f0[3].N(18, false, false);
                                }
                                vf1Var4.a.d();
                            }
                        } else {
                            vf1Var4.n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(18);
                                org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                if (animatedDrawable2 != vj0Var2) {
                                    vf1Var4.a.setAnimation(vj0Var2);
                                }
                                vf1Var4.f0[3].T(0.0f, false);
                                vf1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(context);
        this.a = yj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        yj0Var.setScaleType(scaleType);
        if (i14 == 2 && AndroidUtilities.isSmallScreen()) {
            this.a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.yj0 yj0Var2 = this.a;
            Point point = AndroidUtilities.displaySize;
            yj0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.c.setGravity(1);
        this.c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        wh.n nVar = new wh.n(context);
        this.d = nVar;
        int i17 = org.telegram.ui.ActionBar.h6.D6;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        final int i18 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ vf1 b;

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
                        vf1 vf1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        vf1.V(this.b);
                        break;
                    case 3:
                        vf1 vf1Var2 = this.b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = vf1Var2.O;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        vf1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    vf1Var2.showDialog(b2Var2);
                                    TextView textView22 = (TextView) b2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        vf1 vf1Var3 = this.b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        vf1 vf1Var4 = this.b;
                        int i162 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.n.getTransformationMethod() == null) {
                            vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var = vf1Var4.f0[3];
                                if (animatedDrawable != vj0Var) {
                                    vf1Var4.a.setAnimation(vj0Var);
                                    vf1Var4.f0[3].N(18, false, false);
                                }
                                vf1Var4.a.d();
                            }
                        } else {
                            vf1Var4.n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(18);
                                org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                if (animatedDrawable2 != vj0Var2) {
                                    vf1Var4.a.setAnimation(vj0Var2);
                                }
                                vf1Var4.f0[3].T(0.0f, false);
                                vf1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.b.setGravity(17);
        this.b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{24.0f}, org.telegram.ui.ActionBar.h6.Oh));
        final int i19 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
            public final /* synthetic */ vf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        vf1 vf1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        vf1.V(this.b);
                        break;
                    case 3:
                        vf1 vf1Var2 = this.b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = vf1Var2.O;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        vf1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    vf1Var2.showDialog(b2Var2);
                                    TextView textView22 = (TextView) b2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        vf1 vf1Var3 = this.b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        vf1 vf1Var4 = this.b;
                        int i162 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.n.getTransformationMethod() == null) {
                            vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var = vf1Var4.f0[3];
                                if (animatedDrawable != vj0Var) {
                                    vf1Var4.a.setAnimation(vj0Var);
                                    vf1Var4.f0[3].N(18, false, false);
                                }
                                vf1Var4.a.d();
                            }
                        } else {
                            vf1Var4.n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                vf1Var4.f0[3].P(18);
                                org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                if (animatedDrawable2 != vj0Var2) {
                                    vf1Var4.a.setAnimation(vj0Var2);
                                }
                                vf1Var4.f0[3].T(0.0f, false);
                                vf1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
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
                m0 m0Var = new m0(this, context, 26);
                org.telegram.ui.Components.qa0 qa0Var = new org.telegram.ui.Components.qa0(this, context, m0Var, 2);
                qa0Var.addView(m0Var);
                t9 t9Var = new t9(this, context, qa0Var);
                uf1 uf1Var = new uf1(this, context);
                this.x = uf1Var;
                uf1Var.setVerticalScrollBarEnabled(false);
                m0Var.addView(this.x, w7.z5.c(-1.0f, -1));
                m0Var.addView(this.h, w7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                m0Var.addView(this.c0, org.telegram.ui.Components.h20.b());
                t9Var.addView(qa0Var, w7.z5.c(-1.0f, -1));
                qa1 qa1Var = new qa1(this, context, i15);
                qa1Var.setOrientation(1);
                this.x.addView(qa1Var, w7.z5.x(-1, -1, 51));
                qa1Var.addView(this.a, w7.z5.t(-2, -2, 49, 0, 69, 0, 0));
                qa1Var.addView(this.c, w7.z5.t(-2, -2, 49, 0, 8, 0, 0));
                qa1Var.addView(this.d, w7.z5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
                this.s = sd0Var;
                sd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i20 = org.telegram.ui.ActionBar.h6.l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
                this.n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jf1
                    public final /* synthetic */ vf1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i21, KeyEvent keyEvent) {
                        switch (i13) {
                            case 0:
                                vf1 vf1Var = this.b;
                                vf1Var.getClass();
                                if (i21 == 5 || i21 == 6) {
                                    vf1Var.C0();
                                    break;
                                }
                                break;
                            default:
                                vf1 vf1Var2 = this.b;
                                vf1Var2.getClass();
                                if (i21 == 5 || i21 == 6) {
                                    if (vf1Var2.v.getVisibility() == 0) {
                                        vf1Var2.r.requestFocus();
                                    } else {
                                        vf1Var2.C0();
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
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.kf1
                    public final /* synthetic */ vf1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.Components.sd0 sd0Var2 = this.b.v;
                                float f7 = z10 ? 1.0f : 0.0f;
                                sd0Var2.b(f7, f7, true);
                                break;
                            case 1:
                                vf1 vf1Var = this.b;
                                if (!z10) {
                                    vf1Var.getClass();
                                    break;
                                } else {
                                    vf1Var.e0.setEditText((EditText) view);
                                    vf1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.sd0 sd0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                sd0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, w7.z5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(this, context, 3);
                this.E = j0Var;
                j0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.E.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 1, -1));
                this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                final int i22 = 6;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
                    public final /* synthetic */ vf1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                vf1 vf1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.T = string;
                                vf1Var.showDialog(b2Var);
                                break;
                            case 2:
                                vf1.V(this.b);
                                break;
                            case 3:
                                vf1 vf1Var2 = this.b;
                                if (vf1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = vf1Var2.O;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                vf1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                            vf1Var2.showDialog(b2Var2);
                                            TextView textView22 = (TextView) b2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        vf1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = vf1Var2.a0;
                                        vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                vf1 vf1Var3 = this.b;
                                if (vf1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = vf1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = vf1Var3.G;
                                    vf1Var3.presentFragment(twoStepVerificationActivity, true);
                                    eb0 eb0Var = vf1Var3.j0;
                                    if (eb0Var != null) {
                                        AndroidUtilities.runOnUIThread(eb0Var);
                                        vf1Var3.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                vf1 vf1Var4 = this.b;
                                int i162 = vf1Var4.O;
                                vf1Var4.M = true;
                                if (vf1Var4.n.getTransformationMethod() == null) {
                                    vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                        vf1Var4.f0[3].P(-1);
                                        org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.vj0 vj0Var = vf1Var4.f0[3];
                                        if (animatedDrawable != vj0Var) {
                                            vf1Var4.a.setAnimation(vj0Var);
                                            vf1Var4.f0[3].N(18, false, false);
                                        }
                                        vf1Var4.a.d();
                                    }
                                } else {
                                    vf1Var4.n.setTransformationMethod(null);
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                        vf1Var4.f0[3].P(18);
                                        org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                        if (animatedDrawable2 != vj0Var2) {
                                            vf1Var4.a.setAnimation(vj0Var2);
                                        }
                                        vf1Var4.f0[3].T(0.0f, false);
                                        vf1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = vf1Var4.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                vf1Var4.M = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.z5.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new rf1(this, 2));
                this.s.addView(linearLayout, w7.z5.c(-2.0f, -1));
                qa1Var.addView(this.s, w7.z5.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.sd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.r.setPadding(dp2, dp2, dp2, dp2);
                this.r.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
                this.r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                final int i23 = 0;
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.jf1
                    public final /* synthetic */ vf1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i212, KeyEvent keyEvent) {
                        switch (i23) {
                            case 0:
                                vf1 vf1Var = this.b;
                                vf1Var.getClass();
                                if (i212 == 5 || i212 == 6) {
                                    vf1Var.C0();
                                    break;
                                }
                                break;
                            default:
                                vf1 vf1Var2 = this.b;
                                vf1Var2.getClass();
                                if (i212 == 5 || i212 == 6) {
                                    if (vf1Var2.v.getVisibility() == 0) {
                                        vf1Var2.r.requestFocus();
                                    } else {
                                        vf1Var2.C0();
                                    }
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                });
                this.v.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.kf1
                    public final /* synthetic */ vf1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i23) {
                            case 0:
                                org.telegram.ui.Components.sd0 sd0Var2 = this.b.v;
                                float f7 = z10 ? 1.0f : 0.0f;
                                sd0Var2.b(f7, f7, true);
                                break;
                            case 1:
                                vf1 vf1Var = this.b;
                                if (!z10) {
                                    vf1Var.getClass();
                                    break;
                                } else {
                                    vf1Var.e0.setEditText((EditText) view);
                                    vf1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.sd0 sd0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                sd0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                this.v.addView(this.r, w7.z5.c(-2.0f, -1));
                qa1Var.addView(this.v, w7.z5.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
                this.e0 = fsVar;
                fsVar.setVisibility(8);
                qa0Var.addView(this.e0);
                id0 id0Var = new id0(this, context, 3);
                this.w = id0Var;
                final int i24 = 1;
                id0Var.b(6, 1);
                tr[] trVarArr = this.w.f;
                int length = trVarArr.length;
                int i25 = 0;
                while (i25 < length) {
                    tr trVar = trVarArr[i25];
                    trVar.setShowSoftInputOnFocusCompat((v0() ? 1 : 0) ^ i24);
                    trVar.addTextChangedListener(new rf1(this, 0));
                    trVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.kf1
                        public final /* synthetic */ vf1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i24) {
                                case 0:
                                    org.telegram.ui.Components.sd0 sd0Var2 = this.b.v;
                                    float f7 = z10 ? 1.0f : 0.0f;
                                    sd0Var2.b(f7, f7, true);
                                    break;
                                case 1:
                                    vf1 vf1Var = this.b;
                                    if (!z10) {
                                        vf1Var.getClass();
                                        break;
                                    } else {
                                        vf1Var.e0.setEditText((EditText) view);
                                        vf1Var.e0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.sd0 sd0Var3 = this.b.s;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    sd0Var3.b(f10, f10, true);
                                    break;
                            }
                        }
                    });
                    i25++;
                    i24 = 1;
                }
                this.w.setVisibility(8);
                qa1Var.addView(this.w, w7.z5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                qa1Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.z5.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    qa1Var.addView(this.f, w7.z5.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i26 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
                        public final /* synthetic */ vf1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    this.b.C0();
                                    break;
                                case 1:
                                    vf1 vf1Var = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.T = string;
                                    vf1Var.showDialog(b2Var);
                                    break;
                                case 2:
                                    vf1.V(this.b);
                                    break;
                                case 3:
                                    vf1 vf1Var2 = this.b;
                                    if (vf1Var2.h.getAlpha() >= 0.5f) {
                                        int i152 = vf1Var2.O;
                                        if (i152 != 0) {
                                            if (i152 != 3) {
                                                if (i152 == 2) {
                                                    vf1Var2.A0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                                alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                                alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                                vf1Var2.showDialog(b2Var2);
                                                TextView textView22 = (TextView) b2Var2.d(-1);
                                                if (textView22 != null) {
                                                    textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                                    break;
                                                }
                                            }
                                        } else {
                                            vf1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = vf1Var2.a0;
                                            vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    vf1 vf1Var3 = this.b;
                                    if (vf1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = vf1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = vf1Var3.G;
                                        vf1Var3.presentFragment(twoStepVerificationActivity, true);
                                        eb0 eb0Var = vf1Var3.j0;
                                        if (eb0Var != null) {
                                            AndroidUtilities.runOnUIThread(eb0Var);
                                            vf1Var3.j0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.b.C0();
                                    break;
                                default:
                                    vf1 vf1Var4 = this.b;
                                    int i162 = vf1Var4.O;
                                    vf1Var4.M = true;
                                    if (vf1Var4.n.getTransformationMethod() == null) {
                                        vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                            vf1Var4.f0[3].P(-1);
                                            org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.vj0 vj0Var = vf1Var4.f0[3];
                                            if (animatedDrawable != vj0Var) {
                                                vf1Var4.a.setAnimation(vj0Var);
                                                vf1Var4.f0[3].N(18, false, false);
                                            }
                                            vf1Var4.a.d();
                                        }
                                    } else {
                                        vf1Var4.n.setTransformationMethod(null);
                                        vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                            vf1Var4.f0[3].P(18);
                                            org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                            if (animatedDrawable2 != vj0Var2) {
                                                vf1Var4.a.setAnimation(vj0Var2);
                                            }
                                            vf1Var4.f0[3].T(0.0f, false);
                                            vf1Var4.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = vf1Var4.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    vf1Var4.M = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = t9Var;
                ei.g6 g6Var = new ei.g6(this, context);
                this.y = g6Var;
                g6Var.setAlpha(0.0f);
                t9Var.addView(this.y);
                t9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.l6, false));
                m0Var.addView(this.L, w7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new di.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.a);
                fVar.addView(this.c);
                fVar.addView(this.d);
                fVar.addView(this.b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        switch (i14) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    String string = LocaleController.getString(i14 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.c.setText(string);
                }
                if (!TextUtils.isEmpty(this.a0)) {
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
                this.F = i14 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.vj0[] vj0VarArr = new org.telegram.ui.Components.vj0[7];
                this.f0 = vj0VarArr;
                vj0VarArr[0] = new org.telegram.ui.Components.vj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[1] = new org.telegram.ui.Components.vj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[2] = new org.telegram.ui.Components.vj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[3] = new org.telegram.ui.Components.vj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[4] = new org.telegram.ui.Components.vj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[5] = new org.telegram.ui.Components.vj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[6] = new org.telegram.ui.Components.vj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.vj0 vj0Var = this.f0[6];
                vj0Var.h = true;
                vj0Var.P(19);
                this.f0[2].S(97, this.i0);
                F0(true);
                if (i14 != 1) {
                    this.n.dispatchTextWatchersTextChanged();
                    i10 = 1;
                    F0(true);
                    break;
                } else {
                    mf1 mf1Var = this.g0;
                    if (mf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(mf1Var);
                    }
                    this.a.setAnimation(this.f0[6]);
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
                if (!this.Z) {
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
                this.e0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.U.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf == lastIndexOf || indexOf == -1 || lastIndexOf == -1) {
                    r82 = 0;
                } else {
                    org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11();
                    n11Var.a |= 256;
                    n11Var.b = indexOf;
                    int i27 = lastIndexOf + 1;
                    n11Var.c = i27;
                    r82 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.o11(n11Var, 0), indexOf, i27, 0);
                }
                wh.n nVar2 = this.d;
                String string2 = LocaleController.getString(R.string.RestoreEmailSent);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r82] = valueOf;
                nVar2.setText(AndroidUtilities.formatSpannable(string2, charSequenceArr));
                this.d.setVisibility(r82);
                this.c0.e(r82, r82);
                this.w.setVisibility(r82);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.VerificationCode));
                this.s.setVisibility(8);
                this.e0.setVisibility(0);
                wh.n nVar3 = this.d;
                int i28 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                nVar3.setText(LocaleController.formatString("EmailPasswordConfirmText2", i28, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                final int i29 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.if1
                    public final /* synthetic */ vf1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i29) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                vf1 vf1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                                String string3 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.T = string3;
                                vf1Var.showDialog(b2Var);
                                break;
                            case 2:
                                vf1.V(this.b);
                                break;
                            case 3:
                                vf1 vf1Var2 = this.b;
                                if (vf1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = vf1Var2.O;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                vf1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                            vf1Var2.showDialog(b2Var2);
                                            TextView textView22 = (TextView) b2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        vf1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = vf1Var2.a0;
                                        vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                vf1 vf1Var3 = this.b;
                                if (vf1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = vf1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = vf1Var3.G;
                                    vf1Var3.presentFragment(twoStepVerificationActivity, true);
                                    eb0 eb0Var = vf1Var3.j0;
                                    if (eb0Var != null) {
                                        AndroidUtilities.runOnUIThread(eb0Var);
                                        vf1Var3.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                vf1 vf1Var4 = this.b;
                                int i162 = vf1Var4.O;
                                vf1Var4.M = true;
                                if (vf1Var4.n.getTransformationMethod() == null) {
                                    vf1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                        vf1Var4.f0[3].P(-1);
                                        org.telegram.ui.Components.vj0 animatedDrawable = vf1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.vj0 vj0Var2 = vf1Var4.f0[3];
                                        if (animatedDrawable != vj0Var2) {
                                            vf1Var4.a.setAnimation(vj0Var2);
                                            vf1Var4.f0[3].N(18, false, false);
                                        }
                                        vf1Var4.a.d();
                                    }
                                } else {
                                    vf1Var4.n.setTransformationMethod(null);
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && vf1Var4.n.length() > 0 && vf1Var4.n.hasFocus()) {
                                        vf1Var4.f0[3].P(18);
                                        org.telegram.ui.Components.vj0 animatedDrawable2 = vf1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.vj0 vj0Var22 = vf1Var4.f0[3];
                                        if (animatedDrawable2 != vj0Var22) {
                                            vf1Var4.a.setAnimation(vj0Var22);
                                        }
                                        vf1Var4.f0[3].T(0.0f, false);
                                        vf1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = vf1Var4.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                vf1Var4.M = false;
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
                if (this.Y) {
                    this.b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
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
                this.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.o6, false));
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
            editTextBoldCursor4.addTextChangedListener(new rf1(this, i10));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var != this && (n2Var instanceof vf1)) {
                ((org.telegram.ui.Components.o71) ((vf1) n2Var).b0.b).b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hideKeyboardOnShow() {
        int i10 = this.O;
        return i10 == 7 || i10 == 9;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        I0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i10 = this.O;
            if (i10 == 2 && AndroidUtilities.isSmallScreen()) {
                this.a.setVisibility(8);
            } else if (i10 != 6 && i10 != 9 && i10 != 7) {
                org.telegram.ui.Components.yj0 yj0Var = this.a;
                Point point = AndroidUtilities.displaySize;
                yj0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.fs fsVar = this.e0;
        if (fsVar != null) {
            fsVar.setVisibility(v0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        mf1 mf1Var = this.g0;
        if (mf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mf1Var);
            this.g0 = null;
        }
        if (this.f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.vj0[] vj0VarArr = this.f0;
                if (i10 >= vj0VarArr.length) {
                    break;
                }
                vj0VarArr[i10].C(false);
                i10++;
            }
            this.f0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.S = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new mf1(this, 0), 200L);
            }
            id0 id0Var = this.w;
            if (id0Var == null || id0Var.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new mf1(this, 1), 200L);
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            id0 id0Var = this.w;
            tr[] trVarArr = id0Var.f;
            if (i10 >= trVarArr.length) {
                id0Var.postDelayed(new k71(19, this, runnable), (trVarArr.length * 75) + 350);
                return;
            } else {
                tr trVar = trVarArr[i10];
                trVar.postDelayed(new yk0(trVar, 1), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.O;
        if ((i10 != 5 && i10 != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final void w0() {
        this.c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.c0.f(true, true);
    }

    public final void y0() {
        for (tr trVar : this.w.f) {
            trVar.setText("");
            trVar.i(1.0f);
        }
        this.w.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.w, 8.0f, new mf1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.sd0 sd0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(sd0Var, 5.0f);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle h = a1.g.h("afterSignup", true);
            ng0 ng0Var = new ng0();
            ng0Var.l0(h);
            presentFragment(ng0Var, true);
            return;
        }
        super.finishFragment();
    }

    public vf1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new mf1(this, 2);
        this.i0 = new mf1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nf1(this, 0), 10);
        } else {
            this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void B0() {
    }
}
