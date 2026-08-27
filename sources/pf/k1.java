package pf;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.rc1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k1 implements Runnable {
    public final /* synthetic */ l1 a;

    public k1(l1 l1Var) {
        this.a = l1Var;
    }

    public final void a() {
        l1 l1Var = this.a;
        if (l1Var.M) {
            return;
        }
        l1Var.M = true;
        l1Var.E.clear();
        l1Var.F.clear();
        l1Var.B.clear();
        l1Var.A.clear();
        l1Var.C.clear();
        l1Var.D.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r14.charAt(r7) <= 57343) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r14.charAt(r7) != 9794) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.CharSequence] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int indexOfIgnoreCase;
        HashMap hashMap;
        int indexOfIgnoreCase2;
        int i11;
        String str;
        l1 l1Var = this.a;
        HashMap hashMap2 = l1Var.C;
        HashMap hashMap3 = l1Var.D;
        HashMap hashMap4 = l1Var.E;
        ArrayList arrayList = l1Var.B;
        x31 x31Var = l1Var.e;
        int i12 = l1Var.c;
        if (TextUtils.isEmpty(l1Var.N)) {
            return;
        }
        tp progressDrawable = x31Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        l1Var.M = false;
        int i13 = l1Var.L + 1;
        l1Var.L = i13;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i12).getAllStickers();
        if (l1Var.N.length() <= 14) {
            String str2 = l1Var.N;
            int length = str2.length();
            int i14 = 0;
            while (i14 < length) {
                int i15 = i12;
                if (i14 < length - 1) {
                    if (str2.charAt(i14) == 55356) {
                        int i16 = i14 + 1;
                        i11 = length;
                        if (str2.charAt(i16) >= 57339) {
                        }
                    } else {
                        i11 = length;
                    }
                    if (str2.charAt(i14) == 8205) {
                        int i17 = i14 + 1;
                        if (str2.charAt(i17) != 9792) {
                        }
                        length = i11 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 2, str2.length()));
                        i14--;
                        str2 = str;
                        i14++;
                        i12 = i15;
                    }
                } else {
                    i11 = length;
                }
                if (str2.charAt(i14) == 65039) {
                    length = i11 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i14), str2.subSequence(i14 + 1, str2.length()));
                    i14--;
                    str2 = str;
                    i14++;
                    i12 = i15;
                } else {
                    length = i11;
                    i14++;
                    i12 = i15;
                }
            }
            i10 = i12;
            ArrayList<TLRPC.Document> arrayList3 = allStickers != null ? allStickers.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i18 = 0;
                for (int size = arrayList3.size(); i18 < size; size = size) {
                    TLRPC.Document document = arrayList3.get(i18);
                    longSparseArray.put(document.id, document);
                    i18++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, l1Var.N);
                l1Var.F.add(arrayList2);
            }
        } else {
            i10 = i12;
        }
        if (allStickers != null && !allStickers.isEmpty() && l1Var.N.length() > 1) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(x31Var.a.b(), currentKeyboardLanguage)) {
                MediaDataController.getInstance(i10).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            x31Var.a.i(currentKeyboardLanguage);
            MediaDataController.getInstance(i10).getEmojiSuggestions(x31Var.a.b(), l1Var.N, false, new c3.d(this, i13, allStickers, 15), false);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(0);
        int size2 = stickerSets.size();
        int i19 = 0;
        while (i19 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i19);
            int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, l1Var.N);
            if (indexOfIgnoreCase3 >= 0) {
                if (indexOfIgnoreCase3 != 0) {
                    hashMap = hashMap4;
                    if (tL_messages_stickerSet.set.title.charAt(indexOfIgnoreCase3 - 1) != ' ') {
                    }
                } else {
                    hashMap = hashMap4;
                }
                a();
                arrayList.add(tL_messages_stickerSet);
                hashMap3.put(tL_messages_stickerSet, Integer.valueOf(indexOfIgnoreCase3));
            } else {
                hashMap = hashMap4;
                String str3 = tL_messages_stickerSet.set.short_name;
                if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, l1Var.N)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i19++;
            hashMap4 = hashMap;
        }
        HashMap hashMap5 = hashMap4;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i10).getStickerSets(3);
        int size3 = stickerSets2.size();
        for (int i20 = 0; i20 < size3; i20++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i20);
            int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, l1Var.N);
            if (indexOfIgnoreCase4 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, l1Var.N)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet2);
                    hashMap2.put(tL_messages_stickerSet2, Boolean.TRUE);
                }
            } else if (indexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(indexOfIgnoreCase4 - 1) == ' ') {
                a();
                arrayList.add(tL_messages_stickerSet2);
                hashMap3.put(tL_messages_stickerSet2, Integer.valueOf(indexOfIgnoreCase4));
            }
        }
        if (!arrayList.isEmpty() || !hashMap5.isEmpty()) {
            x31Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = l1Var.N;
        l1Var.J = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchStickerSets, new rc1(7, this, tL_messages_searchStickerSets));
        if (Emoji.isValidEmoji(l1Var.N)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = l1Var.N;
            tL_messages_getStickers.hash = 0L;
            l1Var.K = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getStickers, new gh.f1(this, tL_messages_getStickers, arrayList2, longSparseArray, 19));
        }
        l1Var.l();
    }
}
