package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final long b;
    public final int c;

    public b(long j3, long j10, int i10) {
        e2.d.b(j3 < j10);
        this.a = j3;
        this.b = j10;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = d0.a;
        Locale locale = Locale.US;
        StringBuilder t10 = a4.a.t(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.b);
        t10.append(", speedDivisor=");
        t10.append(this.c);
        return t10.toString();
    }
}
