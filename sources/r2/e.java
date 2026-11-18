package r2;

import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e extends y2.b {
    public final List d;
    public final long e;

    public e(long j3, List list) {
        super(0L, list.size() - 1);
        this.e = j3;
        this.d = list;
    }

    @Override // y2.m
    public final long O() {
        a();
        return this.e + ((s2.k) this.d.get((int) this.c)).e;
    }

    @Override // y2.m
    public final long S0() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.c);
        return this.e + kVar.e + kVar.c;
    }
}
