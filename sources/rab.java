// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
