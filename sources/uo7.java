// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uo7 extends ja {
    public int c;
    public int d;
    public String e;
    public String f;
    public zo7 g;
    public int h;
    public boolean i;

    public static uo7 b(int i, String str, boolean z) {
        uo7 uo7Var = new uo7(1, true);
        uo7Var.c = i;
        uo7Var.e = str;
        uo7Var.i = z;
        return uo7Var;
    }

    public static uo7 c(int i, String str, String str2) {
        uo7 uo7Var = new uo7(5, true);
        uo7Var.c = i;
        uo7Var.e = str;
        uo7Var.f = str2;
        return uo7Var;
    }

    public static uo7 d(int i, String str) {
        uo7 uo7Var = new uo7(4, true);
        uo7Var.c = i;
        uo7Var.e = str;
        return uo7Var;
    }

    @Override // ja
    public final boolean a(ja jaVar) {
        if (this == jaVar) {
            return true;
        }
        if (uo7.class != jaVar.getClass()) {
            return false;
        }
        uo7 uo7Var = (uo7) jaVar;
        return this.c == uo7Var.c && this.d == uo7Var.d && this.h == uo7Var.h && this.i == uo7Var.i && Objects.equals(this.e, uo7Var.e) && Objects.equals(this.f, uo7Var.f) && this.g == uo7Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo7.class != obj.getClass()) {
            return false;
        }
        uo7 uo7Var = (uo7) obj;
        if (this.c != uo7Var.c || this.h != uo7Var.h) {
            return false;
        }
        if (this.a != 8) {
            if (this.d != uo7Var.d || !Objects.equals(this.e, uo7Var.e)) {
                return false;
            }
            if (this.a != 6 && !Objects.equals(this.f, uo7Var.f)) {
                return false;
            }
        }
        return this.g == uo7Var.g;
    }
}
