package yd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import wd.c2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends be.r {
    public final c e;
    public final /* synthetic */ AtomicReferenceArray f;

    public k(long j10, k kVar, c cVar, int i3) {
        super(j10, kVar, i3);
        this.e = cVar;
        this.f = new AtomicReferenceArray(e.b * 2);
    }

    @Override // be.r
    public final int g() {
        return e.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // be.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i3, fd.h hVar) {
        int i10 = e.b;
        boolean z10 = i3 >= i10;
        if (z10) {
            i3 -= i10;
        }
        this.f.get(i3 * 2);
        while (true) {
            Object l10 = l(i3);
            boolean z11 = l10 instanceof c2;
            c cVar = this.e;
            if (z11 || (l10 instanceof s)) {
                if (k(i3, l10, z10 ? e.j : e.k)) {
                    n(i3, null);
                    m(i3, !z10);
                    if (z10) {
                        kotlin.jvm.internal.j.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (l10 == e.j || l10 == e.k) {
                    break;
                }
                if (l10 != e.g && l10 != e.f) {
                    if (l10 == e.i || l10 == e.d || l10 == e.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l10).toString());
                }
            }
        }
    }

    public final boolean k(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i3 * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i3) {
        return this.f.get((i3 * 2) + 1);
    }

    public final void m(int i3, boolean z10) {
        if (z10) {
            c cVar = this.e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.c * e.b) + i3);
        }
        i();
    }

    public final void n(int i3, Object obj) {
        this.f.set(i3 * 2, obj);
    }

    public final void o(int i3, Object obj) {
        this.f.set((i3 * 2) + 1, obj);
    }
}
