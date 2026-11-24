// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pk1 extends qx9 {
    public final y11 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public pk1(long j, pk1 pk1Var, y11 y11Var, int i) {
        super(j, pk1Var, i);
        this.g = y11Var;
        this.h = new AtomicReferenceArray(a21.b << 1);
    }

    @Override // qx9
    public final int g() {
        return a21.b;
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
    @Override // qx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, cy2 cy2Var) {
        int i2 = a21.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i << 1);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof amc;
            y11 y11Var = this.g;
            if (z2 || (l instanceof bmc)) {
                if (k(i, l, z ? a21.j : a21.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        y11Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (l == a21.j || l == a21.k) {
                    break;
                }
                if (l != a21.g && l != a21.f) {
                    if (l == a21.i || l == a21.d || l == a21.l) {
                        return;
                    }
                    zo4.p(l, "unexpected state: ");
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
            y11 y11Var = this.g;
            y11Var.getClass();
            y11Var.F((this.d * a21.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void o(int i, du2 du2Var) {
        this.h.set((i << 1) + 1, du2Var);
    }
}
