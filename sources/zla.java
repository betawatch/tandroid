// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zla implements lf7 {
    public final float a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public zla(float f, int i) {
        this.a = f;
        this.b = i;
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
        if (obj == null || zla.class != obj.getClass()) {
            return false;
        }
        zla zlaVar = (zla) obj;
        return this.a == zlaVar.a && this.b == zlaVar.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + ((int) this.b);
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
