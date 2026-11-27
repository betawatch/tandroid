// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class p90 {
    public final Integer a;
    public final Object b;
    public final pm8 c;
    public final ja0 d;

    public p90(Integer num, Object obj, pm8 pm8Var, ja0 ja0Var) {
        this.a = num;
        if (obj == null) {
            p3d.h("Null payload");
            throw null;
        }
        this.b = obj;
        this.c = pm8Var;
        this.d = ja0Var;
    }

    public static p90 a(Object obj) {
        return new p90(null, obj, pm8.a, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        Integer num = p90Var.a;
        Integer num2 = this.a;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.b.equals(p90Var.b) || !this.c.equals(p90Var.c)) {
            return false;
        }
        ja0 ja0Var = p90Var.d;
        ja0 ja0Var2 = this.d;
        return ja0Var2 == null ? ja0Var == null : ja0Var2.equals(ja0Var);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ja0 ja0Var = this.d;
        return (hashCode ^ (ja0Var != null ? ja0Var.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
