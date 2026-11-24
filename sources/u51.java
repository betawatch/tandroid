// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u51 extends ja {
    public final m51 c;

    public u51(int i, m51 m51Var) {
        super(i, false);
        this.c = m51Var;
    }

    public final boolean equals(Object obj) {
        m51 m51Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || u51.class != obj.getClass()) {
            return false;
        }
        u51 u51Var = (u51) obj;
        if (this.a != u51Var.a) {
            return false;
        }
        m51 m51Var2 = this.c;
        return m51Var2 == null || (m51Var = u51Var.c) == null || m51Var2.a == m51Var.a;
    }
}
