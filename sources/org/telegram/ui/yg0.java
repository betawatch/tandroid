package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        TLRPC.Chat chat;
        String formatString;
        org.telegram.ui.Components.qc M;
        fo0 fo0Var;
        fo0 fo0Var2;
        hk hkVar;
        String str = "";
        int i12 = 18;
        switch (this.a) {
            case 0:
                zg0 zg0Var = (zg0) this.b;
                TLObject tLObject = (TLObject) this.c;
                jh0 jh0Var = zg0Var.a;
                ah0 f02 = jh0Var.f0();
                jh0Var.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = jh0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    jh0Var.getMessagesStorage().saveChatLinksCount(jh0Var.n, jh0Var.d.invitesCount);
                }
                jh0Var.h0(f02);
                break;
            case 1:
                vi0 vi0Var = (vi0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (vi0Var.getParentActivity() != null) {
                    Toast.makeText(vi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 2:
                oj0 oj0Var = (oj0) this.b;
                String str2 = (String) this.c;
                oj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                oj0Var.getContext().startActivity(intent);
                break;
            case 3:
                oj0 oj0Var2 = (oj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                oj0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Components.qy) this.b).run((TLRPC.User) this.c);
                break;
            case 5:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 6:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f3VarArr[0] = null;
                wk0.a = null;
                zArr[0] = true;
                break;
            case 7:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (vr vrVar : passcodeActivity.n.f) {
                    vrVar.l(0.0f);
                }
                runnable.run();
                break;
            case 8:
                bl0 bl0Var = (bl0) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                PasscodeActivity passcodeActivity2 = bl0Var.b;
                e1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                e1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.n0();
                if (passcodeActivity2.h0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 9:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 10:
                xm0 xm0Var = (xm0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = xm0Var.x;
                int i13 = result.type;
                if (i13 == 2) {
                    if (!(xm0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = xm0Var.G.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i14);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    xm0Var.F = tL_secureRequiredType;
                                    xm0Var.O1();
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                } else if (i13 == 1) {
                    if (!(xm0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = xm0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i15);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    xm0Var.F = tL_secureRequiredType2;
                                    xm0Var.O1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i13 == 3) {
                    if (!(xm0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = xm0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i16);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    xm0Var.F = tL_secureRequiredType3;
                                    xm0Var.O1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i13 == 4 && !(xm0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = xm0Var.G.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i17);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                xm0Var.F = tL_secureRequiredType4;
                                xm0Var.O1();
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    xm0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    xm0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    xm0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    xm0Var.Y[7].setText(result.number);
                }
                int i18 = result.gender;
                if (i18 != 0) {
                    if (i18 == 1) {
                        xm0Var.w = "male";
                        xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i18 == 2) {
                        xm0Var.w = "female";
                        xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    xm0Var.s = str3;
                    String str4 = (String) xm0Var.Y0.get(str3);
                    if (str4 != null) {
                        xm0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    xm0Var.v = str5;
                    String str6 = (String) xm0Var.Y0.get(str5);
                    if (str6 != null) {
                        xm0Var.Y[6].setText(str6);
                    }
                }
                int i19 = result.birthDay;
                if (i19 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    xm0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i20 = result.expiryDay;
                if (i20 <= 0 || (i10 = result.expiryMonth) <= 0 || (i11 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    xm0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i20;
                    xm0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 11:
                xm0 xm0Var2 = (xm0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    xm0Var2.J = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(xm0Var2.J);
                        xm0Var2.Q1();
                        if (xm0Var2.Z[0].getVisibility() == 0) {
                            xm0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(xm0Var2.Y[0]);
                        }
                        if (xm0Var2.N0 == 1) {
                            xm0Var2.A1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.f5.w0(xm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 12:
                xm0 xm0Var3 = (xm0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error == null) {
                    xm0Var3.f1 = true;
                    xm0Var3.V0(true);
                    xm0Var3.finishFragment();
                    break;
                } else {
                    xm0Var3.M1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.f5.w0(xm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        xm0Var3.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    }
                }
            case 13:
                ((sm0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 14:
                go0 go0Var = (go0) this.b;
                View view = (View) this.c;
                go0Var.D0(false);
                view.callOnClick();
                break;
            case 15:
                go0 go0Var2 = (go0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                go0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (tL_error2.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.j3 j3Var = go0Var2.S;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = go0Var2.S;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                        go0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        go0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                        break;
                    }
                } else if (go0Var2.getParentActivity() != null) {
                    cn0 cn0Var = go0Var2.d0;
                    if (cn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(cn0Var);
                        go0Var2.d0 = null;
                    }
                    go0Var2.t0();
                    break;
                }
                break;
            case 16:
                go0.W((go0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 17:
                go0 go0Var3 = (go0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = go0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    go0Var3.a1 = true;
                    go0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = go0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (fo0Var2 = go0Var3.Z0) != null) {
                        fo0Var2.c(1);
                    }
                    go0Var3.t0();
                    if (z10 && (fo0Var = go0Var3.Z0) != null) {
                        fo0Var.c(go0Var3.f1);
                    }
                    long r02 = go0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(go0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = go0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = go0Var3.q0();
                    int i21 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String string = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, go0Var3.R0[0], go0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (r02 == 0 || string == null || z12) {
                            String str7 = string;
                            M = str7 != null ? a02.M(str7, replaceTags, i21) : a02.Q(i21, 36, replaceTags);
                        } else {
                            M = a02.K(i21, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new ai.l4(r02, 2));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ci.y3 y3Var = new ci.y3(go0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(y3Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                v21.U(photoViewer.E, photoViewer.m4, false, (ci.b) this.c, null);
                break;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                os0 os0Var = (os0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (os0Var.getWindow() != null) {
                    os0Var.setFocusable(true);
                    sn snVar = photoViewer2.l4;
                    if (snVar != null && (hkVar = snVar.Y) != null) {
                        hkVar.k0(false);
                        break;
                    }
                }
                break;
            case 20:
                ai.u2 u2Var = (ai.u2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                u2Var.run(bitmap);
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                rg.w0 w0Var = (rg.w0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.c.postRunnable(new mj0(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 22:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (e6Var != null) {
                    ArrayList arrayList = e6Var.h;
                    org.telegram.ui.Components.b6 b6Var = e6Var.n;
                    if (b6Var != null) {
                        arrayList.add(b6Var);
                    }
                    org.telegram.ui.Components.b6 b6Var2 = e6Var.r;
                    if (b6Var2 != null) {
                        arrayList.add(b6Var2);
                    }
                    org.telegram.ui.Components.b6 b6Var3 = e6Var.s;
                    if (b6Var3 != null) {
                        arrayList.add(b6Var3);
                    }
                    e6Var.n = new org.telegram.ui.Components.b6(bitmap2);
                    e6Var.r = null;
                    e6Var.s = null;
                    e6Var.t();
                    break;
                }
                break;
            case 23:
                pr0 pr0Var = (pr0) this.b;
                View view2 = (View) this.c;
                pr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = pr0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer4.E2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 24:
                zs0 zs0Var = (zs0) this.b;
                org.telegram.ui.Components.a81 a81Var = (org.telegram.ui.Components.a81) this.c;
                zs0Var.getClass();
                if (a81Var.p() > 0 && a81Var.n() >= a81Var.p() - 590) {
                    zs0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 25:
                dt0 dt0Var = (dt0) this.b;
                rg.w0 w0Var2 = (rg.w0) this.c;
                w0Var2.e.h();
                w0Var2.c.postRunnable(new mj0(i12));
                try {
                    dt0Var.b.e0.removeView(w0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                is0 is0Var = (is0) this.b;
                ah.v vVar = (ah.v) this.c;
                PhotoViewer photoViewer5 = is0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 27:
                nt0 nt0Var = (nt0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                nt0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 28:
                nt0 nt0Var2 = (nt0) this.b;
                lu0 lu0Var = (lu0) this.c;
                nt0Var2.r.s4 = false;
                if (!lu0Var.s) {
                    lu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            default:
                sv0 sv0Var = (sv0) this.b;
                String str8 = (String) this.c;
                sv0Var.getClass();
                AndroidUtilities.addToClipboard(str8);
                sv0Var.c(true);
                break;
        }
    }
}
