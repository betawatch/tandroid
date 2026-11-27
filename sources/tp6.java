// default package

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class tp6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ rf0 h;
    public final /* synthetic */ Object n;

    public /* synthetic */ tp6(ls6 ls6Var, boolean z, ArrayList arrayList, int i, long j, int i2, Runnable runnable) {
        this.h = ls6Var;
        this.f = z;
        this.b = arrayList;
        this.d = i;
        this.c = j;
        this.e = i2;
        this.n = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x018b, code lost:
    
        if (r5 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0184, code lost:
    
        if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - r4) < 3600) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ls6 ls6Var;
        int i;
        int i2;
        zh6 zh6Var;
        ArrayList arrayList;
        ls6 ls6Var2;
        zh6 zh6Var2;
        String str;
        int i3;
        boolean z;
        long j;
        SparseArray sparseArray;
        boolean z2;
        LongSparseIntArray longSparseIntArray;
        long j2;
        byte b = this.a;
        boolean z3 = this.f;
        Object obj = this.n;
        rf0 rf0Var = this.h;
        switch (b) {
            case 0:
                ls6 ls6Var3 = (ls6) rf0Var;
                final Runnable runnable = (Runnable) obj;
                ArrayList arrayList2 = this.b;
                int i4 = this.d;
                final long j3 = this.c;
                int i5 = this.e;
                if (z3) {
                    if (arrayList2 != null) {
                        boolean z4 = f11.a;
                        break;
                    }
                    hl.d3(new r77((Object) ls6Var3, (Object) arrayList2, j3, i5, (byte) 8), (arrayList2 != null || z3) ? 0L : 1000L);
                    if (arrayList2 == null) {
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                    }
                } else if (arrayList2 == null) {
                    break;
                }
                if (arrayList2 != null) {
                    try {
                        final ArrayList arrayList3 = new ArrayList();
                        zh6 zh6Var3 = new zh6();
                        final HashMap hashMap = new HashMap();
                        final zh6 zh6Var4 = new zh6();
                        final zh6 zh6Var5 = new zh6();
                        final HashMap hashMap2 = new HashMap();
                        int i6 = 0;
                        while (i6 < arrayList2.size()) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i6);
                            if (tL_messages_stickerSet != null) {
                                arrayList = arrayList2;
                                ls6Var2 = ls6Var3;
                                if (ls6Var3.U.h(tL_messages_stickerSet.set.id) < 0) {
                                    arrayList3.add(tL_messages_stickerSet);
                                    zh6Var3.k(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
                                    hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                                    for (int i7 = 0; i7 < tL_messages_stickerSet.documents.size(); i7++) {
                                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i7);
                                        if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                            zh6Var5.k(document.id, document);
                                        }
                                    }
                                    if (!tL_messages_stickerSet.set.archived) {
                                        int i8 = 0;
                                        while (i8 < tL_messages_stickerSet.packs.size()) {
                                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i8);
                                            if (tL_stickerPack == null || (str = tL_stickerPack.emoticon) == null) {
                                                zh6Var2 = zh6Var3;
                                            } else {
                                                zh6Var2 = zh6Var3;
                                                String replace = str.replace("️", "");
                                                tL_stickerPack.emoticon = replace;
                                                ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                    hashMap2.put(tL_stickerPack.emoticon, arrayList4);
                                                }
                                                int i9 = 0;
                                                while (i9 < tL_stickerPack.documents.size()) {
                                                    Long l = tL_stickerPack.documents.get(i9);
                                                    int i10 = i5;
                                                    int i11 = i4;
                                                    if (zh6Var4.h(l.longValue()) < 0) {
                                                        i3 = i8;
                                                        zh6Var4.k(l.longValue(), tL_stickerPack.emoticon);
                                                    } else {
                                                        i3 = i8;
                                                    }
                                                    TLRPC.Document document2 = (TLRPC.Document) zh6Var5.f(l.longValue());
                                                    if (document2 != null) {
                                                        arrayList4.add(document2);
                                                    }
                                                    i9++;
                                                    i8 = i3;
                                                    i5 = i10;
                                                    i4 = i11;
                                                }
                                            }
                                            i8++;
                                            zh6Var3 = zh6Var2;
                                            i5 = i5;
                                            i4 = i4;
                                        }
                                    }
                                }
                                zh6Var = zh6Var3;
                            } else {
                                zh6Var = zh6Var3;
                                arrayList = arrayList2;
                                ls6Var2 = ls6Var3;
                            }
                            i6++;
                            zh6Var3 = zh6Var;
                            ls6Var3 = ls6Var2;
                            arrayList2 = arrayList;
                            i5 = i5;
                            i4 = i4;
                        }
                        final zh6 zh6Var6 = zh6Var3;
                        ls6 ls6Var4 = ls6Var3;
                        int i12 = i5;
                        int i13 = i4;
                        if (z3) {
                            ls6Var = ls6Var4;
                            i = i12;
                            i2 = i13;
                        } else {
                            ls6Var = ls6Var4;
                            i = i12;
                            i2 = i13;
                            ls6Var.M1(i, i2, j3, arrayList3);
                        }
                        final ls6 ls6Var5 = ls6Var;
                        final int i14 = i;
                        final int i15 = i2;
                        hl.c3(new Runnable() { // from class: uq6
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i16;
                                ls6 ls6Var6 = ls6.this;
                                zh6 zh6Var7 = ls6Var6.K;
                                ConcurrentHashMap concurrentHashMap = ls6Var6.O;
                                zh6 zh6Var8 = ls6Var6.J;
                                ArrayList[] arrayListArr = ls6Var6.H;
                                int i17 = 0;
                                while (true) {
                                    i16 = i14;
                                    if (i17 >= arrayListArr[i16].size()) {
                                        break;
                                    }
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) arrayListArr[i16].get(i17)).set;
                                    zh6Var8.l(stickerSet.id);
                                    concurrentHashMap.remove(stickerSet.short_name);
                                    if (i16 != 3 && i16 != 6 && i16 != 4) {
                                        zh6Var7.l(stickerSet.id);
                                    }
                                    i17++;
                                }
                                int i18 = 0;
                                while (true) {
                                    zh6 zh6Var9 = zh6Var6;
                                    if (i18 >= zh6Var9.m()) {
                                        break;
                                    }
                                    zh6Var8.k(zh6Var9.j(i18), (TLRPC.TL_messages_stickerSet) zh6Var9.n(i18));
                                    if (i16 != 3 && i16 != 6 && i16 != 4) {
                                        zh6Var7.k(zh6Var9.j(i18), (TLRPC.TL_messages_stickerSet) zh6Var9.n(i18));
                                    }
                                    i18++;
                                }
                                concurrentHashMap.putAll(hashMap);
                                arrayListArr[i16] = arrayList3;
                                ls6Var6.Y[i16] = j3;
                                ls6Var6.Z[i16] = i15;
                                ls6Var6.I[i16] = zh6Var5;
                                HashMap hashMap3 = hashMap2;
                                if (i16 == 0) {
                                    ls6Var6.e0 = hashMap3;
                                    ls6Var6.d0 = zh6Var4;
                                } else if (i16 == 3) {
                                    ls6Var6.f0 = hashMap3;
                                }
                                ls6Var6.getNotificationCenter().k(jn7.x0, Integer.valueOf(i16), Boolean.TRUE);
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        });
                        break;
                    } catch (Throwable th) {
                        cc4.g(th, true);
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                } else if (z3) {
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    hl.c3(new bt((Object) ls6Var3, i5, i4, (byte) 11));
                    ls6Var3.M1(i5, i4, 0L, null);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                ip7 ip7Var = (ip7) rf0Var;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) obj;
                ArrayList arrayList5 = ip7Var.b;
                zh6 zh6Var7 = ip7Var.c;
                ArrayList arrayList6 = ip7Var.a;
                ArrayList arrayList7 = this.b;
                if (longSparseIntArray2 != null) {
                    for (int i16 = 0; i16 < longSparseIntArray2.size(); i16++) {
                        long keyAt = longSparseIntArray2.keyAt(i16);
                        int i17 = longSparseIntArray2.get(keyAt);
                        int i18 = 0;
                        while (i18 < arrayList6.size()) {
                            r47 r47Var = (r47) arrayList6.get(i18);
                            TLRPC.Message message = r47Var.k;
                            if (message.from_scheduled || r47.B0(message) != keyAt || r47Var.e1() > i17 || r47Var.J) {
                                z2 = z3;
                                longSparseIntArray = longSparseIntArray2;
                            } else {
                                if (ip7.y(r47Var)) {
                                    ip7Var.K--;
                                }
                                arrayList7.add(r47Var);
                                boolean z5 = r47Var.J;
                                TLRPC.Message message2 = r47Var.k;
                                if (z5) {
                                    z2 = z3;
                                    j2 = r47.B0(message2);
                                } else {
                                    z2 = z3;
                                    long j4 = message2.peer_id.channel_id;
                                    j2 = j4 != 0 ? -j4 : 0L;
                                }
                                SparseArray sparseArray2 = (SparseArray) zh6Var7.f(j2);
                                longSparseIntArray = longSparseIntArray2;
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(r47Var.e1());
                                    if (sparseArray2.size() == 0) {
                                        zh6Var7.l(j2);
                                    }
                                }
                                arrayList5.remove(r47Var);
                                arrayList6.remove(i18);
                                i18--;
                            }
                            i18++;
                            z3 = z2;
                            longSparseIntArray2 = longSparseIntArray;
                        }
                    }
                }
                boolean z6 = z3;
                long j5 = this.c;
                if (j5 != 0) {
                    int i19 = this.d;
                    int i20 = this.e;
                    if (i19 != 0 || i20 != 0) {
                        int i21 = 0;
                        while (i21 < arrayList6.size()) {
                            r47 r47Var2 = (r47) arrayList6.get(i21);
                            if (r47.B0(r47Var2.k) == j5 && !r47Var2.J) {
                                if (i20 != 0) {
                                    if (r47Var2.k.date > i20) {
                                    }
                                    if (ip7.y(r47Var2)) {
                                        ip7Var.K--;
                                    }
                                    z = r47Var2.J;
                                    TLRPC.Message message3 = r47Var2.k;
                                    if (z) {
                                        j = r47.B0(message3);
                                    } else {
                                        long j6 = message3.peer_id.channel_id;
                                        j = j6 != 0 ? -j6 : 0L;
                                    }
                                    sparseArray = (SparseArray) zh6Var7.f(j);
                                    if (sparseArray != null) {
                                        sparseArray.remove(r47Var2.e1());
                                        if (sparseArray.size() == 0) {
                                            zh6Var7.l(j);
                                        }
                                    }
                                    arrayList6.remove(i21);
                                    arrayList5.remove(r47Var2);
                                    arrayList7.add(r47Var2);
                                    i21--;
                                } else if (z6) {
                                    if (r47Var2.e1() != i19 && i19 >= 0) {
                                    }
                                    if (ip7.y(r47Var2)) {
                                    }
                                    z = r47Var2.J;
                                    TLRPC.Message message32 = r47Var2.k;
                                    if (z) {
                                    }
                                    sparseArray = (SparseArray) zh6Var7.f(j);
                                    if (sparseArray != null) {
                                    }
                                    arrayList6.remove(i21);
                                    arrayList5.remove(r47Var2);
                                    arrayList7.add(r47Var2);
                                    i21--;
                                } else {
                                    if (r47Var2.e1() > i19 && i19 >= 0) {
                                    }
                                    if (ip7.y(r47Var2)) {
                                    }
                                    z = r47Var2.J;
                                    TLRPC.Message message322 = r47Var2.k;
                                    if (z) {
                                    }
                                    sparseArray = (SparseArray) zh6Var7.f(j);
                                    if (sparseArray != null) {
                                    }
                                    arrayList6.remove(i21);
                                    arrayList5.remove(r47Var2);
                                    arrayList7.add(r47Var2);
                                    i21--;
                                }
                            }
                            i21++;
                        }
                    }
                }
                if (!arrayList7.isEmpty()) {
                    hl.c3(new xo7(ip7Var, arrayList7, (byte) 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tp6(ip7 ip7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j, int i, int i2, boolean z) {
        this.h = ip7Var;
        this.n = longSparseIntArray;
        this.b = arrayList;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = z;
    }
}
