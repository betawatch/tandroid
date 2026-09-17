package r3;

import b2.m0;
import b2.o0;
import b2.s;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class d implements o0 {
    public final float a;
    public final int b;

    public d(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // b2.o0
    public final /* synthetic */ s a() {
        return null;
    }

    @Override // b2.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // b2.o0
    public final /* synthetic */ void b(m0 m0Var) {
    }
}
