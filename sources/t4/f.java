package t4;

import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends q4.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override // q4.l
    public final long B() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.c);
        return this.e + gVar.e + gVar.c;
    }

    @Override // q4.l
    public final long p() {
        a();
        return this.e + ((u4.g) this.d.get((int) this.c)).e;
    }
}
