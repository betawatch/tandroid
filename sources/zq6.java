// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zq6 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ zq6(fo6 fo6Var, boolean z, TLRPC.PhotoSize photoSize, k47 k47Var, TLRPC.Photo photo, boolean z2, TLRPC.Document document) {
        this.d = fo6Var;
        this.b = z;
        this.e = photoSize;
        this.f = k47Var;
        this.h = photo;
        this.c = z2;
        this.n = document;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02a1 A[LOOP:1: B:109:0x0231->B:117:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0432 A[LOOP:2: B:124:0x02bc->B:183:0x0432, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0512  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        boolean z;
        Runnable runnable;
        ArrayList[] arrayListArr;
        int i;
        String str2;
        hs6 hs6Var;
        String str3;
        ArrayList arrayList;
        int i2;
        int i3;
        String str4;
        int i4;
        int i5;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str5;
        int i6;
        int i7;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str6;
        String str7;
        int i8;
        int i9;
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.Document e;
        String V;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        yua C;
        byte b = this.a;
        boolean z2 = true;
        Object obj = this.n;
        Object obj2 = this.h;
        boolean z3 = this.c;
        Object obj3 = this.f;
        boolean z4 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i12 = 0;
        switch (b) {
            case 0:
                hs6 hs6Var2 = (hs6) obj5;
                Integer num = (Integer) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList[] arrayListArr2 = (ArrayList[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList3 = hs6Var2.t0[1];
                ArrayList arrayList4 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int intValue = num == null ? arrayList2.size() > 5 ? 1 : arrayList2.size() > 2 ? 2 : 3 : num.intValue();
                int min = num == null ? Math.min(15, arrayList2.size()) : arrayList2.size();
                if (!z8c.h(hs6Var2.currentAccount).p() && !z4) {
                    z2 = false;
                }
                if (z3) {
                    str = z8c.h(hs6Var2.currentAccount).f0;
                    if (arrayListArr2[0] != null) {
                        if (str != null) {
                            tL_messages_stickerSet2 = hs6.d0(hs6Var2.currentAccount).q0(str);
                            if (tL_messages_stickerSet2 == null) {
                                tL_messages_stickerSet2 = hs6.d0(hs6Var2.currentAccount).o0(str);
                            }
                        } else {
                            tL_messages_stickerSet2 = null;
                        }
                        if (tL_messages_stickerSet2 != null) {
                            arrayListArr2[0].add(tL_messages_stickerSet2);
                        }
                    }
                } else {
                    str = null;
                }
                int i13 = 0;
                while (i13 < min) {
                    int i14 = i12;
                    String replace = ((ds6) arrayList2.get(i13)).a == null ? null : ((ds6) arrayList2.get(i13)).a.replace("️", "");
                    if (TextUtils.isEmpty(replace)) {
                        hs6Var = hs6Var2;
                        arrayList = arrayList3;
                        z = z2;
                        runnable = runnable2;
                        arrayListArr = arrayListArr2;
                        i = min;
                        str2 = str;
                    } else {
                        arrayList5.clear();
                        z = z2;
                        String str8 = "animated_";
                        if (gw3.i != null) {
                            runnable = runnable2;
                            arrayListArr = arrayListArr2;
                            int i15 = i14;
                            while (true) {
                                ArrayList arrayList6 = gw3.i;
                                i = min;
                                if (i15 < arrayList6.size()) {
                                    if (((String) arrayList6.get(i15)).startsWith("animated_")) {
                                        try {
                                            int i16 = i15;
                                            try {
                                                i11 = i16;
                                                try {
                                                    e = vm.e(hs6Var2.currentAccount, Long.parseLong(((String) arrayList6.get(i15)).substring(9)));
                                                    V = k47.V(e, null, null);
                                                } catch (Exception unused) {
                                                }
                                            } catch (Exception unused2) {
                                                i11 = i16;
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        if (e != null && V != null && V.replace("️", "").contains(replace) && (z || k47.m3(e))) {
                                            str2 = str;
                                            try {
                                                if (!hashSet.contains(Long.valueOf(e.id))) {
                                                    hashSet.add(Long.valueOf(e.id));
                                                    arrayList5.add(e);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            if (arrayList5.size() < intValue) {
                                                i15 = i11 + 1;
                                                str = str2;
                                                min = i;
                                            }
                                        }
                                        str2 = str;
                                        if (arrayList5.size() < intValue) {
                                        }
                                    }
                                    i11 = i15;
                                    str2 = str;
                                    if (arrayList5.size() < intValue) {
                                    }
                                }
                            }
                        } else {
                            runnable = runnable2;
                            arrayListArr = arrayListArr2;
                            i = min;
                        }
                        str2 = str;
                        if (arrayList5.size() < intValue && arrayListArr[i14] != null) {
                            int i17 = i14;
                            while (i17 < arrayListArr[i14].size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr[i14].get(i17);
                                if (tL_messages_stickerSet3 == null) {
                                    hs6Var = hs6Var2;
                                } else if (tL_messages_stickerSet3.packs != null) {
                                    int i18 = i14;
                                    hs6Var = hs6Var2;
                                    while (i18 < tL_messages_stickerSet3.packs.size()) {
                                        TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet3.packs.get(i18);
                                        if (tL_stickerPack != null) {
                                            i8 = i17;
                                            String str9 = tL_stickerPack.emoticon;
                                            if (str9 == null || !str9.replace("️", "").contains(replace)) {
                                                str7 = str8;
                                            } else {
                                                int i19 = i14;
                                                i9 = i18;
                                                while (true) {
                                                    if (i19 < tL_stickerPack.documents.size()) {
                                                        long longValue = tL_stickerPack.documents.get(i19).longValue();
                                                        int i20 = i14;
                                                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                                                        while (true) {
                                                            if (i20 < tL_messages_stickerSet3.documents.size()) {
                                                                document = tL_messages_stickerSet3.documents.get(i20);
                                                                str7 = str8;
                                                                i10 = i19;
                                                                if (document == null || document.id != longValue) {
                                                                    i20++;
                                                                    str8 = str7;
                                                                    i19 = i10;
                                                                }
                                                            } else {
                                                                str7 = str8;
                                                                i10 = i19;
                                                                document = null;
                                                            }
                                                        }
                                                        if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                                            hashSet.add(Long.valueOf(document.id));
                                                            arrayList5.add(document);
                                                            if (arrayList5.size() < intValue) {
                                                            }
                                                        }
                                                        i19 = i10 + 1;
                                                        tL_stickerPack = tL_stickerPack2;
                                                        str8 = str7;
                                                    } else {
                                                        str7 = str8;
                                                    }
                                                }
                                                i18 = i9 + 1;
                                                i17 = i8;
                                                str8 = str7;
                                            }
                                        } else {
                                            str7 = str8;
                                            i8 = i17;
                                        }
                                        i9 = i18;
                                        i18 = i9 + 1;
                                        i17 = i8;
                                        str8 = str7;
                                    }
                                } else {
                                    hs6Var = hs6Var2;
                                    str3 = str8;
                                    i6 = i17;
                                    if (tL_messages_stickerSet3.documents != null) {
                                        int i21 = i14;
                                        while (i21 < tL_messages_stickerSet3.documents.size()) {
                                            TLRPC.Document document2 = tL_messages_stickerSet3.documents.get(i21);
                                            if (document2 == null || document2.attributes == null || arrayList5.contains(document2)) {
                                                i7 = i21;
                                            } else {
                                                int i22 = i14;
                                                while (true) {
                                                    if (i22 < document2.attributes.size()) {
                                                        TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i22);
                                                        i7 = i21;
                                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                            tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                                        } else {
                                                            i22++;
                                                            i21 = i7;
                                                        }
                                                    } else {
                                                        i7 = i21;
                                                        tL_documentAttributeCustomEmoji2 = null;
                                                    }
                                                }
                                                if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.replace("️", "").contains(replace) && (z || tL_documentAttributeCustomEmoji2.free || ((stickerSet2 = tL_messages_stickerSet3.set) != null && (str6 = stickerSet2.short_name) != null && str6.equals(str2)))) {
                                                    tL_messages_stickerSet = tL_messages_stickerSet3;
                                                    if (hashSet.contains(Long.valueOf(document2.id))) {
                                                        continue;
                                                    } else {
                                                        hashSet.add(Long.valueOf(document2.id));
                                                        arrayList5.add(document2);
                                                        if (arrayList5.size() >= intValue) {
                                                        }
                                                    }
                                                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                                                    i21 = i7 + 1;
                                                }
                                            }
                                            tL_messages_stickerSet = tL_messages_stickerSet3;
                                            tL_messages_stickerSet3 = tL_messages_stickerSet;
                                            i21 = i7 + 1;
                                        }
                                    }
                                    if (arrayList5.size() >= intValue) {
                                        i17 = i6 + 1;
                                        hs6Var2 = hs6Var;
                                        str8 = str3;
                                    } else {
                                        if (arrayList5.size() < intValue && arrayList3 != null) {
                                            i4 = i14;
                                            while (i4 < arrayList3.size()) {
                                                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i4);
                                                if (stickerSetCovered != null) {
                                                    ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                                    if (arrayList7 != null) {
                                                        int i23 = i14;
                                                        while (true) {
                                                            if (i23 < arrayList7.size()) {
                                                                TLRPC.Document document3 = arrayList7.get(i23);
                                                                i5 = i4;
                                                                if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                                                    arrayList = arrayList3;
                                                                } else {
                                                                    int i24 = i14;
                                                                    arrayList = arrayList3;
                                                                    while (true) {
                                                                        if (i24 < document3.attributes.size()) {
                                                                            TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i24);
                                                                            int i25 = i24;
                                                                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                                                                tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                                                            } else {
                                                                                i24 = i25 + 1;
                                                                            }
                                                                        } else {
                                                                            tL_documentAttributeCustomEmoji = null;
                                                                        }
                                                                    }
                                                                    if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) && tL_documentAttributeCustomEmoji.alt.replace("️", "").contains(replace) && ((z || tL_documentAttributeCustomEmoji.free || ((stickerSet = stickerSetCovered.set) != null && (str5 = stickerSet.short_name) != null && str5.equals(str2))) && !hashSet.contains(Long.valueOf(document3.id)))) {
                                                                        hashSet.add(Long.valueOf(document3.id));
                                                                        arrayList5.add(document3);
                                                                        if (arrayList5.size() >= intValue) {
                                                                        }
                                                                    }
                                                                }
                                                                i23++;
                                                                i4 = i5;
                                                                arrayList3 = arrayList;
                                                            } else {
                                                                i5 = i4;
                                                                arrayList = arrayList3;
                                                            }
                                                        }
                                                        if (arrayList5.size() < intValue) {
                                                            i4 = i5 + 1;
                                                            arrayList3 = arrayList;
                                                        } else if (!arrayList5.isEmpty()) {
                                                            String str10 = ((ds6) arrayList2.get(i13)).b;
                                                            int i26 = i14;
                                                            while (i26 < arrayList5.size()) {
                                                                TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i26);
                                                                if (document4 != null) {
                                                                    ds6 ds6Var = new ds6();
                                                                    str4 = str3;
                                                                    StringBuilder sb = new StringBuilder(str4);
                                                                    i2 = i26;
                                                                    i3 = intValue;
                                                                    sb.append(document4.id);
                                                                    ds6Var.a = sb.toString();
                                                                    ds6Var.b = str10;
                                                                    arrayList4.add(ds6Var);
                                                                } else {
                                                                    i2 = i26;
                                                                    i3 = intValue;
                                                                    str4 = str3;
                                                                }
                                                                i26 = i2 + 1;
                                                                str3 = str4;
                                                                intValue = i3;
                                                            }
                                                        }
                                                    }
                                                }
                                                i5 = i4;
                                                arrayList = arrayList3;
                                                i4 = i5 + 1;
                                                arrayList3 = arrayList;
                                            }
                                        }
                                        arrayList = arrayList3;
                                        if (!arrayList5.isEmpty()) {
                                        }
                                    }
                                }
                                str3 = str8;
                                i6 = i17;
                                if (arrayList5.size() >= intValue) {
                                }
                            }
                        }
                        hs6Var = hs6Var2;
                        str3 = str8;
                        if (arrayList5.size() < intValue) {
                            i4 = i14;
                            while (i4 < arrayList3.size()) {
                            }
                        }
                        arrayList = arrayList3;
                        if (!arrayList5.isEmpty()) {
                        }
                    }
                    i13++;
                    i12 = i14;
                    intValue = intValue;
                    str = str2;
                    runnable2 = runnable;
                    z2 = z;
                    arrayListArr2 = arrayListArr;
                    min = i;
                    hs6Var2 = hs6Var;
                    arrayList3 = arrayList;
                }
                arrayList2.addAll(i12, arrayList4);
                runnable2.run();
                break;
            case 1:
                oc7 oc7Var = (oc7) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                d dVar = (d) obj2;
                TLObject tLObject = (TLObject) obj;
                if (((ac7) obj4).b(tL_error)) {
                    ik.c0(oc7Var.currentAccount, tL_error, dVar, tLObject, Boolean.valueOf(z4 && !z3));
                    break;
                }
                break;
            case 2:
                fo6 fo6Var = (fo6) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                k47 k47Var = (k47) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj2;
                TLRPC.Document document5 = (TLRPC.Document) obj;
                j5 j5Var = fo6Var.a;
                HashMap hashMap = fo6Var.d;
                if (z4) {
                    hashMap.put(bc4.r(null, photoSize), k47Var);
                    bc4.G(j5Var.a).V(gn5.i(photoSize, photo), k47Var, "jpg", 3, 0);
                }
                if (z3) {
                    hashMap.put(bc4.r(null, document5), k47Var);
                    bc4.G(j5Var.a).X(document5, k47Var, 3, 0);
                    break;
                }
                break;
            case 3:
                x07 x07Var = (x07) obj5;
                o07 o07Var = (o07) obj4;
                String str11 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                x07Var.w = false;
                x07Var.z = true;
                if (z4) {
                    gm.r(o07Var);
                }
                x07.k(x07Var.q, false, false);
                if (TextUtils.equals(str11, x07Var.t) && tL_error2 == null) {
                    x07Var.z = true;
                    x07Var.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str11, z3, false);
                    break;
                }
                break;
            default:
                wsa wsaVar = (wsa) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.Document document6 = (TLRPC.Document) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj;
                wsaVar.getClass();
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error3 != null) {
                            if (z4 && wsaVar.A2 != null && (C = jva.v(wsaVar.a, false).C(wsaVar.S1, false)) != null) {
                                C.m(wsaVar.A2, !savestargift.unsave);
                            }
                            wsaVar.j().t(c41.W(tL_error3.text), null).k(false);
                            break;
                        }
                    } else {
                        wsaVar.dismiss();
                        long q1 = wsaVar.q1();
                        if (!z4) {
                            jva.v(wsaVar.a, false).M(q1);
                        }
                        if (q1 < 0) {
                            c41.b0(S).s(document6, jb6.M0(z3 ? 2131750193 : 2131750191, null), jb6.M0(z3 ? 2131750194 : 2131750192, null)).j();
                            break;
                        } else {
                            c41.b0(S).s(document6, jb6.M0(z3 ? 2131750056 : 2131750054, null), gm.N2(jb6.M0(z3 ? 2131750057 : 2131750055, null), -1, 0, S instanceof ProfileActivity ? null : new m39(q1, S), null)).k(true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ zq6(hs6 hs6Var, Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = hs6Var;
        this.e = num;
        this.f = arrayList;
        this.b = z;
        this.c = z2;
        this.h = arrayListArr;
        this.n = runnable;
    }

    public /* synthetic */ zq6(x07 x07Var, boolean z, o07 o07Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.d = x07Var;
        this.b = z;
        this.e = o07Var;
        this.f = str;
        this.h = tL_error;
        this.n = tLObject;
        this.c = z2;
    }

    public /* synthetic */ zq6(oc7 oc7Var, ac7 ac7Var, TLRPC.TL_error tL_error, d dVar, TLObject tLObject, boolean z, boolean z2) {
        this.d = oc7Var;
        this.e = ac7Var;
        this.f = tL_error;
        this.h = dVar;
        this.n = tLObject;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ zq6(wsa wsaVar, TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = wsaVar;
        this.e = tLObject;
        this.b = z;
        this.f = document;
        this.c = z2;
        this.h = tL_error;
        this.n = savestargift;
    }
}
