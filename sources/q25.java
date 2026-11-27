// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class q25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q25(pi9 pi9Var, Uri uri, boolean z, String str, int i, mk0 mk0Var) {
        this.a = (byte) 3;
        this.d = pi9Var;
        this.e = uri;
        this.c = z;
        this.f = str;
        this.b = i;
        this.h = mk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:518:0x0844, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0356 A[Catch: Exception -> 0x0359, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0359, blocks: (B:239:0x02de, B:266:0x0356), top: B:232:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x043c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0437 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r4v32, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v34, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r5v80 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        WalletEngine2.ImportedWalletProof importedWalletProof;
        boolean z;
        int i;
        int i2;
        TL_feed.FeedPosition feedPosition;
        int i3;
        int i4;
        int i5;
        byte b;
        im7 im7Var;
        w94 w94Var;
        im7 im7Var2;
        boolean z2;
        Long l;
        int i6;
        TLRPC.Message message;
        int i7;
        boolean z3;
        int i8;
        TLRPC.Photo photo;
        String str;
        ?? r5;
        FileOutputStream fileOutputStream;
        String extensionFromMimeType;
        final String str2;
        boolean z4;
        int i9;
        int i10;
        int ceil;
        final int i11;
        int i12;
        final int i13;
        final int i14;
        final int i15;
        Pair N0;
        final int intValue;
        boolean z5;
        int i16;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputMedia inputMedia2;
        int i17;
        TLRPC.TL_inputSingleMedia tL_inputSingleMedia;
        TLRPC.InputMedia inputMedia3;
        int i18;
        int i19;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        wb2 wb2Var;
        String v2;
        byte b2 = this.a;
        int i20 = 4;
        int i21 = this.b;
        boolean z6 = this.c;
        InputStream inputStream = null;
        r12 = null;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        ?? r13 = true;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b2) {
            case 0:
                c cVar = (c) obj4;
                c35 c35Var = (c35) obj3;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj2;
                icc iccVar = (icc) obj;
                try {
                    try {
                        String str3 = proofchallenge.domain;
                        WalletEngine2.ImportedWalletProof createImportProof = z6 ? WalletEngine2.createImportProof(c35Var, str3, proofchallenge.payload, i21) : WalletEngine2.createOwnershipProof(c35Var, str3, proofchallenge.payload, i21);
                        c35Var.close();
                        importedWalletProof = createImportProof;
                        e = null;
                    } catch (Exception e) {
                        e = e;
                        c.n("createImportProof", e);
                        c35Var.close();
                        importedWalletProof = null;
                    }
                    hl.c3(new re4(cVar, importedWalletProof, e, iccVar));
                    return;
                } catch (Throwable th) {
                    c35Var.close();
                    throw th;
                }
            case 1:
                lm7 lm7Var = (lm7) obj4;
                jm7 jm7Var = (jm7) obj3;
                String str4 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                if (lm7Var.h) {
                    return;
                }
                jm7Var.k = false;
                ArrayList arrayList = jm7Var.a;
                if (jm7Var.o) {
                    jm7Var.o = false;
                    lm7Var.y0(i21, true);
                    return;
                }
                if (i21 == 2 && !str4.equals(lm7Var.Q)) {
                    if (TextUtils.isEmpty(lm7Var.Q) || lm7Var.R != null) {
                        lm7.L0(jm7Var);
                        return;
                    } else {
                        lm7Var.y0(i21, true);
                        return;
                    }
                }
                boolean z7 = z6 || !jm7Var.l;
                jm7Var.l = true;
                jm7Var.p = false;
                if (z6 && ((tLObject instanceof TL_feed.ForYouFeed) || (tLObject instanceof TL_feed.TL_feedMessages))) {
                    arrayList.clear();
                    jm7Var.b.clear();
                    jm7Var.c.clear();
                    jm7Var.d.clear();
                    jm7Var.e.clear();
                    jm7Var.i = null;
                    jm7Var.j = Utilities.b.nextInt(3);
                    jm7Var.r = null;
                    jm7Var.m = false;
                }
                if (tLObject instanceof TL_feed.ForYouFeed) {
                    TL_feed.ForYouFeed forYouFeed = (TL_feed.ForYouFeed) tLObject;
                    Long valueOf = (forYouFeed.flags & 1) != 0 ? Long.valueOf(forYouFeed.recommendation_id) : null;
                    ArrayList<TLRPC.User> arrayList2 = forYouFeed.users;
                    ArrayList<TLRPC.Chat> arrayList3 = forYouFeed.chats;
                    lm7Var.getMessagesController().j4(arrayList2, false);
                    lm7Var.getMessagesController().c4(arrayList3, false);
                    lm7Var.getMessagesStorage().j1(arrayList2, arrayList3, true, true);
                    int size = forYouFeed.items.size();
                    ArrayList<TL_feed.FeedItem> arrayList4 = forYouFeed.items;
                    int size2 = arrayList4.size();
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    while (i24 < size2) {
                        TL_feed.FeedItem feedItem = arrayList4.get(i24);
                        i24++;
                        TL_feed.FeedItem feedItem2 = feedItem;
                        if (feedItem2 instanceof TL_feed.TL_feedItemMessage) {
                            TL_feed.TL_feedItemMessage tL_feedItemMessage = (TL_feed.TL_feedItemMessage) feedItem2;
                            z2 = z7;
                            i22++;
                            lm7.g0(jm7Var, Collections.singletonList(tL_feedItemMessage.message), new fa4(valueOf, i22, "preview"));
                            if (lm7Var.e0(jm7Var, tL_feedItemMessage.message, -1)) {
                                i23++;
                            }
                            l = valueOf;
                        } else {
                            z2 = z7;
                            if (feedItem2 instanceof TL_feed.TL_feedItemMessageGroup) {
                                ArrayList<TLRPC.Message> arrayList5 = ((TL_feed.TL_feedItemMessageGroup) feedItem2).messages;
                                if (arrayList5 != null) {
                                    i22++;
                                    lm7.g0(jm7Var, arrayList5, new fa4(valueOf, i22, "preview"));
                                }
                                if (arrayList5 == null || arrayList5.isEmpty()) {
                                    l = valueOf;
                                    i6 = -1;
                                    message = null;
                                } else {
                                    int size3 = arrayList5.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < size3) {
                                            TLRPC.Message message2 = arrayList5.get(i25);
                                            i25++;
                                            message = message2;
                                            l = valueOf;
                                            if (message == null || TextUtils.isEmpty(message.message)) {
                                                valueOf = l;
                                            }
                                        } else {
                                            l = valueOf;
                                            message = arrayList5.get(0);
                                        }
                                    }
                                    i6 = -1;
                                }
                                if (lm7Var.e0(jm7Var, message, i6)) {
                                    i23++;
                                }
                                if (arrayList5 != null) {
                                    int size4 = arrayList5.size();
                                    int i26 = 0;
                                    while (i26 < size4) {
                                        TLRPC.Message message3 = arrayList5.get(i26);
                                        i26++;
                                        TLRPC.Message message4 = message3;
                                        ArrayList<TLRPC.Message> arrayList6 = arrayList5;
                                        if (message4 != message) {
                                            lm7Var.e0(jm7Var, message4, -1);
                                        }
                                        arrayList5 = arrayList6;
                                    }
                                }
                            } else {
                                l = valueOf;
                                if ((feedItem2 instanceof TL_feed.TL_feedItemInterestCategories) && i21 == 0 && !lm7Var.s) {
                                    int size5 = arrayList.size();
                                    int i27 = 0;
                                    while (true) {
                                        if (i27 < size5) {
                                            Object obj5 = arrayList.get(i27);
                                            i27++;
                                            if (obj5 instanceof TL_feed.TL_feedItemInterestCategories) {
                                                break;
                                            }
                                        } else {
                                            arrayList.add(feedItem2);
                                        }
                                    }
                                }
                            }
                        }
                        z7 = z2;
                        valueOf = l;
                    }
                    z = z7;
                    i = size;
                    i2 = i23;
                } else {
                    z = z7;
                    if (tLObject instanceof TL_feed.TL_feedMessages) {
                        TL_feed.TL_feedMessages tL_feedMessages = (TL_feed.TL_feedMessages) tLObject;
                        ArrayList<TLRPC.User> arrayList7 = tL_feedMessages.users;
                        ArrayList<TLRPC.Chat> arrayList8 = tL_feedMessages.chats;
                        lm7Var.getMessagesController().j4(arrayList7, false);
                        lm7Var.getMessagesController().c4(arrayList8, false);
                        lm7Var.getMessagesStorage().j1(arrayList7, arrayList8, true, true);
                        TL_feed.FeedPosition feedPosition2 = tL_feedMessages.read_max_position;
                        if (feedPosition2 != null && ((feedPosition = jm7Var.s) == null || (i3 = feedPosition2.date) > (i4 = feedPosition.date) || (i3 == i4 && feedPosition2.id > feedPosition.id))) {
                            jm7Var.s = feedPosition2;
                        }
                        i = tL_feedMessages.messages.size();
                        ArrayList<TLRPC.Message> arrayList9 = tL_feedMessages.messages;
                        int size6 = arrayList9.size();
                        i2 = 0;
                        int i28 = 0;
                        while (i28 < size6) {
                            TLRPC.Message message5 = arrayList9.get(i28);
                            i28++;
                            if (lm7Var.e0(jm7Var, message5, -1)) {
                                i2++;
                            }
                        }
                        TL_feed.FeedPosition feedPosition3 = tL_feedMessages.min_position;
                        if (feedPosition3 != null) {
                            jm7Var.r = feedPosition3;
                        } else if (!tL_feedMessages.messages.isEmpty()) {
                            TLRPC.Message message6 = (TLRPC.Message) c00.g(1, tL_feedMessages.messages);
                            TL_feed.FeedPosition feedPosition4 = new TL_feed.FeedPosition();
                            jm7Var.r = feedPosition4;
                            feedPosition4.date = message6.date;
                            feedPosition4.peer = message6.peer_id;
                            feedPosition4.id = message6.id;
                        }
                    } else {
                        if (!(tLObject instanceof TL_feed.TL_feedMessagesNotModified)) {
                            jm7Var.n = true;
                        }
                        i = 0;
                        i2 = 0;
                    }
                }
                boolean z8 = jm7Var.n;
                if (!z8) {
                    if (i21 != 0) {
                        break;
                    }
                    boolean z9 = false;
                    jm7Var.m = z9;
                }
                boolean z10 = z & ((z8 || jm7Var.f == null) ? false : true);
                if (z10) {
                    i5 = 0;
                    jm7Var.f.g3.O(false);
                } else {
                    i5 = 0;
                    lm7.L0(jm7Var);
                }
                if (z6 && !jm7Var.n && (im7Var2 = jm7Var.f) != null) {
                    im7Var2.x0(i5);
                }
                if (z10) {
                    lm7.i0(jm7Var.f);
                }
                if (!z6 || (w94Var = jm7Var.h) == null) {
                    b = 0;
                } else {
                    b = 0;
                    w94Var.setRefreshing(false);
                }
                if (i21 != 1 || (im7Var = jm7Var.f) == null) {
                    return;
                }
                im7Var.post(new xl7(lm7Var, jm7Var, b));
                return;
            case 2:
                l98 l98Var = (l98) obj4;
                String str5 = (String) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                HashMap hashMap = l98Var.h;
                ArrayList arrayList10 = l98Var.f;
                ArrayList arrayList11 = l98Var.n;
                int size7 = arrayList11.size();
                int i29 = 0;
                while (true) {
                    if (i29 < size7) {
                        if (((String) arrayList11.get(i29)).equalsIgnoreCase(str5)) {
                            arrayList11.remove(i29);
                        } else {
                            i29++;
                        }
                    }
                }
                arrayList11.add(0, str5);
                while (arrayList11.size() > 20) {
                    qd4.v(1, arrayList11);
                }
                l98Var.g0();
                if (i21 != l98Var.E) {
                    return;
                }
                int size8 = arrayList10.size();
                if (tLObject2 != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    l98Var.x = messages_botresults.next_offset;
                    int i30 = 0;
                    i7 = 0;
                    for (int size9 = messages_botresults.results.size(); i30 < size9; size9 = i8) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i30);
                        if (z6 ? "gif".equals(botInlineResult.type) : "photo".equals(botInlineResult.type)) {
                            if (!hashMap.containsKey(botInlineResult.id)) {
                                ro6 ro6Var = new ro6();
                                if (!z6) {
                                    i8 = size9;
                                    TLRPC.Photo photo2 = botInlineResult.photo;
                                    if (photo2 != null) {
                                        TLRPC.PhotoSize w = xb4.w(photo2.sizes, hl.Y0(false), false, null, false);
                                        TLRPC.PhotoSize w2 = xb4.w(botInlineResult.photo.sizes, jn7.q5, false, null, false);
                                        if (w != null) {
                                            ro6Var.E = w.w;
                                            ro6Var.F = w.h;
                                            ro6Var.L = w;
                                            ro6Var.K = botInlineResult.photo;
                                            ro6Var.G = w.size;
                                            ro6Var.M = w2;
                                            ro6Var.B = botInlineResult.id;
                                            ro6Var.H = z6;
                                            ro6Var.N = botInlineResult;
                                            HashMap hashMap2 = new HashMap();
                                            ro6Var.O = hashMap2;
                                            hashMap2.put("id", botInlineResult.id);
                                            ro6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                            ro6Var.O.put("bot_name", lbc.p(user));
                                            arrayList10.add(ro6Var);
                                            hashMap.put(ro6Var.B, ro6Var);
                                            i7++;
                                        }
                                    }
                                    if (botInlineResult.content == null) {
                                    }
                                } else if (botInlineResult.document != null) {
                                    for (int i31 = 0; i31 < botInlineResult.document.attributes.size(); i31++) {
                                        TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i31);
                                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                            ro6Var.E = documentAttribute.w;
                                            ro6Var.F = documentAttribute.h;
                                            ro6Var.J = botInlineResult.document;
                                            ro6Var.G = 0;
                                            photo = botInlineResult.photo;
                                            if (photo == null) {
                                                i8 = size9;
                                                TLRPC.PhotoSize w3 = xb4.w(photo.sizes, l98Var.S, true, null, false);
                                                if (w3 != null) {
                                                    botInlineResult.document.thumbs.add(w3);
                                                    botInlineResult.document.flags |= 1;
                                                }
                                            } else {
                                                i8 = size9;
                                            }
                                            ro6Var.B = botInlineResult.id;
                                            ro6Var.H = z6;
                                            ro6Var.N = botInlineResult;
                                            HashMap hashMap22 = new HashMap();
                                            ro6Var.O = hashMap22;
                                            hashMap22.put("id", botInlineResult.id);
                                            ro6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                            ro6Var.O.put("bot_name", lbc.p(user));
                                            arrayList10.add(ro6Var);
                                            hashMap.put(ro6Var.B, ro6Var);
                                            i7++;
                                        }
                                    }
                                    ro6Var.J = botInlineResult.document;
                                    ro6Var.G = 0;
                                    photo = botInlineResult.photo;
                                    if (photo == null) {
                                    }
                                    ro6Var.B = botInlineResult.id;
                                    ro6Var.H = z6;
                                    ro6Var.N = botInlineResult;
                                    HashMap hashMap222 = new HashMap();
                                    ro6Var.O = hashMap222;
                                    hashMap222.put("id", botInlineResult.id);
                                    ro6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                    ro6Var.O.put("bot_name", lbc.p(user));
                                    arrayList10.add(ro6Var);
                                    hashMap.put(ro6Var.B, ro6Var);
                                    i7++;
                                } else {
                                    i8 = size9;
                                    if (botInlineResult.content == null) {
                                        int i32 = 0;
                                        while (true) {
                                            if (i32 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i32);
                                                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    ro6Var.E = documentAttribute2.w;
                                                    ro6Var.F = documentAttribute2.h;
                                                } else {
                                                    i32++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            ro6Var.D = webDocument.url;
                                        } else {
                                            ro6Var.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        ro6Var.C = webDocument2.url;
                                        ro6Var.G = z6 ? 0 : webDocument2.size;
                                        ro6Var.B = botInlineResult.id;
                                        ro6Var.H = z6;
                                        ro6Var.N = botInlineResult;
                                        HashMap hashMap2222 = new HashMap();
                                        ro6Var.O = hashMap2222;
                                        hashMap2222.put("id", botInlineResult.id);
                                        ro6Var.O.put("query_id", String.valueOf(messages_botresults.query_id));
                                        ro6Var.O.put("bot_name", lbc.p(user));
                                        arrayList10.add(ro6Var);
                                        hashMap.put(ro6Var.B, ro6Var);
                                        i7++;
                                    }
                                }
                                i30++;
                            }
                        }
                        i8 = size9;
                        i30++;
                    }
                    l98Var.s = size8 == arrayList10.size() || l98Var.x == null;
                } else {
                    i7 = 0;
                }
                l98Var.r = false;
                if (i7 != 0) {
                    l98Var.M.p(size8, i7);
                } else if (l98Var.s) {
                    z3 = true;
                    l98Var.M.s(arrayList10.size() - 1);
                    if (arrayList10.size() > 0) {
                        l98Var.O.e(false, z3);
                        return;
                    }
                    return;
                }
                z3 = true;
                if (arrayList10.size() > 0) {
                }
                break;
            case 3:
                final pi9 pi9Var = (pi9) obj4;
                ?? r4 = (Uri) obj3;
                String str6 = (String) obj2;
                final mk0 mk0Var = (mk0) obj;
                try {
                    str = hl.S0(r4);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    str = null;
                }
                final boolean z11 = this.c;
                final int i33 = this.b;
                if (str == null || !bp1.t(str)) {
                    Context context = pi9Var.getContext();
                    try {
                        try {
                            if (context != null) {
                                try {
                                    r4 = context.getContentResolver().openInputStream(r4);
                                } catch (Exception e3) {
                                    e = e3;
                                    r4 = 0;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r5 = 0;
                                    if (inputStream != null) {
                                    }
                                    if (r5 != 0) {
                                    }
                                }
                                if (r4 != 0) {
                                    if (str6 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str6);
                                        } catch (Exception e4) {
                                            e = e4;
                                            fileOutputStream = null;
                                            cc4.g(e, true);
                                            if (r4 != 0) {
                                            }
                                            if (fileOutputStream != null) {
                                            }
                                            str = null;
                                            str2 = str;
                                            if (str2 == null) {
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            context = null;
                                            inputStream = r4;
                                            r5 = context;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (r5 != 0) {
                                                throw th;
                                            }
                                            try {
                                                r5.close();
                                                throw th;
                                            } catch (Exception unused2) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        extensionFromMimeType = null;
                                    }
                                    if (TextUtils.isEmpty(extensionFromMimeType)) {
                                        extensionFromMimeType = z11 ? "mp4" : "jpg";
                                    }
                                    File file = new File(xb4.z(4), "rich_external_" + (-i33) + "_" + xea.p() + "." + extensionFromMimeType);
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        hl.D(r4, fileOutputStream);
                                        str = file.getAbsolutePath();
                                        try {
                                            r4.close();
                                        } catch (Exception unused3) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception unused4) {
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        cc4.g(e, true);
                                        if (r4 != 0) {
                                            try {
                                                r4.close();
                                            } catch (Exception unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        str = null;
                                        str2 = str;
                                        if (str2 == null) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                } else if (r4 != 0) {
                                    r4.close();
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception unused6) {
                    }
                    str = null;
                }
                str2 = str;
                if (str2 == null || !bp1.t(str2)) {
                    return;
                }
                if (z11) {
                    try {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever2.setDataSource(str2);
                                    String extractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                                    String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                                    String extractMetadata3 = mediaMetadataRetriever2.extractMetadata(9);
                                    i10 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                                    if (extractMetadata2 != null) {
                                        try {
                                            i9 = Integer.parseInt(extractMetadata2);
                                        } catch (Exception e6) {
                                            e = e6;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            z4 = true;
                                            i9 = 0;
                                            cc4.g(e, z4);
                                            if (mediaMetadataRetriever != null) {
                                            }
                                            i11 = 0;
                                            if (!z11) {
                                            }
                                            intValue = 0;
                                            hl.c3(new Runnable() { // from class: ph9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z12 = z11;
                                                    no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                                                    no6Var.J = i13;
                                                    no6Var.K = intValue;
                                                    pi9 pi9Var2 = pi9.this;
                                                    mk0 mk0Var2 = mk0Var;
                                                    if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                                                        pi9Var2.b2(no6Var);
                                                    } else {
                                                        pi9Var2.Q1(mk0Var2, no6Var);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    } else {
                                        i9 = 0;
                                    }
                                    if (extractMetadata3 != null) {
                                        try {
                                            ceil = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                        } catch (Exception e7) {
                                            e = e7;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            z4 = true;
                                            cc4.g(e, z4);
                                            if (mediaMetadataRetriever != null) {
                                                try {
                                                    mediaMetadataRetriever.release();
                                                } catch (Exception unused7) {
                                                }
                                            }
                                            i11 = 0;
                                            if (!z11) {
                                            }
                                            intValue = 0;
                                            hl.c3(new Runnable() { // from class: ph9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z12 = z11;
                                                    no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                                                    no6Var.J = i13;
                                                    no6Var.K = intValue;
                                                    pi9 pi9Var2 = pi9.this;
                                                    mk0 mk0Var2 = mk0Var;
                                                    if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                                                        pi9Var2.b2(no6Var);
                                                    } else {
                                                        pi9Var2.Q1(mk0Var2, no6Var);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    } else {
                                        ceil = 0;
                                    }
                                    try {
                                        mediaMetadataRetriever2.release();
                                    } catch (Exception unused8) {
                                    }
                                    i11 = ceil;
                                } catch (Exception e8) {
                                    e = e8;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    z4 = true;
                                    i9 = 0;
                                    i10 = 0;
                                    cc4.g(e, z4);
                                    if (mediaMetadataRetriever != null) {
                                    }
                                    i11 = 0;
                                    if (!z11) {
                                    }
                                    intValue = 0;
                                    hl.c3(new Runnable() { // from class: ph9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z12 = z11;
                                            no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                                            no6Var.J = i13;
                                            no6Var.K = intValue;
                                            pi9 pi9Var2 = pi9.this;
                                            mk0 mk0Var2 = mk0Var;
                                            if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                                                pi9Var2.b2(no6Var);
                                            } else {
                                                pi9Var2.Q1(mk0Var2, no6Var);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                if (mediaMetadataRetriever != null) {
                                    try {
                                        mediaMetadataRetriever.release();
                                    } catch (Exception unused9) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e9) {
                        e = e9;
                    }
                    if (!z11) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(str2, options);
                            i10 = options.outWidth;
                            i9 = options.outHeight;
                        } catch (Exception e10) {
                            cc4.g(e10, true);
                        }
                        try {
                            N0 = hl.N0(str2);
                            i12 = ((Integer) N0.first).intValue();
                        } catch (Exception e11) {
                            e = e11;
                            i12 = 0;
                        }
                        try {
                            intValue = ((Integer) N0.second).intValue();
                            i13 = i12;
                            i14 = i9;
                            i15 = i10;
                        } catch (Exception e12) {
                            e = e12;
                            cc4.g(e, true);
                            i13 = i12;
                            i14 = i9;
                            i15 = i10;
                            intValue = 0;
                            hl.c3(new Runnable() { // from class: ph9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z12 = z11;
                                    no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                                    no6Var.J = i13;
                                    no6Var.K = intValue;
                                    pi9 pi9Var2 = pi9.this;
                                    mk0 mk0Var2 = mk0Var;
                                    if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                                        pi9Var2.b2(no6Var);
                                    } else {
                                        pi9Var2.Q1(mk0Var2, no6Var);
                                    }
                                }
                            });
                            return;
                        }
                        hl.c3(new Runnable() { // from class: ph9
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z12 = z11;
                                no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                                no6Var.J = i13;
                                no6Var.K = intValue;
                                pi9 pi9Var2 = pi9.this;
                                mk0 mk0Var2 = mk0Var;
                                if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                                    pi9Var2.b2(no6Var);
                                } else {
                                    pi9Var2.Q1(mk0Var2, no6Var);
                                }
                            }
                        });
                        return;
                    }
                    i14 = i9;
                    i15 = i10;
                    i13 = 0;
                    intValue = 0;
                    hl.c3(new Runnable() { // from class: ph9
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z12 = z11;
                            no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                            no6Var.J = i13;
                            no6Var.K = intValue;
                            pi9 pi9Var2 = pi9.this;
                            mk0 mk0Var2 = mk0Var;
                            if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                                pi9Var2.b2(no6Var);
                            } else {
                                pi9Var2.Q1(mk0Var2, no6Var);
                            }
                        }
                    });
                    return;
                }
                i9 = 0;
                i10 = 0;
                i11 = 0;
                if (!z11) {
                }
                intValue = 0;
                hl.c3(new Runnable() { // from class: ph9
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12 = z11;
                        no6 no6Var = new no6(i33, str2, z12 ? i11 : 0, z12, i15, i14);
                        no6Var.J = i13;
                        no6Var.K = intValue;
                        pi9 pi9Var2 = pi9.this;
                        mk0 mk0Var2 = mk0Var;
                        if (mk0Var2 == null || !pi9.A3(mk0Var2.b)) {
                            pi9Var2.b2(no6Var);
                        } else {
                            pi9Var2.Q1(mk0Var2, no6Var);
                        }
                    }
                });
                return;
            case 4:
                r7a r7aVar = (r7a) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                d7a d7aVar = (d7a) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                    int size10 = tL_messages_sendMultiMedia.multi_media.size();
                    z5 = false;
                    while (i17 < size10) {
                        if (i21 >= 0) {
                            i17 = i21 != i17 ? i17 + 1 : 0;
                            r7aVar.h0(((r47) arrayList12.get(i17)).e1(), z6);
                            tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i17);
                            inputMedia3 = tL_inputSingleMedia.media;
                            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaPhoto)) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) d7aVar.A.get(i17);
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                tL_inputSingleMedia.media = (TLRPC.InputMedia) d7aVar.A.get(i17);
                            }
                            d7aVar.o = (oec) d7aVar.w.get(i17);
                            d7aVar.l = (String) d7aVar.v.get(i17);
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) d7aVar.u.get(i17);
                            d7aVar.g = photoSize;
                            d7aVar.p = true;
                            if (tL_inputSingleMedia.media.file != null || photoSize != null) {
                                z5 = true;
                            }
                            r7aVar.L(d7aVar, i17);
                        } else {
                            if (d7aVar.y.get(i17) == null) {
                            }
                            r7aVar.h0(((r47) arrayList12.get(i17)).e1(), z6);
                            tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i17);
                            inputMedia3 = tL_inputSingleMedia.media;
                            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaPhoto)) {
                            }
                            d7aVar.o = (oec) d7aVar.w.get(i17);
                            d7aVar.l = (String) d7aVar.v.get(i17);
                            TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) d7aVar.u.get(i17);
                            d7aVar.g = photoSize2;
                            d7aVar.p = true;
                            if (tL_inputSingleMedia.media.file != null) {
                            }
                            z5 = true;
                            r7aVar.L(d7aVar, i17);
                        }
                    }
                } else if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                    int size11 = tL_inputMediaPaidMedia.extended_media.size();
                    boolean z12 = false;
                    while (i16 < size11) {
                        if (i21 >= 0) {
                            i16 = i21 != i16 ? i16 + 1 : 0;
                            r7aVar.h0(((r47) arrayList12.get(i16)).e1(), z6);
                            inputMedia = tL_inputMediaPaidMedia.extended_media.get(i16);
                            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                    ArrayList<TLRPC.InputMedia> arrayList13 = tL_inputMediaPaidMedia.extended_media;
                                    inputMedia2 = (TLRPC.InputMedia) d7aVar.A.get(i16);
                                    arrayList13.set(i16, inputMedia2);
                                }
                                d7aVar.o = (oec) d7aVar.w.get(i16);
                                d7aVar.l = (String) d7aVar.v.get(i16);
                                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) d7aVar.u.get(i16);
                                d7aVar.g = photoSize3;
                                d7aVar.p = true;
                                if (inputMedia.file != null || photoSize3 != null) {
                                    z12 = true;
                                }
                                r7aVar.L(d7aVar, i16);
                            } else {
                                ArrayList<TLRPC.InputMedia> arrayList14 = tL_inputMediaPaidMedia.extended_media;
                                inputMedia2 = (TLRPC.InputMedia) d7aVar.A.get(i16);
                                arrayList14.set(i16, inputMedia2);
                            }
                            inputMedia = inputMedia2;
                            d7aVar.o = (oec) d7aVar.w.get(i16);
                            d7aVar.l = (String) d7aVar.v.get(i16);
                            TLRPC.PhotoSize photoSize32 = (TLRPC.PhotoSize) d7aVar.u.get(i16);
                            d7aVar.g = photoSize32;
                            d7aVar.p = true;
                            if (inputMedia.file != null) {
                            }
                            z12 = true;
                            r7aVar.L(d7aVar, i16);
                        } else {
                            if (d7aVar.y.get(i16) == null) {
                            }
                            r7aVar.h0(((r47) arrayList12.get(i16)).e1(), z6);
                            inputMedia = tL_inputMediaPaidMedia.extended_media.get(i16);
                            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                            }
                            inputMedia = inputMedia2;
                            d7aVar.o = (oec) d7aVar.w.get(i16);
                            d7aVar.l = (String) d7aVar.v.get(i16);
                            TLRPC.PhotoSize photoSize322 = (TLRPC.PhotoSize) d7aVar.u.get(i16);
                            d7aVar.g = photoSize322;
                            d7aVar.p = true;
                            if (inputMedia.file != null) {
                            }
                            z12 = true;
                            r7aVar.L(d7aVar, i16);
                        }
                    }
                    z5 = z12;
                } else {
                    z5 = false;
                }
                if (z5) {
                    return;
                }
                for (int i34 = 0; i34 < arrayList12.size(); i34++) {
                    TLRPC.Message message7 = ((r47) arrayList12.get(i34)).k;
                    r7aVar.getMessagesStorage().K0(z6 ? 1 : 0, message7);
                    message7.send_state = 2;
                    message7.errorAllowedPriceStars = 0L;
                    message7.errorNewPriceStars = 0L;
                    r7aVar.getNotificationCenter().k(23, Integer.valueOf(message7.id));
                    r7aVar.c0(message7.id);
                    r7aVar.h0(message7.id, z6);
                }
                return;
            case 5:
                lna lnaVar = (lna) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj3;
                r47 r47Var = (r47) obj2;
                wb2 wb2Var2 = (wb2) obj;
                RLottieNative[] rLottieNativeArr = lnaVar.g1;
                RLottieNative[] rLottieNativeArr2 = lnaVar.j1;
                int[] iArr = lnaVar.e;
                if (lnaVar.X0) {
                    hl.c3(new jna(lnaVar, (byte) 0));
                    return;
                }
                int i35 = 0;
                boolean z13 = false;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i36 = this.b;
                    if (i35 >= length) {
                        wb2 wb2Var3 = wb2Var2;
                        if (z13) {
                            hl.c3(new jna(lnaVar, (byte) 1));
                            return;
                        } else {
                            hl.c3(new ps1(lnaVar, z6, i36, wb2Var3));
                            return;
                        }
                    }
                    if (i35 <= 2) {
                        if (rLottieNativeArr2[i35] == null) {
                            if (i35 == 0) {
                                int i37 = lnaVar.c1;
                                if (i37 == r13) {
                                    i19 = 5;
                                } else if (i37 == 2) {
                                    i19 = 6;
                                } else if (i37 == 3) {
                                    i19 = 7;
                                } else if (i37 == i20) {
                                    i19 = i20;
                                    i18 = i19;
                                    TLRPC.Document document = tL_messages_stickerSet2.documents.get(i19);
                                    xb4.G(yac.t0);
                                    v2 = hl.v2(xb4.J(document, null, r13, r13), 0);
                                    if (TextUtils.isEmpty(v2)) {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        kna knaVar = new kna(document, i36, r47Var, wb2Var2, tL_messages_stickerSet, (byte) 0);
                                        wb2Var = wb2Var2;
                                        hl.c3(knaVar);
                                        z13 = true;
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        wb2Var = wb2Var2;
                                        RLottieNative b3 = RLottieNative.b(v2, iArr, null, null);
                                        if (i35 <= 2) {
                                            rLottieNativeArr2[i35] = b3;
                                            lnaVar.k1[i35] = iArr[0];
                                        } else {
                                            rLottieNativeArr[i35 == 3 ? 0 : i18] = b3;
                                            lnaVar.h1[i35 == 3 ? 0 : i18] = iArr[0];
                                        }
                                    }
                                } else {
                                    i19 = 3;
                                }
                                i18 = i20;
                                TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i19);
                                xb4.G(yac.t0);
                                v2 = hl.v2(xb4.J(document2, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            } else if (i35 == r13) {
                                int i38 = lnaVar.d1;
                                if (i38 == r13) {
                                    i19 = 11;
                                } else if (i38 == 2) {
                                    i19 = 12;
                                } else if (i38 == 3) {
                                    i19 = 13;
                                } else if (i38 == i20) {
                                    i19 = 10;
                                } else {
                                    i18 = i20;
                                    i19 = 9;
                                    TLRPC.Document document22 = tL_messages_stickerSet2.documents.get(i19);
                                    xb4.G(yac.t0);
                                    v2 = hl.v2(xb4.J(document22, null, r13, r13), 0);
                                    if (TextUtils.isEmpty(v2)) {
                                    }
                                }
                                i18 = i20;
                                TLRPC.Document document222 = tL_messages_stickerSet2.documents.get(i19);
                                xb4.G(yac.t0);
                                v2 = hl.v2(xb4.J(document222, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            } else {
                                int i39 = lnaVar.e1;
                                if (i39 == r13) {
                                    i19 = 17;
                                } else {
                                    if (i39 == 2) {
                                        i18 = i20;
                                        i19 = 18;
                                    } else if (i39 == 3) {
                                        i18 = i20;
                                        i19 = 19;
                                    } else {
                                        i19 = i39 == i20 ? 16 : 15;
                                    }
                                    TLRPC.Document document2222 = tL_messages_stickerSet2.documents.get(i19);
                                    xb4.G(yac.t0);
                                    v2 = hl.v2(xb4.J(document2222, null, r13, r13), 0);
                                    if (TextUtils.isEmpty(v2)) {
                                    }
                                }
                                i18 = i20;
                                TLRPC.Document document22222 = tL_messages_stickerSet2.documents.get(i19);
                                xb4.G(yac.t0);
                                v2 = hl.v2(xb4.J(document22222, null, r13, r13), 0);
                                if (TextUtils.isEmpty(v2)) {
                                }
                            }
                        }
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        i18 = i20;
                        wb2Var = wb2Var2;
                    } else {
                        if (rLottieNativeArr[i35] == null) {
                            i18 = i20;
                            i19 = i35 == 3 ? r13 : 2;
                            TLRPC.Document document222222 = tL_messages_stickerSet2.documents.get(i19);
                            xb4.G(yac.t0);
                            v2 = hl.v2(xb4.J(document222222, null, r13, r13), 0);
                            if (TextUtils.isEmpty(v2)) {
                            }
                        }
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        i18 = i20;
                        wb2Var = wb2Var2;
                    }
                    i35++;
                    wb2Var2 = wb2Var;
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    i20 = i18;
                    r13 = true;
                }
            default:
                xkc.a = 0L;
                xkc.g((Activity) obj4, this.b, (TLRPC.InputGroupCall) obj3, this.c, (TLRPC.GroupCall) obj2, (HashSet) obj);
                return;
        }
    }

    public /* synthetic */ q25(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = (byte) 6;
        this.d = activity;
        this.b = i;
        this.e = inputGroupCall;
        this.c = z;
        this.f = groupCall;
        this.h = hashSet;
    }

    public /* synthetic */ q25(Object obj, TLObject tLObject, int i, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.b = i;
        this.f = obj2;
        this.h = obj3;
        this.c = z;
    }

    public /* synthetic */ q25(e eVar, Object obj, int i, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.d = eVar;
        this.e = obj;
        this.b = i;
        this.f = obj2;
        this.c = z;
        this.h = tLObject;
    }

    public /* synthetic */ q25(c cVar, boolean z, c35 c35Var, TL_wallet.proofChallenge proofchallenge, int i, icc iccVar) {
        this.a = (byte) 0;
        this.d = cVar;
        this.c = z;
        this.e = c35Var;
        this.f = proofchallenge;
        this.b = i;
        this.h = iccVar;
    }
}
