// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t0a extends nv9 {
    public final /* synthetic */ AtomicReferenceArray g;

    public t0a(long j, t0a t0aVar, int i) {
        super(j, t0aVar, i);
        this.g = new AtomicReferenceArray(s0a.f);
    }

    @Override // nv9
    public final int g() {
        return s0a.f;
    }

    @Override // nv9
    public final void h(int i, sw2 sw2Var) {
        this.g.set(i, s0a.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
