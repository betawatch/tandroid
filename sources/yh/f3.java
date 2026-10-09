package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f3 {
    public final p3 a;
    public k3 b;
    public k3 c;
    public k3 d;
    public b3 h;
    public b3 i;
    public b3 j;
    public b3 k;
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

    public f3(p3 p3Var) {
        this.a = p3Var;
        p3Var.c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
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
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
