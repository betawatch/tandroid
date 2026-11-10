package r2;

import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
