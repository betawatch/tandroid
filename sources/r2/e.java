package r2;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final long P0() {
        a();
        s2.l lVar = (s2.l) this.d.get((int) this.c);
        return this.e + lVar.e + lVar.c;
    }

    @Override // y2.m
    public final long U() {
        a();
        return this.e + ((s2.l) this.d.get((int) this.c)).e;
    }
}
