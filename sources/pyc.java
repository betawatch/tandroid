// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pyc {
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
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(pyc.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(pyc.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(pyc.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(pyc.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(pyc.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(pyc.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final int a() {
        return ex.a.getIntVolatile(this, g) - ex.a.getIntVolatile(this, e);
    }

    public final zfb b() {
        zfb zfbVar;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & kk7.K1;
            pyc pycVar = this;
            if (unsafe.compareAndSwapInt(pycVar, j, intVolatile, intVolatile + 1) && (zfbVar = (zfb) pycVar.a.getAndSet(i, null)) != null) {
                if (zfbVar.b) {
                    c.decrementAndGet(pycVar);
                }
                return zfbVar;
            }
            this = pycVar;
        }
    }

    public final zfb c(int i, boolean z) {
        int i2 = i & kk7.K1;
        AtomicReferenceArray atomicReferenceArray = this.a;
        zfb zfbVar = (zfb) atomicReferenceArray.get(i2);
        if (zfbVar != null && zfbVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, zfbVar, null)) {
                if (atomicReferenceArray.get(i2) != zfbVar) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return zfbVar;
        }
        return null;
    }
}
