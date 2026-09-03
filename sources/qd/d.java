package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void b() {
        b.set(this, null);
    }

    public final d c() {
        Object obj = a.get(this);
        if (obj == a.b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean d();

    public final void e() {
        d c3;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.d()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d c10 = c();
            kotlin.jvm.internal.j.b(c10);
            while (c10.d() && (c3 = c10.c()) != null) {
                c10 = c3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c10);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(c10, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(c10) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                a.set(dVar, c10);
            }
            if (!c10.d() || c10.c() == null) {
                if (dVar == null || !dVar.d()) {
                    return;
                }
            }
        }
    }
}
