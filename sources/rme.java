// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rme extends e1f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public rme(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // e1f
    public final void a(yze yzeVar, yze yzeVar2) {
        this.b.lazySet(yzeVar, yzeVar2);
    }

    @Override // e1f
    public final void b(yze yzeVar, Thread thread) {
        this.a.lazySet(yzeVar, thread);
    }

    @Override // e1f
    public final boolean c(y4f y4fVar, gce gceVar, gce gceVar2) {
        return m2f.a(this.d, y4fVar, gceVar, gceVar2);
    }

    @Override // e1f
    public final boolean d(y4f y4fVar, Object obj, Object obj2) {
        return m2f.a(this.e, y4fVar, obj, obj2);
    }

    @Override // e1f
    public final boolean e(y4f y4fVar, yze yzeVar, yze yzeVar2) {
        return m2f.a(this.c, y4fVar, yzeVar, yzeVar2);
    }
}
