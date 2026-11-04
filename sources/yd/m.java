package yd;

import k2.p1;
import wd.c2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends c {
    public final a w;

    public m(int i3, a aVar) {
        super(i3);
        this.w = aVar;
        if (aVar != a.a) {
            if (i3 < 1) {
                throw new IllegalArgumentException(p1.j(i3, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Object obj, boolean z10) {
        a aVar = this.w;
        a aVar2 = a.c;
        dd.k kVar = dd.k.a;
        if (aVar == aVar2) {
            Object b10 = super.b(obj);
            return (!(b10 instanceof i) || (b10 instanceof h)) ? b10 : kVar;
        }
        Object obj2 = e.d;
        k kVar2 = (k) c.f.get(this);
        while (true) {
            long andIncrement = c.b.getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean r5 = r(andIncrement, false);
            int i3 = e.b;
            long j11 = i3;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (kVar2.c != j12) {
                k c2 = c.c(this, j12, kVar2);
                if (c2 != null) {
                    kVar2 = c2;
                } else if (r5) {
                    return new h(o());
                }
            }
            int e10 = c.e(this, kVar2, i10, obj, j10, obj2, r5);
            if (e10 == 0) {
                kVar2.b();
                return kVar;
            }
            if (e10 == 1) {
                break;
            }
            if (e10 != 2) {
                if (e10 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e10 == 4) {
                    if (j10 < c.c.get(this)) {
                        kVar2.b();
                    }
                    return new h(o());
                }
                if (e10 == 5) {
                    kVar2.b();
                }
            } else {
                if (r5) {
                    kVar2.i();
                    return new h(o());
                }
                c2 c2Var = obj2 instanceof c2 ? (c2) obj2 : null;
                if (c2Var != null) {
                    c2Var.a(kVar2, i10 + i3);
                }
                j((kVar2.c * j11) + i10);
            }
        }
    }

    @Override // yd.c, yd.r
    public final Object a(fd.c cVar, Object obj) {
        if (C(obj, true) instanceof h) {
            throw o();
        }
        return dd.k.a;
    }

    @Override // yd.c, yd.r
    public final Object b(Object obj) {
        return C(obj, false);
    }

    @Override // yd.c
    public final boolean s() {
        return this.w == a.b;
    }
}
