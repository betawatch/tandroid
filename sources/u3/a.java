package u3;

import a8.ma;
import a8.p0;
import h2.l0;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final int c;

    public a(long j3, int i7, long j10) {
        ma.f(j3 < j10);
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
