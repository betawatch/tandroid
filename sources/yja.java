// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yja implements jd7 {
    public final float a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public yja(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yja.class != obj.getClass()) {
            return false;
        }
        yja yjaVar = (yja) obj;
        return this.a == yjaVar.a && this.b == yjaVar.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + ((int) this.b);
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
