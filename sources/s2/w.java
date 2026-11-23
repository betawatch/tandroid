package s2;

import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class w {
    public final e2.u a;
    public final String b;
    public final String c;

    public w(e2.u uVar, String str, String str2) {
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
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Objects.equals(this.a, wVar.a) && Objects.equals(this.b, wVar.b) && Objects.equals(this.c, wVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
