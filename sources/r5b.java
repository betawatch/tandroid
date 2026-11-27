// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r5b {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ c6b j;

    public r5b(int i, long j, c6b c6bVar) {
        this.j = c6bVar;
        this.a = i;
        this.b = j;
        this.c = j == yac.h(i).e();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.h(this.b)) && this.f && this.h.size() < uc7.s1(this.a).l4.A.f();
    }

    public final w5b b(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                return null;
            }
            w5b w5bVar = (w5b) arrayList.get(i2);
            if (i == w5bVar.a) {
                return w5bVar;
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
            if (i == ((w5b) arrayList.get(i2)).a) {
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
            tL_getAlbums.peer = uc7.s1(i).j1(j);
            ConnectionsManager.getInstance(i).sendRequest(tL_getAlbums, new yp9(this, (byte) 11));
        } else {
            kf7 a0 = kf7.a0(i);
            a0.a.c(new cq6((Object) a0, j, (Object) new tp8(this, b), (byte) 15));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i = this.a;
        tL_reorderAlbums.peer = uc7.s1(i).j1(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tL_reorderAlbums.order.add(Integer.valueOf(((w5b) obj).a));
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        kf7 a0 = kf7.a0(i);
        to3 to3Var = a0.a;
        long j = this.b;
        to3Var.c(new te7(a0, j, this.h, (byte) 3));
        if (z) {
            jn7.f(i).k(jn7.l3, Long.valueOf(j), this);
        }
    }
}
