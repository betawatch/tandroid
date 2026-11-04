package x3;

import d2.p0;
import d2.r0;
import d2.v;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements r0 {
    public final float a;
    public final e b;
    public final e c;

    public f(float f10, e eVar, e eVar2) {
        this.a = f10;
        this.b = eVar;
        this.c = eVar2;
    }

    @Override // d2.r0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // d2.r0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.a, fVar.a) == 0 && Objects.equals(this.b, fVar.b) && Objects.equals(this.c, fVar.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        e eVar = this.b;
        int hashCode = (floatToIntBits + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.c;
        return hashCode + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override // d2.r0
    public final /* synthetic */ void a(p0 p0Var) {
    }
}
