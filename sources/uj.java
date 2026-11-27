// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uj {
    public final long a;
    public final asb b;
    public final int c;
    public final vz6 d;
    public final long e;
    public final asb f;
    public final int g;
    public final vz6 h;
    public final long i;
    public final long j;

    public uj(long j, asb asbVar, int i, vz6 vz6Var, long j2, asb asbVar2, int i2, vz6 vz6Var2, long j3, long j4) {
        this.a = j;
        this.b = asbVar;
        this.c = i;
        this.d = vz6Var;
        this.e = j2;
        this.f = asbVar2;
        this.g = i2;
        this.h = vz6Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uj.class != obj.getClass()) {
            return false;
        }
        uj ujVar = (uj) obj;
        return this.a == ujVar.a && this.c == ujVar.c && this.e == ujVar.e && this.g == ujVar.g && this.i == ujVar.i && this.j == ujVar.j && this.b.equals(ujVar.b) && Objects.equals(this.d, ujVar.d) && Objects.equals(this.f, ujVar.f) && Objects.equals(this.h, ujVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
