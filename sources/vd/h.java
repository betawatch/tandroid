package vd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.l;
import td.j2;
import yd.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends t {
    public final b e;
    public final /* synthetic */ AtomicReferenceArray f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.e = bVar;
        this.f = new AtomicReferenceArray(d.b * 2);
    }

    @Override // yd.t
    public final int g() {
        return d.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.i.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // yd.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i10, cd.h hVar) {
        int i11 = d.b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f.get(i10 * 2);
        while (true) {
            Object l4 = l(i10);
            boolean z11 = l4 instanceof j2;
            b bVar = this.e;
            if (z11 || (l4 instanceof j)) {
                if (k(i10, l4, z10 ? d.j : d.k)) {
                    n(i10, null);
                    m(i10, !z10);
                    if (z10) {
                        kotlin.jvm.internal.i.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (l4 == d.j || l4 == d.k) {
                    break;
                }
                if (l4 != d.g && l4 != d.f) {
                    if (l4 == d.i || l4 == d.d || l4 == d.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l4).toString());
                }
            }
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.q((this.c * d.b) + i10);
        }
        i();
    }

    public final void n(int i10, l lVar) {
        this.f.set(i10 * 2, lVar);
    }

    public final void o(int i10, Object obj) {
        this.f.set((i10 * 2) + 1, obj);
    }
}
