package zh;

import android.text.TextUtils;
import bi.ea;
import bi.k7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.up0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p1(Object obj, TLObject tLObject, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = tLObject;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        int i7 = this.a;
        Object obj = this.d;
        TLObject tLObject = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                a2 a2Var = (a2) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) tLObject;
                up0 up0Var = a2Var.a;
                up0Var.e.k(a2Var.e.d, savedStarGift);
                ((k60) obj).u();
                up0Var.o();
                TL_stars.TL_starGiftCollection c10 = up0Var.e.c(a2Var.e.d);
                if (c10 != null) {
                    hc.a0(up0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750036, k7.A1(savedStarGift.gift), c10.title))).j();
                    break;
                }
                break;
            case 1:
                a2 a2Var2 = (a2) obj2;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) tLObject;
                z0 z0Var = (z0) obj;
                if (a2Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z9 = true;
                } else {
                    z9 = true;
                    z0Var.d(false, true);
                    a2Var2.e.o(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z9;
                z0Var.i(savedStarGift2, z9, a2Var2.d);
                a2Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = a2Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(a2Var2.b).sendRequest(savestargift, null);
                break;
            default:
                d3 d3Var = (d3) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = d3Var.m;
                HashMap hashMap2 = d3Var.o;
                HashMap hashMap3 = d3Var.n;
                ArrayList arrayList = d3Var.h;
                ArrayList arrayList2 = d3Var.g;
                ArrayList arrayList3 = d3Var.f;
                int i10 = d3Var.a;
                ArrayList arrayList4 = d3Var.d;
                d3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    qp.s1(i10).Y3(resalestargifts.users, false);
                    qp.s1(i10).S3(resalestargifts.chats, false);
                    d3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i11);
                        i11++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    d3Var.u = arrayList4.size() >= d3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    d3Var.q = resalestargifts.next_offset;
                    d3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        d3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i12);
                            i12++;
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
                    c20 c20Var = d3Var.c;
                    if (c20Var != null) {
                        c20Var.a(Boolean.valueOf(z10));
                        break;
                    }
                }
                break;
        }
    }
}
