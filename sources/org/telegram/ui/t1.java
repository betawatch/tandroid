package org.telegram.ui;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0515 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i10;
        ArrayList arrayList;
        boolean z10;
        int i11;
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
                eo0 eo0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (eo0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        eo0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        eo0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        eo0Var.w0 = str6;
                        FileLog.e(th2);
                    }
                    eo0Var.t0();
                    return;
                }
                return;
            case 2:
                p pVar = (p) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                pVar.getClass();
                if (tL_error == null) {
                    pVar.X((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                c7 c7Var = (c7) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((bi.b) arrayList2.get(i12)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new i0(5, c7Var, b2Var));
                return;
            case 4:
                v7 v7Var = (v7) this.d;
                bi.b bVar = (bi.b) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(v7Var.getContext(), Uri.fromFile(bVar.a));
                        str2 = mediaMetadataRetriever.extractMetadata(7);
                    } catch (Exception e7) {
                        e = e7;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        str = "";
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (Throwable unused2) {
                            }
                        }
                        str2 = str;
                        AndroidUtilities.runOnUIThread(new ai.t0(v7Var, bVar, tL_documentAttributeAudio, str2, str7, 20));
                        return;
                    }
                    try {
                        str7 = mediaMetadataRetriever.extractMetadata(2);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused3) {
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str = str2;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                        }
                        str2 = str;
                        AndroidUtilities.runOnUIThread(new ai.t0(v7Var, bVar, tL_documentAttributeAudio, str2, str7, 20));
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new ai.t0(v7Var, bVar, tL_documentAttributeAudio, str2, str7, 20));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    if (mediaMetadataRetriever2 != null) {
                        try {
                            mediaMetadataRetriever2.release();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            case 5:
                f8 f8Var = (f8) this.d;
                qn qnVar = (qn) this.b;
                i8 i8Var = (i8) this.c;
                f8Var.b.x.finishFragment();
                qnVar.L9(i8Var.h);
                return;
            case 6:
                m9.W((m9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.nk.p(R.string.LinkCopied, new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, d6Var));
                return;
            case 8:
                sa.X((sa) this.d, (org.telegram.ui.ActionBar.b2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                vb.Z((vb) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                zc zcVar = (zc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                HashMap hashMap = zcVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    g6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, g6Var);
                FileLoader.getInstance(g6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                md mdVar = (md) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    mdVar.getClass();
                    mdVar.c0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                mdVar.b0 = false;
                org.telegram.ui.Components.q90 q90Var = mdVar.P;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = mdVar.c0;
                q90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ie ieVar = (ie) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    pf.d.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new od(ieVar, 5), 1000L);
                return;
            case 13:
                ((p91) this.d).showDialog(ie.d0((Context) this.b, (org.telegram.ui.ActionBar.d6) this.c, false));
                return;
            case 14:
                qn qnVar2 = (qn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                qnVar2.f = messagesStorage.getUser(qnVar2.h.user_id);
                countDownLatch.countDown();
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new i0(26, (ai.f3) this.c, ((qn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 16:
                qn.t1((qn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 17:
                qn qnVar3 = (qn) this.d;
                org.telegram.ui.Components.zm0 zm0Var = (org.telegram.ui.Components.zm0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                qnVar3.getClass();
                zm0Var.dismiss();
                qnVar3.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 18:
                qn qnVar4 = (qn) this.d;
                org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) this.c;
                String str8 = (String) this.b;
                i80Var.u();
                mj0 mj0Var = new mj0(qnVar4.getParentActivity(), qnVar4);
                mj0Var.x(str8, false);
                mj0Var.show();
                return;
            case 19:
                qn qnVar5 = (qn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.f5.S(qnVar5.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new e7(qnVar5, suggestedPost, (MessageObject) this.c, 5), qnVar5.getResourceProvider(), 0).a.show();
                return;
            case 20:
                qn.A1((qn) this.d, (ag.a) this.b, (Runnable) this.c);
                return;
            case 21:
                qn.Q0((qn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 22:
                org.telegram.ui.Components.f5.e0(r0.currentAccount, (TLRPC.TL_error) this.b, (qn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 23:
                tl tlVar = (tl) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                ul ulVar = tlVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    qn qnVar6 = ulVar.a.Q;
                    qnVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = qnVar6.getMessagesController().getUser(Long.valueOf(qnVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        zf.e0.a(messageObject.messageOwner.action.photo, user2, false);
                        qnVar6.getUserConfig().setCurrentUser(user2);
                        qnVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.xc.a0(qnVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ti(tlVar, 6)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                cn cnVar = (cn) this.d;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                qn qnVar7 = cnVar.a;
                if (qnVar7.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && qnVar7.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    qnVar7.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                MessageObject messageObject2 = u1Var == null ? null : u1Var.getMessageObject();
                if (messageObject2 == null || messageObject2.messageOwner == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject2.isOutOwner();
                tL_message.id = messageObject2.getId();
                tL_message.realId = messageObject2.getRealId();
                tL_message.dialog_id = messageObject2.getDialogId();
                TLRPC.Message message = messageObject2.messageOwner;
                tL_message.peer_id = message.peer_id;
                tL_message.from_id = message.from_id;
                tL_message.date = message.date;
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                int i13 = tL_message.flags;
                tL_message.flags = i13 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i13 | 768;
                }
                ArrayList arrayList3 = new ArrayList();
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar7).currentAccount;
                arrayList3.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(qnVar7.getParentActivity(), qnVar7.getAccountInstance(), arrayList3, new va(cnVar, 1));
                return;
            case 25:
                ((cn) this.d).r((org.telegram.ui.Cells.u1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((cn) this.d).o((org.telegram.ui.Cells.u1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                io ioVar = (io) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                ioVar.getClass();
                if (tL_error3 == null) {
                    ioVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    ioVar.getMessagesStorage().saveChatLinksCount(ioVar.w0, ioVar.y0.invitesCount);
                    ioVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                hp hpVar = (hp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                hpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new t1(hpVar, new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i14 = 0;
                boolean z11 = true;
                int i15 = (translitString != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i15];
                strArr2[0] = lowerCase;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int i16 = 0;
                while (i16 < arrayList4.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList4.get(i16);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i17 = i14;
                    int i18 = i17;
                    String str10 = null;
                    while (true) {
                        if (i17 < i15) {
                            String str11 = strArr2[i17];
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.g0.w(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.g0.w(" ", str11, translitString2)))) {
                                arrayList = arrayList4;
                                i11 = 1;
                            } else {
                                String str12 = chat.username;
                                if (str12 == null || !str12.startsWith(str11)) {
                                    ArrayList<TLRPC.TL_username> arrayList7 = chat.usernames;
                                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                                        int i19 = 0;
                                        while (i19 < chat.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i19);
                                            arrayList = arrayList4;
                                            if (tL_username.active && tL_username.username.startsWith(str11)) {
                                                str10 = tL_username.username;
                                            } else {
                                                i19++;
                                                arrayList4 = arrayList;
                                            }
                                        }
                                    }
                                    arrayList = arrayList4;
                                    i11 = i18;
                                } else {
                                    str10 = chat.username;
                                    arrayList = arrayList4;
                                }
                                i11 = 2;
                            }
                            if (i11 != 0) {
                                z10 = true;
                                if (i11 == 1) {
                                    arrayList6.add(AndroidUtilities.generateSearchName(chat.title, null, str11));
                                } else {
                                    arrayList6.add(AndroidUtilities.generateSearchName(r4.c.h("@", str10), null, "@" + str11));
                                }
                                arrayList5.add(chat);
                            } else {
                                i17++;
                                i18 = i11;
                                z11 = true;
                                arrayList4 = arrayList;
                            }
                        } else {
                            arrayList = arrayList4;
                            z10 = z11;
                        }
                    }
                    i16++;
                    z11 = z10;
                    arrayList4 = arrayList;
                    i14 = 0;
                }
                AndroidUtilities.runOnUIThread(new t1(hpVar, arrayList5, arrayList6, 29));
                return;
            default:
                hp.E((hp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ t1(qn qnVar, org.telegram.ui.Components.i80 i80Var, String str) {
        this.a = 18;
        this.d = qnVar;
        this.c = i80Var;
        this.b = str;
    }
}
