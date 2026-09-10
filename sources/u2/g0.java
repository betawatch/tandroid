package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.b, this.c, this.e, j3, obj);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a.equals(g0Var.a) && this.b == g0Var.b && this.c == g0Var.c && this.d == g0Var.d && this.e == g0Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public g0(int i10, int i11, int i12, long j3, Object obj) {
        this.a = obj;
        this.b = i10;
        this.c = i11;
        this.d = j3;
        this.e = i12;
    }
}
