package ph;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.uk;
import org.telegram.ui.io0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.c2, io0, uk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.io0
    public void a(int i10) {
        rh.l2 l2Var = (rh.l2) this.b;
        bd0 bd0Var = (bd0) this.d;
        String str = (String) this.c;
        if (i10 != 3) {
            bd0Var.dismiss();
        }
        l2Var.d.x.C(str, yh.B(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override // org.telegram.ui.Components.uk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.a) {
            case 5:
                vh.p pVar = (vh.p) this.b;
                vh.a aVar = (vh.a) this.c;
                li liVar = (li) this.d;
                vh.r3 r3Var = pVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    vh.c2 c2Var = r3Var.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    vh.c2 c2Var2 = r3Var.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    pVar.V(true);
                    liVar.dismiss(true);
                    r3Var.post(new vh.f(pVar, aVar, 0));
                    break;
                }
                break;
            default:
                vh.y1 y1Var = (vh.y1) this.b;
                vh.a aVar2 = (vh.a) this.c;
                li liVar2 = (li) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    vh.c2 c2Var3 = y1Var.M.G3;
                    if (c2Var3 != null) {
                        c2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    vh.c2 c2Var4 = y1Var.M.G3;
                    if (c2Var4 != null) {
                        c2Var4.h();
                    }
                    liVar2.dismiss(true);
                    y1Var.M.post(new vh.i1(y1Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                ((f8) this.b).g1((d8) this.c, (Runnable) this.d, true);
                break;
            case 2:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                break;
            case 3:
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                vh.y3 y3Var = (vh.y3) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = y3Var.a;
                    vh.o3 o3Var = y3Var.b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            o3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            o3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 4:
                tf.u0 u0Var = (tf.u0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                u0Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(u0Var.f).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    u0Var.G();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        n1 n1Var = (n1) this.b;
        String str2 = (String) this.c;
        MediaDataController mediaDataController = (MediaDataController) this.d;
        ArrayList arrayList6 = n1Var.h;
        SparseIntArray sparseIntArray = n1Var.y;
        ArrayList arrayList7 = n1Var.n;
        o1 o1Var = n1Var.K;
        ArrayList arrayList8 = n1Var.v;
        HashSet hashSet = n1Var.I;
        ArrayList arrayList9 = n1Var.s;
        if (TextUtils.equals(str2, n1Var.E)) {
            ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(n1Var.E);
            for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                try {
                    MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                    keywordResult.emoji = parseEmojis.get(i10).code.toString();
                    arrayList5.add(keywordResult);
                } catch (Exception unused) {
                }
            }
            n1Var.x = 0;
            arrayList9.clear();
            arrayList8.clear();
            sparseIntArray.clear();
            arrayList7.clear();
            n1Var.x++;
            arrayList9.add(null);
            arrayList8.add(0L);
            if (o1Var.a == 0) {
                hashSet.clear();
                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                    String str3 = keywordResult2.emoji;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) n1Var.d.get(keywordResult2.emoji)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList8.addAll(hashSet);
                for (int i12 = 0; i12 < hashSet.size(); i12++) {
                    arrayList9.add(null);
                }
                n1Var.x = hashSet.size() + n1Var.x;
            } else {
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                    String str4 = keywordResult3.emoji;
                    if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                            TLRPC.Document document = arrayList3.get(i14);
                            if (document != null && !arrayList9.contains(document)) {
                                arrayList9.add(document);
                                n1Var.x++;
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                int i15 = 0;
                while (i15 < arrayList5.size()) {
                    MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                    String str5 = keywordResult4.emoji;
                    if (str5 != null && !str5.startsWith("animated_")) {
                        for (int i16 = 0; i16 < featuredStickerSets.size(); i16++) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i16);
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else if (!stickerSetCovered.covers.isEmpty()) {
                                arrayList2 = stickerSetCovered.covers;
                            } else if (stickerSetCovered.cover != null) {
                                ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                arrayList10.add(stickerSetCovered.cover);
                                arrayList2 = arrayList10;
                            }
                            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i17), null);
                                if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                    arrayList9.add(arrayList2.get(i17));
                                    n1Var.x++;
                                }
                            }
                        }
                    }
                    i15++;
                    arrayList5 = arrayList;
                }
            }
            String translitSafe = AndroidUtilities.translitSafe((n1Var.E + "").toLowerCase());
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(n1Var.x, size);
                        arrayList9.add(null);
                        n1Var.x++;
                        arrayList9.addAll(tL_messages_stickerSet.documents);
                        n1Var.x = tL_messages_stickerSet.documents.size() + n1Var.x;
                    }
                }
            }
            boolean z4 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
            n1Var.w = z4;
            if (z4) {
                n1Var.x++;
            }
            if (!z4) {
                n1Var.H++;
            }
            n1Var.F = n1Var.E;
            n1Var.l();
            d1.w1(o1Var.b, 0, 0);
            o1Var.f.c(false);
            o1Var.e.n(false);
        }
    }

    public /* synthetic */ m1(rh.l2 l2Var, bd0 bd0Var, String str) {
        this.a = 3;
        this.b = l2Var;
        this.d = bd0Var;
        this.c = str;
    }
}
