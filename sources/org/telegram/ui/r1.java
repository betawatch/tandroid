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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* JADX WARN: Removed duplicated region for block: B:203:0x0514 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                vo0 vo0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (vo0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        vo0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        vo0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        vo0Var.w0 = str6;
                        FileLog.e(th2);
                    }
                    vo0Var.t0();
                    return;
                }
                return;
            case 2:
                q qVar = (q) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                qVar.getClass();
                if (tL_error == null) {
                    qVar.X((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((zh.a) arrayList2.get(i12)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(10, y6Var, b2Var));
                return;
            case 4:
                r7 r7Var = (r7) this.d;
                zh.a aVar = (zh.a) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(r7Var.getContext(), Uri.fromFile(aVar.a));
                        str2 = mediaMetadataRetriever.extractMetadata(7);
                        try {
                            str7 = mediaMetadataRetriever.extractMetadata(2);
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused2) {
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = str2;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            FileLog.e(e);
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                } catch (Throwable unused3) {
                                }
                            }
                            str2 = str;
                            AndroidUtilities.runOnUIThread(new ai.n3(r7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        str = "";
                        FileLog.e(e);
                        if (mediaMetadataRetriever2 != null) {
                        }
                        str2 = str;
                        AndroidUtilities.runOnUIThread(new ai.n3(r7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new ai.n3(r7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
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
                b8 b8Var = (b8) this.d;
                zn znVar = (zn) this.b;
                e8 e8Var = (e8) this.c;
                b8Var.b.x.finishFragment();
                znVar.L9(e8Var.h);
                return;
            case 6:
                j9.W((j9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.bi.p(R.string.LinkCopied, new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, e6Var));
                return;
            case 8:
                ra.X((ra) this.d, (org.telegram.ui.ActionBar.b2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                vb.Z((vb) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                zc zcVar = (zc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                HashMap hashMap = zcVar.w;
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
                md mdVar = (md) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    mdVar.getClass();
                    mdVar.c0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                mdVar.b0 = false;
                org.telegram.ui.Components.x90 x90Var = mdVar.P;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = mdVar.c0;
                x90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ke keVar = (ke) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    of.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new od(keVar, 5), 1000L);
                return;
            case 13:
                ((bb1) this.d).showDialog(ke.d0((Context) this.b, (org.telegram.ui.ActionBar.e6) this.c, false));
                return;
            case 14:
                zn znVar2 = (zn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                znVar2.f = messagesStorage.getUser(znVar2.h.user_id);
                countDownLatch.countDown();
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new sg(1, (ta) this.c, ((zn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 16:
                zn.t1((zn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 17:
                zn znVar3 = (zn) this.d;
                org.telegram.ui.Components.gn0 gn0Var = (org.telegram.ui.Components.gn0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                znVar3.getClass();
                gn0Var.dismiss();
                znVar3.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 18:
                zn znVar4 = (zn) this.d;
                org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) this.c;
                String str8 = (String) this.b;
                p80Var.u();
                dk0 dk0Var = new dk0(znVar4.getParentActivity(), znVar4);
                dk0Var.x(str8, false);
                dk0Var.show();
                return;
            case 19:
                zn znVar5 = (zn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.g5.S(znVar5.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new a7(znVar5, suggestedPost, (MessageObject) this.c, 5), znVar5.getResourceProvider(), 0).a.show();
                return;
            case 20:
                zn.A1((zn) this.d, (zf.a) this.b, (Runnable) this.c);
                return;
            case 21:
                zn.Q0((zn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 22:
                org.telegram.ui.Components.g5.e0(r0.currentAccount, (TLRPC.TL_error) this.b, (zn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 23:
                cm cmVar = (cm) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                dm dmVar = cmVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    zn znVar6 = dmVar.a.Q;
                    znVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = znVar6.getMessagesController().getUser(Long.valueOf(znVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        yf.d0.a(messageObject.messageOwner.action.photo, user2, false);
                        znVar6.getUserConfig().setCurrentUser(user2);
                        znVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.ad.a0(znVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new cj(cmVar, 6)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                ln lnVar = (ln) this.d;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                zn znVar7 = lnVar.a;
                if (znVar7.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && znVar7.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    znVar7.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                i10 = ((org.telegram.ui.ActionBar.n2) znVar7).currentAccount;
                arrayList3.add(new MessageObject(i10, tL_message, false, true));
                MediaController.saveFilesFromMessages(znVar7.getParentActivity(), znVar7.getAccountInstance(), arrayList3, new va(lnVar, 1));
                return;
            case 25:
                ((ln) this.d).q((org.telegram.ui.Cells.u1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((ln) this.d).m((org.telegram.ui.Cells.u1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                uo uoVar = (uo) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                uoVar.getClass();
                if (tL_error3 == null) {
                    uoVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    uoVar.getMessagesStorage().saveChatLinksCount(uoVar.w0, uoVar.y0.invitesCount);
                    uoVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                tp tpVar = (tp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                tpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new r1(tpVar, new ArrayList(), new ArrayList(), 29));
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
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.bi.w(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.bi.w(" ", str11, translitString2)))) {
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
                                    arrayList6.add(AndroidUtilities.generateSearchName(sc.v.i("@", str10), null, "@" + str11));
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
                AndroidUtilities.runOnUIThread(new r1(tpVar, arrayList5, arrayList6, 29));
                return;
            default:
                tp.E((tp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ r1(zn znVar, org.telegram.ui.Components.p80 p80Var, String str) {
        this.a = 18;
        this.d = znVar;
        this.c = p80Var;
        this.b = str;
    }
}
