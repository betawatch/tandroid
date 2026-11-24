// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p3f {
    public final m3f a;
    public final Integer b;

    public /* synthetic */ p3f(aec aecVar) {
        this.a = (m3f) aecVar.b;
        this.b = (Integer) aecVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p3f)) {
            return false;
        }
        p3f p3fVar = (p3f) obj;
        return cqe.a(this.a, p3fVar.a) && cqe.a(this.b, p3fVar.b) && cqe.a(null, null) && cqe.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
