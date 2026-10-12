package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e3 {
    public final o3 a;
    public j3 b;
    public j3 c;
    public j3 d;
    public a3 h;
    public a3 i;
    public a3 j;
    public a3 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public a1 r;
    public a1 s;
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

    public e3(o3 o3Var) {
        this.a = o3Var;
        o3Var.c.addOnAttachStateChangeListener(new bi.j2(this, 15));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        a3 a3Var = this.h;
        if (a3Var != null) {
            a3Var.a();
        }
        a3 a3Var2 = this.i;
        if (a3Var2 != null) {
            a3Var2.a();
        }
        a3 a3Var3 = this.j;
        if (a3Var3 != null) {
            a3Var3.a();
        }
        a3 a3Var4 = this.k;
        if (a3Var4 != null) {
            a3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new y2(this, 1));
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
            ((c3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
