package yb;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public static final d j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;

    public d(double d, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.a = d12;
        this.b = d13;
        this.c = d14;
        this.d = d;
        this.e = d9;
        this.f = d10;
        this.g = d11;
        this.h = d15;
        this.i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = p2.b.f(byteBuffer);
        double f11 = p2.b.f(byteBuffer);
        double e10 = p2.b.e(byteBuffer);
        return new d(f10, f11, p2.b.f(byteBuffer), p2.b.f(byteBuffer), e10, p2.b.e(byteBuffer), p2.b.e(byteBuffer), p2.b.f(byteBuffer), p2.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        p2.b.n(byteBuffer, this.d);
        p2.b.n(byteBuffer, this.e);
        p2.b.m(byteBuffer, this.a);
        p2.b.n(byteBuffer, this.f);
        p2.b.n(byteBuffer, this.g);
        p2.b.m(byteBuffer, this.b);
        p2.b.n(byteBuffer, this.h);
        p2.b.n(byteBuffer, this.i);
        p2.b.m(byteBuffer, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f, this.f) == 0 && Double.compare(dVar.g, this.g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.i, this.i) == 0 && Double.compare(dVar.a, this.a) == 0 && Double.compare(dVar.b, this.b) == 0 && Double.compare(dVar.c, this.c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i9 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i10 = (i9 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i11 = (i10 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        int i13 = (i12 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        int i14 = (i13 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        int i15 = (i14 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (i15 * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.a + ", v=" + this.b + ", w=" + this.c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f + ", d=" + this.g + ", tx=" + this.h + ", ty=" + this.i + '}';
    }
}
