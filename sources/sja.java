// default package

import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sja {
    public final long a;
    public final long b;
    public final int c;

    public sja(long j, int i, long j2) {
        gre.f(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sja.class == obj.getClass()) {
            sja sjaVar = (sja) obj;
            if (this.a == sjaVar.a && this.b == sjaVar.b && this.c == sjaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = g8c.a;
        Locale locale = Locale.US;
        StringBuilder o = ug8.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
