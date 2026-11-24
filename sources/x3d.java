// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x3d implements vn {
    public static final x3d c;
    public final boolean a;
    public final String b;

    static {
        aec aecVar = new aec((byte) 7, false);
        aecVar.b = Boolean.FALSE;
        c = new x3d(aecVar);
    }

    public x3d(aec aecVar) {
        this.a = ((Boolean) aecVar.b).booleanValue();
        this.b = (String) aecVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x3d)) {
            return false;
        }
        x3d x3dVar = (x3d) obj;
        return cqe.a(null, null) && this.a == x3dVar.a && cqe.a(this.b, x3dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
