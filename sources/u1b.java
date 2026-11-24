// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u1b {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ g2b j;

    public u1b(int i, long j, g2b g2bVar) {
        this.j = g2bVar;
        this.a = i;
        this.b = j;
        this.c = j == y6c.h(i).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.h(this.b)) && this.f && this.h.size() < na7.q1(this.a).k4.y.f();
    }

    public final z1b b(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                return null;
            }
            z1b z1bVar = (z1b) arrayList.get(i2);
            if (i == z1bVar.a) {
                return z1bVar;
            }
            i2++;
        }
    }

    public final int c(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            if (i == ((z1b) arrayList.get(i2)).a) {
                return i2;
            }
            i2++;
        }
    }

    public final void d() {
        if (this.e || this.f) {
            return;
        }
        byte b = 1;
        this.e = true;
        boolean z = this.d;
        long j = this.b;
        int i = this.a;
        if (z) {
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = na7.q1(i).h1(j);
            ConnectionsManager.getInstance(i).sendRequest(tL_getAlbums, new wx9(this, (byte) 10));
        } else {
            ad7 Y = ad7.Y(i);
            Y.a.c(new go6((Object) Y, j, (Object) new km8(this, b), (byte) 11));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i = this.a;
        tL_reorderAlbums.peer = na7.q1(i).h1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tL_reorderAlbums.order.add(Integer.valueOf(((z1b) obj).a));
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        ad7 Y = ad7.Y(i);
        co3 co3Var = Y.a;
        long j = this.b;
        co3Var.c(new jc7(Y, j, this.h, (byte) 4));
        if (z) {
            kk7.f(i).k(kk7.k3, Long.valueOf(j), this);
        }
    }
}
