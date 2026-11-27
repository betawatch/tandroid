// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uf7 {
    public final sf7[] a;
    public final long b;

    public uf7(List list) {
        this((sf7[]) list.toArray(new sf7[0]));
    }

    public final uf7 a(sf7... sf7VarArr) {
        if (sf7VarArr.length == 0) {
            return this;
        }
        String str = gcc.a;
        sf7[] sf7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(sf7VarArr2, sf7VarArr2.length + sf7VarArr.length);
        System.arraycopy(sf7VarArr, 0, copyOf, sf7VarArr2.length, sf7VarArr.length);
        return new uf7(this.b, (sf7[]) copyOf);
    }

    public final uf7 b(uf7 uf7Var) {
        return uf7Var == null ? this : a(uf7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uf7.class == obj.getClass()) {
            uf7 uf7Var = (uf7) obj;
            if (Arrays.equals(this.a, uf7Var.a) && this.b == uf7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return tse.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        sb.append(j == -9223372036854775807L ? "" : qu6.n(j, ", presentationTimeUs="));
        return sb.toString();
    }

    public uf7(long j, sf7... sf7VarArr) {
        this.b = j;
        this.a = sf7VarArr;
    }

    public uf7(sf7... sf7VarArr) {
        this(-9223372036854775807L, sf7VarArr);
    }
}
