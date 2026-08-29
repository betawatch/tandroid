package org.telegram.ui;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v86 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever;
        ArrayList arrayList;
        ?? r32;
        switch (this.a) {
            case 0:
                ArticleViewer$BlockEmbedCell$TelegramWebviewProxy articleViewer$BlockEmbedCell$TelegramWebviewProxy = (ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) this.d;
                String str3 = (String) this.b;
                String str4 = (String) this.c;
                w1 w1Var = articleViewer$BlockEmbedCell$TelegramWebviewProxy.a;
                if ("resize_frame".equals(str3)) {
                    try {
                        w1Var.r = Utilities.parseInt((CharSequence) new JSONObject(str4).getString("height")).intValue();
                        w1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                PaymentFormActivity$TelegramWebviewProxy paymentFormActivity$TelegramWebviewProxy = (PaymentFormActivity$TelegramWebviewProxy) this.d;
                String str5 = (String) this.b;
                String str6 = (String) this.c;
                bo0 bo0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (bo0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        bo0Var.s0 = jSONObject.getJSONObject("credentials").toString();
                        bo0Var.t0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        bo0Var.s0 = str6;
                        FileLog.e(th2);
                    }
                    bo0Var.t0();
                    return;
                }
                return;
            case 2:
                r rVar = (r) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                rVar.getClass();
                if (tL_error == null) {
                    rVar.X((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                x6 x6Var = (x6) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((kh.a) arrayList2.get(i10)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(12, x6Var, c2Var));
                return;
            case 4:
                q7 q7Var = (q7) this.d;
                kh.a aVar = (kh.a) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e10) {
                        e = e10;
                    }
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(q7Var.getContext(), Uri.fromFile(aVar.a));
                            str2 = mediaMetadataRetriever.extractMetadata(7);
                        } catch (Throwable th3) {
                            th = th3;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        str = "";
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (Throwable unused3) {
                            }
                        }
                        str2 = str;
                        AndroidUtilities.runOnUIThread(new eg.k0(q7Var, aVar, tL_documentAttributeAudio, str2, str7, 20));
                        return;
                    }
                    try {
                        str7 = mediaMetadataRetriever.extractMetadata(2);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused4) {
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = str2;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                        }
                        str2 = str;
                        AndroidUtilities.runOnUIThread(new eg.k0(q7Var, aVar, tL_documentAttributeAudio, str2, str7, 20));
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new eg.k0(q7Var, aVar, tL_documentAttributeAudio, str2, str7, 20));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            case 5:
                a8 a8Var = (a8) this.d;
                tn tnVar = (tn) this.b;
                d8 d8Var = (d8) this.c;
                a8Var.b.x.finishFragment();
                tnVar.G9(d8Var.h);
                return;
            case 6:
                h9.W((h9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                b.n(R.string.LinkCopied, new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var));
                return;
            case 8:
                la.X((la) this.d, (org.telegram.ui.ActionBar.c2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                ob.Z((ob) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                tc tcVar = (tc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                HashMap hashMap = tcVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    f6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, f6Var);
                FileLoader.getInstance(f6Var.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                hd hdVar = (hd) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    hdVar.getClass();
                    hdVar.Y = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                hdVar.X = false;
                org.telegram.ui.Components.r80 r80Var = hdVar.L;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = hdVar.Y;
                r80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                de deVar = (de) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    ye.d.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new jd(deVar, 5), 1000L);
                return;
            case 13:
                ((t91) this.d).showDialog(de.d0((Context) this.b, (org.telegram.ui.ActionBar.c6) this.c, false));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new vf(0, (jh.g2) this.c, ((tn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 15:
                tn.J0((tn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 16:
                tn tnVar2 = (tn) this.d;
                org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                tnVar2.getClass();
                yl0Var.dismiss();
                tnVar2.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 17:
                tn tnVar3 = (tn) this.d;
                org.telegram.ui.Components.j70 j70Var = (org.telegram.ui.Components.j70) this.c;
                String str8 = (String) this.b;
                j70Var.u();
                kj0 kj0Var = new kj0(tnVar3.getParentActivity(), tnVar3);
                kj0Var.v(str8, false);
                kj0Var.show();
                return;
            case 18:
                tn tnVar4 = (tn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.c5.T(tnVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new z6(tnVar4, suggestedPost, (MessageObject) this.c, 5), tnVar4.getResourceProvider(), 0).a.show();
                return;
            case 19:
                tn.f0((tn) this.d, (kf.a) this.b, (Runnable) this.c);
                return;
            case 20:
                tn.l0((tn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 21:
                org.telegram.ui.Components.c5.f0(r0.currentAccount, (TLRPC.TL_error) this.b, (tn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 22:
                tn tnVar5 = (tn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tnVar5.f = messagesStorage.getUser(tnVar5.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                ul ulVar = (ul) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                vl vlVar = ulVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    tn tnVar6 = vlVar.a.M;
                    tnVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = tnVar6.getMessagesController().getUser(Long.valueOf(tnVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        jf.k0.a(messageObject.messageOwner.action.photo, user2, false);
                        tnVar6.getUserConfig().setCurrentUser(user2);
                        tnVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.tc.a0(tnVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ui(ulVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                fn.a((fn) this.d, (org.telegram.ui.Cells.s1) this.b, (TLRPC.Document) this.c);
                return;
            case 25:
                ((fn) this.d).q((org.telegram.ui.Cells.s1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((fn) this.d).m((org.telegram.ui.Cells.s1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                ko koVar = (ko) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                koVar.getClass();
                if (tL_error3 == null) {
                    koVar.u0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    koVar.getMessagesStorage().saveChatLinksCount(koVar.s0, koVar.u0.invitesCount);
                    koVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                jp jpVar = (jp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                jpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new u1(jpVar, new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i11 = (translitString != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i11];
                strArr2[0] = lowerCase;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i12);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i13 = 0;
                    String str10 = null;
                    boolean z10 = false;
                    while (true) {
                        if (i13 < i11) {
                            String str11 = strArr2[i13];
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.x3.w(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.x3.w(" ", str11, translitString2)))) {
                                arrayList = arrayList3;
                                r32 = 1;
                            } else {
                                String str12 = chat.username;
                                if (str12 == null || !str12.startsWith(str11)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        int i14 = 0;
                                        while (i14 < chat.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i14);
                                            arrayList = arrayList3;
                                            if (tL_username.active && tL_username.username.startsWith(str11)) {
                                                str10 = tL_username.username;
                                            } else {
                                                i14++;
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                    arrayList = arrayList3;
                                    r32 = z10;
                                } else {
                                    str10 = chat.username;
                                    arrayList = arrayList3;
                                }
                                r32 = 2;
                            }
                            if (r32 != 0) {
                                if (r32 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(chat.title, null, str11));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName(u3.c.e("@", str10), null, "@" + str11));
                                }
                                arrayList4.add(chat);
                            } else {
                                i13++;
                                z10 = r32;
                                arrayList3 = arrayList;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    i12++;
                    arrayList3 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new u1(jpVar, arrayList4, arrayList5, 29));
                return;
            default:
                jp.E((jp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ u1(tn tnVar, org.telegram.ui.Components.j70 j70Var, String str) {
        this.a = 17;
        this.d = tnVar;
        this.c = j70Var;
        this.b = str;
    }
}
