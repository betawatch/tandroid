// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class th7 implements lf7 {
    public final float a;
    public final float b;

    public th7(float f, float f2) {
        jte.e("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && th7.class == obj.getClass()) {
            th7 th7Var = (th7) obj;
            if (this.a == th7Var.a && this.b == th7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
