// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vf7 {
    public final tf7[] a;
    public final long b;

    public vf7(List list) {
        this((tf7[]) list.toArray(new tf7[0]));
    }

    public final vf7 a(tf7... tf7VarArr) {
        if (tf7VarArr.length == 0) {
            return this;
        }
        String str = gcc.a;
        tf7[] tf7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(tf7VarArr2, tf7VarArr2.length + tf7VarArr.length);
        System.arraycopy(tf7VarArr, 0, copyOf, tf7VarArr2.length, tf7VarArr.length);
        return new vf7(this.b, (tf7[]) copyOf);
    }

    public final vf7 b(vf7 vf7Var) {
        return vf7Var == null ? this : a(vf7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf7.class == obj.getClass()) {
            vf7 vf7Var = (vf7) obj;
            if (Arrays.equals(this.a, vf7Var.a) && this.b == vf7Var.b) {
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

    public vf7(long j, tf7... tf7VarArr) {
        this.b = j;
        this.a = tf7VarArr;
    }

    public vf7(tf7... tf7VarArr) {
        this(-9223372036854775807L, tf7VarArr);
    }
}
