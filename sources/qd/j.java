package qd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import md.t;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j10, j jVar, int i9) {
        super(j10, jVar, i9);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // md.t
    public final int g() {
        return i.f;
    }

    @Override // md.t
    public final void h(int i9, qc.h hVar) {
        this.e.set(i9, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
