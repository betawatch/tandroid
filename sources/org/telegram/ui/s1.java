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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, int i10) {
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
                u1 u1Var = articleViewer$BlockEmbedCell$TelegramWebviewProxy.a;
                if ("resize_frame".equals(str3)) {
                    try {
                        u1Var.r = Utilities.parseInt((CharSequence) new JSONObject(str4).getString("height")).intValue();
                        u1Var.requestLayout();
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
                lo0 lo0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (lo0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        lo0Var.t0 = jSONObject.getJSONObject("credentials").toString();
                        lo0Var.u0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        lo0Var.t0 = str6;
                        FileLog.e(th2);
                    }
                    lo0Var.t0();
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
                b7 b7Var = (b7) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((nh.a) arrayList2.get(i10)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(20, b7Var, d2Var));
                return;
            case 4:
                u7 u7Var = (u7) this.d;
                nh.a aVar = (nh.a) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(u7Var.getContext(), Uri.fromFile(aVar.a));
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
                        } catch (Exception e6) {
                            e = e6;
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
                            AndroidUtilities.runOnUIThread(new hg.j0(u7Var, aVar, tL_documentAttributeAudio, str2, str7, 18));
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
                            AndroidUtilities.runOnUIThread(new hg.j0(u7Var, aVar, tL_documentAttributeAudio, str2, str7, 18));
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    AndroidUtilities.runOnUIThread(new hg.j0(u7Var, aVar, tL_documentAttributeAudio, str2, str7, 18));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            case 5:
                e8 e8Var = (e8) this.d;
                xn xnVar = (xn) this.b;
                h8 h8Var = (h8) this.c;
                e8Var.b.x.finishFragment();
                xnVar.G9(h8Var.h);
                return;
            case 6:
                l9.W((l9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                b.m(R.string.LinkCopied, new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, g6Var));
                return;
            case 8:
                pa.X((pa) this.d, (org.telegram.ui.ActionBar.d2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                sb.Z((sb) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                zc zcVar = (zc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.c;
                HashMap hashMap = zcVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    j6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, j6Var);
                FileLoader.getInstance(j6Var.B).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                nd ndVar = (nd) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    ndVar.getClass();
                    ndVar.Z = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                ndVar.Y = false;
                org.telegram.ui.Components.y80 y80Var = ndVar.M;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = ndVar.Z;
                y80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ke keVar = (ke) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    af.g.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new pd(keVar, 5), 1000L);
                return;
            case 13:
                ((ha1) this.d).showDialog(ke.d0((Context) this.b, (org.telegram.ui.ActionBar.g6) this.c, false));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new fc(8, (mh.f2) this.c, ((xn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 15:
                xn.J0((xn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 16:
                xn xnVar2 = (xn) this.d;
                org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                xnVar2.getClass();
                jm0Var.dismiss();
                xnVar2.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 17:
                xn xnVar3 = (xn) this.d;
                org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) this.c;
                String str8 = (String) this.b;
                q70Var.u();
                uj0 uj0Var = new uj0(xnVar3.getParentActivity(), xnVar3);
                uj0Var.v(str8, false);
                uj0Var.show();
                return;
            case 18:
                xn xnVar4 = (xn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.z4.T(xnVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new d7(xnVar4, suggestedPost, (MessageObject) this.c, 5), xnVar4.getResourceProvider(), 0).a.show();
                return;
            case 19:
                xn.f0((xn) this.d, (mf.a) this.b, (Runnable) this.c);
                return;
            case 20:
                xn.l0((xn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 21:
                org.telegram.ui.Components.z4.f0(r0.currentAccount, (TLRPC.TL_error) this.b, (xn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 22:
                xn xnVar5 = (xn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                xnVar5.f = messagesStorage.getUser(xnVar5.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                am amVar = (am) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                bm bmVar = amVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    xn xnVar6 = bmVar.a.N;
                    xnVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = xnVar6.getMessagesController().getUser(Long.valueOf(xnVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        lf.k0.a(messageObject.messageOwner.action.photo, user2, false);
                        xnVar6.getUserConfig().setCurrentUser(user2);
                        xnVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.qc.a0(xnVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new zi(amVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                jn.a((jn) this.d, (org.telegram.ui.Cells.t1) this.b, (TLRPC.Document) this.c);
                return;
            case 25:
                ((jn) this.d).u((org.telegram.ui.Cells.t1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((jn) this.d).p((org.telegram.ui.Cells.t1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                po poVar = (po) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                poVar.getClass();
                if (tL_error3 == null) {
                    poVar.v0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    poVar.getMessagesStorage().saveChatLinksCount(poVar.t0, poVar.v0.invitesCount);
                    poVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                qp qpVar = (qp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                qpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new s1(qpVar, new ArrayList(), new ArrayList(), 29));
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
                    boolean z4 = false;
                    while (true) {
                        if (i13 < i11) {
                            String str11 = strArr2[i13];
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.y3.w(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.y3.w(" ", str11, translitString2)))) {
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
                                    r32 = z4;
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
                                    arrayList5.add(AndroidUtilities.generateSearchName(yh.k("@", str10), null, "@" + str11));
                                }
                                arrayList4.add(chat);
                            } else {
                                i13++;
                                z4 = r32;
                                arrayList3 = arrayList;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    i12++;
                    arrayList3 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new s1(qpVar, arrayList4, arrayList5, 29));
                return;
            default:
                qp.E((qp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ s1(xn xnVar, org.telegram.ui.Components.q70 q70Var, String str) {
        this.a = 17;
        this.d = xnVar;
        this.c = q70Var;
        this.b = str;
    }
}
