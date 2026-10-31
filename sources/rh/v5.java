package rh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ex0;
import org.telegram.ui.wd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v5 implements w5 {
    public final int a;
    public final long b;
    public int d;
    public Boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public int n;
    public boolean o;
    public ArrayList q;
    public boolean c = false;
    public boolean e = true;
    public boolean f = false;
    public int g = 783;
    public final ArrayList l = new ArrayList();
    public int m = -1;
    public long p = 0;

    public v5(int i10, long j10, boolean z10) {
        this.a = i10;
        this.b = j10;
        if (z10) {
            b();
        }
    }

    @Override // rh.w5
    public final int a(int i10) {
        if (!e4.L1(this.a, this.b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.l;
            if (i11 >= arrayList.size()) {
                for (int i12 = i10 - 1; i12 >= 0; i12--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i12)).can_upgrade) {
                        return i12;
                    }
                }
                return -1;
            }
            if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                return i11;
            }
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rh.w5
    public final void b() {
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (this.i || this.j) {
            return;
        }
        boolean z10 = this.k == null;
        this.i = true;
        long j10 = this.p;
        int i10 = this.a;
        if (j10 != 0) {
            TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
            getcraftstargifts.gift_id = this.p;
            getcraftstargifts.offset = z10 ? "" : this.k;
            getcraftstargifts.limit = z10 ? 15 : 30;
            getsavedstargifts = getcraftstargifts;
        } else {
            TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
            getsavedstargifts2.sort_by_value = !this.e;
            getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.g, 2);
            getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.g, 4);
            getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.g, 1);
            getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.g, 8);
            getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.g, 256);
            getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.g, 512);
            getsavedstargifts2.peer_color_available = this.f;
            long j11 = this.b;
            if (j11 == 0) {
                getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                getsavedstargifts2.peer = vp.r1(i10).i1(j11);
            }
            getsavedstargifts2.offset = z10 ? "" : this.k;
            getsavedstargifts2.limit = z10 ? Math.max(vp.r1(i10).L6, 15) : 30;
            getsavedstargifts = getsavedstargifts2;
            if (this.c) {
                getsavedstargifts2.flags |= 64;
                getsavedstargifts2.collection_id = this.d;
                getsavedstargifts = getsavedstargifts2;
            }
        }
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getsavedstargifts, new wd(this, r2, z10, 6));
        this.m = sendRequest;
        int[] iArr = {sendRequest};
    }

    @Override // rh.w5
    public final int c() {
        return this.n;
    }

    @Override // rh.w5
    public final void d() {
        zs.f(this.a).k(zs.G3, Long.valueOf(this.b), this);
    }

    @Override // rh.w5
    public final int e() {
        return this.l.size();
    }

    public final void f() {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
    }

    public final void g(int i10, boolean z10) {
        int i11 = (i10 & 15) != 0 ? 15 : (i10 & 768) != 0 ? 768 : 0;
        int i12 = this.g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.g = i13;
            if (z10) {
                j(true);
            }
        }
    }

    @Override // rh.w5
    public final Object get(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.l;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    public final TL_stars.InputSavedStarGift h(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = vp.r1(this.a).i1(this.b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.l;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i10);
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                arrayList.add(savedStarGift);
            }
            i10++;
        }
    }

    @Override // rh.w5
    public final int indexOf(Object obj) {
        return this.l.indexOf(obj);
    }

    public final void j(boolean z10) {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
        this.l.clear();
        this.k = null;
        this.j = false;
        if (z10 || this.o) {
            b();
        }
    }

    public final void k(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.id == starGift2.id) {
                            arrayList2.remove(i12);
                            this.n = Math.max(0, this.n - 1);
                            z10 = true;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                zs.f(i10).k(zs.G3, Long.valueOf(this.b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new ag.c(this, 17));
        }
    }

    public final boolean l(TL_stars.SavedStarGift savedStarGift) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (e6.k((TL_stars.SavedStarGift) arrayList.get(i10), savedStarGift)) {
                arrayList.remove(i10);
                this.n = Math.max(0, this.n - 1);
                zs.f(this.a).k(zs.G3, Long.valueOf(this.b), this);
                return true;
            }
            i10++;
        }
    }

    public final void m(int i10, int i11) {
        ArrayList arrayList = this.l;
        int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
        if (j10 < 0 || j10 >= arrayList.size()) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j10);
        int j11 = Utilities.j(i11, arrayList.size() - 1, 0);
        if (j11 < 0 || j11 >= arrayList.size()) {
            return;
        }
        arrayList.add(j11, savedStarGift);
    }

    public final void n() {
        boolean z10 = this.c;
        int i10 = 0;
        long j10 = this.b;
        int i11 = this.a;
        if (!z10) {
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = vp.r1(i11).i1(j10);
            ArrayList i12 = i();
            int size = i12.size();
            while (i10 < size) {
                Object obj = i12.get(i10);
                i10++;
                togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new ag.c3(4), 64);
            return;
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = vp.r1(i11).i1(j10);
        updatestargiftcollection.collection_id = this.d;
        updatestargiftcollection.flags |= 8;
        ArrayList arrayList = this.l;
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
    }

    public final boolean o(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i10 = i();
            boolean contains = i10.contains(savedStarGift);
            int i11 = this.a;
            if (contains) {
                if (!z10) {
                    i10.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.l;
                    arrayList.removeAll(i10);
                    if (this.e && !this.c) {
                        Collections.sort(arrayList, new ex0(12));
                    }
                    arrayList.addAll(0, i10);
                    zs.f(i11).k(zs.G3, Long.valueOf(this.b), this);
                    n();
                    return z12;
                }
            } else if (z10) {
                if (i10.size() + 1 <= vp.r1(i11).L6) {
                    z12 = false;
                } else {
                    if (!z11) {
                        return true;
                    }
                    while (i10.size() > 0 && i10.size() + 1 > vp.r1(i11).L6) {
                        ((TL_stars.SavedStarGift) i0.a.v(1, i10)).pinned_to_top = false;
                    }
                    z12 = true;
                }
                i10.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.l;
                arrayList.removeAll(i10);
                if (this.e) {
                    Collections.sort(arrayList, new ex0(12));
                }
                arrayList.addAll(0, i10);
                zs.f(i11).k(zs.G3, Long.valueOf(this.b), this);
                n();
                return z12;
            }
        }
        return false;
    }

    public final void p(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e6.k(savedStarGift2, savedStarGift)) {
                if (!z10) {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i10));
                } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i10))) {
                    savedStarGift2.collection_id.add(Integer.valueOf(i10));
                }
            }
        }
    }

    public final void q(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e6.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            zs.f(this.a).k(zs.G3, Long.valueOf(this.b), this);
        }
    }
}
