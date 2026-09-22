package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class l3 {
    public final w3 a;
    public q3 b;
    public q3 c;
    public q3 d;
    public h3 h;
    public h3 i;
    public h3 j;
    public h3 k;
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

    public l3(w3 w3Var) {
        this.a = w3Var;
        w3Var.c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        h3 h3Var = this.h;
        if (h3Var != null) {
            h3Var.a();
        }
        h3 h3Var2 = this.i;
        if (h3Var2 != null) {
            h3Var2.a();
        }
        h3 h3Var3 = this.j;
        if (h3Var3 != null) {
            h3Var3.a();
        }
        h3 h3Var4 = this.k;
        if (h3Var4 != null) {
            h3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new f3(this, 1));
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
            ((j3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
