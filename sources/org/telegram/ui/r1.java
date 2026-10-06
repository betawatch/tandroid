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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0468 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        ArrayList arrayList;
        ?? r32;
        switch (this.a) {
            case 0:
                ArticleViewer$BlockEmbedCell$TelegramWebviewProxy articleViewer$BlockEmbedCell$TelegramWebviewProxy = (ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) this.d;
                String str3 = (String) this.b;
                String str4 = (String) this.c;
                t1 t1Var = articleViewer$BlockEmbedCell$TelegramWebviewProxy.a;
                if ("resize_frame".equals(str3)) {
                    try {
                        t1Var.r = Utilities.parseInt((CharSequence) new JSONObject(str4).getString("height")).intValue();
                        t1Var.requestLayout();
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
                so0 so0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (so0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        so0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        so0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        so0Var.w0 = str6;
                        FileLog.e(th2);
                    }
                    so0Var.t0();
                    return;
                }
                return;
            case 2:
                q qVar = (q) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                qVar.getClass();
                if (tL_error == null) {
                    qVar.W((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                a7 a7Var = (a7) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((zh.a) arrayList2.get(i10)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(7, a7Var, b2Var));
                return;
            case 4:
                v7 v7Var = (v7) this.d;
                zh.a aVar = (zh.a) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(v7Var.getContext(), Uri.fromFile(aVar.a));
                                str2 = mediaMetadataRetriever2.extractMetadata(7);
                            } catch (Throwable th3) {
                                th = th3;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                if (mediaMetadataRetriever != null) {
                                    try {
                                        mediaMetadataRetriever.release();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            str = "";
                            FileLog.e(e);
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Throwable unused3) {
                                }
                            }
                            str2 = str;
                            AndroidUtilities.runOnUIThread(new ai.m3(v7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                            return;
                        }
                        try {
                            str7 = mediaMetadataRetriever2.extractMetadata(2);
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (Throwable unused4) {
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = str2;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            FileLog.e(e);
                            if (mediaMetadataRetriever != null) {
                            }
                            str2 = str;
                            AndroidUtilities.runOnUIThread(new ai.m3(v7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(v7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            case 5:
                f8 f8Var = (f8) this.d;
                yn ynVar = (yn) this.b;
                i8 i8Var = (i8) this.c;
                f8Var.b.x.finishFragment();
                ynVar.F9(i8Var.h);
                return;
            case 6:
                m9.S((m9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.bi.n(R.string.LinkCopied, new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var));
                return;
            case 8:
                sa.W((sa) this.d, (org.telegram.ui.ActionBar.b2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                wb.Y((wb) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                ad adVar = (ad) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                HashMap hashMap = adVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    h6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, h6Var);
                FileLoader.getInstance(h6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                nd ndVar = (nd) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    ndVar.getClass();
                    ndVar.c0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                ndVar.b0 = false;
                org.telegram.ui.Components.j90 j90Var = ndVar.P;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = ndVar.c0;
                j90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((ta1) this.d).showDialog(me.I((Context) this.b, (org.telegram.ui.ActionBar.d6) this.c, false));
                return;
            case 13:
                me meVar = (me) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new pd(meVar, 4), 1000L);
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(25, (ua) this.c, ((yn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 15:
                yn.F0((yn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 16:
                yn ynVar2 = (yn) this.d;
                org.telegram.ui.Components.sm0 sm0Var = (org.telegram.ui.Components.sm0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ynVar2.getClass();
                sm0Var.dismiss();
                ynVar2.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 17:
                yn ynVar3 = (yn) this.d;
                org.telegram.ui.Components.b80 b80Var = (org.telegram.ui.Components.b80) this.c;
                String str8 = (String) this.b;
                b80Var.u();
                ak0 ak0Var = new ak0(ynVar3.getParentActivity(), ynVar3);
                ak0Var.v(str8, false);
                ak0Var.show();
                return;
            case 18:
                yn ynVar4 = (yn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.e5.T(ynVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new c7(ynVar4, suggestedPost, (MessageObject) this.c, 5), ynVar4.getResourceProvider(), 0).a.show();
                return;
            case 19:
                yn.j0((yn) this.d, (zf.a) this.b, (Runnable) this.c);
                return;
            case 20:
                yn.n0((yn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 21:
                org.telegram.ui.Components.e5.f0(r0.currentAccount, (TLRPC.TL_error) this.b, (yn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 22:
                yn ynVar5 = (yn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                ynVar5.f = messagesStorage.getUser(ynVar5.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                zl zlVar = (zl) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                am amVar = zlVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    yn ynVar6 = amVar.a.Q;
                    ynVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = ynVar6.getMessagesController().getUser(Long.valueOf(ynVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        yf.b0.a(messageObject.messageOwner.action.photo, user2, false);
                        ynVar6.getUserConfig().setCurrentUser(user2);
                        ynVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.yc.a0(ynVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new bj(zlVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                kn.a((kn) this.d, (org.telegram.ui.Cells.u1) this.b, (TLRPC.Document) this.c);
                return;
            case 25:
                ((kn) this.d).v((org.telegram.ui.Cells.u1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((kn) this.d).q((org.telegram.ui.Cells.u1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                to toVar = (to) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                toVar.getClass();
                if (tL_error3 == null) {
                    toVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    toVar.getMessagesStorage().saveChatLinksCount(toVar.w0, toVar.y0.invitesCount);
                    toVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                sp spVar = (sp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                spVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new r1(spVar, new ArrayList(), new ArrayList(), 29));
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
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.bi.u(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.bi.u(" ", str11, translitString2)))) {
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
                                    arrayList5.add(AndroidUtilities.generateSearchName(sa.e.i("@", str10), null, "@" + str11));
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
                AndroidUtilities.runOnUIThread(new r1(spVar, arrayList4, arrayList5, 29));
                return;
            default:
                sp.E((sp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ r1(yn ynVar, org.telegram.ui.Components.b80 b80Var, String str) {
        this.a = 17;
        this.d = ynVar;
        this.c = b80Var;
        this.b = str;
    }
}
