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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
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
                v1 v1Var = articleViewer$BlockEmbedCell$TelegramWebviewProxy.a;
                if ("resize_frame".equals(str3)) {
                    try {
                        v1Var.r = Utilities.parseInt((CharSequence) new JSONObject(str4).getString("height")).intValue();
                        v1Var.requestLayout();
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
                co0 co0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (co0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        co0Var.s0 = jSONObject.getJSONObject("credentials").toString();
                        co0Var.t0 = jSONObject.getString("title");
                    } catch (Throwable th) {
                        co0Var.s0 = str6;
                        FileLog.e(th);
                    }
                    co0Var.s0();
                    return;
                }
                return;
            case 2:
                p pVar = (p) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                pVar.getClass();
                if (tL_error == null) {
                    pVar.W((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    ((hh.a) arrayList2.get(i9)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(15, y6Var, c2Var));
                return;
            case 4:
                r7 r7Var = (r7) this.d;
                hh.a aVar = (hh.a) this.b;
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
                            mediaMetadataRetriever.setDataSource(r7Var.getContext(), Uri.fromFile(aVar.a));
                            str2 = mediaMetadataRetriever.extractMetadata(7);
                        } catch (Throwable th2) {
                            th = th2;
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
                        AndroidUtilities.runOnUIThread(new bg.o0(r7Var, aVar, tL_documentAttributeAudio, str2, str7, 21));
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
                        AndroidUtilities.runOnUIThread(new bg.o0(r7Var, aVar, tL_documentAttributeAudio, str2, str7, 21));
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new bg.o0(r7Var, aVar, tL_documentAttributeAudio, str2, str7, 21));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            case 5:
                b8 b8Var = (b8) this.d;
                qn qnVar = (qn) this.b;
                e8 e8Var = (e8) this.c;
                b8Var.b.x.finishFragment();
                qnVar.G9(e8Var.h);
                return;
            case 6:
                i9.V((i9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.ll.o(R.string.LinkCopied, new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, b6Var));
                return;
            case 8:
                ma.W((ma) this.d, (org.telegram.ui.ActionBar.c2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                pb.Y((pb) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                vc vcVar = (vc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                HashMap hashMap = vcVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    e6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, e6Var);
                FileLoader.getInstance(e6Var.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                id idVar = (id) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    idVar.getClass();
                    idVar.Y = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                idVar.X = false;
                org.telegram.ui.Components.e80 e80Var = idVar.L;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = idVar.Y;
                e80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                fe feVar = (fe) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    ve.e.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new kd(feVar, 5), 1000L);
                return;
            case 13:
                ((s91) this.d).showDialog(fe.d0((Context) this.b, (org.telegram.ui.ActionBar.b6) this.c, false));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new rd(3, (gh.i2) this.c, ((qn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 15:
                qn.I0((qn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 16:
                qn qnVar2 = (qn) this.d;
                org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                qnVar2.getClass();
                ll0Var.dismiss();
                qnVar2.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 17:
                qn qnVar3 = (qn) this.d;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.c;
                String str8 = (String) this.b;
                x60Var.u();
                nj0 nj0Var = new nj0(qnVar3.getParentActivity(), qnVar3);
                nj0Var.v(str8, false);
                nj0Var.show();
                return;
            case 18:
                qn qnVar4 = (qn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.y4.T(qnVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new a7(qnVar4, suggestedPost, (MessageObject) this.c, 5), qnVar4.getResourceProvider(), 0).a.show();
                return;
            case 19:
                qn.e0((qn) this.d, (gf.a) this.b, (Runnable) this.c);
                return;
            case 20:
                qn.k0((qn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 21:
                org.telegram.ui.Components.y4.f0(r0.currentAccount, (TLRPC.TL_error) this.b, (qn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 22:
                qn qnVar5 = (qn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                qnVar5.f = messagesStorage.getUser(qnVar5.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                sl slVar = (sl) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                tl tlVar = slVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    qn qnVar6 = tlVar.a.M;
                    qnVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = qnVar6.getMessagesController().getUser(Long.valueOf(qnVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        ff.l0.a(messageObject.messageOwner.action.photo, user2, false);
                        qnVar6.getUserConfig().setCurrentUser(user2);
                        qnVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.oc.a0(qnVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ri(slVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                cn.a((cn) this.d, (org.telegram.ui.Cells.t1) this.b, (TLRPC.Document) this.c);
                return;
            case 25:
                ((cn) this.d).n((org.telegram.ui.Cells.t1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((cn) this.d).k((org.telegram.ui.Cells.t1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                ho hoVar = (ho) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                hoVar.getClass();
                if (tL_error3 == null) {
                    hoVar.u0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    hoVar.getMessagesStorage().saveChatLinksCount(hoVar.s0, hoVar.u0.invitesCount);
                    hoVar.o0(false, false);
                    return;
                }
                return;
            case 28:
                gp gpVar = (gp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                gpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new t1(gpVar, new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i10 = (translitString != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i10];
                strArr2[0] = lowerCase;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i11);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i12 = 0;
                    String str10 = null;
                    boolean z10 = false;
                    while (true) {
                        if (i12 < i10) {
                            String str11 = strArr2[i12];
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.l0.w(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.l0.w(" ", str11, translitString2)))) {
                                arrayList = arrayList3;
                                r32 = 1;
                            } else {
                                String str12 = chat.username;
                                if (str12 == null || !str12.startsWith(str11)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        int i13 = 0;
                                        while (i13 < chat.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i13);
                                            arrayList = arrayList3;
                                            if (tL_username.active && tL_username.username.startsWith(str11)) {
                                                str10 = tL_username.username;
                                            } else {
                                                i13++;
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
                                    arrayList5.add(AndroidUtilities.generateSearchName(ta.b.d("@", str10), null, "@" + str11));
                                }
                                arrayList4.add(chat);
                            } else {
                                i12++;
                                z10 = r32;
                                arrayList3 = arrayList;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    i11++;
                    arrayList3 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new t1(gpVar, arrayList4, arrayList5, 29));
                return;
            default:
                gp.E((gp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ t1(qn qnVar, org.telegram.ui.Components.x60 x60Var, String str) {
        this.a = 17;
        this.d = qnVar;
        this.c = x60Var;
        this.b = str;
    }
}
