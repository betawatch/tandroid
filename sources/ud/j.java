package ud;

import java.util.concurrent.atomic.AtomicReferenceArray;
import qd.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // qd.t
    public final int g() {
        return i.f;
    }

    @Override // qd.t
    public final void h(int i10, uc.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
