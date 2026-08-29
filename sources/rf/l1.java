package rf;

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
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.zp;
import org.telegram.ui.qe1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l1 implements Runnable {
    public final /* synthetic */ m1 a;

    public l1(m1 m1Var) {
        this.a = m1Var;
    }

    public final void a() {
        m1 m1Var = this.a;
        if (m1Var.M) {
            return;
        }
        m1Var.M = true;
        m1Var.E.clear();
        m1Var.F.clear();
        m1Var.B.clear();
        m1Var.A.clear();
        m1Var.C.clear();
        m1Var.D.clear();
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
        m1 m1Var = this.a;
        HashMap hashMap2 = m1Var.C;
        HashMap hashMap3 = m1Var.D;
        HashMap hashMap4 = m1Var.E;
        ArrayList arrayList = m1Var.B;
        g41 g41Var = m1Var.e;
        int i12 = m1Var.c;
        if (TextUtils.isEmpty(m1Var.N)) {
            return;
        }
        zp progressDrawable = g41Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        m1Var.M = false;
        int i13 = m1Var.L + 1;
        m1Var.L = i13;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i12).getAllStickers();
        if (m1Var.N.length() <= 14) {
            String str2 = m1Var.N;
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
                hashMap4.put(arrayList2, m1Var.N);
                m1Var.F.add(arrayList2);
            }
        } else {
            i10 = i12;
        }
        if (allStickers != null && !allStickers.isEmpty() && m1Var.N.length() > 1) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(g41Var.a.b(), currentKeyboardLanguage)) {
                MediaDataController.getInstance(i10).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            g41Var.a.i(currentKeyboardLanguage);
            MediaDataController.getInstance(i10).getEmojiSuggestions(g41Var.a.b(), m1Var.N, false, new e3.d(this, i13, allStickers, 15), false);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(0);
        int size2 = stickerSets.size();
        int i19 = 0;
        while (i19 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i19);
            int indexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, m1Var.N);
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
                if (str3 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3, m1Var.N)) >= 0 && (indexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(indexOfIgnoreCase2 - 1) == ' ')) {
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
            int indexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, m1Var.N);
            if (indexOfIgnoreCase4 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str4, m1Var.N)) >= 0 && (indexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(indexOfIgnoreCase - 1) == ' ')) {
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
            g41Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = m1Var.N;
        m1Var.J = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchStickerSets, new qe1(8, this, tL_messages_searchStickerSets));
        if (Emoji.isValidEmoji(m1Var.N)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = m1Var.N;
            tL_messages_getStickers.hash = 0L;
            m1Var.K = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getStickers, new ih.c1(this, tL_messages_getStickers, arrayList2, longSparseArray, 19));
        }
        m1Var.l();
    }
}
