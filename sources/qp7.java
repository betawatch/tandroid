// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qp7 extends ka {
    public int c;
    public int d;
    public String e;
    public String f;
    public vp7 g;
    public int h;
    public boolean i;

    public static qp7 b(int i, String str, boolean z) {
        qp7 qp7Var = new qp7(1, true);
        qp7Var.c = i;
        qp7Var.e = str;
        qp7Var.i = z;
        return qp7Var;
    }

    public static qp7 c(int i, String str, String str2) {
        qp7 qp7Var = new qp7(5, true);
        qp7Var.c = i;
        qp7Var.e = str;
        qp7Var.f = str2;
        return qp7Var;
    }

    public static qp7 d(int i, String str) {
        qp7 qp7Var = new qp7(4, true);
        qp7Var.c = i;
        qp7Var.e = str;
        return qp7Var;
    }

    @Override // ka
    public final boolean a(ka kaVar) {
        if (this == kaVar) {
            return true;
        }
        if (qp7.class != kaVar.getClass()) {
            return false;
        }
        qp7 qp7Var = (qp7) kaVar;
        return this.c == qp7Var.c && this.d == qp7Var.d && this.h == qp7Var.h && this.i == qp7Var.i && Objects.equals(this.e, qp7Var.e) && Objects.equals(this.f, qp7Var.f) && this.g == qp7Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qp7.class != obj.getClass()) {
            return false;
        }
        qp7 qp7Var = (qp7) obj;
        if (this.c != qp7Var.c || this.h != qp7Var.h) {
            return false;
        }
        if (this.a != 8) {
            if (this.d != qp7Var.d || !Objects.equals(this.e, qp7Var.e)) {
                return false;
            }
            if (this.a != 6 && !Objects.equals(this.f, qp7Var.f)) {
                return false;
            }
        }
        return this.g == qp7Var.g;
    }
}
