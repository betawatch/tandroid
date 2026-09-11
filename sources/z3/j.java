package z3;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class j extends h2.h implements d {
    public d f;
    public long h;

    @Override // z3.d
    public final int d(long j3) {
        d dVar = this.f;
        dVar.getClass();
        return dVar.d(j3 - this.h);
    }

    @Override // z3.d
    public final long e(int i10) {
        d dVar = this.f;
        dVar.getClass();
        return dVar.e(i10) + this.h;
    }

    @Override // z3.d
    public final List h(long j3) {
        d dVar = this.f;
        dVar.getClass();
        return dVar.h(j3 - this.h);
    }

    @Override // h2.h
    public final void i() {
        this.b = 0;
        this.c = 0L;
        this.d = 0;
        this.e = false;
        this.f = null;
    }

    @Override // z3.d
    public final int k() {
        d dVar = this.f;
        dVar.getClass();
        return dVar.k();
    }
}
