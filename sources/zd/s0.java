package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class s0 extends t0 implements g0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public l0 a(long j3, y1 y1Var, id.h hVar) {
        return d0.a.a(j3, y1Var, hVar);
    }

    @Override // zd.g0
    public final void b(long j3, m mVar) {
        long j10 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            o0 o0Var = new o0(this, j10 + nanoTime, mVar);
            q(nanoTime, o0Var);
            mVar.v(new j(o0Var, 2));
        }
    }

    @Override // zd.x
    public final void c(id.h hVar, Runnable runnable) {
        m(runnable);
    }

    @Override // zd.t0
    public final long j() {
        Runnable runnable;
        q0 q0Var;
        com.google.android.gms.internal.clearcut.e eVar = b0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (!k()) {
            n();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof ee.m)) {
                    if (obj != eVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                ee.m mVar = (ee.m) obj;
                Object d = mVar.d();
                if (d != ee.m.g) {
                    runnable = (Runnable) d;
                    break;
                }
                ee.m c10 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            hd.d dVar = this.e;
            if (((dVar == null || dVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof ee.m) {
                        long j3 = ee.m.f.get((ee.m) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == eVar) {
                        return Long.MAX_VALUE;
                    }
                }
                r0 r0Var = (r0) n.get(this);
                if (r0Var != null) {
                    synchronized (r0Var) {
                        q0[] q0VarArr = r0Var.a;
                        q0Var = q0VarArr != null ? q0VarArr[0] : null;
                    }
                    if (q0Var != null) {
                        long nanoTime = q0Var.a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void m(Runnable runnable) {
        n();
        if (!o(runnable)) {
            c0.s.m(runnable);
            return;
        }
        Thread h7 = h();
        if (Thread.currentThread() != h7) {
            LockSupport.unpark(h7);
        }
    }

    public final void n() {
        q0 q0Var;
        r0 r0Var = (r0) n.get(this);
        if (r0Var == null || ee.u.b.get(r0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (r0Var) {
                try {
                    q0[] q0VarArr = r0Var.a;
                    q0 q0Var2 = q0VarArr != null ? q0VarArr[0] : null;
                    if (q0Var2 != null) {
                        q0Var = ((nanoTime - q0Var2.a) > 0L ? 1 : ((nanoTime - q0Var2.a) == 0L ? 0 : -1)) >= 0 ? o(q0Var2) : false ? r0Var.c(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (q0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (r.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof ee.m)) {
                        if (obj != b0.c) {
                            ee.m mVar = new ee.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    ee.m mVar2 = (ee.m) obj;
                    int a10 = mVar2.a(runnable);
                    if (a10 == 0) {
                        break;
                    }
                    if (a10 == 1) {
                        ee.m c10 = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a10 == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((ee.u.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        hd.d dVar = this.e;
        if (dVar != null ? dVar.isEmpty() : true) {
            r0 r0Var = (r0) n.get(this);
            if (r0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof ee.m) {
                    long j3 = ee.m.f.get((ee.m) obj);
                    return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                }
                if (obj == b0.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void q(long j3, q0 q0Var) {
        int c10;
        Thread h7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (r.get(this) != 0) {
            c10 = 1;
        } else {
            r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
            if (r0Var == null) {
                r0 r0Var2 = new r0();
                r0Var2.c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, r0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj);
                r0Var = (r0) obj;
            }
            c10 = q0Var.c(j3, r0Var, this);
        }
        if (c10 != 0) {
            if (c10 == 1) {
                l(j3, q0Var);
                return;
            } else {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        r0 r0Var3 = (r0) atomicReferenceFieldUpdater.get(this);
        if (r0Var3 != null) {
            synchronized (r0Var3) {
                q0[] q0VarArr = r0Var3.a;
                r2 = q0VarArr != null ? q0VarArr[0] : null;
            }
        }
        if (r2 != q0Var || Thread.currentThread() == (h7 = h())) {
            return;
        }
        LockSupport.unpark(h7);
    }

    @Override // zd.t0
    public void shutdown() {
        q0 c10;
        v1.a.set(null);
        r.set(this, 1);
        com.google.android.gms.internal.clearcut.e eVar = b0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof ee.m)) {
                    if (obj != eVar) {
                        ee.m mVar = new ee.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((ee.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (j() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            r0 r0Var = (r0) n.get(this);
            if (r0Var == null) {
                return;
            }
            synchronized (r0Var) {
                c10 = ee.u.b.get(r0Var) > 0 ? r0Var.c(0) : null;
            }
            if (c10 == null) {
                return;
            } else {
                l(nanoTime, c10);
            }
        }
    }
}
