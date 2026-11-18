package r2;

import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
