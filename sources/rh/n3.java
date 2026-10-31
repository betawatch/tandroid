package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 {
    public final y3 a;
    public s3 b;
    public s3 c;
    public s3 d;
    public j3 h;
    public j3 i;
    public j3 j;
    public j3 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public w0 r;
    public w0 s;
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

    public n3(y3 y3Var) {
        this.a = y3Var;
        y3Var.c.addOnAttachStateChangeListener(new l.d(this, 14));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        j3 j3Var = this.h;
        if (j3Var != null) {
            j3Var.a();
        }
        j3 j3Var2 = this.i;
        if (j3Var2 != null) {
            j3Var2.a();
        }
        j3 j3Var3 = this.j;
        if (j3Var3 != null) {
            j3Var3.a();
        }
        j3 j3Var4 = this.k;
        if (j3Var4 != null) {
            j3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            org.telegram.messenger.i0.g3(new h3(this, 1));
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
            ((l3) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
