package z3;

import java.util.List;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int c(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.c(j10 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final long d(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(i10) + this.b;
    }

    @Override // z3.d
    public final List e(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.e(j10 - this.b);
    }

    @Override // z3.d
    public final int h() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.h();
    }
}
