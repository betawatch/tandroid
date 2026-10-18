package r3;

import b2.q0;
import b2.s0;
import b2.w;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c implements s0 {
    public final float a;
    public final int b;

    public c(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // b2.s0
    public final /* synthetic */ w a() {
        return null;
    }

    @Override // b2.s0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b) {
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

    @Override // b2.s0
    public final /* synthetic */ void b(q0 q0Var) {
    }
}
