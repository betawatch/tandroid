package r2;

import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends y2.b {
    public final List d;
    public final long e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.e = j3;
        this.d = list;
    }

    @Override // y2.m
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.c);
        return this.e + kVar.e + kVar.c;
    }

    @Override // y2.m
    public final long w() {
        a();
        return this.e + ((s2.k) this.d.get((int) this.c)).e;
    }
}
