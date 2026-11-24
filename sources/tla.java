// default package

import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tla {
    public final long a;
    public final long b;
    public final int c;

    public tla(long j, int i, long j2) {
        jte.f(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tla.class == obj.getClass()) {
            tla tlaVar = (tla) obj;
            if (this.a == tlaVar.a && this.b == tlaVar.b && this.c == tlaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = hac.a;
        Locale locale = Locale.US;
        StringBuilder o = wi8.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
