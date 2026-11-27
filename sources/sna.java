// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sna implements tf7 {
    public final float a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public sna(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // tf7
    public final ko4 a() {
        return null;
    }

    @Override // tf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sna.class != obj.getClass()) {
            return false;
        }
        sna snaVar = (sna) obj;
        return this.a == snaVar.a && this.b == snaVar.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + ((int) this.b);
    }

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
