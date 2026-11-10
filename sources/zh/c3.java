package zh;

import bi.w9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.p41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c3 implements w9 {
    public final int a;
    public final long b;
    public final c20 c;
    public int e;
    public long i;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public final HashMap o = new HashMap();
    public b3 p = b3.a;
    public boolean u = false;
    public int v = -1;

    public c3(int i7, long j3, c20 c20Var) {
        this.a = i7;
        this.b = j3;
        this.c = c20Var;
    }

    @Override // bi.w9
    public final void a() {
        g(false);
    }

    @Override // bi.w9
    public final int b(int i7) {
        return -1;
    }

    @Override // bi.w9
    public final int c() {
        return this.e;
    }

    @Override // bi.w9
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.t = false;
    }

    public final void g(boolean z9) {
        if (this.t) {
            return;
        }
        if (z9 || !this.u) {
            this.t = true;
            TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
            getresalestargifts.gift_id = this.b;
            String str = this.q;
            if (str == null) {
                str = "";
            }
            getresalestargifts.offset = str;
            getresalestargifts.limit = 15;
            getresalestargifts.for_craft = this.s;
            getresalestargifts.stars_only = this.r;
            b3 b3Var = this.p;
            int i7 = 0;
            if (b3Var == b3.c) {
                getresalestargifts.sort_by_num = true;
                getresalestargifts.sort_by_price = false;
            } else if (b3Var == b3.b) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = false;
            } else if (b3Var == b3.a) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = true;
            }
            long j3 = this.i;
            ArrayList arrayList = this.h;
            ArrayList arrayList2 = this.g;
            ArrayList arrayList3 = this.f;
            if (j3 != 0) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = j3;
            } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = 0L;
            }
            HashSet hashSet = this.j;
            boolean isEmpty = hashSet.isEmpty();
            HashSet hashSet2 = this.l;
            HashSet hashSet3 = this.k;
            if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                getresalestargifts.flags |= 8;
                if (!hashSet.isEmpty()) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                        if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                            TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                            stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidmodel);
                        }
                    }
                }
                if (!hashSet3.isEmpty()) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                        if (!hashSet3.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                            TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                            stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                            getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    int size3 = arrayList.size();
                    while (i7 < size3) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                        if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                            TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                            stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidpattern);
                        }
                    }
                }
            }
            this.v = ConnectionsManager.getInstance(this.a).sendRequest(getresalestargifts, new p41(11, this, getresalestargifts));
        }
    }

    @Override // bi.w9
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final void h() {
        f();
        this.q = null;
        this.d.clear();
        g(true);
        c20 c20Var = this.c;
        if (c20Var != null) {
            c20Var.a(Boolean.TRUE);
        }
    }

    public final void i(b3 b3Var) {
        if (this.p != b3Var) {
            this.p = b3Var;
            h();
        }
    }

    @Override // bi.w9
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // bi.w9
    public final void d() {
    }
}
