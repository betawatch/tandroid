// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class rab extends b93 implements kab {
    public kab a;
    public long b;

    @Override // kab
    public final int b(long j) {
        kab kabVar = this.a;
        kabVar.getClass();
        return kabVar.b(j - this.b);
    }

    @Override // b93, n01
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // kab
    public final long h(int i) {
        kab kabVar = this.a;
        kabVar.getClass();
        return kabVar.h(i) + this.b;
    }

    @Override // kab
    public final List l(long j) {
        kab kabVar = this.a;
        kabVar.getClass();
        return kabVar.l(j - this.b);
    }

    @Override // kab
    public final int t() {
        kab kabVar = this.a;
        kabVar.getClass();
        return kabVar.t();
    }
}
