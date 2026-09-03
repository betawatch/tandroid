package t4;

import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final long a1() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.c);
        return this.e + gVar.e + gVar.c;
    }

    @Override // q4.l
    public final long n0() {
        a();
        return this.e + ((u4.g) this.d.get((int) this.c)).e;
    }
}
