// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q0d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = fy.a;
        f = unsafe.objectFieldOffset(q0d.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(q0d.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(q0d.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(q0d.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(q0d.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(q0d.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final int a() {
        return fy.a.getIntVolatile(this, g) - fy.a.getIntVolatile(this, e);
    }

    public final aib b() {
        aib aibVar;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & nm7.K1;
            q0d q0dVar = this;
            if (unsafe.compareAndSwapInt(q0dVar, j, intVolatile, intVolatile + 1) && (aibVar = (aib) q0dVar.a.getAndSet(i, null)) != null) {
                if (aibVar.b) {
                    c.decrementAndGet(q0dVar);
                }
                return aibVar;
            }
            this = q0dVar;
        }
    }

    public final aib c(int i, boolean z) {
        int i2 = i & nm7.K1;
        AtomicReferenceArray atomicReferenceArray = this.a;
        aib aibVar = (aib) atomicReferenceArray.get(i2);
        if (aibVar != null && aibVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, aibVar, null)) {
                if (atomicReferenceArray.get(i2) != aibVar) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return aibVar;
        }
        return null;
    }
}
