package t4;

import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final long k() {
        a();
        return this.e + ((u4.g) this.d.get((int) this.c)).e;
    }

    @Override // q4.l
    public final long l() {
        a();
        u4.g gVar = (u4.g) this.d.get((int) this.c);
        return this.e + gVar.e + gVar.c;
    }
}
