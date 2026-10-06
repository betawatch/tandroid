package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wj0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        TLRPC.Chat chat;
        String string;
        String formatString;
        org.telegram.ui.Components.rc M;
        ro0 ro0Var;
        ro0 ro0Var2;
        jk jkVar;
        String str = "";
        int i12 = 12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((ft) this.b).run((TLRPC.User) this.c);
                break;
            case 1:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                es[] esVarArr = passcodeActivity.n.f;
                int length = esVarArr.length;
                while (i13 < length) {
                    esVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 3:
                ll0 ll0Var = (ll0) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                PasscodeActivity passcodeActivity2 = ll0Var.b;
                f1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.q0();
                if (passcodeActivity2.k0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 4:
                ((PasskeysActivity) this.b).X((TL_account.Passkey) this.c);
                break;
            case 5:
                kn0 kn0Var = (kn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = kn0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = kn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    kn0Var.F = tL_secureRequiredType;
                                    kn0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = kn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    kn0Var.F = tL_secureRequiredType2;
                                    kn0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = kn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    kn0Var.F = tL_secureRequiredType3;
                                    kn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = kn0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                kn0Var.F = tL_secureRequiredType4;
                                kn0Var.P1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    kn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    kn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    kn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    kn0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        kn0Var.w = "male";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        kn0Var.w = "female";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    kn0Var.s = str2;
                    String str3 = (String) kn0Var.Y0.get(str2);
                    if (str3 != null) {
                        kn0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    kn0Var.v = str4;
                    String str5 = (String) kn0Var.Y0.get(str4);
                    if (str5 != null) {
                        kn0Var.Y[6].setText(str5);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    kn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    kn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    kn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 6:
                kn0 kn0Var2 = (kn0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(kn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(kn0Var2.J);
                        kn0Var2.R1();
                        if (kn0Var2.Z[0].getVisibility() == 0) {
                            kn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(kn0Var2.Y[0]);
                        }
                        if (kn0Var2.N0 == 1) {
                            kn0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 7:
                kn0 kn0Var3 = (kn0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    kn0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        kn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.e5.x0(kn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    kn0Var3.f1 = true;
                    kn0Var3.W0(true);
                    kn0Var3.finishFragment();
                    break;
                }
            case 8:
                ((fn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 9:
                so0 so0Var = (so0) this.b;
                View view = (View) this.c;
                so0Var.D0(false);
                view.callOnClick();
                break;
            case 10:
                so0 so0Var2 = (so0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                so0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            so0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            so0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.k3 k3Var = so0Var2.S;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = so0Var2.S;
                        k3Var2.a.setText("");
                        k3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (so0Var2.getParentActivity() != null) {
                    pn0 pn0Var = so0Var2.d0;
                    if (pn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(pn0Var);
                        so0Var2.d0 = null;
                    }
                    so0Var2.t0();
                    break;
                }
                break;
            case 11:
                so0.U((so0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 12:
                so0 so0Var3 = (so0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = so0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    so0Var3.a1 = true;
                    so0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = so0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (ro0Var2 = so0Var3.Z0) != null) {
                        ro0Var2.a(1);
                    }
                    so0Var3.t0();
                    if (z10 && (ro0Var = so0Var3.Z0) != null) {
                        ro0Var.a(so0Var3.f1);
                    }
                    long r02 = so0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(so0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = so0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = so0Var3.q0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, so0Var3.R0[0], so0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(U);
                        if (r02 == 0 || string == null || z12) {
                            String str6 = string;
                            M = str6 != null ? a02.M(str6, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new tn0(r02, i13));
                        }
                        org.telegram.ui.Components.rc rcVar = M;
                        rcVar.r = false;
                        rcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ai.l5 l5Var = new ai.l5(so0Var3, rcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.vb vbVar = rcVar.e;
                            if (vbVar != null) {
                                vbVar.setOnClickListener(l5Var);
                            }
                        }
                        rcVar.k(z12);
                        break;
                    }
                }
                break;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                z31.R(photoViewer.E, photoViewer.m4, false, (ai.d) this.c, null);
                break;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                bt0 bt0Var = (bt0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bt0Var.getWindow() != null) {
                    bt0Var.setFocusable(true);
                    yn ynVar = photoViewer2.l4;
                    if (ynVar != null && (jkVar = ynVar.W) != null) {
                        jkVar.m0(false);
                        break;
                    }
                }
                break;
            case 15:
                ai.l lVar = (ai.l) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                lVar.run(bitmap);
                break;
            case 16:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                qg.w0 w0Var = (qg.w0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.c.postRunnable(new n21(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 17:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (d6Var != null) {
                    ArrayList arrayList = d6Var.h;
                    org.telegram.ui.Components.a6 a6Var = d6Var.n;
                    if (a6Var != null) {
                        arrayList.add(a6Var);
                    }
                    org.telegram.ui.Components.a6 a6Var2 = d6Var.r;
                    if (a6Var2 != null) {
                        arrayList.add(a6Var2);
                    }
                    org.telegram.ui.Components.a6 a6Var3 = d6Var.s;
                    if (a6Var3 != null) {
                        arrayList.add(a6Var3);
                    }
                    d6Var.n = new org.telegram.ui.Components.a6(bitmap2);
                    d6Var.r = null;
                    d6Var.s = null;
                    d6Var.t();
                    break;
                }
                break;
            case 18:
                bs0 bs0Var = (bs0) this.b;
                View view2 = (View) this.c;
                bs0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = bs0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pu0 pu0Var = photoViewer4.E2;
                if (pu0Var != null) {
                    pu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 19:
                mt0 mt0Var = (mt0) this.b;
                org.telegram.ui.Components.e81 e81Var = (org.telegram.ui.Components.e81) this.c;
                mt0Var.getClass();
                if (e81Var.p() > 0 && e81Var.n() >= e81Var.p() - 590) {
                    mt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 20:
                qt0 qt0Var = (qt0) this.b;
                qg.w0 w0Var2 = (qg.w0) this.c;
                w0Var2.e.h();
                w0Var2.c.postRunnable(new n21(i12));
                try {
                    qt0Var.b.e0.removeView(w0Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 21:
                vs0 vs0Var = (vs0) this.b;
                ci.m6 m6Var = (ci.m6) this.c;
                PhotoViewer photoViewer5 = vs0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) m6Var.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 22:
                au0 au0Var = (au0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                au0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 23:
                au0 au0Var2 = (au0) this.b;
                yu0 yu0Var = (yu0) this.c;
                au0Var2.r.s4 = false;
                if (!yu0Var.s) {
                    yu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 24:
                gw0 gw0Var = (gw0) this.b;
                String str7 = (String) this.c;
                gw0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                gw0Var.c(true);
                break;
            case 25:
                gw0 gw0Var2 = (gw0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                gw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                gw0Var2.c(true);
                break;
            case 26:
                gw0 gw0Var3 = (gw0) this.b;
                SendMessagesHelper.getInstance(gw0Var3.H.currentAccount).deletePollOption(gw0Var3.H, (byte[]) this.c);
                gw0Var3.c(true);
                break;
            case 27:
                PrivacyControlActivity.U((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 28:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.y0();
                break;
        }
    }
}
