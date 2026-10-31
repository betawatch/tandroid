package rh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.mb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u5 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public v5 g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public u5(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        v5 e = e(i10);
        int i11 = 1;
        int i12 = 0;
        long j10 = this.b;
        int i13 = this.a;
        if (e != null) {
            e.l.addAll(0, arrayList);
            e.n = arrayList.size() + e.n;
            zs.f(i13).k(zs.G3, Long.valueOf(j10), e);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = vp.r1(i13).i1(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i10, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = vp.r1(i13).i1(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.f8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new s5(this, i11));
    }

    public final void b(String str, q20 q20Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i10 = this.a;
        long j10 = this.b;
        v5 v5Var = new v5(i10, j10, false);
        v5Var.c = true;
        v5Var.d = -1;
        v5Var.n = 0;
        v5Var.j = true;
        this.h.put(-1, v5Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = vp.r1(i10).i1(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new mb(this, tL_starGiftCollection, v5Var, q20Var, 16));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 >= arrayList.size()) {
                return null;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i11);
            if (i10 == tL_starGiftCollection.collection_id) {
                return tL_starGiftCollection;
            }
            i11++;
        }
    }

    public final ArrayList d() {
        return h() ? this.e : this.f;
    }

    public final v5 e(int i10) {
        return (v5) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (i10 == ((TL_stars.TL_starGiftCollection) arrayList.get(i11)).collection_id) {
                return i11;
            }
            i11++;
        }
    }

    public final void g() {
        if (this.i != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i, true);
            this.i = -1;
        }
        this.c = false;
        this.d = false;
        if (this.j) {
            i();
        }
    }

    public final boolean h() {
        long j10 = this.b;
        int i10 = this.a;
        return j10 >= 0 ? j10 == 0 || j10 == d20.i(i10).e() : org.telegram.messenger.w3.w(5, vp.r1(i10).L0(Long.valueOf(-j10)));
    }

    public final void i() {
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i10 = this.a;
        getstargiftcollections.peer = vp.r1(i10).i1(this.b);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        long j10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j10 = ui.p(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = j10;
        this.i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new s5(this, 0));
    }

    public final void j() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i10);
            if (tL_starGiftCollection.gifts_count > 0) {
                arrayList.add(tL_starGiftCollection);
            }
            i10++;
        }
    }

    public final void k(int i10, TL_stars.SavedStarGift savedStarGift) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        v5 e = e(i10);
        boolean z12 = true;
        boolean z13 = false;
        if (e != null) {
            ArrayList arrayList2 = e.l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (e6.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            e.n = Math.max(0, e.n - 1);
                            i11--;
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
            }
        }
        n(i10);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i13 = this.a;
        vp r12 = vp.r1(i13);
        long j10 = this.b;
        updatestargiftcollection.peer = r12.i1(j10);
        updatestargiftcollection.collection_id = i10;
        int i14 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i10, z13);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                z10 = z12;
                z11 = z13;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = vp.r1(i13).i1(j10);
                z10 = z12;
                z11 = z13;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                z10 = z12;
                z11 = z13;
                org.telegram.messenger.f8.l("can't convert gift to inputgift to add into the collection");
            }
            z12 = z10;
            z13 = z11;
        }
        boolean z14 = z12;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new s5(this, i14));
        zs f7 = zs.f(i13);
        Object[] objArr = new Object[2];
        objArr[z13 ? 1 : 0] = Long.valueOf(j10);
        objArr[z14 ? 1 : 0] = e;
        f7.k(zs.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((v5) it.next()).p(savedStarGift, i10, z10);
        }
        v5 v5Var = this.g;
        if (v5Var != null) {
            v5Var.p(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((v5) it.next()).q(savedStarGift, z10);
        }
        v5 v5Var = this.g;
        if (v5Var != null) {
            v5Var.q(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        v5 e = e(i10);
        TL_stars.TL_starGiftCollection c10 = c(i10);
        if (e != null) {
            ArrayList arrayList = e.l;
            if (c10 == null) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = arrayList.isEmpty() ? null : (TL_stars.SavedStarGift) arrayList.get(0);
            if (savedStarGift == null) {
                c10.flags &= -2;
                c10.icon = null;
            } else {
                c10.flags |= 1;
                c10.icon = savedStarGift.gift.getDocument();
            }
            zs.f(this.a).k(zs.H3, Long.valueOf(this.b), this);
        }
    }
}
