package p4;

import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class w {
    public final h9.i0 a;
    public final int b;
    public final long c;

    public w(List list, int i7, long j3) {
        this.a = h9.i0.q(list);
        this.b = i7;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a.equals(wVar.a) && this.b == wVar.b && this.c == wVar.c;
    }

    public final int hashCode() {
        return c8.l1.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
