package q3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends j {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final j[] g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i10;
        this.d = i11;
        this.e = j3;
        this.f = j10;
        this.g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Objects.equals(this.b, cVar.b) && Arrays.equals(this.g, cVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
