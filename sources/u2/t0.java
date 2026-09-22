package u2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class t0 {
    public final int a;
    public final boolean b;

    public t0(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
