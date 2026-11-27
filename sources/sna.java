// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
