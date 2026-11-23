package u3;

import a8.la;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final int c;

    public a(long j3, int i7, long j10) {
        la.f(j3 < j10);
        this.a = j3;
        this.b = j10;
        this.c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = l0.a;
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        t6.append(this.b);
        t6.append(", speedDivisor=");
        t6.append(this.c);
        return t6.toString();
    }
}
