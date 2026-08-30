package qd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");
    public static final i5.c g = new i5.c("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public n(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
        int i11 = i10 - 1;
        this.c = i11;
        this.d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z4 = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z4 || atomicReferenceArray.get(i11 & i12) == null) {
                if (f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i11 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i11 & i12, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.d;
                        int i13 = nVar.c & i11;
                        Object obj2 = atomicReferenceArray2.get(i13);
                        if ((obj2 instanceof m) && ((m) obj2).a == i11) {
                            atomicReferenceArray2.set(i13, obj);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i14 = this.a;
                if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.a * 2, nVar.b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = nVar.c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = nVar.d.get(i13);
                if (obj == null) {
                    obj = new m(i10);
                }
                nVar3.d.set(nVar3.c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j10 = atomicLongFieldUpdater.get(nVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = nVar.c;
            int i13 = i10 & i12;
            if ((i11 & i12) == i13) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.d;
            Object obj = atomicReferenceArray.get(i13);
            boolean z4 = nVar.b;
            if (obj == null) {
                if (z4) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (f.compareAndSet(nVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i13, null);
                    return obj;
                }
                nVar = this;
                if (z4) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(nVar);
                        int i14 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f.compareAndSet(nVar2, j12, (j12 & (-1073741824)) | j11)) {
                                nVar2.d.set(i14 & nVar2.c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
