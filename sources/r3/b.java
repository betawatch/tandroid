package r3;

import e2.d0;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        StringBuilder u10 = a4.a.u(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        u10.append(this.b);
        u10.append(", speedDivisor=");
        u10.append(this.c);
        return u10.toString();
    }
}
