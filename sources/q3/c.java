package q3;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends i {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final i[] g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i10;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.g = iVarArr;
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
