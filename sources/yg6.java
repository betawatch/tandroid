// default package

import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class yg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yg6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v29 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        ArrayList arrayList;
        String str;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        TLRPC.Dialog dialog;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 4;
        gy2 gy2Var = null;
        int i4 = 2;
        int i5 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        int i6 = 0;
        switch (b) {
            case 0:
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) obj;
                qh6 qh6Var = ((zg6) obj3).w;
                qh6Var.e = true;
                qh6 qh6Var2 = (qh6) LaunchActivity.M();
                if (qh6Var2 == null) {
                    i = ((e) qh6Var).currentAccount;
                    qh6Var2 = new qh6(i);
                    e S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(qh6Var2);
                    }
                }
                qh6Var2.F1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 1:
                ph6 ph6Var = (ph6) obj3;
                TLObject tLObject = (TLObject) obj2;
                HashMap hashMap = (HashMap) obj;
                mh6 mh6Var = ph6Var.a;
                if (tLObject != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject;
                    if (mh6Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList2 = ph6Var.H;
                        if (((String) hashMap.get(upperCase)) != null && arrayList2 != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayList2.size()) {
                                    if (arrayList2.get(i7) == null || !((gy2) arrayList2.get(i7)).a.equals(upperCase)) {
                                        i7++;
                                    } else {
                                        gy2Var = (gy2) arrayList2.get(i7);
                                    }
                                }
                            }
                            if (gy2Var != null) {
                                mh6Var.setText(gy2Var.c);
                                ph6Var.F = (byte) 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                ck6 ck6Var = (ck6) obj3;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    ck6Var.getClass();
                    break;
                } else {
                    ck6 ck6Var2 = ck6Var.t0.a;
                    while (true) {
                        ArrayList arrayList3 = ck6Var2.k0;
                        if (i6 >= arrayList3.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList3.get(i6)).link.equals(tL_chatInviteExported.link)) {
                            uj6 k0 = ck6Var2.k0();
                            arrayList3.remove(i6);
                            ck6Var2.m0(k0);
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            case 3:
                ls6 ls6Var = (ls6) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ls6Var.R.put(str2, tL_messages_stickerSet);
                ls6Var.S.k(tL_messages_stickerSet.set.id, str2);
                ls6Var.getNotificationCenter().k(62, str2);
                break;
            case 4:
                ((ls6) obj3).q2((TLRPC.Message) obj2, (String) obj);
                break;
            case 5:
                ls6 ls6Var2 = (ls6) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                iq6 iq6Var = (iq6) obj;
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    r47 r47Var = (r47) arrayList4.get(i8);
                    TLRPC.TL_message c0 = ls6Var2.getMessagesStorage().c0(r47Var.e1(), r47.B0(r47Var.k));
                    TLRPC.Message message = r47Var.k;
                    message.translatedToLanguage = c0.translatedToLanguage;
                    message.translatedText = c0.translatedText;
                    r47Var.f6(false);
                }
                iq6Var.run();
                break;
            case 6:
                ls6 ls6Var3 = (ls6) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                if7 if7Var = (if7) obj;
                HashMap hashMap2 = ls6Var3.A1;
                zh6 zh6Var = ls6Var3.B1;
                zh6 zh6Var2 = ls6Var3.z1;
                if (arrayList5 != null) {
                    for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                        int intValue = ((Integer) arrayList5.get(i9)).intValue();
                        long j = intValue;
                        if7 if7Var2 = (if7) zh6Var.f(j);
                        if (if7Var2 != null) {
                            hashMap2.remove(if7Var2);
                            ArrayList arrayList6 = (ArrayList) zh6Var2.f(if7Var2.a);
                            if (arrayList6 != null) {
                                int i10 = 0;
                                while (i10 < arrayList6.size()) {
                                    TLRPC.Message message2 = (TLRPC.Message) arrayList6.get(i10);
                                    if (message2 == null || message2.id == intValue) {
                                        arrayList6.remove(i10);
                                        i10--;
                                    }
                                    i10++;
                                }
                                if (arrayList6.isEmpty()) {
                                    zh6Var2.l(if7Var2.a);
                                }
                            }
                            zh6Var.l(j);
                            ls6Var3.getNotificationCenter().k(70, null, if7Var2);
                        }
                    }
                    break;
                } else if (if7Var != null) {
                    hashMap2.remove(if7Var);
                    zh6Var2.l(if7Var.a);
                    ls6Var3.getNotificationCenter().k(70, null, if7Var);
                    break;
                }
                break;
            case 7:
                ls6 ls6Var4 = (ls6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                if (tLObject2 != null) {
                    boolean z3 = tLObject2 instanceof TL_account.TL_savedRingtoneConverted;
                    wm9 wm9Var = ls6Var4.A0;
                    if (z3) {
                        wm9Var.a(((TL_account.TL_savedRingtoneConverted) tLObject2).document);
                        break;
                    } else {
                        wm9Var.a(document);
                        break;
                    }
                }
                break;
            case 8:
                int i11 = 3;
                ls6 ls6Var5 = (ls6) obj3;
                TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) obj2;
                String str3 = (String) obj;
                try {
                    if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                        SQLitePreparedStatement executeFast = ls6Var5.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                        SQLitePreparedStatement executeFast2 = ls6Var5.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                        ls6Var5.getMessagesStorage().b.beginTransaction();
                        int size = tL_emojiKeywordsDifference.keywords.size();
                        int i12 = 0;
                        while (i12 < size) {
                            TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i12);
                            if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                                TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                                String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                                int size2 = tL_emojiKeyword.emoticons.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    executeFast.requery();
                                    executeFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast.bindString(2, lowerCase);
                                    executeFast.bindString(i11, tL_emojiKeyword.emoticons.get(i13));
                                    executeFast.step();
                                    i13++;
                                    i11 = 3;
                                }
                            } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                                TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                                String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                                int size3 = tL_emojiKeywordDeleted.emoticons.size();
                                for (int i14 = 0; i14 < size3; i14++) {
                                    executeFast2.requery();
                                    executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast2.bindString(2, lowerCase2);
                                    executeFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i14));
                                    executeFast2.step();
                                }
                            }
                            i12++;
                            i11 = 3;
                        }
                        ls6Var5.getMessagesStorage().b.commitTransaction();
                        executeFast.dispose();
                        executeFast2.dispose();
                    }
                    SQLitePreparedStatement executeFast3 = ls6Var5.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
                    executeFast3.bindString(1, str3);
                    executeFast3.bindString(2, tL_emojiKeywordsDifference.lang_code);
                    executeFast3.bindInteger(3, tL_emojiKeywordsDifference.version);
                    executeFast3.bindLong(4, System.currentTimeMillis());
                    executeFast3.step();
                    executeFast3.dispose();
                    hl.c3(new aq6(ls6Var5, str3, b3));
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 9:
                vz6 vz6Var = (vz6) obj;
                ea3 ea3Var = ((au6) obj3).c;
                j99 f = ((mo5) obj2).f();
                fp fpVar = ea3Var.d;
                s64 s64Var = ea3Var.h;
                s64Var.getClass();
                fpVar.b = po5.q(f);
                if (!f.isEmpty()) {
                    fpVar.e = (vz6) f.get(0);
                    vz6Var.getClass();
                    fpVar.f = vz6Var;
                }
                if (((vz6) fpVar.d) == null) {
                    fpVar.d = fp.e(s64Var, (po5) fpVar.b, (vz6) fpVar.e, (xrb) fpVar.a);
                }
                fpVar.q(s64Var.y0());
                break;
            case 10:
                yx6 yx6Var = (yx6) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                ko6 ko6Var = yx6Var.u;
                if (ko6Var != null) {
                    yx6Var.t.p0(ko6Var);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    yx6Var.h.n0();
                    yx6Var.g.T();
                }
                countDownLatch.countDown();
                break;
            case 11:
                vx6 vx6Var = (vx6) obj3;
                xw6 xw6Var = (xw6) obj2;
                KeyEvent keyEvent = (KeyEvent) obj;
                yx6 yx6Var2 = vx6Var.b;
                if (yx6Var2.h(xw6Var)) {
                    yx6Var2.a(keyEvent, false, false);
                } else {
                    qy6 qy6Var = yx6Var2.h;
                    ry6 ry6Var = xw6Var.a;
                    ry6Var.getClass();
                    qy6Var.getClass();
                    qy6Var.g0(1, new cy6(qy6Var, (byte) 9), ry6Var, true);
                }
                vx6Var.a = null;
                break;
            case 12:
                yx6 yx6Var3 = (yx6) obj3;
                yw6 yw6Var = (yw6) obj;
                if (!yx6Var3.i()) {
                    yx6Var3.t();
                    ote.b(yx6Var3.t, yw6Var);
                    break;
                }
                break;
            case 13:
                Pair pair = (Pair) obj2;
                ((f07) obj3).b.i.N(((Integer) pair.first).intValue(), (vz6) pair.second, (rj2) obj);
                break;
            case 14:
                Pair pair2 = (Pair) obj2;
                ((f07) obj3).b.i.i(((Integer) pair2.first).intValue(), (vz6) pair2.second, (Exception) obj);
                break;
            case 15:
                r17 r17Var = (r17) obj3;
                String str4 = (String) obj2;
                TLObject tLObject3 = (TLObject) obj;
                r17Var.F0 = 0;
                if (str4.equals(r17Var.E0) && (tLObject3 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                    ArrayList arrayList7 = r17Var.B0;
                    int size4 = arrayList7 != null ? arrayList7.size() : 0;
                    r17Var.F("sticker_search_".concat(str4), tL_messages_stickers.stickers);
                    ArrayList arrayList8 = r17Var.B0;
                    int size5 = arrayList8 != null ? arrayList8.size() : 0;
                    if (!r17Var.p0 && (arrayList = r17Var.B0) != null && !arrayList.isEmpty()) {
                        r17Var.H();
                        r17Var.W.a(r17Var.K() > 0);
                        r17Var.p0 = true;
                    }
                    if (size4 != size5) {
                        r17Var.f();
                        break;
                    }
                }
                break;
            case 16:
                r17 r17Var2 = (r17) obj3;
                r17Var2.q0 = null;
                r17Var2.W((zh6) obj, (ArrayList) obj2, true);
                break;
            case 17:
                u57 u57Var = (u57) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                vnb vnbVar = u57Var.c;
                TextView textView = u57Var.f;
                TextView textView2 = u57Var.e;
                if (tL_error != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        textView2.setText(ob6.M0(2131746920, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        u57Var.F = true;
                        textView2.setText(ob6.M0(2131746924, null));
                        textView.setText(ob6.M0(2131746922, null));
                    } else {
                        textView2.setText(ob6.N0("UnknownError"));
                        textView.setVisibility(8);
                        new d31(o11.a(u57Var.getContext()), vnbVar).g0(tL_error, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    long j2 = ((TLRPC.TL_outboxReadDate) tLObject4).date * 1000;
                    try {
                        Calendar calendar = Calendar.getInstance();
                        int i15 = calendar.get(6);
                        int i16 = calendar.get(1);
                        calendar.setTimeInMillis(j2);
                        int i17 = calendar.get(6);
                        int i18 = calendar.get(1);
                        str = (i17 == i15 && i16 == i18) ? ob6.a0(null, null, 2131746921, ob6.D0().o0().format(new Date(j2))) : (i17 + 1 == i15 && i16 == i18) ? ob6.a0(null, null, 2131746919, ob6.D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? ob6.a0(null, null, 2131746923, ob6.D0().p0().format(new Date(j2)), ob6.D0().o0().format(new Date(j2))) : ob6.a0(null, null, 2131746923, ob6.D0().B0().format(new Date(j2)), ob6.D0().o0().format(new Date(j2)));
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        str = "LOC_ERR";
                    }
                    textView2.setText(str);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha = u57Var.d.animate().alpha(1.0f);
                k43 k43Var = k43.h;
                ik8.t(alpha, k43Var, 320L);
                u57Var.h.animate().alpha(0.0f).setInterpolator(k43Var).setDuration(320L).start();
                if (u57Var.F) {
                    int i19 = aob.i6;
                    hf0 Y = aob.Y(aob.v0(i19, vnbVar), 6, 0);
                    uob M = yob.M(i19);
                    u57Var.setBackground(Y);
                    yob.j(u57Var, Y, null, M, vnbVar);
                    u57Var.setOnClickListener(new sa5(u57Var, (byte) 27));
                    break;
                } else {
                    u57Var.setBackground(null);
                    u57Var.setOnClickListener(null);
                    break;
                }
            case 18:
                uc7 uc7Var = (uc7) obj3;
                long[] jArr = (long[]) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                int i20 = (int) jArr[1];
                uc7Var.getSendMessagesHelper().c0(i20);
                uc7Var.getSendMessagesHelper().h0(i20, false);
                jn7 notificationCenter = uc7Var.getNotificationCenter();
                Integer valueOf = Integer.valueOf(i20);
                Integer valueOf2 = Integer.valueOf(tL_updateMessageID.id);
                Long valueOf3 = Long.valueOf(jArr[0]);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
                uc7Var.getNotificationCenter().k(22, Integer.valueOf(i20), Integer.valueOf(tL_updateMessageID.id), null, Long.valueOf(jArr[0]), 0L, -1, bool);
                break;
            case 19:
                uc7 uc7Var2 = (uc7) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                ArrayList arrayList9 = (ArrayList) obj;
                zh6 zh6Var3 = uc7Var2.S4;
                if (tLObject5 instanceof Vector) {
                    ArrayList<T> arrayList10 = ((Vector) tLObject5).objects;
                    z = false;
                    for (int i21 = 0; i21 < Math.min(arrayList9.size(), arrayList10.size()); i21++) {
                        long longValue = ((Long) arrayList9.get(i21)).longValue();
                        if (arrayList10.get(i21) instanceof TL_account.RequirementToContact) {
                            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList10.get(i21);
                            if (!lbc.d((TL_account.RequirementToContact) zh6Var3.f(longValue), requirementToContact)) {
                                if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                                    zh6Var3.l(longValue);
                                } else {
                                    zh6Var3.k(longValue, requirementToContact);
                                }
                                z = true;
                            }
                            TLRPC.UserFull Y1 = uc7Var2.Y1(longValue);
                            if (Y1 == null) {
                                jf7 messagesStorage = uc7Var2.getMessagesStorage();
                                messagesStorage.a.c(new cq6((Object) messagesStorage, longValue, (Object) requirementToContact, (byte) 8));
                            } else if (lbc.a(Y1, requirementToContact)) {
                                uc7Var2.getMessagesStorage().g2(Y1, true);
                            }
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    uc7Var2.getNotificationCenter().k(jn7.k3, new Object[0]);
                    break;
                }
                break;
            case 20:
                id[] idVarArr = (id[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                e eVar = (e) obj;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new zn1(zArr, b3));
                    eVar.showDialog(idVarArr[0]);
                    break;
                }
                break;
            case 21:
                uc7 uc7Var3 = (uc7) obj3;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) obj2;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                zh6 zh6Var4 = uc7Var3.R;
                ArrayList arrayList11 = uc7Var3.y;
                if (longSparseIntArray != null) {
                    int i22 = 0;
                    z2 = 0;
                    while (i22 < longSparseIntArray.size()) {
                        long keyAt = longSparseIntArray.keyAt(i22);
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var4.f(keyAt);
                        if (dialog2 == null) {
                            int i23 = 0;
                            while (i23 < arrayList11.size()) {
                                i2 = i4;
                                i3 = i5;
                                if (((TLRPC.Dialog) arrayList11.get(i23)).id == keyAt) {
                                    zh6Var4.k(keyAt, (TLRPC.Dialog) arrayList11.get(i23));
                                    dialog2 = (TLRPC.Dialog) arrayList11.get(i23);
                                    dialog = dialog2;
                                    if (dialog != null) {
                                        boolean z4 = f11.a;
                                        uc7Var3.b0.put(keyAt, longSparseIntArray.valueAt(i22));
                                    } else {
                                        int i24 = dialog.unread_count;
                                        int valueAt = longSparseIntArray.valueAt(i22);
                                        dialog.unread_count = valueAt;
                                        boolean z5 = f11.a;
                                        if (i24 != 0) {
                                            if (valueAt == 0) {
                                                uc7Var3.p2(keyAt, 0L, null);
                                                if (z2 == 0) {
                                                    z2 = uc7Var3.l0();
                                                }
                                            }
                                        } else if (!dialog.unread_mark && valueAt != 0) {
                                            uc7Var3.p2(keyAt, 0L, null);
                                            if (z2 == 0) {
                                                z2 = uc7Var3.l0();
                                            }
                                        }
                                    }
                                    i22++;
                                    i4 = i2;
                                    i5 = i3;
                                    z2 = z2;
                                } else {
                                    i23++;
                                    i4 = i2;
                                    i5 = i3;
                                }
                            }
                        }
                        i2 = i4;
                        i3 = i5;
                        dialog = dialog2;
                        if (dialog != null) {
                        }
                        i22++;
                        i4 = i2;
                        i5 = i3;
                        z2 = z2;
                    }
                } else {
                    z2 = 0;
                }
                int i25 = i4;
                int i26 = i5;
                if (longSparseIntArray2 != null) {
                    int i27 = 0;
                    z2 = z2;
                    while (i27 < longSparseIntArray2.size()) {
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var4.f(longSparseIntArray2.keyAt(i27));
                        if (dialog3 != null) {
                            dialog3.unread_mentions_count = longSparseIntArray2.valueAt(i27);
                            if (uc7Var3.n0.contains(Long.valueOf(dialog3.id))) {
                                jn7 notificationCenter2 = uc7Var3.getNotificationCenter();
                                Long valueOf4 = Long.valueOf(dialog3.id);
                                Integer valueOf5 = Integer.valueOf(dialog3.unread_mentions_count);
                                Object[] objArr = new Object[3];
                                objArr[0] = valueOf4;
                                objArr[i26] = 0L;
                                objArr[i25] = valueOf5;
                                notificationCenter2.k(94, objArr);
                            }
                            if (z2 == 0) {
                                int i28 = 0;
                                while (true) {
                                    ac7[] ac7VarArr = uc7Var3.N;
                                    if (i28 < ac7VarArr.length) {
                                        ac7 ac7Var = ac7VarArr[i28];
                                        if (ac7Var == null || (ac7Var.g & 32) == 0) {
                                            i28++;
                                        } else {
                                            z2 = i26;
                                        }
                                    }
                                }
                                if (z2 == 0) {
                                    z2 = uc7Var3.l0();
                                }
                            }
                        }
                        i27++;
                        z2 = z2;
                    }
                }
                if (z2 != 0) {
                    uc7Var3.h5(null);
                    uc7Var3.getNotificationCenter().k(3, new Object[0]);
                }
                jn7 notificationCenter3 = uc7Var3.getNotificationCenter();
                Object[] objArr2 = new Object[i26];
                objArr2[0] = 256;
                notificationCenter3.k(i25, objArr2);
                if (longSparseIntArray != null) {
                    uc7Var3.getNotificationsController().J(longSparseIntArray);
                    break;
                }
                break;
            case 22:
                ((uc7) obj3).getNotificationCenter().k(jn7.N2, (znb) obj2, (ynb) obj);
                break;
            case 23:
                ((uc7) obj3).getConnectionsManager().sendRequest((TLRPC.TL_channels_editAdmin) obj2, (z97) obj);
                break;
            case 24:
                ((uc7) obj3).getConnectionsManager().sendRequest((TLRPC.TL_messages_editChatAdmin) obj2, (qh3) obj);
                break;
            case 25:
                uc7 uc7Var4 = (uc7) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                uc7Var4.j4(updates.users, false);
                uc7Var4.c4(updates.chats, false);
                ((Runnable) obj).run();
                break;
            case 26:
                uc7 uc7Var5 = (uc7) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                if (!arrayList12.isEmpty()) {
                    hl.c3(new k77(uc7Var5, arrayList12, b2));
                }
                uc7Var5.getMessagesStorage().g1(updates_channeldifference.new_messages, true, false, false, uc7Var5.getDownloadController().l(), false, 0, 0L);
                break;
            case 27:
                ((uc7) obj3).getNotificationsController().K((ArrayList) obj2, !(((TLRPC.updates_Difference) obj) instanceof TLRPC.TL_updates_differenceSlice), false, null);
                break;
            case 28:
                uc7 uc7Var6 = (uc7) obj3;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                chatFull.about = (String) obj;
                uc7Var6.getMessagesStorage().K1(chatFull, false);
                jn7 notificationCenter4 = uc7Var6.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter4.k(31, chatFull, 0, bool2, bool2);
                break;
            default:
                pc7 pc7Var = (pc7) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = pc7Var.c;
                if (tLObject6 instanceof TLRPC.TL_savedMusic) {
                    TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject6;
                    if (pc7Var.d <= 0 && arrayList14.size() == 1) {
                        if (((r47) arrayList14.get(0)).F0() == null || arrayList13.isEmpty() || ((r47) arrayList13.get(0)).F0() == null || ((r47) arrayList14.get(0)).F0().id != ((r47) arrayList13.get(0)).F0().id) {
                            arrayList14.clear();
                        } else {
                            arrayList13.remove(0);
                        }
                    }
                    pc7Var.d = tL_savedMusic.count;
                    arrayList14.addAll(arrayList13);
                    pc7Var.e = arrayList14.size() >= pc7Var.d;
                }
                pc7Var.f = false;
                jn7.f(pc7Var.a).k(jn7.W3, pc7Var);
                break;
        }
    }
}
