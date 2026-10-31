package th;

import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t4 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ e5 j;

    public t4(int i10, long j10, e5 e5Var) {
        this.j = e5Var;
        this.a = i10;
        this.b = j10;
        this.c = j10 == d20.i(i10).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < ((org.telegram.messenger.l0) vp.r1(this.a).y7.u.a).c;
    }

    public final y4 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return null;
            }
            y4 y4Var = (y4) arrayList.get(i11);
            if (i10 == y4Var.a) {
                return y4Var;
            }
            i11++;
        }
    }

    public final int c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (i10 == ((y4) arrayList.get(i11)).a) {
                return i11;
            }
            i11++;
        }
    }

    public final void d() {
        if (this.e || this.f) {
            return;
        }
        this.e = true;
        boolean z10 = this.d;
        long j10 = this.b;
        int i10 = this.a;
        if (z10) {
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = vp.r1(i10).i1(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new ag.c(this, 21));
        } else {
            hs a02 = hs.a0(i10);
            a02.a.c(new org.telegram.messenger.d4(a02, j10, new s4(this), 23));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.a;
        tL_reorderAlbums.peer = vp.r1(i10).i1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((y4) obj).a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.a;
        hs a02 = hs.a0(i10);
        org.telegram.messenger.r5 r5Var = a02.a;
        long j10 = this.b;
        r5Var.c(new org.telegram.messenger.d4(a02, j10, this.h, 26));
        if (z10) {
            zs.f(i10).k(zs.j3, Long.valueOf(j10), this);
        }
    }
}
