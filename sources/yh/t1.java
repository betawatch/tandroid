package yh;

import ai.ga;
import ai.k7;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        zh.t0 t0Var;
        String str;
        int i10;
        String str2;
        zh.i0 i0Var;
        int i11;
        int i12;
        int i13 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        int i14 = 0;
        switch (i13) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                ((is0) obj3).H = -1;
                if (tL_error != null) {
                    xc.a0(n2Var).f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                m2 m2Var = (m2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                is0 is0Var = m2Var.a;
                is0Var.e.k(m2Var.e.d, savedStarGift);
                ((i80) obj).u();
                is0Var.n();
                TL_stars.TL_starGiftCollection c10 = is0Var.e.c(m2Var.e.d);
                if (c10 != null) {
                    xc.a0(is0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, k7.R1(savedStarGift.gift), c10.title))).j();
                    break;
                }
                break;
            case 2:
                m2 m2Var2 = (m2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                h1 h1Var = (h1) obj;
                if (m2Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    h1Var.c(false, true);
                    m2Var2.e.n(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                h1Var.h(savedStarGift2, z10, m2Var2.d);
                m2Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m2Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m2Var2.b).sendRequest(savestargift, null);
                break;
            case 3:
                t3 t3Var = (t3) obj3;
                TLObject tLObject = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = t3Var.m;
                HashMap hashMap2 = t3Var.o;
                HashMap hashMap3 = t3Var.n;
                ArrayList arrayList = t3Var.h;
                ArrayList arrayList2 = t3Var.g;
                ArrayList arrayList3 = t3Var.f;
                int i15 = t3Var.a;
                ArrayList arrayList4 = t3Var.d;
                t3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    MessagesController.getInstance(i15).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i15).putChats(resalestargifts.chats, false);
                    t3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i16);
                        i16++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    t3Var.u = arrayList4.size() >= t3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    t3Var.q = resalestargifts.next_offset;
                    t3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(ga.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(ga.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(ga.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        t3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i17);
                            i17++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    Utilities.Callback callback = t3Var.c;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                        break;
                    }
                }
                break;
            default:
                zh.f0 f0Var = (zh.f0) obj3;
                List list = (List) obj;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = ((zh.d) obj2).b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList8 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList8 != null && arrayList8 != list && (t0Var = f0Var.d) != null && !f0Var.isFinished) {
                    zh.r0 r0Var = t0Var.n;
                    if (r0Var != null && r0Var.a == 0 && (i12 = r0Var.f) >= 0) {
                        String[] strArr = zh.a.a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                            i10 = t0Var.N7;
                            if (i10 >= 0) {
                                String[] strArr2 = zh.a.a;
                                if (i10 < strArr2.length) {
                                    str2 = strArr2[i10];
                                    if (zh.a.a(arrayList8)) {
                                        if (str2 != null) {
                                            i11 = 0;
                                            while (true) {
                                                String[] strArr3 = zh.a.a;
                                                if (i11 < strArr3.length) {
                                                    if (!str2.equals(strArr3[i11])) {
                                                        i11++;
                                                    }
                                                }
                                            }
                                        }
                                        i11 = zh.t0.H9;
                                        t0Var.N7 = i11;
                                        if (str != null) {
                                            if (t0Var.r != null) {
                                                t0Var.r = null;
                                                t0Var.s = 1.0f;
                                            }
                                            while (true) {
                                                String[] strArr4 = zh.a.a;
                                                if (i14 >= strArr4.length) {
                                                    i14 = zh.t0.H9;
                                                } else if (!str.equals(strArr4[i14])) {
                                                    i14++;
                                                }
                                            }
                                            t0Var.n = zh.t0.t(i14);
                                            u3.c cVar = t0Var.c;
                                            if (cVar != null) {
                                                ((zh.f0) cVar.a).W();
                                            }
                                        }
                                        t0Var.invalidate();
                                    }
                                    i0Var = f0Var.e;
                                    if (i0Var != null && !i0Var.E) {
                                        if (!i0Var.y) {
                                            if (!i0Var.x) {
                                                TLRPC.ShareTheme shareTheme = i0Var.H;
                                                if ((shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) && (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) != 0) {
                                                    i0Var.a(shareTheme);
                                                    break;
                                                }
                                            }
                                        } else {
                                            i0Var.f();
                                            break;
                                        }
                                    }
                                }
                            }
                            str2 = null;
                            if (zh.a.a(arrayList8)) {
                            }
                            i0Var = f0Var.e;
                            if (i0Var != null) {
                            }
                        }
                    }
                    str = null;
                    i10 = t0Var.N7;
                    if (i10 >= 0) {
                    }
                    str2 = null;
                    if (zh.a.a(arrayList8)) {
                    }
                    i0Var = f0Var.e;
                    if (i0Var != null) {
                    }
                }
                break;
        }
    }
}
