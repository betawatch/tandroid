package r3;

import a1.g;
import a8.yb;
import e2.n0;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final int c;

    public a(long j10, long j11, int i10) {
        yb.g(j10 < j11);
        this.a = j10;
        this.b = j11;
        this.c = i10;
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
        String str = n0.a;
        Locale locale = Locale.US;
        StringBuilder t10 = g.t(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        t10.append(this.b);
        t10.append(", speedDivisor=");
        t10.append(this.c);
        return t10.toString();
    }
}
