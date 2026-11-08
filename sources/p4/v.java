package p4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class v {
    public final q4.r a;
    public final int b;
    public final int c;
    public final u d;
    public final Bundle e;

    public v(q4.r rVar, int i7, int i10, boolean z9, u uVar, Bundle bundle) {
        this.a = rVar;
        this.b = i7;
        this.c = i10;
        this.d = uVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        u uVar = vVar.d;
        u uVar2 = this.d;
        return (uVar2 == null && uVar == null) ? this.a.equals(vVar.a) : Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.a;
        sb2.append(rVar.a.a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.a.c, "}", sb2);
    }
}
