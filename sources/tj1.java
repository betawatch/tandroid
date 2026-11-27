// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tj1 implements rj1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final xy5 d;

    public tj1(long j, long j2, boolean z, xy5 xy5Var) {
        yve.f(j == -9223372036854775807L || j2 == -9223372036854775807L || j <= j2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = xy5Var;
    }

    @Override // sf7
    public final ko4 a() {
        return null;
    }

    @Override // sf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tj1.class != obj.getClass()) {
            return false;
        }
        tj1 tj1Var = (tj1) obj;
        return this.a == tj1Var.a && this.b == tj1Var.b && this.c == tj1Var.c && Objects.equals(this.d, tj1Var.d);
    }

    public final int hashCode() {
        int b = (((tse.b(this.b) + ((tse.b(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        xy5 xy5Var = this.d;
        return b + (xy5Var != null ? xy5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        sb.append(j == -9223372036854775807L ? "UNSET" : Long.valueOf(j));
        long j2 = this.b;
        String str = "";
        sb.append(j2 == -9223372036854775807L ? "" : qu6.n(j2, ", endTimeMs="));
        sb.append(this.c ? ", hidden" : "");
        xy5 xy5Var = this.d;
        if (xy5Var != null) {
            str = ", title=" + xy5Var;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
