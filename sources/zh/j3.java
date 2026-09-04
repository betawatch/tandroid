package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class j3 {
    public final t3 a;
    public o3 b;
    public o3 c;
    public o3 d;
    public f3 h;
    public f3 i;
    public f3 j;
    public f3 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public b1 r;
    public b1 s;
    public float t;
    public boolean u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public float n = 0.0f;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public j3(t3 t3Var) {
        this.a = t3Var;
        t3Var.c.addOnAttachStateChangeListener(new bi.i2(this, 14));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
