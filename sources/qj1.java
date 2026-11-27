// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qj1 extends hz9 {
    public final z01 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public qj1(long j, qj1 qj1Var, z01 z01Var, int i) {
        super(j, qj1Var, i);
        this.g = z01Var;
        this.h = new AtomicReferenceArray(b11.b << 1);
    }

    @Override // hz9
    public final int g() {
        return b11.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0042, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0045, code lost:
    
        if (r0 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // hz9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, mx2 mx2Var) {
        int i2 = b11.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i << 1);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof noc;
            z01 z01Var = this.g;
            if (z2 || (l instanceof ooc)) {
                if (k(i, l, z ? b11.j : b11.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        z01Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (l == b11.j || l == b11.k) {
                    break;
                }
                if (l != b11.g && l != b11.f) {
                    if (l == b11.i || l == b11.d || l == b11.l) {
                        return;
                    }
                    lq5.i(l, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i << 1) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.h.get((i << 1) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            z01 z01Var = this.g;
            z01Var.getClass();
            z01Var.F((this.d * b11.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void o(int i, ow5 ow5Var) {
        this.h.set((i << 1) + 1, ow5Var);
    }
}
