// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qm7 extends ja {
    public int c;
    public int d;
    public String e;
    public String f;
    public vm7 g;
    public int h;
    public boolean i;

    public static qm7 b(int i, String str, boolean z) {
        qm7 qm7Var = new qm7(1, true);
        qm7Var.c = i;
        qm7Var.e = str;
        qm7Var.i = z;
        return qm7Var;
    }

    public static qm7 c(int i, String str, String str2) {
        qm7 qm7Var = new qm7(5, true);
        qm7Var.c = i;
        qm7Var.e = str;
        qm7Var.f = str2;
        return qm7Var;
    }

    public static qm7 d(int i, String str) {
        qm7 qm7Var = new qm7(4, true);
        qm7Var.c = i;
        qm7Var.e = str;
        return qm7Var;
    }

    @Override // ja
    public final boolean a(ja jaVar) {
        if (this == jaVar) {
            return true;
        }
        if (qm7.class != jaVar.getClass()) {
            return false;
        }
        qm7 qm7Var = (qm7) jaVar;
        return this.c == qm7Var.c && this.d == qm7Var.d && this.h == qm7Var.h && this.i == qm7Var.i && Objects.equals(this.e, qm7Var.e) && Objects.equals(this.f, qm7Var.f) && this.g == qm7Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qm7.class != obj.getClass()) {
            return false;
        }
        qm7 qm7Var = (qm7) obj;
        if (this.c != qm7Var.c || this.h != qm7Var.h) {
            return false;
        }
        if (this.a != 8) {
            if (this.d != qm7Var.d || !Objects.equals(this.e, qm7Var.e)) {
                return false;
            }
            if (this.a != 6 && !Objects.equals(this.f, qm7Var.f)) {
                return false;
            }
        }
        return this.g == qm7Var.g;
    }
}
