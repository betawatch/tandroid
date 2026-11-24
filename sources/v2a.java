// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v2a extends qx9 {
    public final /* synthetic */ AtomicReferenceArray g;

    public v2a(long j, v2a v2aVar, int i) {
        super(j, v2aVar, i);
        this.g = new AtomicReferenceArray(u2a.f);
    }

    @Override // qx9
    public final int g() {
        return u2a.f;
    }

    @Override // qx9
    public final void h(int i, cy2 cy2Var) {
        this.g.set(i, u2a.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
