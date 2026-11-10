package s2;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v {
    public final e2.u a;
    public final String b;
    public final String c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.a = null;
        a10.k = null;
        this.a = new e2.u(a10);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Objects.equals(this.a, vVar.a) && Objects.equals(this.b, vVar.b) && Objects.equals(this.c, vVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
