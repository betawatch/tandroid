package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tf0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        char c10;
        String formatPluralString;
        int i12;
        boolean z10;
        String formatString;
        org.telegram.ui.ActionBar.n2 U;
        uo0 uo0Var;
        uo0 uo0Var2;
        ok okVar;
        String str = "";
        switch (this.a) {
            case 0:
                ((zf0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 1:
                zf0 zf0Var = (zf0) this.b;
                Runnable runnable = (Runnable) this.c;
                cs csVar = zf0Var.f;
                int i13 = 0;
                while (true) {
                    es[] esVarArr = csVar.f;
                    if (i13 >= esVarArr.length) {
                        runnable.run();
                        csVar.e = false;
                        break;
                    } else {
                        esVarArr[i13].l(0.0f);
                        i13++;
                    }
                }
            case 2:
                ((t3) this.b).run((String) this.c);
                break;
            case 3:
                vg0 vg0Var = (vg0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                wg0 wg0Var = vg0Var.V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    wg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                    alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.T = string;
                    wg0Var.n = wg0Var.showDialog(b2Var, true, null);
                    wg0Var.c0 = true;
                    break;
                }
                break;
            case 4:
                zg0.V((zg0) this.b, (org.telegram.ui.ActionBar.b2) this.c);
                break;
            case 5:
                zh0 zh0Var = (zh0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                zh0Var.c0 = false;
                if (tL_error == null) {
                    qh0 f02 = zh0Var.f0();
                    zh0Var.j0.clear();
                    zh0Var.h0(f02);
                    break;
                }
                break;
            case 6:
                ph0 ph0Var = (ph0) this.b;
                TLObject tLObject = (TLObject) this.c;
                zh0 zh0Var2 = ph0Var.a;
                qh0 f03 = zh0Var2.f0();
                zh0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = zh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    zh0Var2.getMessagesStorage().saveChatLinksCount(zh0Var2.n, zh0Var2.d.invitesCount);
                }
                zh0Var2.h0(f03);
                break;
            case 7:
                lj0 lj0Var = (lj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (lj0Var.getParentActivity() != null) {
                    Toast.makeText(lj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 8:
                dk0 dk0Var = (dk0) this.b;
                String str2 = (String) this.c;
                dk0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                dk0Var.getContext().startActivity(intent);
                break;
            case 9:
                dk0 dk0Var2 = (dk0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                dk0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 10:
                ((ft) this.b).run((TLRPC.User) this.c);
                break;
            case 11:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 12:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f3VarArr[0] = null;
                ml0.a = null;
                zArr[0] = true;
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (es esVar : passcodeActivity.n.f) {
                    esVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 14:
                ql0 ql0Var = (ql0) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                PasscodeActivity passcodeActivity2 = ql0Var.b;
                f1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.n0();
                if (passcodeActivity2.h0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 16:
                nn0 nn0Var = (nn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = nn0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(nn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = nn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) nn0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    nn0Var.F = tL_secureRequiredType;
                                    nn0Var.O1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(nn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = nn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) nn0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    nn0Var.F = tL_secureRequiredType2;
                                    nn0Var.O1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(nn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = nn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) nn0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    nn0Var.F = tL_secureRequiredType3;
                                    nn0Var.O1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(nn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = nn0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) nn0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                nn0Var.F = tL_secureRequiredType4;
                                nn0Var.O1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    nn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    nn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    nn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    nn0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        nn0Var.w = "male";
                        nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        nn0Var.w = "female";
                        nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    nn0Var.s = str3;
                    String str4 = (String) nn0Var.Y0.get(str3);
                    if (str4 != null) {
                        nn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    nn0Var.v = str5;
                    String str6 = (String) nn0Var.Y0.get(str5);
                    if (str6 != null) {
                        nn0Var.Y[6].setText(str6);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    nn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 <= 0 || (i10 = result.expiryMonth) <= 0 || (i11 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    nn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    nn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 17:
                nn0 nn0Var2 = (nn0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    nn0Var2.J = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(nn0Var2.J);
                        nn0Var2.Q1();
                        if (nn0Var2.Z[0].getVisibility() == 0) {
                            nn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(nn0Var2.Y[0]);
                        }
                        if (nn0Var2.N0 == 1) {
                            nn0Var2.A1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.g5.w0(nn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 18:
                nn0 nn0Var3 = (nn0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tL_error2 == null) {
                    nn0Var3.f1 = true;
                    nn0Var3.V0(true);
                    nn0Var3.finishFragment();
                    break;
                } else {
                    nn0Var3.M1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.g5.w0(nn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        nn0Var3.L1(LocaleController.getString(R.string.AppName), tL_error2.text);
                        break;
                    }
                }
            case 19:
                ((in0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 20:
                vo0 vo0Var = (vo0) this.b;
                View view = (View) this.c;
                vo0Var.D0(false);
                view.callOnClick();
                break;
            case 21:
                vo0 vo0Var2 = (vo0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                vo0Var2.H0(true, false);
                if (tL_error3 != null) {
                    if (tL_error3.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.k3 k3Var = vo0Var2.S;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = vo0Var2.S;
                        k3Var2.a.setText("");
                        k3Var2.b = false;
                        k3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error3.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c10 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string2 = LocaleController.getString(R.string.AppName);
                        int i22 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c10] = formatPluralString;
                        vo0Var2.F0(string2, LocaleController.formatString("FloodWaitTime", i22, objArr));
                        break;
                    } else {
                        vo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error3.text);
                        break;
                    }
                } else if (vo0Var2.getParentActivity() != null) {
                    sn0 sn0Var = vo0Var2.d0;
                    if (sn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(sn0Var);
                        vo0Var2.d0 = null;
                    }
                    vo0Var2.t0();
                    break;
                }
                break;
            case 22:
                vo0.W((vo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 23:
                vo0 vo0Var3 = (vo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = vo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    vo0Var3.a1 = true;
                    vo0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = vo0Var3.b1;
                    boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z11 && (uo0Var2 = vo0Var3.Z0) != null) {
                        uo0Var2.a(1);
                    }
                    vo0Var3.t0();
                    if (z11 && (uo0Var = vo0Var3.Z0) != null) {
                        uo0Var.a(vo0Var3.f1);
                    }
                    long r02 = vo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(vo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0) {
                        i12 = 0;
                        z10 = z12;
                        TLRPC.Chat chat = vo0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long q02 = vo0Var3.q0();
                        int i23 = !z11 ? (z10 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string3 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z10 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z11) {
                            int i24 = R.string.PaymentInfoHint;
                            String str7 = vo0Var3.R0[i12];
                            String str8 = vo0Var3.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[i12] = str7;
                            objArr2[1] = str8;
                            formatString = LocaleController.formatString(i24, objArr2);
                        } else if (z13) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            String str9 = z10 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[i12] = str;
                            formatString = LocaleController.formatPluralStringComma(str9, (int) q02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        U = LaunchActivity.U();
                        if (U == null) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(U);
                            org.telegram.ui.Components.tc M = (r02 == 0 || string3 == null || z13) ? string3 != null ? a02.M(string3, replaceTags, i23) : a02.Q(i23, 36, replaceTags) : a02.K(i23, string3, replaceTags, LocaleController.getString(R.string.ViewInChat), new wn0(r02, i12));
                            M.r = false;
                            M.j = 5000;
                            if (messageArr[0] != null) {
                                ai.m5 m5Var = new ai.m5(vo0Var3, M, z10, messageArr, 3);
                                org.telegram.ui.Components.xb xbVar = M.e;
                                if (xbVar != null) {
                                    xbVar.setOnClickListener(m5Var);
                                }
                            }
                            M.k(z13);
                            break;
                        }
                    }
                    i12 = 0;
                    z10 = z12;
                    long q022 = vo0Var3.q0();
                    int i232 = !z11 ? (z10 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z11) {
                    }
                    String string32 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z10 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (z11) {
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                    }
                }
                break;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                h41.U(photoViewer.E, photoViewer.m4, false, (ai.d) this.c, null);
                break;
            case 25:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                gt0 gt0Var = (gt0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (gt0Var.getWindow() != null) {
                    gt0Var.setFocusable(true);
                    zn znVar = photoViewer2.l4;
                    if (znVar != null && (okVar = znVar.Y) != null) {
                        okVar.k0(false);
                        break;
                    }
                }
                break;
            case 26:
                ai.l lVar = (ai.l) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                lVar.run(bitmap);
                break;
            case 27:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                qg.w0 w0Var = (qg.w0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.c.postRunnable(new t21(14));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 28:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (f6Var != null) {
                    ArrayList arrayList2 = f6Var.h;
                    org.telegram.ui.Components.c6 c6Var = f6Var.n;
                    if (c6Var != null) {
                        arrayList2.add(c6Var);
                    }
                    org.telegram.ui.Components.c6 c6Var2 = f6Var.r;
                    if (c6Var2 != null) {
                        arrayList2.add(c6Var2);
                    }
                    org.telegram.ui.Components.c6 c6Var3 = f6Var.s;
                    if (c6Var3 != null) {
                        arrayList2.add(c6Var3);
                    }
                    f6Var.n = new org.telegram.ui.Components.c6(bitmap2);
                    f6Var.r = null;
                    f6Var.s = null;
                    f6Var.t();
                    break;
                }
                break;
            default:
                gs0 gs0Var = (gs0) this.b;
                View view2 = (View) this.c;
                gs0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = gs0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                vu0 vu0Var = photoViewer4.E2;
                if (vu0Var != null) {
                    vu0Var.setOutlineProvider(null);
                    break;
                }
                break;
        }
    }
}
