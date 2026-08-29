package sd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import od.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends u {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // od.u
    public final int g() {
        return i.f;
    }

    @Override // od.u
    public final void h(int i10, sc.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
