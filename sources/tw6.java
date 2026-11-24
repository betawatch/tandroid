// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tw6 {
    public final mo5 a;
    public final int b;
    public final long c;

    public tw6(List list, int i, long j) {
        this.a = mo5.q(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw6)) {
            return false;
        }
        tw6 tw6Var = (tw6) obj;
        return this.a.equals(tw6Var.a) && this.b == tw6Var.b && this.c == tw6Var.c;
    }

    public final int hashCode() {
        return cqe.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
