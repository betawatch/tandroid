package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class s0 extends t0 implements g0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // wd.g0
    public final void a(long j10, m mVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            o0 o0Var = new o0(this, j11 + nanoTime, mVar);
            q(nanoTime, o0Var);
            mVar.v(new j(o0Var, 2));
        }
    }

    public l0 b(long j10, y1 y1Var, fd.h hVar) {
        return d0.a.b(j10, y1Var, hVar);
    }

    @Override // wd.x
    public final void c(fd.h hVar, Runnable runnable) {
        m(runnable);
    }

    @Override // wd.t0
    public final long j() {
        Runnable runnable;
        q0 q0Var;
        be.t tVar = b0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (!k()) {
            n();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof be.m)) {
                    if (obj != tVar) {
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
                be.m mVar = (be.m) obj;
                Object d = mVar.d();
                if (d != be.m.g) {
                    runnable = (Runnable) d;
                    break;
                }
                be.m c2 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ed.e eVar = this.e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof be.m) {
                        long j10 = be.m.f.get((be.m) obj2);
                        if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
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
        if (r0Var == null || be.v.b.get(r0Var) == 0) {
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
                    if (!(obj instanceof be.m)) {
                        if (obj != b0.c) {
                            be.m mVar = new be.m(8, true);
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
                    be.m mVar2 = (be.m) obj;
                    int a10 = mVar2.a(runnable);
                    if (a10 == 0) {
                        break;
                    }
                    if (a10 == 1) {
                        be.m c2 = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
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
    
        if ((be.v.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        ed.e eVar = this.e;
        if (eVar != null ? eVar.isEmpty() : true) {
            r0 r0Var = (r0) n.get(this);
            if (r0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof be.m) {
                    long j10 = be.m.f.get((be.m) obj);
                    return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
                }
                if (obj == b0.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void q(long j10, q0 q0Var) {
        int c2;
        Thread h7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (r.get(this) != 0) {
            c2 = 1;
        } else {
            r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
            if (r0Var == null) {
                r0 r0Var2 = new r0();
                r0Var2.c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, r0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj);
                r0Var = (r0) obj;
            }
            c2 = q0Var.c(j10, r0Var, this);
        }
        if (c2 != 0) {
            if (c2 == 1) {
                l(j10, q0Var);
                return;
            } else {
                if (c2 != 2) {
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

    @Override // wd.t0
    public void shutdown() {
        q0 c2;
        v1.a.set(null);
        r.set(this, 1);
        be.t tVar = b0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof be.m)) {
                    if (obj != tVar) {
                        be.m mVar = new be.m(8, true);
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
                ((be.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
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
                c2 = be.v.b.get(r0Var) > 0 ? r0Var.c(0) : null;
            }
            if (c2 == null) {
                return;
            } else {
                l(nanoTime, c2);
            }
        }
    }
}
