package r3;

import a1.g;
import e2.l0;
import j$.util.Objects;
import java.util.Locale;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final int c;

    public a(long j10, int i10, long j11) {
        t6.f(j10 < j11);
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
        String str = l0.a;
        Locale locale = Locale.US;
        StringBuilder s10 = g.s(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        s10.append(this.b);
        s10.append(", speedDivisor=");
        s10.append(this.c);
        return s10.toString();
    }
}
