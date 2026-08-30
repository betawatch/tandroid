package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zq0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.w8 w8Var;
        ArrayList arrayList;
        int i11;
        String str;
        int i12;
        String str2;
        String str3;
        int i13;
        String[] strArr;
        String str4;
        SpannableStringBuilder spannableStringBuilder;
        String str5;
        int i14 = this.a;
        int i15 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i14) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((kh.y0) obj2).run((Bitmap) obj);
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                dg.q1 q1Var = (dg.q1) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                q1Var.e.h();
                q1Var.c.postRunnable(new cg.n0(i15));
                photoViewer.b0.removeView(photoViewer.K1);
                break;
            case 2:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                if (y5Var != null) {
                    ArrayList arrayList2 = y5Var.h;
                    org.telegram.ui.Components.v5 v5Var = y5Var.n;
                    if (v5Var != null) {
                        arrayList2.add(v5Var);
                    }
                    org.telegram.ui.Components.v5 v5Var2 = y5Var.r;
                    if (v5Var2 != null) {
                        arrayList2.add(v5Var2);
                    }
                    org.telegram.ui.Components.v5 v5Var3 = y5Var.s;
                    if (v5Var3 != null) {
                        arrayList2.add(v5Var3);
                    }
                    y5Var.n = new org.telegram.ui.Components.v5(bitmap);
                    y5Var.r = null;
                    y5Var.s = null;
                    y5Var.t();
                    break;
                }
                break;
            case 3:
                lr0 lr0Var = (lr0) obj2;
                lr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer2 = lr0Var.c;
                ImageView imageView = photoViewer2.u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                au0 au0Var = photoViewer2.B2;
                if (au0Var != null) {
                    au0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 4:
                ws0 ws0Var = (ws0) obj2;
                org.telegram.ui.Components.i71 i71Var = (org.telegram.ui.Components.i71) obj;
                ws0Var.getClass();
                if (i71Var.p() > 0 && i71Var.n() >= i71Var.p() - 590) {
                    ws0Var.a.b0.invalidate();
                    break;
                }
                break;
            case 5:
                at0 at0Var = (at0) obj2;
                dg.q1 q1Var2 = (dg.q1) obj;
                q1Var2.e.h();
                q1Var2.c.postRunnable(new cg.n0(i15));
                try {
                    at0Var.b.b0.removeView(q1Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                ah.d dVar = (ah.d) obj;
                PhotoViewer photoViewer3 = ((es0) obj2).b;
                if (photoViewer3.z3 != null) {
                    ImageView imageView2 = photoViewer3.u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer3.u3.setImageBitmap(photoViewer3.z3);
                    }
                    ((ImageReceiver) dVar.b).setImageBitmap(photoViewer3.z3);
                    break;
                }
                break;
            case 7:
                ((kt0) obj2).r.i7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 8:
                ju0 ju0Var = (ju0) obj;
                ((kt0) obj2).r.p4 = false;
                if (!ju0Var.s) {
                    ju0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 9:
                rv0 rv0Var = (rv0) obj2;
                rv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                rv0Var.c(true);
                break;
            case 10:
                rv0 rv0Var2 = (rv0) obj2;
                rv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                rv0Var2.c(true);
                break;
            case 11:
                rv0 rv0Var3 = (rv0) obj2;
                SendMessagesHelper.getInstance(rv0Var3.E.currentAccount).deletePollOption(rv0Var3.E, (byte[]) obj);
                rv0Var3.c(true);
                break;
            case 12:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 14:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 15:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z4 = !privacySettingsActivity2.S;
                privacySettingsActivity2.S = z4;
                ((org.telegram.ui.Cells.s8) obj).setChecked(z4);
                break;
            case 16:
                ((mx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i16 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i16);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new xn(bundle), true);
                break;
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.x2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.c1, user);
                    if (profileActivity2.B2 != null && user != null && org.telegram.ui.Components.qc.a(profileActivity2)) {
                        org.telegram.ui.Components.qc.D(profileActivity2, user, profileActivity2.B2.title).j();
                    }
                    if (profileActivity2.r2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i17 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i17);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i17, Long.valueOf(-profileActivity2.c1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i17, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.c1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.G1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 19:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 20:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 21:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.c1);
                ((CountDownLatch) obj).countDown();
                break;
            case 22:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.D2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 23:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.o8) ((View) obj)).setChecked(profileActivity6.p2.g());
                break;
            case 24:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.u5) != null) {
                    w8Var.run();
                }
                profileActivity7.u5 = null;
                break;
            case 25:
                ry0 ry0Var = (ry0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = ry0Var.Y0.c;
                org.telegram.ui.Components.qc.x(profileActivity8.getParentActivity(), profileActivity8.j5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, ry0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), ry0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 26:
                gz0 gz0Var = (gz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = gz0Var.Y0;
                org.telegram.ui.Components.qc.x(profileActivity9.getParentActivity(), profileActivity9.j5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, gz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), gz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 27:
                ((g01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 28:
                aa aaVar = new aa(null);
                aaVar.d = (org.telegram.ui.ActionBar.f6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment(aaVar);
                break;
            default:
                r01 r01Var = (r01) obj2;
                String str6 = (String) obj;
                ArrayList arrayList3 = r01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var = r01Var.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String str7 = " ";
                String[] split = str6.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i18 = 0; i18 < split.length; i18++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i18]);
                    strArr2[i18] = translitString;
                    if (translitString.equals(split[i18])) {
                        strArr2[i18] = null;
                    }
                }
                int i19 = 0;
                while (true) {
                    q01[] q01VarArr = r01Var.c;
                    if (i19 >= q01VarArr.length) {
                        String[] strArr3 = strArr2;
                        if (r01Var.B != null) {
                            int size = arrayList3.size();
                            int i20 = 0;
                            while (i20 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList3.get(i20);
                                String str8 = str7 + faqSearchResult.title.toLowerCase();
                                int i21 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i21 < split.length) {
                                        if (split[i21].length() != 0) {
                                            String str9 = split[i21];
                                            arrayList = arrayList3;
                                            int indexOf = str8.indexOf(str7 + str9);
                                            if (indexOf >= 0 || (str2 = strArr3[i21]) == null) {
                                                i12 = indexOf;
                                            } else {
                                                str9 = str2;
                                                i12 = str8.indexOf(str7.concat(str2));
                                            }
                                            if (i12 >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    i11 = size;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                } else {
                                                    i11 = size;
                                                }
                                                str = str7;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), i12, str9.length() + i12, 33);
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i11 = size;
                                            str = str7;
                                        }
                                        if (spannableStringBuilder2 != null && i21 == split.length - 1) {
                                            arrayList5.add(faqSearchResult);
                                            arrayList6.add(spannableStringBuilder2);
                                        }
                                        i21++;
                                        arrayList3 = arrayList;
                                        size = i11;
                                        str7 = str;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i20++;
                                arrayList3 = arrayList;
                                size = size;
                                str7 = str7;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(r01Var, str6, arrayList4, arrayList5, arrayList6, 28));
                        break;
                    } else {
                        q01 q01Var = q01VarArr[i19];
                        if (q01Var != null) {
                            String str10 = q01Var.a;
                            String str11 = " " + str10.toLowerCase();
                            int i22 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i22 < split.length) {
                                if (split[i22].length() != 0) {
                                    String str12 = split[i22];
                                    i13 = i19;
                                    int indexOf2 = str11.indexOf(" " + str12);
                                    if (indexOf2 >= 0 || (str5 = strArr2[i22]) == null) {
                                        str5 = str12;
                                    } else {
                                        indexOf2 = str11.indexOf(" ".concat(str5));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str13 = str5;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str10) : spannableStringBuilder3;
                                        str3 = str11;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.j6.q6));
                                        int length = str13.length() + indexOf2;
                                        str4 = str10;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i19 = i13 + 1;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str3 = str11;
                                    i13 = i19;
                                    strArr = strArr2;
                                    str4 = str10;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i22 == split.length - 1) {
                                    if (q01Var.f == 502) {
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 >= 4) {
                                                i23 = -1;
                                            } else if (UserConfig.getInstance(i23).isClientActivated()) {
                                                i23++;
                                            }
                                        }
                                        if (i23 < 0) {
                                        }
                                    }
                                    arrayList4.add(q01Var);
                                    arrayList6.add(spannableStringBuilder);
                                }
                                i22++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i19 = i13;
                                str10 = str4;
                                str11 = str3;
                                strArr2 = strArr;
                            }
                        }
                        i13 = i19;
                        i19 = i13 + 1;
                        strArr2 = strArr2;
                    }
                }
                break;
        }
    }

    public /* synthetic */ zq0(org.telegram.ui.Components.lq0 lq0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = lq0Var;
        this.c = hVar;
    }
}
