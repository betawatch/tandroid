// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r90 extends o03 {
    public final long a;
    public final String b;
    public final t90 c;
    public final da0 d;
    public final ea0 e;
    public final ia0 f;

    public r90(long j, String str, t90 t90Var, da0 da0Var, ea0 ea0Var, ia0 ia0Var) {
        this.a = j;
        this.b = str;
        this.c = t90Var;
        this.d = da0Var;
        this.e = ea0Var;
        this.f = ia0Var;
    }

    public final q90 a() {
        q90 q90Var = new q90();
        q90Var.a = this.a;
        q90Var.b = this.b;
        q90Var.c = this.c;
        q90Var.d = this.d;
        q90Var.e = this.e;
        q90Var.f = this.f;
        q90Var.g = (byte) 1;
        return q90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o03)) {
            return false;
        }
        r90 r90Var = (r90) ((o03) obj);
        if (this.a != r90Var.a || !this.b.equals(r90Var.b) || !this.c.equals(r90Var.c) || !this.d.equals(r90Var.d)) {
            return false;
        }
        ea0 ea0Var = r90Var.e;
        ea0 ea0Var2 = this.e;
        if (ea0Var2 == null) {
            if (ea0Var != null) {
                return false;
            }
        } else if (!ea0Var2.equals(ea0Var)) {
            return false;
        }
        ia0 ia0Var = r90Var.f;
        ia0 ia0Var2 = this.f;
        return ia0Var2 == null ? ia0Var == null : ia0Var2.equals(ia0Var);
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ea0 ea0Var = this.e;
        int hashCode2 = (hashCode ^ (ea0Var == null ? 0 : ea0Var.hashCode())) * 1000003;
        ia0 ia0Var = this.f;
        return hashCode2 ^ (ia0Var != null ? ia0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
