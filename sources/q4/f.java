package q4;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends n4.b {
    public final List d;
    public final long e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.e = j10;
        this.d = list;
    }

    @Override // n4.l
    public final long b() {
        a();
        return this.e + ((r4.h) this.d.get((int) this.c)).e;
    }

    @Override // n4.l
    public final long l() {
        a();
        r4.h hVar = (r4.h) this.d.get((int) this.c);
        return this.e + hVar.e + hVar.c;
    }
}
