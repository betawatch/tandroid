package zf;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.k6;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.vp;
import org.telegram.ui.mb;
import rh.h5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n1 implements Runnable {
    public final /* synthetic */ o1 a;

    public n1(o1 o1Var) {
        this.a = o1Var;
    }

    public final void a() {
        o1 o1Var = this.a;
        if (o1Var.Q) {
            return;
        }
        o1Var.Q = true;
        o1Var.I.clear();
        o1Var.J.clear();
        o1Var.F.clear();
        o1Var.E.clear();
        o1Var.G.clear();
        o1Var.H.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r14.charAt(r7) <= 57343) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
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
        int i11;
        int A1;
        HashMap hashMap;
        int A12;
        int i12;
        String str;
        o1 o1Var = this.a;
        HashMap hashMap2 = o1Var.G;
        HashMap hashMap3 = o1Var.H;
        HashMap hashMap4 = o1Var.I;
        ArrayList arrayList = o1Var.F;
        j41 j41Var = o1Var.e;
        int i13 = o1Var.c;
        if (TextUtils.isEmpty(o1Var.R)) {
            return;
        }
        vp progressDrawable = j41Var.b.h.getProgressDrawable();
        progressDrawable.e = true;
        progressDrawable.b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        o1Var.Q = false;
        int i14 = o1Var.P + 1;
        o1Var.P = i14;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap hashMap5 = ui.b0(i13).d0;
        if (o1Var.R.length() <= 14) {
            String str2 = o1Var.R;
            int length = str2.length();
            i11 = 1;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i13;
                if (i15 < length - 1) {
                    if (str2.charAt(i15) == 55356) {
                        int i17 = i15 + 1;
                        i12 = length;
                        if (str2.charAt(i17) >= 57339) {
                        }
                    } else {
                        i12 = length;
                    }
                    if (str2.charAt(i15) == 8205) {
                        int i18 = i15 + 1;
                        if (str2.charAt(i18) != 9792) {
                        }
                        length = i12 - 2;
                        str = TextUtils.concat(str2.subSequence(0, i15), str2.subSequence(i15 + 2, str2.length()));
                        i15--;
                        str2 = str;
                        i15++;
                        i13 = i16;
                    }
                } else {
                    i12 = length;
                }
                if (str2.charAt(i15) == 65039) {
                    length = i12 - 1;
                    str = TextUtils.concat(str2.subSequence(0, i15), str2.subSequence(i15 + 1, str2.length()));
                    i15--;
                    str2 = str;
                    i15++;
                    i13 = i16;
                } else {
                    length = i12;
                    i15++;
                    i13 = i16;
                }
            }
            i10 = i13;
            ArrayList arrayList3 = hashMap5 != null ? (ArrayList) hashMap5.get(str2.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i19 = 0;
                for (int size = arrayList3.size(); i19 < size; size = size) {
                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                    longSparseArray.put(document.id, document);
                    i19++;
                    arrayList3 = arrayList3;
                }
                hashMap4.put(arrayList2, o1Var.R);
                o1Var.J.add(arrayList2);
            }
        } else {
            i10 = i13;
            i11 = 1;
        }
        if (hashMap5 != null && !hashMap5.isEmpty() && o1Var.R.length() > i11) {
            String[] G0 = org.telegram.messenger.i0.G0();
            if (!Arrays.equals(j41Var.a.b(), G0)) {
                ui.b0(i10).M(G0, false);
            }
            j41Var.a.i(G0);
            ui.b0(i10).U(j41Var.a.b(), o1Var.R, false, new ag.b0(this, i14, hashMap5, 18), false);
        }
        ArrayList s02 = ui.b0(i10).s0(0);
        int size2 = s02.size();
        int i20 = 0;
        while (i20 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i20);
            int A13 = org.telegram.messenger.i0.A1(tL_messages_stickerSet.set.title, o1Var.R);
            if (A13 >= 0) {
                if (A13 != 0) {
                    hashMap = hashMap4;
                    if (tL_messages_stickerSet.set.title.charAt(A13 - 1) != ' ') {
                    }
                } else {
                    hashMap = hashMap4;
                }
                a();
                arrayList.add(tL_messages_stickerSet);
                hashMap3.put(tL_messages_stickerSet, Integer.valueOf(A13));
            } else {
                hashMap = hashMap4;
                String str3 = tL_messages_stickerSet.set.short_name;
                if (str3 != null && (A12 = org.telegram.messenger.i0.A1(str3, o1Var.R)) >= 0 && (A12 == 0 || tL_messages_stickerSet.set.short_name.charAt(A12 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    hashMap2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i20++;
            hashMap4 = hashMap;
        }
        HashMap hashMap6 = hashMap4;
        ArrayList s03 = ui.b0(i10).s0(3);
        int size3 = s03.size();
        for (int i21 = 0; i21 < size3; i21++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s03.get(i21);
            int A14 = org.telegram.messenger.i0.A1(tL_messages_stickerSet2.set.title, o1Var.R);
            if (A14 < 0) {
                String str4 = tL_messages_stickerSet2.set.short_name;
                if (str4 != null && (A1 = org.telegram.messenger.i0.A1(str4, o1Var.R)) >= 0 && (A1 == 0 || tL_messages_stickerSet2.set.short_name.charAt(A1 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet2);
                    hashMap2.put(tL_messages_stickerSet2, Boolean.TRUE);
                }
            } else if (A14 == 0 || tL_messages_stickerSet2.set.title.charAt(A14 - 1) == ' ') {
                a();
                arrayList.add(tL_messages_stickerSet2);
                hashMap3.put(tL_messages_stickerSet2, Integer.valueOf(A14));
            }
        }
        if (!arrayList.isEmpty() || !hashMap6.isEmpty()) {
            j41Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.q = o1Var.R;
        o1Var.N = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchStickerSets, new h5(13, this, tL_messages_searchStickerSets));
        if (k6.h(o1Var.R)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = o1Var.R;
            tL_messages_getStickers.hash = 0L;
            o1Var.O = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getStickers, new mb(this, tL_messages_getStickers, arrayList2, longSparseArray, 20));
        }
        o1Var.f();
    }
}
