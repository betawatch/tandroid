package t4;

import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
