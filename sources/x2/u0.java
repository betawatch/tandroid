package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u0 {
    public final int a;
    public final boolean b;

    public u0(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && this.b == u0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
