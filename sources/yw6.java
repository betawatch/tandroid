// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yw6 {
    public final po5 a;
    public final int b;
    public final long c;

    public yw6(List list, int i, long j) {
        this.a = po5.q(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw6)) {
            return false;
        }
        yw6 yw6Var = (yw6) obj;
        return this.a.equals(yw6Var.a) && this.b == yw6Var.b && this.c == yw6Var.c;
    }

    public final int hashCode() {
        return tse.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
