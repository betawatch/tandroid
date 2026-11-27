// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sna implements sf7 {
    public final float a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public sna(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // sf7
    public final ko4 a() {
        return null;
    }

    @Override // sf7
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

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
