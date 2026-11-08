package p4;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
