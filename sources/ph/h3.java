package ph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ul0;
import rh.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h3 implements w5 {
    public final int a;
    public final long b;
    public final q20 c;
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
    public g3 p = g3.a;
    public boolean u = false;
    public int v = -1;

    public h3(int i10, long j10, q20 q20Var) {
        this.a = i10;
        this.b = j10;
        this.c = q20Var;
    }

    @Override // rh.w5
    public final int a(int i10) {
        return -1;
    }

    @Override // rh.w5
    public final void b() {
        g(false);
    }

    @Override // rh.w5
    public final int c() {
        return this.e;
    }

    @Override // rh.w5
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

    public final void g(boolean z10) {
        if (this.t) {
            return;
        }
        if (z10 || !this.u) {
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
            g3 g3Var = this.p;
            int i10 = 0;
            if (g3Var == g3.c) {
                getresalestargifts.sort_by_num = true;
                getresalestargifts.sort_by_price = false;
            } else if (g3Var == g3.b) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = false;
            } else if (g3Var == g3.a) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = true;
            }
            long j10 = this.i;
            ArrayList arrayList = this.h;
            ArrayList arrayList2 = this.g;
            ArrayList arrayList3 = this.f;
            if (j10 != 0) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = j10;
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
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
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
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
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
                    while (i10 < size3) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                        if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                            TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                            stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidpattern);
                        }
                    }
                }
            }
            this.v = ConnectionsManager.getInstance(this.a).sendRequest(getresalestargifts, new ul0(22, this, getresalestargifts));
        }
    }

    @Override // rh.w5
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.q = null;
        this.d.clear();
        g(true);
        q20 q20Var = this.c;
        if (q20Var != null) {
            q20Var.a(Boolean.TRUE);
        }
    }

    public final void i(g3 g3Var) {
        if (this.p != g3Var) {
            this.p = g3Var;
            h();
        }
    }

    @Override // rh.w5
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // rh.w5
    public final void d() {
    }
}
