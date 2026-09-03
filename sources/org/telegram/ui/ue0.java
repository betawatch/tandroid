package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ue0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        char c3;
        String formatPluralString;
        int i13;
        ?? r15;
        String formatString;
        org.telegram.ui.ActionBar.p2 U;
        ko0 ko0Var;
        ko0 ko0Var2;
        jk jkVar;
        String str = "";
        int i14 = 5;
        int i15 = 1;
        switch (this.a) {
            case 0:
                af0 af0Var = (af0) this.b;
                TLObject tLObject = (TLObject) this.c;
                af0Var.L.k1(false, false);
                AndroidUtilities.hideKeyboard(af0Var.L.fragmentView.findFocus());
                af0Var.L.o1((TLRPC.TL_auth_authorization) tLObject, true);
                TLRPC.FileLocation fileLocation = af0Var.K;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new ue0(i15, af0Var, fileLocation));
                    break;
                }
                break;
            case 1:
                af0 af0Var2 = (af0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i10 = ((org.telegram.ui.ActionBar.p2) af0Var2.L).currentAccount;
                MessagesController.getInstance(i10).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 2:
                bf0 bf0Var = (bf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                og0 og0Var = bf0Var.B;
                og0Var.k1(false, true);
                if (tL_error == null) {
                    if (bf0Var.r != null && bf0Var.s != null && bf0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", bf0Var.r);
                        bundle.putString("phoneHash", bf0Var.s);
                        bundle.putString("code", bf0Var.v);
                        og0Var.u1(5, true, bundle, false);
                        break;
                    } else {
                        og0Var.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    break;
                }
                break;
            case 3:
                sf0 sf0Var = (sf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.Q = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.y3.j(new StringBuilder("+"), sf0Var.b, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new of0(sf0Var, 0));
                alertDialog$Builder.o();
                break;
            case 4:
                sf0 sf0Var2 = (sf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                sf0Var2.getClass();
                sf0Var2.b0 = tL_error2.text;
                break;
            case 5:
                ((sf0) this.b).p0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 6:
                sf0 sf0Var3 = (sf0) this.b;
                Runnable runnable = (Runnable) this.c;
                zr zrVar = sf0Var3.f;
                int i16 = 0;
                while (true) {
                    cs[] csVarArr = zrVar.f;
                    if (i16 >= csVarArr.length) {
                        runnable.run();
                        zrVar.e = false;
                        break;
                    } else {
                        csVarArr[i16].l(0.0f);
                        i16++;
                    }
                }
            case 7:
                ((w3) this.b).run((String) this.c);
                break;
            case 8:
                qh0 qh0Var = (qh0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                qh0Var.Z = false;
                if (tL_error3 == null) {
                    hh0 f02 = qh0Var.f0();
                    qh0Var.g0.clear();
                    qh0Var.h0(f02);
                    break;
                }
                break;
            case 9:
                gh0 gh0Var = (gh0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                qh0 qh0Var2 = gh0Var.a;
                hh0 f03 = qh0Var2.f0();
                qh0Var2.f0.add(0, (TLRPC.TL_chatInviteExported) tLObject2);
                TLRPC.ChatFull chatFull = qh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    qh0Var2.getMessagesStorage().saveChatLinksCount(qh0Var2.n, qh0Var2.d.invitesCount);
                }
                qh0Var2.h0(f03);
                break;
            case 10:
                bj0 bj0Var = (bj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (bj0Var.getParentActivity() != null) {
                    Toast.makeText(bj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 11:
                uj0 uj0Var = (uj0) this.b;
                String str2 = (String) this.c;
                uj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                uj0Var.getContext().startActivity(intent);
                break;
            case 12:
                uj0 uj0Var2 = (uj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                uj0Var2.dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.xk) this.b).run((TLRPC.User) this.c);
                break;
            case 14:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 15:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (cs csVar : passcodeActivity.n.f) {
                    csVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 16:
                el0 el0Var = (el0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = el0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 17:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 18:
                fn0 fn0Var = (fn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = fn0Var.x;
                int i17 = result.type;
                if (i17 == 2) {
                    if (!(fn0Var.C.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = fn0Var.D.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i18);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    fn0Var.C = tL_secureRequiredType;
                                    fn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i17 == 1) {
                    if (!(fn0Var.C.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = fn0Var.D.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i19);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    fn0Var.C = tL_secureRequiredType2;
                                    fn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i17 == 3) {
                    if (!(fn0Var.C.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = fn0Var.D.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i20);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    fn0Var.C = tL_secureRequiredType3;
                                    fn0Var.P1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i17 == 4 && !(fn0Var.C.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = fn0Var.D.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i21);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                fn0Var.C = tL_secureRequiredType4;
                                fn0Var.P1();
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    fn0Var.V[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    fn0Var.V[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    fn0Var.V[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    fn0Var.V[7].setText(result.number);
                }
                int i22 = result.gender;
                if (i22 != 0) {
                    if (i22 == 1) {
                        fn0Var.w = "male";
                        fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i22 == 2) {
                        fn0Var.w = "female";
                        fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    fn0Var.s = str3;
                    String str4 = (String) fn0Var.V0.get(str3);
                    if (str4 != null) {
                        fn0Var.V[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    fn0Var.v = str5;
                    String str6 = (String) fn0Var.V0.get(str5);
                    if (str6 != null) {
                        fn0Var.V[6].setText(str6);
                    }
                }
                int i23 = result.birthDay;
                if (i23 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    fn0Var.V[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i24 = result.expiryDay;
                if (i24 <= 0 || (i11 = result.expiryMonth) <= 0 || (i12 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    fn0Var.V[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i12;
                    iArr[1] = i11;
                    iArr[2] = i24;
                    fn0Var.V[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 19:
                fn0 fn0Var2 = (fn0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    fn0Var2.G = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(fn0Var2.G);
                        fn0Var2.R1();
                        if (fn0Var2.W[0].getVisibility() == 0) {
                            fn0Var2.V[0].requestFocus();
                            AndroidUtilities.showKeyboard(fn0Var2.V[0]);
                        }
                        if (fn0Var2.K0 == 1) {
                            fn0Var2.B1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.z4.x0(fn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 20:
                fn0 fn0Var3 = (fn0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if (tL_error4 == null) {
                    fn0Var3.c1 = true;
                    fn0Var3.W0(true);
                    fn0Var3.finishFragment();
                    break;
                } else {
                    fn0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error4.text)) {
                        org.telegram.ui.Components.z4.x0(fn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        fn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error4.text);
                        break;
                    }
                }
            case 21:
                ((an0) this.b).a.H = ((TLRPC.TL_error) this.c).text;
                break;
            case 22:
                lo0 lo0Var = (lo0) this.b;
                View view = (View) this.c;
                lo0Var.D0(false);
                view.callOnClick();
                break;
            case 23:
                lo0 lo0Var2 = (lo0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                lo0Var2.H0(true, false);
                if (tL_error5 != null) {
                    if (tL_error5.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.j3 j3Var = lo0Var2.P;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = lo0Var2.P;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                        if (intValue < 60) {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.AppName);
                        int i25 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        lo0Var2.F0(string, LocaleController.formatString("FloodWaitTime", i25, objArr));
                        break;
                    } else {
                        lo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error5.text);
                        break;
                    }
                } else if (lo0Var2.getParentActivity() != null) {
                    kn0 kn0Var = lo0Var2.a0;
                    if (kn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(kn0Var);
                        lo0Var2.a0 = null;
                    }
                    lo0Var2.t0();
                    break;
                }
                break;
            case 24:
                lo0.W((lo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 25:
                lo0 lo0Var3 = (lo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = lo0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = ApplicationLoader.applicationContext;
                }
                if (obj == null) {
                    obj = LaunchActivity.D1;
                }
                if (obj != null) {
                    lo0Var3.X0 = true;
                    lo0Var3.c1 = 1;
                    TLRPC.InputInvoice inputInvoice = lo0Var3.Y0;
                    boolean z4 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z10 = z4 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z11 = z4 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z4 && (ko0Var2 = lo0Var3.W0) != null) {
                        ko0Var2.a(1);
                    }
                    lo0Var3.t0();
                    if (z4 && (ko0Var = lo0Var3.W0) != null) {
                        ko0Var.a(lo0Var3.c1);
                    }
                    long r02 = lo0Var3.r0();
                    int i26 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i26 > 0) {
                        str = UserObject.getForcedFirstName(lo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i26 < 0) {
                        i13 = i26;
                        r15 = 0;
                        r15 = 0;
                        TLRPC.Chat chat = lo0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long q02 = lo0Var3.q0();
                        int i27 = !z4 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string2 = z4 ? LocaleController.getString(z11 ? R.string.StarsGiveawaySentPopup : z10 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z4) {
                            int i28 = R.string.PaymentInfoHint;
                            String str7 = lo0Var3.O0[r15];
                            String str8 = lo0Var3.n0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r15] = str7;
                            objArr2[1] = str8;
                            formatString = LocaleController.formatString(i28, objArr2);
                        } else if (z11) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            String str9 = z10 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r15] = str;
                            formatString = LocaleController.formatPluralStringComma(str9, (int) q02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        U = LaunchActivity.U();
                        if (U == null) {
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(U);
                            org.telegram.ui.Components.ic M = (i13 == 0 || string2 == null || z11) ? string2 != null ? a02.M(string2, replaceTags, i27) : a02.Q(i27, 36, replaceTags) : a02.K(i27, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new mh.s9(r02, i15));
                            M.r = r15;
                            M.j = 5000;
                            if (messageArr[r15] != null) {
                                fg.d1 d1Var = new fg.d1(lo0Var3, M, z10, messageArr, 4);
                                org.telegram.ui.Components.nb nbVar = M.e;
                                if (nbVar != null) {
                                    nbVar.setOnClickListener(d1Var);
                                }
                            }
                            M.k(z11);
                            break;
                        }
                    }
                    i13 = i26;
                    r15 = 0;
                    long q022 = lo0Var3.q0();
                    int i272 = !z4 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z4) {
                    }
                    String string22 = z4 ? LocaleController.getString(z11 ? R.string.StarsGiveawaySentPopup : z10 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (z4) {
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                w31.T(photoViewer.B, photoViewer.j4, false, (oh.b) this.c, null);
                break;
            case 27:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                rs0 rs0Var = (rs0) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (rs0Var.getWindow() != null) {
                    rs0Var.setFocusable(true);
                    xn xnVar = photoViewer2.i4;
                    if (xnVar != null && (jkVar = xnVar.V) != null) {
                        jkVar.m0(false);
                        break;
                    }
                }
                break;
            case 28:
                lh.y0 y0Var = (lh.y0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                y0Var.run(bitmap);
                break;
            default:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                eg.o1 o1Var = (eg.o1) this.c;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                o1Var.e.h();
                o1Var.c.postRunnable(new ag.f(i14));
                photoViewer3.b0.removeView(photoViewer3.K1);
                break;
        }
    }
}
