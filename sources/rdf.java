// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rdf extends e6f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public rdf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // e6f
    public final qdf a(wdf wdfVar) {
        return (qdf) this.d.getAndSet(wdfVar, qdf.d);
    }

    @Override // e6f
    public final udf b(wdf wdfVar) {
        return (udf) this.c.getAndSet(wdfVar, udf.c);
    }

    @Override // e6f
    public final void c(udf udfVar, udf udfVar2) {
        this.b.lazySet(udfVar, udfVar2);
    }

    @Override // e6f
    public final void d(udf udfVar, Thread thread) {
        this.a.lazySet(udfVar, thread);
    }

    @Override // e6f
    public final boolean e(wdf wdfVar, qdf qdfVar, qdf qdfVar2) {
        return g6f.a(this.d, wdfVar, qdfVar, qdfVar2);
    }

    @Override // e6f
    public final boolean f(wdf wdfVar, Object obj, Object obj2) {
        return g6f.a(this.e, wdfVar, obj, obj2);
    }

    @Override // e6f
    public final boolean g(wdf wdfVar, udf udfVar, udf udfVar2) {
        return g6f.a(this.c, wdfVar, udfVar, udfVar2);
    }
}
