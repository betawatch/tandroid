package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ se0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.Chat chat;
        String string;
        String formatString;
        org.telegram.ui.Components.sc M;
        zo0 zo0Var;
        zo0 zo0Var2;
        String str = "";
        int i14 = 0;
        switch (this.a) {
            case 0:
                te0 te0Var = (te0) this.b;
                String str2 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = te0Var.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                qe0 qe0Var = new qe0(te0Var, 2);
                if (z10) {
                    TL_account.Password password = te0Var.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.m2) te0Var.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, qe0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        qe0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 1:
                lf0 lf0Var = (lf0) this.b;
                TLObject tLObject = (TLObject) this.c;
                lf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(lf0Var.O.fragmentView.findFocus());
                lf0Var.O.o1((TLRPC.TL_auth_authorization) tLObject, true);
                TLRPC.FileLocation fileLocation = lf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new se0(2, lf0Var, fileLocation));
                    break;
                }
                break;
            case 2:
                lf0 lf0Var2 = (lf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.m2) lf0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 3:
                mf0 mf0Var = (mf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ah0 ah0Var = mf0Var.E;
                ah0Var.k1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                        break;
                    } else {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (mf0Var.r != null && mf0Var.s != null && mf0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", mf0Var.r);
                    bundle.putString("phoneHash", mf0Var.s);
                    bundle.putString("code", mf0Var.v);
                    ah0Var.u1(5, true, bundle, false);
                    break;
                } else {
                    ah0Var.u1(0, true, null, true);
                    break;
                }
                break;
            case 4:
                dg0 dg0Var = (dg0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.sk.g(new StringBuilder("+"), dg0Var.b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new zf0(dg0Var, i14));
                alertDialog$Builder.o();
                break;
            case 5:
                dg0 dg0Var2 = (dg0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                dg0Var2.getClass();
                dg0Var2.e0 = tL_error3.text;
                break;
            case 6:
                ((dg0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 7:
                dg0 dg0Var3 = (dg0) this.b;
                Runnable runnable = (Runnable) this.c;
                hs hsVar = dg0Var3.f;
                int i15 = 0;
                while (true) {
                    ks[] ksVarArr = hsVar.f;
                    if (i15 >= ksVarArr.length) {
                        runnable.run();
                        hsVar.e = false;
                        break;
                    } else {
                        ksVarArr[i15].l(0.0f);
                        i15++;
                    }
                }
            case 8:
                ((v3) this.b).run((String) this.c);
                break;
            case 9:
                zg0 zg0Var = (zg0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ah0 ah0Var2 = zg0Var.V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !ah0Var2.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ah0Var2.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ah0Var2.getParentActivity());
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.a;
                    a2Var.T = string2;
                    ah0Var2.n = ah0Var2.showDialog(a2Var, true, null);
                    ah0Var2.c0 = true;
                    break;
                }
                break;
            case 10:
                dh0.V((dh0) this.b, (org.telegram.ui.ActionBar.a2) this.c);
                break;
            case 11:
                di0 di0Var = (di0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                di0Var.c0 = false;
                if (tL_error4 == null) {
                    uh0 f02 = di0Var.f0();
                    di0Var.j0.clear();
                    di0Var.h0(f02);
                    break;
                }
                break;
            case 12:
                th0 th0Var = (th0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                di0 di0Var2 = th0Var.a;
                uh0 f03 = di0Var2.f0();
                di0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject2);
                TLRPC.ChatFull chatFull = di0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    di0Var2.getMessagesStorage().saveChatLinksCount(di0Var2.n, di0Var2.d.invitesCount);
                }
                di0Var2.h0(f03);
                break;
            case 13:
                pj0 pj0Var = (pj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (pj0Var.getParentActivity() != null) {
                    Toast.makeText(pj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 14:
                hk0 hk0Var = (hk0) this.b;
                String str3 = (String) this.c;
                hk0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                hk0Var.getContext().startActivity(intent);
                break;
            case 15:
                hk0 hk0Var2 = (hk0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                hk0Var2.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 16:
                ((mt) this.b).run((TLRPC.User) this.c);
                break;
            case 17:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 18:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                e3VarArr[0] = null;
                ql0.a = null;
                zArr[0] = true;
                break;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ks[] ksVarArr2 = passcodeActivity.n.f;
                int length = ksVarArr2.length;
                while (i14 < length) {
                    ksVarArr2[i14].l(0.0f);
                    i14++;
                }
                runnable2.run();
                break;
            case 20:
                ul0 ul0Var = (ul0) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                PasscodeActivity passcodeActivity2 = ul0Var.b;
                e1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                e1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.n0();
                if (passcodeActivity2.h0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 21:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 22:
                sn0 sn0Var = (sn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = sn0Var.x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(sn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = sn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    sn0Var.F = tL_secureRequiredType;
                                    sn0Var.O1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(sn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = sn0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    sn0Var.F = tL_secureRequiredType2;
                                    sn0Var.O1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(sn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = sn0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    sn0Var.F = tL_secureRequiredType3;
                                    sn0Var.O1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(sn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = sn0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) sn0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                sn0Var.F = tL_secureRequiredType4;
                                sn0Var.O1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    sn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    sn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    sn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    sn0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 == 1) {
                        sn0Var.w = "male";
                        sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i21 == 2) {
                        sn0Var.w = "female";
                        sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str4 = result.nationality;
                    sn0Var.s = str4;
                    String str5 = (String) sn0Var.Y0.get(str4);
                    if (str5 != null) {
                        sn0Var.Y[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str6 = result.issuingCountry;
                    sn0Var.v = str6;
                    String str7 = (String) sn0Var.Y0.get(str6);
                    if (str7 != null) {
                        sn0Var.Y[6].setText(str7);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    sn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    sn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    sn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 23:
                sn0 sn0Var2 = (sn0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    sn0Var2.J = password2;
                    if (!TwoStepVerificationActivity.i0(password2, false)) {
                        org.telegram.ui.Components.g5.w0(sn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(sn0Var2.J);
                        sn0Var2.Q1();
                        if (sn0Var2.Z[0].getVisibility() == 0) {
                            sn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(sn0Var2.Y[0]);
                        }
                        if (sn0Var2.N0 == 1) {
                            sn0Var2.A1(true);
                            break;
                        }
                    }
                }
                break;
            case 24:
                sn0 sn0Var3 = (sn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                if (tL_error5 != null) {
                    sn0Var3.M1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error5.text)) {
                        sn0Var3.L1(LocaleController.getString(R.string.AppName), tL_error5.text);
                        break;
                    } else {
                        org.telegram.ui.Components.g5.w0(sn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    sn0Var3.f1 = true;
                    sn0Var3.V0(true);
                    sn0Var3.finishFragment();
                    break;
                }
            case 25:
                ((nn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 26:
                ap0 ap0Var = (ap0) this.b;
                View view = (View) this.c;
                ap0Var.D0(false);
                view.callOnClick();
                break;
            case 27:
                ap0 ap0Var2 = (ap0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                ap0Var2.H0(true, false);
                if (tL_error6 != null) {
                    if (!tL_error6.text.startsWith("CODE_INVALID")) {
                        if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                            ap0Var2.F0(LocaleController.getString(R.string.AppName), tL_error6.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                            ap0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.k3 k3Var = ap0Var2.S;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = ap0Var2.S;
                        k3Var2.a.setText("");
                        k3Var2.b = false;
                        k3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (ap0Var2.getParentActivity() != null) {
                    xn0 xn0Var = ap0Var2.d0;
                    if (xn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(xn0Var);
                        ap0Var2.d0 = null;
                    }
                    ap0Var2.t0();
                    break;
                }
                break;
            case 28:
                ap0.W((ap0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            default:
                ap0 ap0Var3 = (ap0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = ap0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    ap0Var3.a1 = true;
                    ap0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = ap0Var3.b1;
                    boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z11 && (zo0Var2 = ap0Var3.Z0) != null) {
                        zo0Var2.a(1);
                    }
                    ap0Var3.t0();
                    if (z11 && (zo0Var = ap0Var3.Z0) != null) {
                        zo0Var.a(ap0Var3.f1);
                    }
                    long r02 = ap0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(ap0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = ap0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = ap0Var3.q0();
                    int i24 = z11 ? (z12 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z11) {
                        string = LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z12 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z11) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, ap0Var3.R0[0], ap0Var3.q0);
                    } else if (z13) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z12 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(U2);
                        if (r02 == 0 || string == null || z13) {
                            String str8 = string;
                            M = str8 != null ? a02.M(str8, replaceTags, i24) : a02.Q(i24, 36, replaceTags);
                        } else {
                            M = a02.K(i24, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new bo0(r02, i14));
                        }
                        org.telegram.ui.Components.sc scVar = M;
                        scVar.r = false;
                        scVar.j = 5000;
                        if (messageArr[0] != null) {
                            bi.y4 y4Var = new bi.y4(ap0Var3, scVar, z12, messageArr, 3);
                            org.telegram.ui.Components.wb wbVar = scVar.e;
                            if (wbVar != null) {
                                wbVar.setOnClickListener(y4Var);
                            }
                        }
                        scVar.k(z13);
                        break;
                    }
                }
                break;
        }
    }
}
