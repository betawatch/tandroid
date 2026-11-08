package r2;

import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
