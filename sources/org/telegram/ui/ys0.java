package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ys0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        org.telegram.messenger.q8 q8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i12 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                fh.v vVar = (fh.v) obj;
                PhotoViewer photoViewer = ((xr0) obj2).b;
                if (photoViewer.y3 != null) {
                    ImageView imageView = photoViewer.t3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        photoViewer.t3.setImageBitmap(photoViewer.y3);
                    }
                    ((ImageReceiver) vVar.c).setImageBitmap(photoViewer.y3);
                    break;
                }
                break;
            case 1:
                ((dt0) obj2).r.h7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 2:
                bu0 bu0Var = (bu0) obj;
                ((dt0) obj2).r.o4 = false;
                if (!bu0Var.s) {
                    bu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 3:
                iv0 iv0Var = (iv0) obj2;
                iv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                iv0Var.c(true);
                break;
            case 4:
                iv0 iv0Var2 = (iv0) obj2;
                iv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                iv0Var2.c(true);
                break;
            case 5:
                iv0 iv0Var3 = (iv0) obj2;
                SendMessagesHelper.getInstance(iv0Var3.D.currentAccount).deletePollOption(iv0Var3.D, (byte[]) obj);
                iv0Var3.c(true);
                break;
            case 6:
                PrivacyControlActivity.V((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 7:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.w0();
                    break;
                }
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.x0();
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.R;
                privacySettingsActivity2.R = z10;
                ((org.telegram.ui.Cells.t8) obj).setChecked(z10);
                break;
            case 10:
                ((cx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i13 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i13);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new qn(bundle), true);
                break;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.w2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.b1, user);
                    if (profileActivity2.A2 != null && user != null && org.telegram.ui.Components.oc.a(profileActivity2)) {
                        org.telegram.ui.Components.oc.D(profileActivity2, user, profileActivity2.A2.title).j();
                    }
                    if (profileActivity2.q2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i14 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i14);
                    if (AndroidUtilities.isTablet()) {
                        i9 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity2.b1));
                    } else {
                        i9 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.b1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.F1 = i9;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 13:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 14:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.gc.e();
                ve.e.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 15:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.A2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.b1);
                ((CountDownLatch) obj).countDown();
                break;
            case 16:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.C2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 17:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.p8) ((View) obj)).setChecked(profileActivity6.o2.g());
                break;
            case 18:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (q8Var = profileActivity7.t5) != null) {
                    q8Var.run();
                }
                profileActivity7.t5 = null;
                break;
            case 19:
                gy0 gy0Var = (gy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = gy0Var.X0.c;
                org.telegram.ui.Components.oc.x(profileActivity8.getParentActivity(), profileActivity8.i5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, gy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), gy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi)).j();
                break;
            case 20:
                vy0 vy0Var = (vy0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = vy0Var.X0;
                org.telegram.ui.Components.oc.x(profileActivity9.getParentActivity(), profileActivity9.i5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, vy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), vy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi)).j();
                break;
            case 21:
                ((vz0) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 22:
                x9 x9Var = new x9(null);
                x9Var.d = (org.telegram.ui.ActionBar.b6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment(x9Var);
                break;
            case 23:
                f01 f01Var = (f01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = f01Var.d;
                org.telegram.ui.ActionBar.o2 o2Var = f01Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i15 = 0; i15 < split.length; i15++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i15]);
                    strArr2[i15] = translitString;
                    if (translitString.equals(split[i15])) {
                        strArr2[i15] = null;
                    }
                }
                int i16 = 0;
                while (true) {
                    e01[] e01VarArr = f01Var.c;
                    if (i16 >= e01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (f01Var.A != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i17);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i18 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i18 < split.length) {
                                        if (split[i18].length() != 0) {
                                            String str8 = split[i18];
                                            int indexOf = str7.indexOf(" " + str8);
                                            i10 = size;
                                            if (indexOf < 0 && (str = strArr3[i18]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(o2Var.getThemedColor(org.telegram.ui.ActionBar.f6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder2 != null && i18 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i18++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i17++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new rx0(f01Var, str6, arrayList3, arrayList4, arrayList5, 1));
                        break;
                    } else {
                        e01 e01Var = e01VarArr[i16];
                        if (e01Var != null) {
                            String str9 = e01Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i19 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i19 < split.length) {
                                if (split[i19].length() != 0) {
                                    String str11 = split[i19];
                                    i11 = i16;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i19]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(o2Var.getThemedColor(org.telegram.ui.ActionBar.f6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i16 = i11 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i11 = i16;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i19 == split.length - 1) {
                                    if (e01Var.f == 502) {
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 >= 4) {
                                                i20 = -1;
                                            } else if (UserConfig.getInstance(i20).isClientActivated()) {
                                                i20++;
                                            }
                                        }
                                        if (i20 < 0) {
                                        }
                                    }
                                    arrayList3.add(e01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i19++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i16 = i11;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i16;
                        i16 = i11 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 24:
                f01 f01Var2 = (f01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                f01Var2.d.addAll(arrayList6);
                int i21 = f01Var2.f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = f01Var2.A;
                if (!f01Var2.w) {
                    f01Var2.l();
                    break;
                }
                break;
            case 25:
                j01 j01Var = (j01) obj2;
                j01Var.f.add((l01) obj);
                j01Var.a();
                break;
            case 26:
                ((z11) obj2).d0(34, (Bitmap) obj, true);
                break;
            case 27:
                u11 u11Var = (u11) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    u11Var.getClass();
                    break;
                } else {
                    int i22 = u11Var.F;
                    if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) u11Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                u11Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    u11Var.F = tL_exportedContactToken.expires;
                    u11Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
            case 28:
                x21 x21Var = (x21) ((View[]) obj2)[0];
                x21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                x21Var.c = null;
                x21Var.d = null;
                x21Var.f.U2.N(false);
                break;
            default:
                ((x21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
        }
    }

    public /* synthetic */ ys0(org.telegram.ui.Components.rp0 rp0Var, a0.h hVar, int i9, int i10) {
        this.a = i10;
        this.b = rp0Var;
        this.c = hVar;
    }
}
