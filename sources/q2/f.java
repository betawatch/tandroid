package q2;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends x2.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override // x2.m
    public final long D() {
        a();
        r2.k kVar = (r2.k) this.d.get((int) this.c);
        return this.e + kVar.e + kVar.c;
    }

    @Override // x2.m
    public final long t() {
        a();
        return this.e + ((r2.k) this.d.get((int) this.c)).e;
    }
}
