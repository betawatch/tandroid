// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qa9 {
    public static final qa9 c = new qa9(0, false);
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public qa9(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa9.class != obj.getClass()) {
            return false;
        }
        qa9 qa9Var = (qa9) obj;
        return this.a == qa9Var.a && this.b == qa9Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
