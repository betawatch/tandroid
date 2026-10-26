package v3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f implements t0 {
    public final float a;
    public final e b;
    public final e c;

    public f(float f7, e eVar, e eVar2) {
        this.a = f7;
        this.b = eVar;
        this.c = eVar2;
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    @Override // b2.t0
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

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
