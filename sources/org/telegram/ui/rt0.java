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
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rt0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.o8 o8Var;
        ArrayList arrayList;
        int i11;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.a;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                st0 st0Var = (st0) obj2;
                org.telegram.ui.Components.k81 k81Var = (org.telegram.ui.Components.k81) obj;
                st0Var.getClass();
                if (k81Var.p() > 0 && k81Var.n() >= k81Var.p() - 590) {
                    st0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 1:
                wt0 wt0Var = (wt0) obj2;
                qg.w0 w0Var = (qg.w0) obj;
                w0Var.e.h();
                w0Var.c.postRunnable(new t21(14));
                try {
                    wt0Var.b.e0.removeView(w0Var);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 2:
                ci.m6 m6Var = (ci.m6) obj;
                PhotoViewer photoViewer = ((at0) obj2).b;
                if (photoViewer.C3 != null) {
                    ImageView imageView = photoViewer.x3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        photoViewer.x3.setImageBitmap(photoViewer.C3);
                    }
                    ((ImageReceiver) m6Var.b).setImageBitmap(photoViewer.C3);
                    break;
                }
                break;
            case 3:
                ((gu0) obj2).r.l7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 4:
                ev0 ev0Var = (ev0) obj;
                ((gu0) obj2).r.s4 = false;
                if (!ev0Var.s) {
                    ev0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 5:
                mw0 mw0Var = (mw0) obj2;
                mw0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                mw0Var.c(true);
                break;
            case 6:
                mw0 mw0Var2 = (mw0) obj2;
                mw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                mw0Var2.c(true);
                break;
            case 7:
                mw0 mw0Var3 = (mw0) obj2;
                SendMessagesHelper.getInstance(mw0Var3.H.currentAccount).deletePollOption(mw0Var3.H, (byte[]) obj);
                mw0Var3.c(true);
                break;
            case 8:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 9:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 11:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.w8) obj).setChecked(z11);
                break;
            case 12:
                ((gy0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new zn(bundle), true);
                break;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j3 = profileActivity2.A2;
                if (j3 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j3));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.ad.a(profileActivity2)) {
                        org.telegram.ui.Components.ad.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i15 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i15);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.J1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 15:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.tc.e();
                of.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 17:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 18:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 19:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.s2.g());
                break;
            case 20:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (o8Var = profileActivity7.x5) != null) {
                    o8Var.run();
                }
                profileActivity7.x5 = null;
                break;
            case 21:
                jz0 jz0Var = (jz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = jz0Var.b1.c;
                org.telegram.ui.Components.ad.x(profileActivity8.getParentActivity(), profileActivity8.m5, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, jz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), jz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                break;
            case 22:
                yz0 yz0Var = (yz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = yz0Var.b1;
                org.telegram.ui.Components.ad.x(profileActivity9.getParentActivity(), profileActivity9.m5, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, yz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), yz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                break;
            case 23:
                ((y01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 24:
                aa aaVar = new aa(null);
                aaVar.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(aaVar);
                break;
            case 25:
                i11 i11Var = (i11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = i11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var = i11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i16 = 0; i16 < split.length; i16++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i16]);
                    strArr2[i16] = translitString;
                    if (translitString.equals(split[i16])) {
                        strArr2[i16] = null;
                    }
                }
                int i17 = 0;
                while (true) {
                    h11[] h11VarArr = i11Var.c;
                    boolean z12 = z10;
                    if (i17 >= h11VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (i11Var.E != null) {
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i18);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i19 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i19 < split.length) {
                                        if (split[i19].length() != 0) {
                                            String str8 = split[i19];
                                            int indexOf = str7.indexOf(" " + str8);
                                            arrayList = arrayList2;
                                            if (indexOf < 0 && (str = strArr3[i19]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                i11 = size;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i19 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i19++;
                                        arrayList2 = arrayList;
                                        size = i11;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i18++;
                                arrayList2 = arrayList;
                                size = size;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new g90(i11Var, str6, arrayList3, arrayList4, arrayList5, 22));
                        break;
                    } else {
                        h11 h11Var = h11VarArr[i17];
                        if (h11Var != null) {
                            String str9 = h11Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i20 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i20 < split.length) {
                                if (split[i20].length() != 0) {
                                    String str11 = split[i20];
                                    i12 = i17;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i20]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.i6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        z10 = z12;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i12 = i17;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i20 == split.length - 1) {
                                    if (h11Var.f == 502) {
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 >= 4) {
                                                i21 = -1;
                                            } else if (UserConfig.getInstance(i21).isClientActivated()) {
                                                i21++;
                                            }
                                        }
                                        if (i21 < 0) {
                                        }
                                    }
                                    arrayList3.add(h11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i20++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i17 = i12;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i17;
                        i17 = i12 + 1;
                        z10 = z12;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 26:
                i11 i11Var2 = (i11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                i11Var2.d.addAll(arrayList6);
                int i22 = i11Var2.f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = i11Var2.E;
                if (!i11Var2.w) {
                    i11Var2.l();
                    break;
                }
                break;
            case 27:
                m11 m11Var = (m11) obj2;
                m11Var.f.add((o11) obj);
                m11Var.a();
                break;
            case 28:
                ((e31) obj2).d0(34, (Bitmap) obj, true);
                break;
            default:
                y21 y21Var = (y21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    y21Var.getClass();
                    break;
                } else {
                    int i23 = y21Var.J;
                    if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) y21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                y21Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    y21Var.J = tL_exportedContactToken.expires;
                    y21Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
        }
    }

    public /* synthetic */ rt0(org.telegram.ui.Components.mr0 mr0Var, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.b = mr0Var;
        this.c = iVar;
    }
}
