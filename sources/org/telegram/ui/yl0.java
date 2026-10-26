package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0399  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String formatPluralString;
        int i10;
        ?? r15;
        String formatString;
        org.telegram.ui.ActionBar.r2 U;
        oo0 oo0Var;
        oo0 oo0Var2;
        hk hkVar;
        String str = "";
        int i11 = 22;
        int i12 = 2;
        String str2 = null;
        switch (this.a) {
            case 0:
                in0 in0Var = (in0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    in0Var.J = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(in0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.n0(in0Var.J);
                        in0Var.S1();
                        if (in0Var.Z[0].getVisibility() == 0) {
                            in0Var.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(in0Var.Y[0]);
                        }
                        if (in0Var.N0 == 1) {
                            in0Var.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                in0 in0Var2 = (in0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    in0Var2.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        in0Var2.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.g5.w0(in0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    in0Var2.f1 = true;
                    in0Var2.W0(true);
                    in0Var2.finishFragment();
                    break;
                }
            case 2:
                ((dn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 3:
                po0 po0Var = (po0) this.b;
                View view = (View) this.c;
                po0Var.E0(false);
                view.callOnClick();
                break;
            case 4:
                po0 po0Var2 = (po0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                po0Var2.I0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            po0Var2.G0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            if (intValue < 60) {
                                c10 = 0;
                                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                            } else {
                                c10 = 0;
                                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                            }
                            String string = LocaleController.getString(R.string.AppName);
                            int i13 = R.string.FloodWaitTime;
                            Object[] objArr = new Object[1];
                            objArr[c10] = formatPluralString;
                            po0Var2.G0(string, LocaleController.formatString("FloodWaitTime", i13, objArr));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.h3 h3Var = po0Var2.S;
                        try {
                            h3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                        org.telegram.ui.Cells.h3 h3Var2 = po0Var2.S;
                        h3Var2.a.setText("");
                        h3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (po0Var2.getParentActivity() != null) {
                    nn0 nn0Var = po0Var2.d0;
                    if (nn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(nn0Var);
                        po0Var2.d0 = null;
                    }
                    po0Var2.u0();
                    break;
                }
                break;
            case 5:
                po0.X((po0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 6:
                po0 po0Var3 = (po0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = po0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity != null) {
                    po0Var3.a1 = true;
                    po0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = po0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (oo0Var2 = po0Var3.Z0) != null) {
                        oo0Var2.a(1);
                    }
                    po0Var3.u0();
                    if (z10 && (oo0Var = po0Var3.Z0) != null) {
                        oo0Var.a(po0Var3.f1);
                    }
                    long s02 = po0Var3.s0();
                    int i14 = (s02 > 0L ? 1 : (s02 == 0L ? 0 : -1));
                    if (i14 <= 0) {
                        if (i14 < 0) {
                            boolean z13 = false;
                            i10 = i14;
                            TLRPC.Chat chat = po0Var3.getMessagesController().getChat(Long.valueOf(-s02));
                            r15 = z13;
                            if (chat != null) {
                                str = chat.title;
                                r15 = z13;
                            }
                            long r02 = po0Var3.r0();
                            int i15 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                            if (z10) {
                                str2 = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                            }
                            String str3 = str2;
                            if (z10) {
                                int i16 = R.string.PaymentInfoHint;
                                String str4 = po0Var3.R0[r15];
                                String str5 = po0Var3.q0;
                                Object[] objArr2 = new Object[2];
                                objArr2[r15] = str4;
                                objArr2[1] = str5;
                                formatString = LocaleController.formatString(i16, objArr2);
                            } else if (z12) {
                                formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) r02);
                            } else {
                                String str6 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                                Object[] objArr3 = new Object[1];
                                objArr3[r15] = str;
                                formatString = LocaleController.formatPluralStringComma(str6, (int) r02, objArr3);
                            }
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                            U = LaunchActivity.U();
                            if (U == null) {
                                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(U);
                                org.telegram.ui.Components.qc M = (i10 == 0 || str3 == null || z12) ? str3 != null ? b02.M(str3, replaceTags, i15) : b02.R(i15, 36, replaceTags) : b02.K(i15, str3, replaceTags, LocaleController.getString(R.string.ViewInChat), new bi.j4(s02, i12));
                                M.s = r15;
                                M.j = 5000;
                                if (messageArr[r15] != null) {
                                    di.y3 y3Var = new di.y3(po0Var3, M, z11, messageArr, 3);
                                    org.telegram.ui.Components.ub ubVar = M.e;
                                    if (ubVar != null) {
                                        ubVar.setOnClickListener(y3Var);
                                    }
                                }
                                M.k(z12);
                                break;
                            }
                        }
                    } else {
                        str = UserObject.getForcedFirstName(po0Var3.getMessagesController().getUser(Long.valueOf(s02)));
                    }
                    r15 = 0;
                    i10 = i14;
                    long r022 = po0Var3.r0();
                    int i152 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    String str32 = str2;
                    if (z10) {
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                    }
                }
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                a31.T(photoViewer.E, photoViewer.m4, false, (di.b) this.c, null);
                break;
            case 8:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ts0 ts0Var = (ts0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (ts0Var.getWindow() != null) {
                    ts0Var.setFocusable(true);
                    un unVar = photoViewer2.l4;
                    if (unVar != null && (hkVar = unVar.Y) != null) {
                        hkVar.j0(false);
                        break;
                    }
                }
                break;
            case 9:
                bi.t2 t2Var = (bi.t2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                t2Var.run(bitmap);
                break;
            case 10:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                sg.x0 x0Var = (sg.x0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                x0Var.e.h();
                x0Var.c.postRunnable(new u90(i11));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 11:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (g6Var != null) {
                    ArrayList arrayList = g6Var.h;
                    org.telegram.ui.Components.d6 d6Var = g6Var.n;
                    if (d6Var != null) {
                        arrayList.add(d6Var);
                    }
                    org.telegram.ui.Components.d6 d6Var2 = g6Var.r;
                    if (d6Var2 != null) {
                        arrayList.add(d6Var2);
                    }
                    org.telegram.ui.Components.d6 d6Var3 = g6Var.s;
                    if (d6Var3 != null) {
                        arrayList.add(d6Var3);
                    }
                    g6Var.n = new org.telegram.ui.Components.d6(bitmap2);
                    g6Var.r = null;
                    g6Var.s = null;
                    g6Var.t();
                    break;
                }
                break;
            case 12:
                ur0 ur0Var = (ur0) this.b;
                View view2 = (View) this.c;
                ur0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = ur0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer4.E2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 13:
                et0 et0Var = (et0) this.b;
                org.telegram.ui.Components.s81 s81Var = (org.telegram.ui.Components.s81) this.c;
                et0Var.getClass();
                if (s81Var.p() > 0 && s81Var.n() >= s81Var.p() - 590) {
                    et0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 14:
                it0 it0Var = (it0) this.b;
                sg.x0 x0Var2 = (sg.x0) this.c;
                x0Var2.e.h();
                x0Var2.c.postRunnable(new u90(i11));
                try {
                    it0Var.b.e0.removeView(x0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ns0 ns0Var = (ns0) this.b;
                bh.p pVar = (bh.p) this.c;
                PhotoViewer photoViewer5 = ns0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) pVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 16:
                st0 st0Var = (st0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                st0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 17:
                st0 st0Var2 = (st0) this.b;
                qu0 qu0Var = (qu0) this.c;
                st0Var2.r.s4 = false;
                if (!qu0Var.s) {
                    qu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 18:
                xv0 xv0Var = (xv0) this.b;
                String str7 = (String) this.c;
                xv0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                xv0Var.c(true);
                break;
            case 19:
                xv0 xv0Var2 = (xv0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                xv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                xv0Var2.c(true);
                break;
            case 20:
                xv0 xv0Var3 = (xv0) this.b;
                SendMessagesHelper.getInstance(xv0Var3.H.currentAccount).deletePollOption(xv0Var3.H, (byte[]) this.c);
                xv0Var3.c(true);
                break;
            case 21:
                PrivacyControlActivity.X((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 22:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.y0();
                    break;
                }
                break;
            case 23:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.z0();
                break;
            case 24:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) this.c;
                boolean z14 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z14;
                a9Var.setChecked(z14);
                break;
            case 25:
                ((sx0) this.b).getMessagesController().unblockPeer(((Long) this.c).longValue());
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr4 = (Object[]) this.c;
                int i17 = ProfileActivity.R6;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i18 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i18);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i18, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr4[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new un(bundle), true);
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j10 = profileActivity2.A2;
                if (j10 == 0) {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i19 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i19);
                    if (AndroidUtilities.isTablet()) {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i19, Long.valueOf(-profileActivity2.f1));
                    } else {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i19, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.J1 = 0;
                    profileActivity2.finishFragment();
                    break;
                } else {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.wc.a(profileActivity2)) {
                        org.telegram.ui.Components.wc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.p5(true, false);
                        break;
                    }
                }
                break;
            case 28:
                AgentController agentController = (AgentController) this.b;
                String str8 = (String) this.c;
                int i20 = ProfileActivity.R6;
                agentController.disconnect(str8);
                break;
            default:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                int i21 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("https://" + profileActivity3.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat2));
                break;
        }
    }
}
