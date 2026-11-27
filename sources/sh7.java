// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sh7 implements sf7 {
    public final float a;
    public final rh7 b;
    public final rh7 c;

    public sh7(float f, rh7 rh7Var, rh7 rh7Var2) {
        this.a = f;
        this.b = rh7Var;
        this.c = rh7Var2;
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
        if (!(obj instanceof sh7)) {
            return false;
        }
        sh7 sh7Var = (sh7) obj;
        return Float.compare(this.a, sh7Var.a) == 0 && Objects.equals(this.b, sh7Var.b) && Objects.equals(this.c, sh7Var.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        rh7 rh7Var = this.b;
        int hashCode = (floatToIntBits + (rh7Var != null ? rh7Var.hashCode() : 0)) * 31;
        rh7 rh7Var2 = this.c;
        return hashCode + (rh7Var2 != null ? rh7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
