// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class th7 implements tf7 {
    public final float a;
    public final sh7 b;
    public final sh7 c;

    public th7(float f, sh7 sh7Var, sh7 sh7Var2) {
        this.a = f;
        this.b = sh7Var;
        this.c = sh7Var2;
    }

    @Override // tf7
    public final ko4 a() {
        return null;
    }

    @Override // tf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof th7)) {
            return false;
        }
        th7 th7Var = (th7) obj;
        return Float.compare(this.a, th7Var.a) == 0 && Objects.equals(this.b, th7Var.b) && Objects.equals(this.c, th7Var.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        sh7 sh7Var = this.b;
        int hashCode = (floatToIntBits + (sh7Var != null ? sh7Var.hashCode() : 0)) * 31;
        sh7 sh7Var2 = this.c;
        return hashCode + (sh7Var2 != null ? sh7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override // tf7
    public final void b(lt6 lt6Var) {
    }
}
