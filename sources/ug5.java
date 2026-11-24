// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ug5 {
    public final String a;
    public final byte b;
    public final double c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public ug5(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        jte.p(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug5)) {
            return false;
        }
        ug5 ug5Var = (ug5) obj;
        return this.b == ug5Var.b && Double.compare(this.c, ug5Var.c) == 0 && this.a.equals(ug5Var.a) && Objects.equals(this.d, ug5Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public ug5(String str, double d) {
        this.a = str;
        this.b = (byte) 2;
        this.c = d;
        this.d = null;
    }
}
