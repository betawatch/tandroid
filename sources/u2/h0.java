package u2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class h0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public h0(Object obj) {
        this(obj, -1L);
    }

    public final h0 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new h0(this.b, this.c, this.e, j10, obj);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a.equals(h0Var.a) && this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d && this.e == h0Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public h0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public h0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public h0(int i10, int i11, int i12, long j10, Object obj) {
        this.a = obj;
        this.b = i10;
        this.c = i11;
        this.d = j10;
        this.e = i12;
    }
}
