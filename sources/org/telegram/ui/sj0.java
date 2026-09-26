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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sj0(int i10, Object obj, Object obj2) {
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
        org.telegram.ui.Components.qc M;
        no0 no0Var;
        no0 no0Var2;
        jk jkVar;
        String str = "";
        int i12 = 12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                wj0 wj0Var = (wj0) this.b;
                String str2 = (String) this.c;
                wj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                wj0Var.getContext().startActivity(intent);
                break;
            case 1:
                wj0 wj0Var2 = (wj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                wj0Var2.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 2:
                ((bt) this.b).run((TLRPC.User) this.c);
                break;
            case 3:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                as[] asVarArr = passcodeActivity.n.f;
                int length = asVarArr.length;
                while (i13 < length) {
                    asVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 5:
                gl0 gl0Var = (gl0) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                PasscodeActivity passcodeActivity2 = gl0Var.b;
                e1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                e1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 6:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 7:
                gn0 gn0Var = (gn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = gn0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(gn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = gn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) gn0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    gn0Var.F = tL_secureRequiredType;
                                    gn0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(gn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = gn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) gn0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    gn0Var.F = tL_secureRequiredType2;
                                    gn0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(gn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = gn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) gn0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    gn0Var.F = tL_secureRequiredType3;
                                    gn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(gn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = gn0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) gn0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                gn0Var.F = tL_secureRequiredType4;
                                gn0Var.P1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    gn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    gn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    gn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    gn0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        gn0Var.w = "male";
                        gn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        gn0Var.w = "female";
                        gn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    gn0Var.s = str3;
                    String str4 = (String) gn0Var.Y0.get(str3);
                    if (str4 != null) {
                        gn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    gn0Var.v = str5;
                    String str6 = (String) gn0Var.Y0.get(str5);
                    if (str6 != null) {
                        gn0Var.Y[6].setText(str6);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    gn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    gn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    gn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 8:
                gn0 gn0Var2 = (gn0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    gn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(gn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(gn0Var2.J);
                        gn0Var2.R1();
                        if (gn0Var2.Z[0].getVisibility() == 0) {
                            gn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(gn0Var2.Y[0]);
                        }
                        if (gn0Var2.N0 == 1) {
                            gn0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                gn0 gn0Var3 = (gn0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    gn0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        gn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.e5.x0(gn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    gn0Var3.f1 = true;
                    gn0Var3.W0(true);
                    gn0Var3.finishFragment();
                    break;
                }
            case 10:
                ((bn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 11:
                oo0 oo0Var = (oo0) this.b;
                View view = (View) this.c;
                oo0Var.D0(false);
                view.callOnClick();
                break;
            case 12:
                oo0 oo0Var2 = (oo0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                oo0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            oo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            oo0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.k3 k3Var = oo0Var2.S;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = oo0Var2.S;
                        k3Var2.a.setText("");
                        k3Var2.b = false;
                        k3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (oo0Var2.getParentActivity() != null) {
                    ln0 ln0Var = oo0Var2.d0;
                    if (ln0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ln0Var);
                        oo0Var2.d0 = null;
                    }
                    oo0Var2.t0();
                    break;
                }
                break;
            case 13:
                oo0.W((oo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 14:
                oo0 oo0Var3 = (oo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = oo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    oo0Var3.a1 = true;
                    oo0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = oo0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (no0Var2 = oo0Var3.Z0) != null) {
                        no0Var2.a(1);
                    }
                    oo0Var3.t0();
                    if (z10 && (no0Var = oo0Var3.Z0) != null) {
                        no0Var.a(oo0Var3.f1);
                    }
                    long r02 = oo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(oo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = oo0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = oo0Var3.q0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, oo0Var3.R0[0], oo0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (r02 == 0 || string == null || z12) {
                            String str7 = string;
                            M = str7 != null ? a02.M(str7, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new pn0(r02, i13));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ai.l5 l5Var = new ai.l5(oo0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(l5Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                z31.T(photoViewer.E, photoViewer.m4, false, (ai.d) this.c, null);
                break;
            case 16:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ys0 ys0Var = (ys0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (ys0Var.getWindow() != null) {
                    ys0Var.setFocusable(true);
                    wn wnVar = photoViewer2.l4;
                    if (wnVar != null && (jkVar = wnVar.Y) != null) {
                        jkVar.m0(false);
                        break;
                    }
                }
                break;
            case 17:
                ai.l lVar = (ai.l) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                lVar.run(bitmap);
                break;
            case 18:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                qg.x0 x0Var = (qg.x0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                x0Var.e.h();
                x0Var.c.postRunnable(new l21(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 19:
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
            case 20:
                yr0 yr0Var = (yr0) this.b;
                View view2 = (View) this.c;
                yr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = yr0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                mu0 mu0Var = photoViewer4.E2;
                if (mu0Var != null) {
                    mu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 21:
                jt0 jt0Var = (jt0) this.b;
                org.telegram.ui.Components.s71 s71Var = (org.telegram.ui.Components.s71) this.c;
                jt0Var.getClass();
                if (s71Var.p() > 0 && s71Var.n() >= s71Var.p() - 590) {
                    jt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 22:
                nt0 nt0Var = (nt0) this.b;
                qg.x0 x0Var2 = (qg.x0) this.c;
                x0Var2.e.h();
                x0Var2.c.postRunnable(new l21(i12));
                try {
                    nt0Var.b.e0.removeView(x0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ss0 ss0Var = (ss0) this.b;
                ci.m6 m6Var = (ci.m6) this.c;
                PhotoViewer photoViewer5 = ss0Var.b;
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
            case 24:
                xt0 xt0Var = (xt0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                xt0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 25:
                xt0 xt0Var2 = (xt0) this.b;
                vu0 vu0Var = (vu0) this.c;
                xt0Var2.r.s4 = false;
                if (!vu0Var.s) {
                    vu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 26:
                dw0 dw0Var = (dw0) this.b;
                String str8 = (String) this.c;
                dw0Var.getClass();
                AndroidUtilities.addToClipboard(str8);
                dw0Var.c(true);
                break;
            case 27:
                dw0 dw0Var2 = (dw0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                dw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                dw0Var2.c(true);
                break;
            case 28:
                dw0 dw0Var3 = (dw0) this.b;
                SendMessagesHelper.getInstance(dw0Var3.H.currentAccount).deletePollOption(dw0Var3.H, (byte[]) this.c);
                dw0Var3.c(true);
                break;
            default:
                PrivacyControlActivity.W((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
        }
    }
}
